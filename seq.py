class Instr:
	def __init__(self,size, reg, hasC):
		self.instr = None
		self.size = size
		self.regs = reg
		self.const = hasC

class Memory:
	def __init__(self, addr, isInstr):
		self.address = addr
		self.isInstr = isInstr

	def __str__(self):
		yn = "Yes"
		if not self.isInstr:
			yn = "No"
		return "address:{} \n     instruction?: {}".format(self.address, yn)
		
class SEQ:
	def __init__(self, file):
		self.IM = {} #instruction memory
		self.MEM = [0] * 500
		self.registers = [0] * 15
		self.directives = set([".pos", ".align", ".quad"])
		self.regs = set(["%rax","%rcx","%rdx","%rbx","%rsi","%rdi","%rsp","%rbp" ,"%r8","%r9","%r10","%r11","%r12","%r13","%r14",0])
		self.valid_instr = {"rrmovq": Instr(2,2, False), "irmovq": Instr(10,1,True), "rmmovq":Instr(10,2,False), "mrmovq":Instr(10,2,False),
		        "addq":Instr(2,2,False), "subq":Instr(2,2,False), "andq":Instr(2,2,False), "xorq":Instr(2,2,False), "jmp":Instr(9,0,True), "jle":Instr(9,0,True),
		         "jl":Instr(9,0,True), "je":Instr(9,0,True), "jne":Instr(9,0,True), "jge":Instr(9,0,True), "jg":Instr(9,0,True),
		          "cmovle":Instr(2,2, False), "cmovl":Instr(2,2, False), "cmove":Instr(2,2, False), "cmovne":Instr(2,2, False),
		          "cmovge":Instr(2,2, False), "cmovg":Instr(2,2, False), "call":Instr(9,0,True), "ret": Instr(1,0,False), "pushq": Instr(2,1,False), "popq":Instr(2,1,False),
		          "halt":Instr(1,0,False), "iaddq":Instr(10,1,True)
		          }
		for k, v in self.valid_instr.items():
			v.instr = k
		self.instr_file = file
		self.tag = {}
		self.compile(file)

	def expandMem():
		size = len(self.MEM)
		for i in range(0, size):
			self.MEM.append(0)

	def throwError(self, line):
		raise SyntaxError("error at line " + str(line))

	def compile(self, file):
		tags = {}
		pos = []
		line = 1
		addr = 0
		self.memscan(file, pos, tags)
		self.instrscan(file, pos, tags)
		for k, v in tags.items():
			print(k,str(v))				

	#check for quads and pos and tags
	def memscan(self, file, pos, tag):
		ln = 1
		lastInstr = ""
		with open(file, 'r') as fi:
			for line in fi:
				if line[0] == '#': #comments
					ln += 1
					continue
				txt = line.split()

				if not txt:
					ln += 1
					continue

				n = len(txt[0])
				if txt[0] == '.pos':
					if txt[1].isdigit():
						num = int(txt[1])
						if num >= 0:
							pos.append(num)

						else:
							self.throwError(ln)
						
					else:
						self.throwError(ln)
				elif txt[0] == '.quad':				
						if lastInstr[len(lastInstr) - 1] == ':':
							tag[lastInstr] = Memory(0, False)
						
					
				elif txt[0][n-1] == ':':
					if lastInstr == '.pos':
						tag[txt[0]] = Memory(pos[len(pos)-1], False) #last pos put in

					elif lastInstr == '.quad':
						tag[txt[0]] = Memory(0, False)
					else:
						tag[txt[0]] = Memory(0, True)
				lastInstr = txt[0]
				ln += 1
				

	#check for instructions
	def instrscan(self, file, pos, tag):
		ln = 1
		address = 0
		with open(file, 'r') as fi:
			for line in fi:
				txt = line.split()
				if txt:
					if txt[0][0] == '#':
						ln += 1
						continue
					if txt[0][len(txt[0])-1] == ':': #issa tag
					    if not tag[txt[0]].isInstr:
					        ln += 1
					        continue
					    tag[txt[0]] = Memory(address, True) #tag already gotten by memscan
					    if len(txt) > 1:
						    if txt[1]:
						    	if txt[1] in self.valid_instr:
						    		self.IM[" ".join(txt[1::])] = address
						    		address += self.valid_instr[txt[1]].size
						    	elif txt[1][0] != '#':
						    		print(line)
						    		self.throwError(ln)
					elif txt[0] in self.valid_instr:
						self.IM[line] = address
						address += self.valid_instr[txt[0]].size
					elif txt[0] in self.directives:
						ln += 1
						continue
					else:
						print(line)
						self.throwError(ln)
				ln += 1

def main():
	s = SEQ("ldriver.ys")
	# for k, v in s.IM.items():
	# 	print(k, " :", v)

main()