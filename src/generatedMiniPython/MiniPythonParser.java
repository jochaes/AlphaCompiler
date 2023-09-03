// Generated from /Users/jochaes/Documents/Repositorios/Compiladores/AlphaCompiler/Proyecto1G4/MiniPythonParser.g4 by ANTLR 4.12.0
package generatedMiniPython;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, COMA=2, ASSIGN=3, PIZQ=4, PDER=5, CIZQ=6, CDER=7, VIR=8, DOSPUN=9, 
		DOUBLEQUOTES=10, SINGLEQUOTE=11, SUM=12, SUB=13, MUL=14, DIV=15, DEF=16, 
		IF=17, WHILE=18, LET=19, THEN=20, ELSE=21, IN=22, DO=23, BEGIN=24, END=25, 
		CONST=26, VAR=27, CHAR=28, STRING=29, INTEGER=30, ID=31, NUM=32, CHARLIT=33, 
		STRLIT=34, WS=35;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typedenoter = 5, RULE_expression = 6, 
		RULE_primaryExpression = 7, RULE_operator = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"typedenoter", "expression", "primaryExpression", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':='", "'('", "')'", "'{'", "'}'", "'~'", "':'", 
			"'\"'", "'''", "'+'", "'-'", "'*'", "'/'", "'def'", "'if'", "'while'", 
			"'let'", "'then'", "'else'", "'in'", "'do'", "'begin'", "'end'", "'const'", 
			"'var'", "'char'", "'string'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "COMA", "ASSIGN", "PIZQ", "PDER", "CIZQ", "CDER", "VIR", 
			"DOSPUN", "DOUBLEQUOTES", "SINGLEQUOTE", "SUM", "SUB", "MUL", "DIV", 
			"DEF", "IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", "END", 
			"CONST", "VAR", "CHAR", "STRING", "INTEGER", "ID", "NUM", "CHARLIT", 
			"STRLIT", "WS"
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
	public String getGrammarFileName() { return "MiniPythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramASTContext extends ProgramContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			singleCommand();
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandASTContext extends CommandContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(MiniPythonParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(MiniPythonParser.PyCOMA, i);
		}
		public CommandASTContext(CommandContext ctx) { copyFrom(ctx); }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			_localctx = new CommandASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			singleCommand();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(21);
				match(PyCOMA);
				setState(22);
				singleCommand();
				}
				}
				setState(27);
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
	public static class LetSCASTContext extends SingleCommandContext {
		public TerminalNode LET() { return getToken(MiniPythonParser.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(MiniPythonParser.IN, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public LetSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallSCASTContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(MiniPythonParser.PIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PDER() { return getToken(MiniPythonParser.PDER, 0); }
		public List<TerminalNode> COMA() { return getTokens(MiniPythonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiniPythonParser.COMA, i);
		}
		public CallSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignSCASTContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPythonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileSCASTContext extends SingleCommandContext {
		public TerminalNode WHILE() { return getToken(MiniPythonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPythonParser.DO, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public WhileSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfSCASTContext extends SingleCommandContext {
		public TerminalNode IF() { return getToken(MiniPythonParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPythonParser.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPythonParser.ELSE, 0); }
		public IfSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockSCASTContext extends SingleCommandContext {
		public TerminalNode BEGIN() { return getToken(MiniPythonParser.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(MiniPythonParser.END, 0); }
		public BlockSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignSCASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(ID);
				setState(29);
				match(ASSIGN);
				setState(30);
				expression();
				}
				break;
			case 2:
				_localctx = new CallSCASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(ID);
				setState(32);
				match(PIZQ);
				setState(33);
				expression();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(34);
					match(COMA);
					setState(35);
					expression();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				match(PDER);
				}
				break;
			case 3:
				_localctx = new IfSCASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(IF);
				setState(44);
				expression();
				setState(45);
				match(THEN);
				setState(46);
				singleCommand();
				setState(47);
				match(ELSE);
				setState(48);
				singleCommand();
				}
				break;
			case 4:
				_localctx = new WhileSCASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(WHILE);
				setState(51);
				expression();
				setState(52);
				match(DO);
				setState(53);
				singleCommand();
				}
				break;
			case 5:
				_localctx = new LetSCASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(LET);
				setState(56);
				declaration();
				setState(57);
				match(IN);
				setState(58);
				singleCommand();
				}
				break;
			case 6:
				_localctx = new BlockSCASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				match(BEGIN);
				setState(61);
				command();
				setState(62);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationASTContext extends DeclarationContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(MiniPythonParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(MiniPythonParser.PyCOMA, i);
		}
		public DeclarationASTContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			singleDeclaration();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(67);
				match(PyCOMA);
				setState(68);
				singleDeclaration();
				}
				}
				setState(73);
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
	public static class DefSDASTContext extends SingleDeclarationContext {
		public TerminalNode DEF() { return getToken(MiniPythonParser.DEF, 0); }
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public TerminalNode CIZQ() { return getToken(MiniPythonParser.CIZQ, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode CDER() { return getToken(MiniPythonParser.CDER, 0); }
		public TerminalNode PIZQ() { return getToken(MiniPythonParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiniPythonParser.PDER, 0); }
		public List<TerminalNode> DOSPUN() { return getTokens(MiniPythonParser.DOSPUN); }
		public TerminalNode DOSPUN(int i) {
			return getToken(MiniPythonParser.DOSPUN, i);
		}
		public List<TypedenoterContext> typedenoter() {
			return getRuleContexts(TypedenoterContext.class);
		}
		public TypedenoterContext typedenoter(int i) {
			return getRuleContext(TypedenoterContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiniPythonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiniPythonParser.COMA, i);
		}
		public DefSDASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstSDASTContext extends SingleDeclarationContext {
		public TerminalNode CONST() { return getToken(MiniPythonParser.CONST, 0); }
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public TerminalNode VIR() { return getToken(MiniPythonParser.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstSDASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarSDASTContext extends SingleDeclarationContext {
		public TerminalNode VAR() { return getToken(MiniPythonParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public TerminalNode DOSPUN() { return getToken(MiniPythonParser.DOSPUN, 0); }
		public TypedenoterContext typedenoter() {
			return getRuleContext(TypedenoterContext.class,0);
		}
		public VarSDASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstSDASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(CONST);
				setState(75);
				match(ID);
				setState(76);
				match(VIR);
				setState(77);
				expression();
				}
				break;
			case VAR:
				_localctx = new VarSDASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(VAR);
				setState(79);
				match(ID);
				setState(80);
				match(DOSPUN);
				setState(81);
				typedenoter();
				}
				break;
			case DEF:
				_localctx = new DefSDASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(DEF);
				setState(83);
				match(ID);
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(84);
					match(PIZQ);
					setState(85);
					match(PDER);
					}
					break;
				case 2:
					{
					setState(86);
					match(PIZQ);
					setState(87);
					match(ID);
					setState(88);
					match(DOSPUN);
					setState(89);
					typedenoter();
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(90);
						match(COMA);
						setState(91);
						match(ID);
						setState(92);
						match(DOSPUN);
						setState(93);
						typedenoter();
						}
						}
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(99);
					match(PDER);
					}
					break;
				}
				setState(103);
				match(CIZQ);
				setState(104);
				command();
				setState(105);
				match(CDER);
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
	public static class TypedenoterContext extends ParserRuleContext {
		public TypedenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedenoter; }
	 
		public TypedenoterContext() { }
		public void copyFrom(TypedenoterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTDASTContext extends TypedenoterContext {
		public TerminalNode INTEGER() { return getToken(MiniPythonParser.INTEGER, 0); }
		public IntTDASTContext(TypedenoterContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTDASTContext extends TypedenoterContext {
		public TerminalNode CHAR() { return getToken(MiniPythonParser.CHAR, 0); }
		public CharTDASTContext(TypedenoterContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTDASTContext extends TypedenoterContext {
		public TerminalNode STRING() { return getToken(MiniPythonParser.STRING, 0); }
		public StringTDASTContext(TypedenoterContext ctx) { copyFrom(ctx); }
	}

	public final TypedenoterContext typedenoter() throws RecognitionException {
		TypedenoterContext _localctx = new TypedenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedenoter);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntTDASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(INTEGER);
				}
				break;
			case CHAR:
				_localctx = new CharTDASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(CHAR);
				}
				break;
			case STRING:
				_localctx = new StringTDASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(STRING);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionASTContext extends ExpressionContext {
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
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			primaryExpression();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) {
				{
				{
				setState(115);
				operator();
				setState(116);
				primaryExpression();
				}
				}
				setState(122);
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
	public static class NumPEASTContext extends PrimaryExpressionContext {
		public TerminalNode NUM() { return getToken(MiniPythonParser.NUM, 0); }
		public NumPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrPEASTContext extends PrimaryExpressionContext {
		public TerminalNode STRLIT() { return getToken(MiniPythonParser.STRLIT, 0); }
		public StrPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdPEASTContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public IdPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPEASTContext extends PrimaryExpressionContext {
		public TerminalNode PIZQ() { return getToken(MiniPythonParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiniPythonParser.PDER, 0); }
		public ExpPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharPEASTContext extends PrimaryExpressionContext {
		public TerminalNode CHARLIT() { return getToken(MiniPythonParser.CHARLIT, 0); }
		public CharPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumPEASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new IdPEASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(ID);
				}
				break;
			case PIZQ:
				_localctx = new ExpPEASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(PIZQ);
				setState(126);
				expression();
				setState(127);
				match(PDER);
				}
				break;
			case CHARLIT:
				_localctx = new CharPEASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(CHARLIT);
				}
				break;
			case STRLIT:
				_localctx = new StrPEASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(STRLIT);
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
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(MiniPythonParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(MiniPythonParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(MiniPythonParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiniPythonParser.DIV, 0); }
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
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
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
		"\u0004\u0001#\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004_\b\u0004\n\u0004\f\u0004b\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004f\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004l\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005q\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006w\b\u0006\n\u0006\f\u0006z\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0084\b\u0007\u0001\b\u0001\b\u0001\b\u0000"+
		"\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000"+
		"\f\u000f\u0091\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000"+
		"\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000"+
		"\bk\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fr\u0001\u0000"+
		"\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0001\u0001\u0000"+
		"\u0000\u0000\u0014\u0019\u0003\u0004\u0002\u0000\u0015\u0016\u0005\u0001"+
		"\u0000\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u001f"+
		"\u0000\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001eA\u0003\f\u0006"+
		"\u0000\u001f \u0005\u001f\u0000\u0000 !\u0005\u0004\u0000\u0000!&\u0003"+
		"\f\u0006\u0000\"#\u0005\u0002\u0000\u0000#%\u0003\f\u0006\u0000$\"\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000)*\u0005\u0005\u0000\u0000*A\u0001\u0000\u0000\u0000+,\u0005\u0011"+
		"\u0000\u0000,-\u0003\f\u0006\u0000-.\u0005\u0014\u0000\u0000./\u0003\u0004"+
		"\u0002\u0000/0\u0005\u0015\u0000\u000001\u0003\u0004\u0002\u00001A\u0001"+
		"\u0000\u0000\u000023\u0005\u0012\u0000\u000034\u0003\f\u0006\u000045\u0005"+
		"\u0017\u0000\u000056\u0003\u0004\u0002\u00006A\u0001\u0000\u0000\u0000"+
		"78\u0005\u0013\u0000\u000089\u0003\u0006\u0003\u00009:\u0005\u0016\u0000"+
		"\u0000:;\u0003\u0004\u0002\u0000;A\u0001\u0000\u0000\u0000<=\u0005\u0018"+
		"\u0000\u0000=>\u0003\u0002\u0001\u0000>?\u0005\u0019\u0000\u0000?A\u0001"+
		"\u0000\u0000\u0000@\u001c\u0001\u0000\u0000\u0000@\u001f\u0001\u0000\u0000"+
		"\u0000@+\u0001\u0000\u0000\u0000@2\u0001\u0000\u0000\u0000@7\u0001\u0000"+
		"\u0000\u0000@<\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000"+
		"BG\u0003\b\u0004\u0000CD\u0005\u0001\u0000\u0000DF\u0003\b\u0004\u0000"+
		"EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JK\u0005\u001a\u0000\u0000KL\u0005\u001f\u0000\u0000"+
		"LM\u0005\b\u0000\u0000Ml\u0003\f\u0006\u0000NO\u0005\u001b\u0000\u0000"+
		"OP\u0005\u001f\u0000\u0000PQ\u0005\t\u0000\u0000Ql\u0003\n\u0005\u0000"+
		"RS\u0005\u0010\u0000\u0000Se\u0005\u001f\u0000\u0000TU\u0005\u0004\u0000"+
		"\u0000Uf\u0005\u0005\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0005\u001f"+
		"\u0000\u0000XY\u0005\t\u0000\u0000Y`\u0003\n\u0005\u0000Z[\u0005\u0002"+
		"\u0000\u0000[\\\u0005\u001f\u0000\u0000\\]\u0005\t\u0000\u0000]_\u0003"+
		"\n\u0005\u0000^Z\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cd\u0005\u0005\u0000\u0000df\u0001\u0000\u0000"+
		"\u0000eT\u0001\u0000\u0000\u0000eV\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0006\u0000\u0000hi\u0003\u0002\u0001\u0000ij\u0005"+
		"\u0007\u0000\u0000jl\u0001\u0000\u0000\u0000kJ\u0001\u0000\u0000\u0000"+
		"kN\u0001\u0000\u0000\u0000kR\u0001\u0000\u0000\u0000l\t\u0001\u0000\u0000"+
		"\u0000mq\u0005\u001e\u0000\u0000nq\u0005\u001c\u0000\u0000oq\u0005\u001d"+
		"\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rx\u0003\u000e\u0007"+
		"\u0000st\u0003\u0010\b\u0000tu\u0003\u000e\u0007\u0000uw\u0001\u0000\u0000"+
		"\u0000vs\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\r\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{\u0084\u0005 \u0000\u0000|\u0084\u0005\u001f\u0000"+
		"\u0000}~\u0005\u0004\u0000\u0000~\u007f\u0003\f\u0006\u0000\u007f\u0080"+
		"\u0005\u0005\u0000\u0000\u0080\u0084\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0005!\u0000\u0000\u0082\u0084\u0005\"\u0000\u0000\u0083{\u0001\u0000"+
		"\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0000\u0000\u0000"+
		"\u0086\u0011\u0001\u0000\u0000\u0000\n\u0019&@G`ekpx\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}