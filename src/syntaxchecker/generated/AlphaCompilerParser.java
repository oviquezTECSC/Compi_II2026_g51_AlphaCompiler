// Generated from C:/Users/o_viq/IdeaProjects/Compi_II2026_G51_AlphaCompiler/AlphaCompiler.g4 by ANTLR 4.13.2
package syntaxchecker.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AlphaCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, DO=5, LET=6, IN=7, BEGIN=8, END=9, CONST=10, 
		VAR=11, VOID=12, RETURN=13, TRUE=14, FALSE=15, SEMI=16, ASSIGN=17, LEFTP=18, 
		RIGHTP=19, VIR=20, COLON=21, COMMA=22, ADD=23, SUB=24, MUL=25, DIV=26, 
		MOD=27, EQEQ=28, NOTEQ=29, LESS=30, MORET=31, LESSEQ=32, MOREEQ=33, ID=34, 
		INTNUM=35, STRINGCONST=36, CHARCONST=37, LINE_COMMENT=38, BLOCK_COMMENT=39, 
		WS=40;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_argumentList = 3, 
		RULE_declaration = 4, RULE_singleDeclaration = 5, RULE_paramList = 6, 
		RULE_param = 7, RULE_typeDenoter = 8, RULE_expression = 9, RULE_primaryExpression = 10, 
		RULE_operator = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "argumentList", "declaration", 
			"singleDeclaration", "paramList", "param", "typeDenoter", "expression", 
			"primaryExpression", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'do'", "'let'", "'in'", 
			"'begin'", "'end'", "'const'", "'var'", "'void'", "'return'", "'true'", 
			"'false'", "';'", "':='", "'('", "')'", "'~'", "':'", "','", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", "END", 
			"CONST", "VAR", "VOID", "RETURN", "TRUE", "FALSE", "SEMI", "ASSIGN", 
			"LEFTP", "RIGHTP", "VIR", "COLON", "COMMA", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "EQEQ", "NOTEQ", "LESS", "MORET", "LESSEQ", "MOREEQ", "ID", "INTNUM", 
			"STRINGCONST", "CHARCONST", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			singleCommand();
			setState(25);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			singleCommand();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(28);
				match(SEMI);
				setState(29);
				singleCommand();
				}
				}
				setState(34);
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
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
	 
		public SingleCommandContext() { }
		public void copyFrom(SingleCommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallSingleCommandContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode LEFTP() { return getToken(AlphaCompilerParser.LEFTP, 0); }
		public TerminalNode RIGHTP() { return getToken(AlphaCompilerParser.RIGHTP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCallSingleCommandContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitMethodCallSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileSingleCommandContext extends SingleCommandContext {
		public TerminalNode WHILE() { return getToken(AlphaCompilerParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(AlphaCompilerParser.DO, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public WhileSingleCommandContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitWhileSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockSingleCommandContext extends SingleCommandContext {
		public TerminalNode BEGIN() { return getToken(AlphaCompilerParser.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(AlphaCompilerParser.END, 0); }
		public BlockSingleCommandContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitBlockSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnSingleCommandContext extends SingleCommandContext {
		public TerminalNode RETURN() { return getToken(AlphaCompilerParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnSingleCommandContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitReturnSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfSingleCommandContext extends SingleCommandContext {
		public TerminalNode IF() { return getToken(AlphaCompilerParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AlphaCompilerParser.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AlphaCompilerParser.ELSE, 0); }
		public IfSingleCommandContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitIfSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignSingleCommandContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AlphaCompilerParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignSingleCommandContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitAssignSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetSingleCommandContext extends SingleCommandContext {
		public TerminalNode LET() { return getToken(AlphaCompilerParser.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(AlphaCompilerParser.IN, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public LetSingleCommandContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitLetSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignSingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(ID);
				setState(36);
				match(ASSIGN);
				setState(37);
				expression();
				}
				break;
			case 2:
				_localctx = new MethodCallSingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(ID);
				setState(39);
				match(LEFTP);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257715126272L) != 0)) {
					{
					setState(40);
					argumentList();
					}
				}

				setState(43);
				match(RIGHTP);
				}
				break;
			case 3:
				_localctx = new ReturnSingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(RETURN);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257715126272L) != 0)) {
					{
					setState(45);
					expression();
					}
				}

				}
				break;
			case 4:
				_localctx = new IfSingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(IF);
				setState(49);
				expression();
				setState(50);
				match(THEN);
				setState(51);
				singleCommand();
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(52);
					match(ELSE);
					setState(53);
					singleCommand();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new WhileSingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				match(WHILE);
				setState(57);
				expression();
				setState(58);
				match(DO);
				setState(59);
				singleCommand();
				}
				break;
			case 6:
				_localctx = new LetSingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(LET);
				setState(62);
				declaration();
				setState(63);
				match(IN);
				setState(64);
				singleCommand();
				}
				break;
			case 7:
				_localctx = new BlockSingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				match(BEGIN);
				setState(67);
				command();
				setState(68);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlphaCompilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlphaCompilerParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			expression();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				expression();
				}
				}
				setState(79);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			singleDeclaration();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(81);
				match(SEMI);
				setState(82);
				singleDeclaration();
				}
				}
				setState(87);
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
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
	 
		public SingleDeclarationContext() { }
		public void copyFrom(SingleDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodSingleDeclarationContext extends SingleDeclarationContext {
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode LEFTP() { return getToken(AlphaCompilerParser.LEFTP, 0); }
		public TerminalNode RIGHTP() { return getToken(AlphaCompilerParser.RIGHTP, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AlphaCompilerParser.VOID, 0); }
		public TypeDenoterContext typeDenoter() {
			return getRuleContext(TypeDenoterContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public MethodSingleDeclarationContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitMethodSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarSingleDeclarationContext extends SingleDeclarationContext {
		public TerminalNode VAR() { return getToken(AlphaCompilerParser.VAR, 0); }
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AlphaCompilerParser.COLON, 0); }
		public TypeDenoterContext typeDenoter() {
			return getRuleContext(TypeDenoterContext.class,0);
		}
		public VarSingleDeclarationContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitVarSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstSingleDeclarationContext extends SingleDeclarationContext {
		public TerminalNode CONST() { return getToken(AlphaCompilerParser.CONST, 0); }
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode VIR() { return getToken(AlphaCompilerParser.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstSingleDeclarationContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitConstSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDeclaration);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstSingleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(CONST);
				setState(89);
				match(ID);
				setState(90);
				match(VIR);
				setState(91);
				expression();
				}
				break;
			case VAR:
				_localctx = new VarSingleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(VAR);
				setState(93);
				match(ID);
				setState(94);
				match(COLON);
				setState(95);
				typeDenoter();
				}
				break;
			case VOID:
			case ID:
				_localctx = new MethodSingleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(96);
					match(VOID);
					}
					break;
				case ID:
					{
					setState(97);
					typeDenoter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100);
				match(ID);
				setState(101);
				match(LEFTP);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(102);
					paramList();
					}
				}

				setState(105);
				match(RIGHTP);
				setState(106);
				singleCommand();
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
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlphaCompilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlphaCompilerParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			param();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				param();
				}
				}
				setState(116);
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
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AlphaCompilerParser.COLON, 0); }
		public TypeDenoterContext typeDenoter() {
			return getRuleContext(TypeDenoterContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(118);
			match(COLON);
			setState(119);
			typeDenoter();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitTypeDenoter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDenoterContext typeDenoter() throws RecognitionException {
		TypeDenoterContext _localctx = new TypeDenoterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeDenoter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			primaryExpression();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17171480576L) != 0)) {
				{
				{
				setState(124);
				operator();
				setState(125);
				primaryExpression();
				}
				}
				setState(131);
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
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumPrimaryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode INTNUM() { return getToken(AlphaCompilerParser.INTNUM, 0); }
		public TerminalNode SUB() { return getToken(AlphaCompilerParser.SUB, 0); }
		public NumPrimaryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitNumPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruePrimaryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode TRUE() { return getToken(AlphaCompilerParser.TRUE, 0); }
		public TruePrimaryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitTruePrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallPrimaryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode LEFTP() { return getToken(AlphaCompilerParser.LEFTP, 0); }
		public TerminalNode RIGHTP() { return getToken(AlphaCompilerParser.RIGHTP, 0); }
		public TerminalNode SUB() { return getToken(AlphaCompilerParser.SUB, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCallPrimaryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitMethodCallPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdPrimaryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(AlphaCompilerParser.ID, 0); }
		public TerminalNode SUB() { return getToken(AlphaCompilerParser.SUB, 0); }
		public IdPrimaryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitIdPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupPrimaryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFTP() { return getToken(AlphaCompilerParser.LEFTP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(AlphaCompilerParser.RIGHTP, 0); }
		public TerminalNode SUB() { return getToken(AlphaCompilerParser.SUB, 0); }
		public GroupPrimaryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitGroupPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPrimaryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode STRINGCONST() { return getToken(AlphaCompilerParser.STRINGCONST, 0); }
		public StringPrimaryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitStringPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalsePrimaryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode FALSE() { return getToken(AlphaCompilerParser.FALSE, 0); }
		public FalsePrimaryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitFalsePrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharPrimaryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode CHARCONST() { return getToken(AlphaCompilerParser.CHARCONST, 0); }
		public CharPrimaryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitCharPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primaryExpression);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NumPrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(132);
					match(SUB);
					}
				}

				setState(135);
				match(INTNUM);
				}
				break;
			case 2:
				_localctx = new IdPrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(136);
					match(SUB);
					}
				}

				setState(139);
				match(ID);
				}
				break;
			case 3:
				_localctx = new GroupPrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(140);
					match(SUB);
					}
				}

				setState(143);
				match(LEFTP);
				setState(144);
				expression();
				setState(145);
				match(RIGHTP);
				}
				break;
			case 4:
				_localctx = new MethodCallPrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(147);
					match(SUB);
					}
				}

				setState(150);
				match(ID);
				setState(151);
				match(LEFTP);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257715126272L) != 0)) {
					{
					setState(152);
					argumentList();
					}
				}

				setState(155);
				match(RIGHTP);
				}
				break;
			case 5:
				_localctx = new CharPrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(CHARCONST);
				}
				break;
			case 6:
				_localctx = new StringPrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(STRINGCONST);
				}
				break;
			case 7:
				_localctx = new TruePrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(TRUE);
				}
				break;
			case 8:
				_localctx = new FalsePrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				match(FALSE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaCompilerVisitor ) return ((AlphaCompilerVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17171480576L) != 0)) ) {
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
		"\u0004\u0001(\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"7\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004T\b\u0004\n\u0004\f\u0004"+
		"W\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005l\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006q\b\u0006\n\u0006\f\u0006t\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u0080\b\t\n\t\f\t\u0083\t\t\u0001\n\u0003\n\u0086\b\n"+
		"\u0001\n\u0001\n\u0003\n\u008a\b\n\u0001\n\u0001\n\u0003\n\u008e\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0095\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u009a\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a1"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000\u0017"+
		"!\u00b6\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000"+
		"\u0000\u0004F\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\b"+
		"P\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000"+
		"\u0000\u000eu\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012"+
		"{\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a2"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a"+
		"\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b \u0003"+
		"\u0004\u0002\u0000\u001c\u001d\u0005\u0010\u0000\u0000\u001d\u001f\u0003"+
		"\u0004\u0002\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\u0003\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\"\u0000"+
		"\u0000$%\u0005\u0011\u0000\u0000%G\u0003\u0012\t\u0000&\'\u0005\"\u0000"+
		"\u0000\')\u0005\u0012\u0000\u0000(*\u0003\u0006\u0003\u0000)(\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+G\u0005"+
		"\u0013\u0000\u0000,.\u0005\r\u0000\u0000-/\u0003\u0012\t\u0000.-\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/G\u0001\u0000\u0000\u0000"+
		"01\u0005\u0001\u0000\u000012\u0003\u0012\t\u000023\u0005\u0002\u0000\u0000"+
		"36\u0003\u0004\u0002\u000045\u0005\u0003\u0000\u000057\u0003\u0004\u0002"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007G\u0001\u0000"+
		"\u0000\u000089\u0005\u0004\u0000\u00009:\u0003\u0012\t\u0000:;\u0005\u0005"+
		"\u0000\u0000;<\u0003\u0004\u0002\u0000<G\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0006\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005\u0007\u0000\u0000@A\u0003"+
		"\u0004\u0002\u0000AG\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CD\u0003"+
		"\u0002\u0001\u0000DE\u0005\t\u0000\u0000EG\u0001\u0000\u0000\u0000F#\u0001"+
		"\u0000\u0000\u0000F&\u0001\u0000\u0000\u0000F,\u0001\u0000\u0000\u0000"+
		"F0\u0001\u0000\u0000\u0000F8\u0001\u0000\u0000\u0000F=\u0001\u0000\u0000"+
		"\u0000FB\u0001\u0000\u0000\u0000G\u0005\u0001\u0000\u0000\u0000HM\u0003"+
		"\u0012\t\u0000IJ\u0005\u0016\u0000\u0000JL\u0003\u0012\t\u0000KI\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PU\u0003\n\u0005\u0000QR\u0005\u0010\u0000\u0000RT\u0003\n"+
		"\u0005\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\t\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000XY\u0005\n\u0000\u0000YZ\u0005\"\u0000\u0000"+
		"Z[\u0005\u0014\u0000\u0000[l\u0003\u0012\t\u0000\\]\u0005\u000b\u0000"+
		"\u0000]^\u0005\"\u0000\u0000^_\u0005\u0015\u0000\u0000_l\u0003\u0010\b"+
		"\u0000`c\u0005\f\u0000\u0000ac\u0003\u0010\b\u0000b`\u0001\u0000\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\"\u0000"+
		"\u0000eg\u0005\u0012\u0000\u0000fh\u0003\f\u0006\u0000gf\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u0013"+
		"\u0000\u0000jl\u0003\u0004\u0002\u0000kX\u0001\u0000\u0000\u0000k\\\u0001"+
		"\u0000\u0000\u0000kb\u0001\u0000\u0000\u0000l\u000b\u0001\u0000\u0000"+
		"\u0000mr\u0003\u000e\u0007\u0000no\u0005\u0016\u0000\u0000oq\u0003\u000e"+
		"\u0007\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uv\u0005\"\u0000\u0000vw\u0005\u0015\u0000\u0000"+
		"wx\u0003\u0010\b\u0000x\u000f\u0001\u0000\u0000\u0000yz\u0005\"\u0000"+
		"\u0000z\u0011\u0001\u0000\u0000\u0000{\u0081\u0003\u0014\n\u0000|}\u0003"+
		"\u0016\u000b\u0000}~\u0003\u0014\n\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007f|\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0013\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0005\u0018\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u00a1\u0005#\u0000\u0000\u0088\u008a\u0005\u0018\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u00a1\u0005\"\u0000\u0000\u008c\u008e\u0005"+
		"\u0018\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u0012\u0000\u0000\u0090\u0091\u0003\u0012\t\u0000\u0091\u0092\u0005\u0013"+
		"\u0000\u0000\u0092\u00a1\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u0018"+
		"\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\"\u0000"+
		"\u0000\u0097\u0099\u0005\u0012\u0000\u0000\u0098\u009a\u0003\u0006\u0003"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a1\u0005\u0013\u0000"+
		"\u0000\u009c\u00a1\u0005%\u0000\u0000\u009d\u00a1\u0005$\u0000\u0000\u009e"+
		"\u00a1\u0005\u000e\u0000\u0000\u009f\u00a1\u0005\u000f\u0000\u0000\u00a0"+
		"\u0085\u0001\u0000\u0000\u0000\u00a0\u0089\u0001\u0000\u0000\u0000\u00a0"+
		"\u008d\u0001\u0000\u0000\u0000\u00a0\u0094\u0001\u0000\u0000\u0000\u00a0"+
		"\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u0015\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0000\u0000\u0000\u00a3"+
		"\u0017\u0001\u0000\u0000\u0000\u0012 ).6FMUbgkr\u0081\u0085\u0089\u008d"+
		"\u0094\u0099\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}