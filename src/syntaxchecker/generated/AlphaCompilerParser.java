// Generated from C:/Users/oviquez/Documents/00.Cursos/Compiladores (IC-5701)/2026/I Semestre/G51/tests/AlphaCompiler/AlphaCompiler.g4 by ANTLR 4.13.1
package syntaxchecker.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlphaCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, DO=5, LET=6, IN=7, BEGIN=8, END=9, CONST=10, 
		VAR=11, SEMI=12, ASSIGN=13, LEFTP=14, RIGHTP=15, VIR=16, COLON=17, ADD=18, 
		SUB=19, MUL=20, DIV=21, MOD=22, EQEQ=23, NOTEQ=24, LESS=25, MORET=26, 
		LESSEQ=27, MOREEQ=28, ID=29, INTLIT=30, WS=31;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typeDenoter = 5, RULE_expression = 6, 
		RULE_primaryExpression = 7, RULE_operator = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"typeDenoter", "expression", "primaryExpression", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'do'", "'let'", "'in'", 
			"'begin'", "'end'", "'const'", "'var'", "';'", "':='", "'('", "')'", 
			"'~'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", "END", 
			"CONST", "VAR", "SEMI", "ASSIGN", "LEFTP", "RIGHTP", "VIR", "COLON", 
			"ADD", "SUB", "MUL", "DIV", "MOD", "EQEQ", "NOTEQ", "LESS", "MORET", 
			"LESSEQ", "MOREEQ", "ID", "INTLIT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "AlphaCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlphaCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlphaCompilerParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			singleCommand();
			setState(19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AlphaCompilerParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AlphaCompilerParser.SEMI, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			singleCommand();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(22);
				match(SEMI);
				setState(23);
				singleCommand();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AlphaCompilerParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFTP() { return getToken(AlphaCompilerParser.LEFTP, 0); }
		public TerminalNode RIGHTP() { return getToken(AlphaCompilerParser.RIGHTP, 0); }
		public TerminalNode IF() { return getToken(AlphaCompilerParser.IF, 0); }
		public TerminalNode THEN() { return getToken(AlphaCompilerParser.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AlphaCompilerParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(AlphaCompilerParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(AlphaCompilerParser.DO, 0); }
		public TerminalNode LET() { return getToken(AlphaCompilerParser.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(AlphaCompilerParser.IN, 0); }
		public TerminalNode BEGIN() { return getToken(AlphaCompilerParser.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(AlphaCompilerParser.END, 0); }
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(ID);
				setState(30);
				match(ASSIGN);
				setState(31);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(ID);
				setState(33);
				match(LEFTP);
				setState(34);
				expression();
				setState(35);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(IF);
				setState(38);
				expression();
				setState(39);
				match(THEN);
				setState(40);
				singleCommand();
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(41);
					match(ELSE);
					setState(42);
					singleCommand();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(WHILE);
				setState(46);
				expression();
				setState(47);
				match(DO);
				setState(48);
				singleCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(LET);
				setState(51);
				declaration();
				setState(52);
				match(IN);
				setState(53);
				singleCommand();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(BEGIN);
				setState(56);
				command();
				setState(57);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AlphaCompilerParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AlphaCompilerParser.SEMI, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			singleDeclaration();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(62);
				match(SEMI);
				setState(63);
				singleDeclaration();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AlphaCompilerParser.CONST, 0); }
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode VIR() { return getToken(AlphaCompilerParser.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(AlphaCompilerParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(AlphaCompilerParser.COLON, 0); }
		public TypeDenoterContext typeDenoter() {
			return getRuleContext(TypeDenoterContext.class,0);
		}
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(CONST);
				setState(70);
				match(ID);
				setState(71);
				match(VIR);
				setState(72);
				expression();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(VAR);
				setState(74);
				match(ID);
				setState(75);
				match(COLON);
				setState(76);
				typeDenoter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDenoterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TypeDenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDenoter; }
	}

	public final TypeDenoterContext typeDenoter() throws RecognitionException {
		TypeDenoterContext _localctx = new TypeDenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDenoter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			primaryExpression();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536608768L) != 0)) {
				{
				{
				setState(82);
				operator();
				setState(83);
				primaryExpression();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode INTLIT() { return getToken(AlphaCompilerParser.INTLIT, 0); }
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode LEFTP() { return getToken(AlphaCompilerParser.LEFTP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(AlphaCompilerParser.RIGHTP, 0); }
		public TerminalNode SUB() { return getToken(AlphaCompilerParser.SUB, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(90);
				match(SUB);
				}
			}

			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLIT:
				{
				setState(93);
				match(INTLIT);
				}
				break;
			case ID:
				{
				setState(94);
				match(ID);
				}
				break;
			case LEFTP:
				{
				setState(95);
				match(LEFTP);
				setState(96);
				expression();
				setState(97);
				match(RIGHTP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(AlphaCompilerParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AlphaCompilerParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(AlphaCompilerParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AlphaCompilerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AlphaCompilerParser.MOD, 0); }
		public TerminalNode EQEQ() { return getToken(AlphaCompilerParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(AlphaCompilerParser.NOTEQ, 0); }
		public TerminalNode LESS() { return getToken(AlphaCompilerParser.LESS, 0); }
		public TerminalNode MORET() { return getToken(AlphaCompilerParser.MORET, 0); }
		public TerminalNode LESSEQ() { return getToken(AlphaCompilerParser.LESSEQ, 0); }
		public TerminalNode MOREEQ() { return getToken(AlphaCompilerParser.MOREEQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 536608768L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001fh\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003A\b\u0003"+
		"\n\u0003\f\u0003D\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006V\b\u0006\n\u0006\f\u0006Y\t\u0006\u0001\u0007\u0003\u0007"+
		"\\\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007d\b\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000\u0012"+
		"\u001ck\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000"+
		"\u0000\u0004;\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\b"+
		"M\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000"+
		"\u0000\u000e[\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0003\u0004\u0002\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014"+
		"\u0001\u0001\u0000\u0000\u0000\u0015\u001a\u0003\u0004\u0002\u0000\u0016"+
		"\u0017\u0005\f\u0000\u0000\u0017\u0019\u0003\u0004\u0002\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0003"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005\u001d\u0000\u0000\u001e\u001f\u0005\r\u0000\u0000\u001f<\u0003"+
		"\f\u0006\u0000 !\u0005\u001d\u0000\u0000!\"\u0005\u000e\u0000\u0000\""+
		"#\u0003\f\u0006\u0000#$\u0005\u000f\u0000\u0000$<\u0001\u0000\u0000\u0000"+
		"%&\u0005\u0001\u0000\u0000&\'\u0003\f\u0006\u0000\'(\u0005\u0002\u0000"+
		"\u0000(+\u0003\u0004\u0002\u0000)*\u0005\u0003\u0000\u0000*,\u0003\u0004"+
		"\u0002\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,<\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0003\f\u0006\u0000/0\u0005"+
		"\u0005\u0000\u000001\u0003\u0004\u0002\u00001<\u0001\u0000\u0000\u0000"+
		"23\u0005\u0006\u0000\u000034\u0003\u0006\u0003\u000045\u0005\u0007\u0000"+
		"\u000056\u0003\u0004\u0002\u00006<\u0001\u0000\u0000\u000078\u0005\b\u0000"+
		"\u000089\u0003\u0002\u0001\u00009:\u0005\t\u0000\u0000:<\u0001\u0000\u0000"+
		"\u0000;\u001d\u0001\u0000\u0000\u0000; \u0001\u0000\u0000\u0000;%\u0001"+
		"\u0000\u0000\u0000;-\u0001\u0000\u0000\u0000;2\u0001\u0000\u0000\u0000"+
		";7\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=B\u0003\b\u0004"+
		"\u0000>?\u0005\f\u0000\u0000?A\u0003\b\u0004\u0000@>\u0001\u0000\u0000"+
		"\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000C\u0007\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"EF\u0005\n\u0000\u0000FG\u0005\u001d\u0000\u0000GH\u0005\u0010\u0000\u0000"+
		"HN\u0003\f\u0006\u0000IJ\u0005\u000b\u0000\u0000JK\u0005\u001d\u0000\u0000"+
		"KL\u0005\u0011\u0000\u0000LN\u0003\n\u0005\u0000ME\u0001\u0000\u0000\u0000"+
		"MI\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0005\u001d\u0000"+
		"\u0000P\u000b\u0001\u0000\u0000\u0000QW\u0003\u000e\u0007\u0000RS\u0003"+
		"\u0010\b\u0000ST\u0003\u000e\u0007\u0000TV\u0001\u0000\u0000\u0000UR\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\r\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z\\\u0005\u0013\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\c\u0001\u0000\u0000\u0000]d\u0005\u001e\u0000\u0000^d\u0005"+
		"\u001d\u0000\u0000_`\u0005\u000e\u0000\u0000`a\u0003\f\u0006\u0000ab\u0005"+
		"\u000f\u0000\u0000bd\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000"+
		"c^\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000d\u000f\u0001\u0000"+
		"\u0000\u0000ef\u0007\u0000\u0000\u0000f\u0011\u0001\u0000\u0000\u0000"+
		"\b\u001a+;BMW[c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}