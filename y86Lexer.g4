lexer grammar y86Lexer;
fragment HexDigit
    : [0-9a-fA-F]
    ;
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_]
    ; // these are the "letters" below 0x7F


//Instructions
OP: 'addq' | 'andq' | 'xorq' | 'subq';
HALT: 'halt';
NOP: 'nop';
IRMOVQ: 'irmovq';
MRMOVQ: 'mrmovq';
RMMOVQ: 'rmmovq';
CALL: 'call';
RET: 'ret';
PUSHQ: 'pushq';
POPQ: 'popq';


//Directives
POS: '.pos';
QUAD: '.quad';
ALIGN: '.align';

//Program Registers
REGISTER: '%rax' | '%rcx' | '%rdx' | '%rbx' | '%rsp' | '%rbp' | '%rsi' | '%rdi' | '%r8' | '%r9' |
 '%r10' | '%r11' | '%r12' | '%r13' | '%r14';

RMOV: 'rrmovq' | 'cmove' | 'cmovg' | 'cmovge' | 'cmovl' | 'cmovle' | 'cmovne';

JUMP: 'je' | 'jg' | 'jge' | 'jl' | 'jle' | 'jmp' | 'jne';

// Literals
DECIMAL_LITERAL: ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
HEX_LITERAL: '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;

// Separators
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
COLON: ':';

// Whitespace and comments
WS: [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT: '#' ~[\r\n]*    -> channel(HIDDEN);
CONSTANT: '$' DECIMAL_LITERAL | '$' HEX_LITERAL;
MEMORY_LOCATION: '(' REGISTER ')' | DECIMAL_LITERAL '(' REGISTER ')' | HEX_LITERAL '(' REGISTER ')';
IDENTIFIER: Letter LetterOrDigit*;

