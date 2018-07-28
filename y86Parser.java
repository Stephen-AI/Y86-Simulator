// Generated from y86Parser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class y86Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP=1, HALT=2, NOP=3, IRMOVQ=4, MRMOVQ=5, RMMOVQ=6, CALL=7, RET=8, PUSHQ=9, 
		POPQ=10, POS=11, QUAD=12, ALIGN=13, REGISTER=14, RMOV=15, JUMP=16, DECIMAL_LITERAL=17, 
		HEX_LITERAL=18, LPAREN=19, RPAREN=20, COMMA=21, COLON=22, WS=23, COMMENT=24, 
		CONSTANT=25, MEMORY_LOCATION=26, IDENTIFIER=27;
	public static final int
		RULE_functionOrMemoryDeclaration = 0, RULE_doOperation = 1, RULE_doRegisterMove = 2, 
		RULE_doImmediateMove = 3, RULE_doMemoryMove = 4, RULE_doJumporCall = 5, 
		RULE_doStackOp = 6, RULE_doNoValueNeeded = 7, RULE_directiveDeclaration = 8, 
		RULE_validY86 = 9, RULE_program = 10;
	public static final String[] ruleNames = {
		"functionOrMemoryDeclaration", "doOperation", "doRegisterMove", "doImmediateMove", 
		"doMemoryMove", "doJumporCall", "doStackOp", "doNoValueNeeded", "directiveDeclaration", 
		"validY86", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'halt'", "'nop'", "'irmovq'", "'mrmovq'", "'rmmovq'", "'call'", 
		"'ret'", "'pushq'", "'popq'", "'.pos'", "'.quad'", "'.align'", null, null, 
		null, null, null, "'('", "')'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OP", "HALT", "NOP", "IRMOVQ", "MRMOVQ", "RMMOVQ", "CALL", "RET", 
		"PUSHQ", "POPQ", "POS", "QUAD", "ALIGN", "REGISTER", "RMOV", "JUMP", "DECIMAL_LITERAL", 
		"HEX_LITERAL", "LPAREN", "RPAREN", "COMMA", "COLON", "WS", "COMMENT", 
		"CONSTANT", "MEMORY_LOCATION", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "y86Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public y86Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FunctionOrMemoryDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(y86Parser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(y86Parser.COLON, 0); }
		public FunctionOrMemoryDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionOrMemoryDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterFunctionOrMemoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitFunctionOrMemoryDeclaration(this);
		}
	}

	public final FunctionOrMemoryDeclarationContext functionOrMemoryDeclaration() throws RecognitionException {
		FunctionOrMemoryDeclarationContext _localctx = new FunctionOrMemoryDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_functionOrMemoryDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(IDENTIFIER);
			setState(23);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoOperationContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(y86Parser.OP, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(y86Parser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(y86Parser.REGISTER, i);
		}
		public TerminalNode COMMA() { return getToken(y86Parser.COMMA, 0); }
		public DoOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterDoOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitDoOperation(this);
		}
	}

	public final DoOperationContext doOperation() throws RecognitionException {
		DoOperationContext _localctx = new DoOperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_doOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(OP);
			setState(26);
			match(REGISTER);
			setState(27);
			match(COMMA);
			setState(28);
			match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoRegisterMoveContext extends ParserRuleContext {
		public TerminalNode RMOV() { return getToken(y86Parser.RMOV, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(y86Parser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(y86Parser.REGISTER, i);
		}
		public TerminalNode COMMA() { return getToken(y86Parser.COMMA, 0); }
		public DoRegisterMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doRegisterMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterDoRegisterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitDoRegisterMove(this);
		}
	}

	public final DoRegisterMoveContext doRegisterMove() throws RecognitionException {
		DoRegisterMoveContext _localctx = new DoRegisterMoveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_doRegisterMove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(RMOV);
			setState(31);
			match(REGISTER);
			setState(32);
			match(COMMA);
			setState(33);
			match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoImmediateMoveContext extends ParserRuleContext {
		public TerminalNode IRMOVQ() { return getToken(y86Parser.IRMOVQ, 0); }
		public TerminalNode CONSTANT() { return getToken(y86Parser.CONSTANT, 0); }
		public TerminalNode COMMA() { return getToken(y86Parser.COMMA, 0); }
		public TerminalNode REGISTER() { return getToken(y86Parser.REGISTER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(y86Parser.IDENTIFIER, 0); }
		public DoImmediateMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doImmediateMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterDoImmediateMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitDoImmediateMove(this);
		}
	}

	public final DoImmediateMoveContext doImmediateMove() throws RecognitionException {
		DoImmediateMoveContext _localctx = new DoImmediateMoveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_doImmediateMove);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(IRMOVQ);
				setState(36);
				match(CONSTANT);
				setState(37);
				match(COMMA);
				setState(38);
				match(REGISTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(IRMOVQ);
				setState(40);
				match(IDENTIFIER);
				setState(41);
				match(COMMA);
				setState(42);
				match(REGISTER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoMemoryMoveContext extends ParserRuleContext {
		public TerminalNode RMMOVQ() { return getToken(y86Parser.RMMOVQ, 0); }
		public TerminalNode REGISTER() { return getToken(y86Parser.REGISTER, 0); }
		public TerminalNode COMMA() { return getToken(y86Parser.COMMA, 0); }
		public TerminalNode MEMORY_LOCATION() { return getToken(y86Parser.MEMORY_LOCATION, 0); }
		public TerminalNode MRMOVQ() { return getToken(y86Parser.MRMOVQ, 0); }
		public DoMemoryMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doMemoryMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterDoMemoryMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitDoMemoryMove(this);
		}
	}

	public final DoMemoryMoveContext doMemoryMove() throws RecognitionException {
		DoMemoryMoveContext _localctx = new DoMemoryMoveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_doMemoryMove);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RMMOVQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(RMMOVQ);
				setState(46);
				match(REGISTER);
				setState(47);
				match(COMMA);
				setState(48);
				match(MEMORY_LOCATION);
				}
				break;
			case MRMOVQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(MRMOVQ);
				setState(50);
				match(MEMORY_LOCATION);
				setState(51);
				match(COMMA);
				setState(52);
				match(REGISTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoJumporCallContext extends ParserRuleContext {
		public TerminalNode JUMP() { return getToken(y86Parser.JUMP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(y86Parser.IDENTIFIER, 0); }
		public TerminalNode CALL() { return getToken(y86Parser.CALL, 0); }
		public DoJumporCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doJumporCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterDoJumporCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitDoJumporCall(this);
		}
	}

	public final DoJumporCallContext doJumporCall() throws RecognitionException {
		DoJumporCallContext _localctx = new DoJumporCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_doJumporCall);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JUMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(JUMP);
				setState(56);
				match(IDENTIFIER);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(CALL);
				setState(58);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStackOpContext extends ParserRuleContext {
		public TerminalNode PUSHQ() { return getToken(y86Parser.PUSHQ, 0); }
		public TerminalNode REGISTER() { return getToken(y86Parser.REGISTER, 0); }
		public TerminalNode POPQ() { return getToken(y86Parser.POPQ, 0); }
		public DoStackOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStackOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterDoStackOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitDoStackOp(this);
		}
	}

	public final DoStackOpContext doStackOp() throws RecognitionException {
		DoStackOpContext _localctx = new DoStackOpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_doStackOp);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSHQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(PUSHQ);
				setState(62);
				match(REGISTER);
				}
				break;
			case POPQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(POPQ);
				setState(64);
				match(REGISTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoNoValueNeededContext extends ParserRuleContext {
		public TerminalNode HALT() { return getToken(y86Parser.HALT, 0); }
		public TerminalNode NOP() { return getToken(y86Parser.NOP, 0); }
		public TerminalNode RET() { return getToken(y86Parser.RET, 0); }
		public DoNoValueNeededContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doNoValueNeeded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterDoNoValueNeeded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitDoNoValueNeeded(this);
		}
	}

	public final DoNoValueNeededContext doNoValueNeeded() throws RecognitionException {
		DoNoValueNeededContext _localctx = new DoNoValueNeededContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doNoValueNeeded);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HALT) | (1L << NOP) | (1L << RET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveDeclarationContext extends ParserRuleContext {
		public TerminalNode POS() { return getToken(y86Parser.POS, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(y86Parser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(y86Parser.HEX_LITERAL, 0); }
		public TerminalNode ALIGN() { return getToken(y86Parser.ALIGN, 0); }
		public TerminalNode QUAD() { return getToken(y86Parser.QUAD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(y86Parser.IDENTIFIER, 0); }
		public DirectiveDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterDirectiveDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitDirectiveDeclaration(this);
		}
	}

	public final DirectiveDeclarationContext directiveDeclaration() throws RecognitionException {
		DirectiveDeclarationContext _localctx = new DirectiveDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_directiveDeclaration);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(POS);
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL_LITERAL || _la==HEX_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ALIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(ALIGN);
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL_LITERAL || _la==HEX_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case QUAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(QUAD);
				setState(74);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidY86Context extends ParserRuleContext {
		public FunctionOrMemoryDeclarationContext functionOrMemoryDeclaration() {
			return getRuleContext(FunctionOrMemoryDeclarationContext.class,0);
		}
		public DoOperationContext doOperation() {
			return getRuleContext(DoOperationContext.class,0);
		}
		public DoRegisterMoveContext doRegisterMove() {
			return getRuleContext(DoRegisterMoveContext.class,0);
		}
		public DoImmediateMoveContext doImmediateMove() {
			return getRuleContext(DoImmediateMoveContext.class,0);
		}
		public DoMemoryMoveContext doMemoryMove() {
			return getRuleContext(DoMemoryMoveContext.class,0);
		}
		public DoJumporCallContext doJumporCall() {
			return getRuleContext(DoJumporCallContext.class,0);
		}
		public DoStackOpContext doStackOp() {
			return getRuleContext(DoStackOpContext.class,0);
		}
		public DoNoValueNeededContext doNoValueNeeded() {
			return getRuleContext(DoNoValueNeededContext.class,0);
		}
		public DirectiveDeclarationContext directiveDeclaration() {
			return getRuleContext(DirectiveDeclarationContext.class,0);
		}
		public ValidY86Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validY86; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterValidY86(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitValidY86(this);
		}
	}

	public final ValidY86Context validY86() throws RecognitionException {
		ValidY86Context _localctx = new ValidY86Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_validY86);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				functionOrMemoryDeclaration();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				doOperation();
				}
				break;
			case RMOV:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				doRegisterMove();
				}
				break;
			case IRMOVQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				doImmediateMove();
				}
				break;
			case MRMOVQ:
			case RMMOVQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				doMemoryMove();
				}
				break;
			case CALL:
			case JUMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				doJumporCall();
				}
				break;
			case PUSHQ:
			case POPQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				doStackOp();
				}
				break;
			case HALT:
			case NOP:
			case RET:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				doNoValueNeeded();
				}
				break;
			case POS:
			case QUAD:
			case ALIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				directiveDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(y86Parser.EOF, 0); }
		public List<ValidY86Context> validY86() {
			return getRuleContexts(ValidY86Context.class);
		}
		public ValidY86Context validY86(int i) {
			return getRuleContext(ValidY86Context.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof y86ParserListener ) ((y86ParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << HALT) | (1L << NOP) | (1L << IRMOVQ) | (1L << MRMOVQ) | (1L << RMMOVQ) | (1L << CALL) | (1L << RET) | (1L << PUSHQ) | (1L << POPQ) | (1L << POS) | (1L << QUAD) | (1L << ALIGN) | (1L << RMOV) | (1L << JUMP) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(88);
				validY86();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\68\n\6"+
		"\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\5\bD\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"Y\n\13\3\f\7\f\\\n\f\f\f\16\f_\13\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\5\4\2\4\5\n\n\3\2\23\24\4\2\23\24\35\35\2f\2\30\3\2\2\2\4"+
		"\33\3\2\2\2\6 \3\2\2\2\b-\3\2\2\2\n\67\3\2\2\2\f=\3\2\2\2\16C\3\2\2\2"+
		"\20E\3\2\2\2\22M\3\2\2\2\24X\3\2\2\2\26]\3\2\2\2\30\31\7\35\2\2\31\32"+
		"\7\30\2\2\32\3\3\2\2\2\33\34\7\3\2\2\34\35\7\20\2\2\35\36\7\27\2\2\36"+
		"\37\7\20\2\2\37\5\3\2\2\2 !\7\21\2\2!\"\7\20\2\2\"#\7\27\2\2#$\7\20\2"+
		"\2$\7\3\2\2\2%&\7\6\2\2&\'\7\33\2\2\'(\7\27\2\2(.\7\20\2\2)*\7\6\2\2*"+
		"+\7\35\2\2+,\7\27\2\2,.\7\20\2\2-%\3\2\2\2-)\3\2\2\2.\t\3\2\2\2/\60\7"+
		"\b\2\2\60\61\7\20\2\2\61\62\7\27\2\2\628\7\34\2\2\63\64\7\7\2\2\64\65"+
		"\7\34\2\2\65\66\7\27\2\2\668\7\20\2\2\67/\3\2\2\2\67\63\3\2\2\28\13\3"+
		"\2\2\29:\7\22\2\2:>\7\35\2\2;<\7\t\2\2<>\7\35\2\2=9\3\2\2\2=;\3\2\2\2"+
		">\r\3\2\2\2?@\7\13\2\2@D\7\20\2\2AB\7\f\2\2BD\7\20\2\2C?\3\2\2\2CA\3\2"+
		"\2\2D\17\3\2\2\2EF\t\2\2\2F\21\3\2\2\2GH\7\r\2\2HN\t\3\2\2IJ\7\17\2\2"+
		"JN\t\3\2\2KL\7\16\2\2LN\t\4\2\2MG\3\2\2\2MI\3\2\2\2MK\3\2\2\2N\23\3\2"+
		"\2\2OY\5\2\2\2PY\5\4\3\2QY\5\6\4\2RY\5\b\5\2SY\5\n\6\2TY\5\f\7\2UY\5\16"+
		"\b\2VY\5\20\t\2WY\5\22\n\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3"+
		"\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\25\3\2\2\2Z\\\5\24\13"+
		"\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\2"+
		"\2\3a\27\3\2\2\2\t-\67=CMX]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}