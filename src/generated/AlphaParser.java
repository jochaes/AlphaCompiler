// Generated from /Users/jochaes/Documents/Repositorios/AlphaCompiler/AlphaParser.g4 by ANTLR 4.12.0
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlphaParser extends Parser {
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
	public String getGrammarFileName() { return "AlphaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlphaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
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
		public List<TerminalNode> PyCOMA() { return getTokens(AlphaParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(AlphaParser.PyCOMA, i);
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
		public TerminalNode ID() { return getToken(AlphaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AlphaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(AlphaParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(AlphaParser.PDER, 0); }
		public TerminalNode IF() { return getToken(AlphaParser.IF, 0); }
		public TerminalNode THEN() { return getToken(AlphaParser.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AlphaParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(AlphaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(AlphaParser.DO, 0); }
		public TerminalNode LET() { return getToken(AlphaParser.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(AlphaParser.IN, 0); }
		public TerminalNode BEGIN() { return getToken(AlphaParser.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(AlphaParser.END, 0); }
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(ID);
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(29);
					match(ASSIGN);
					setState(30);
					expression();
					}
					break;
				case PIZQ:
					{
					setState(31);
					match(PIZQ);
					setState(32);
					expression();
					setState(33);
					match(PDER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(IF);
				setState(38);
				expression();
				setState(39);
				match(THEN);
				setState(40);
				singleCommand();
				setState(41);
				match(ELSE);
				setState(42);
				singleCommand();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(WHILE);
				setState(45);
				expression();
				setState(46);
				match(DO);
				setState(47);
				singleCommand();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(LET);
				setState(50);
				declaration();
				setState(51);
				match(IN);
				setState(52);
				singleCommand();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(BEGIN);
				setState(55);
				command();
				setState(56);
				match(END);
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
	public static class DeclarationContext extends ParserRuleContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(AlphaParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(AlphaParser.PyCOMA, i);
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
			setState(60);
			singleDeclaration();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(61);
				match(PyCOMA);
				setState(62);
				singleDeclaration();
				}
				}
				setState(67);
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
		public TerminalNode CONST() { return getToken(AlphaParser.CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(AlphaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AlphaParser.ID, i);
		}
		public TerminalNode VIR() { return getToken(AlphaParser.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(AlphaParser.VAR, 0); }
		public List<TerminalNode> DOSPUN() { return getTokens(AlphaParser.DOSPUN); }
		public TerminalNode DOSPUN(int i) {
			return getToken(AlphaParser.DOSPUN, i);
		}
		public List<TypedenoterContext> typedenoter() {
			return getRuleContexts(TypedenoterContext.class);
		}
		public TypedenoterContext typedenoter(int i) {
			return getRuleContext(TypedenoterContext.class,i);
		}
		public TerminalNode DEF() { return getToken(AlphaParser.DEF, 0); }
		public TerminalNode CIZQ() { return getToken(AlphaParser.CIZQ, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode CDER() { return getToken(AlphaParser.CDER, 0); }
		public TerminalNode PIZQ() { return getToken(AlphaParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(AlphaParser.PDER, 0); }
		public List<TerminalNode> COMA() { return getTokens(AlphaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(AlphaParser.COMA, i);
		}
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(CONST);
				setState(69);
				match(ID);
				setState(70);
				match(VIR);
				setState(71);
				expression();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(VAR);
				setState(73);
				match(ID);
				setState(74);
				match(DOSPUN);
				setState(75);
				typedenoter();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(DEF);
				setState(77);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(78);
					match(PIZQ);
					setState(79);
					match(PDER);
					}
					break;
				case 2:
					{
					setState(80);
					match(PIZQ);
					setState(81);
					match(ID);
					setState(82);
					match(DOSPUN);
					setState(83);
					typedenoter();
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(84);
						match(COMA);
						setState(85);
						match(ID);
						setState(86);
						match(DOSPUN);
						setState(87);
						typedenoter();
						}
						}
						setState(92);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(93);
					match(PDER);
					}
					break;
				}
				setState(97);
				match(CIZQ);
				setState(98);
				command();
				setState(99);
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
		public TerminalNode INTEGER() { return getToken(AlphaParser.INTEGER, 0); }
		public TerminalNode CHAR() { return getToken(AlphaParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(AlphaParser.STRING, 0); }
		public TypedenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedenoter; }
	}

	public final TypedenoterContext typedenoter() throws RecognitionException {
		TypedenoterContext _localctx = new TypedenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedenoter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
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
			setState(105);
			primaryExpression();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) {
				{
				{
				setState(106);
				operator();
				setState(107);
				primaryExpression();
				}
				}
				setState(113);
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
		public TerminalNode NUM() { return getToken(AlphaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(AlphaParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(AlphaParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(AlphaParser.PDER, 0); }
		public TerminalNode CHARLIT() { return getToken(AlphaParser.CHARLIT, 0); }
		public TerminalNode STRLIT() { return getToken(AlphaParser.STRLIT, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(ID);
				}
				break;
			case PIZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(PIZQ);
				setState(117);
				expression();
				setState(118);
				match(PDER);
				}
				break;
			case CHARLIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(CHARLIT);
				}
				break;
			case STRLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
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
		public TerminalNode SUM() { return getToken(AlphaParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(AlphaParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(AlphaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AlphaParser.DIV, 0); }
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
			setState(124);
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
		"\u0004\u0001#\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002;\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003@\b\u0003\n\u0003"+
		"\f\u0003C\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004Y\b\u0004\n\u0004"+
		"\f\u0004\\\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004`\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004f\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006n\b\u0006\n\u0006\f\u0006q\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007{\b\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0002\u0001\u0000\u001c\u001e\u0001\u0000"+
		"\f\u000f\u0085\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000"+
		"\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000"+
		"\be\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000\u0000\fi\u0001\u0000"+
		"\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0001\u0001\u0000\u0000\u0000"+
		"\u0014\u0019\u0003\u0004\u0002\u0000\u0015\u0016\u0005\u0001\u0000\u0000"+
		"\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0015\u0001\u0000\u0000\u0000"+
		"\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001c#\u0005\u001f\u0000\u0000\u001d"+
		"\u001e\u0005\u0003\u0000\u0000\u001e$\u0003\f\u0006\u0000\u001f \u0005"+
		"\u0004\u0000\u0000 !\u0003\f\u0006\u0000!\"\u0005\u0005\u0000\u0000\""+
		"$\u0001\u0000\u0000\u0000#\u001d\u0001\u0000\u0000\u0000#\u001f\u0001"+
		"\u0000\u0000\u0000$;\u0001\u0000\u0000\u0000%&\u0005\u0011\u0000\u0000"+
		"&\'\u0003\f\u0006\u0000\'(\u0005\u0014\u0000\u0000()\u0003\u0004\u0002"+
		"\u0000)*\u0005\u0015\u0000\u0000*+\u0003\u0004\u0002\u0000+;\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0012\u0000\u0000-.\u0003\f\u0006\u0000./\u0005\u0017"+
		"\u0000\u0000/0\u0003\u0004\u0002\u00000;\u0001\u0000\u0000\u000012\u0005"+
		"\u0013\u0000\u000023\u0003\u0006\u0003\u000034\u0005\u0016\u0000\u0000"+
		"45\u0003\u0004\u0002\u00005;\u0001\u0000\u0000\u000067\u0005\u0018\u0000"+
		"\u000078\u0003\u0002\u0001\u000089\u0005\u0019\u0000\u00009;\u0001\u0000"+
		"\u0000\u0000:\u001c\u0001\u0000\u0000\u0000:%\u0001\u0000\u0000\u0000"+
		":,\u0001\u0000\u0000\u0000:1\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000"+
		"\u0000;\u0005\u0001\u0000\u0000\u0000<A\u0003\b\u0004\u0000=>\u0005\u0001"+
		"\u0000\u0000>@\u0003\b\u0004\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0007"+
		"\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u001a\u0000"+
		"\u0000EF\u0005\u001f\u0000\u0000FG\u0005\b\u0000\u0000Gf\u0003\f\u0006"+
		"\u0000HI\u0005\u001b\u0000\u0000IJ\u0005\u001f\u0000\u0000JK\u0005\t\u0000"+
		"\u0000Kf\u0003\n\u0005\u0000LM\u0005\u0010\u0000\u0000M_\u0005\u001f\u0000"+
		"\u0000NO\u0005\u0004\u0000\u0000O`\u0005\u0005\u0000\u0000PQ\u0005\u0004"+
		"\u0000\u0000QR\u0005\u001f\u0000\u0000RS\u0005\t\u0000\u0000SZ\u0003\n"+
		"\u0005\u0000TU\u0005\u0002\u0000\u0000UV\u0005\u001f\u0000\u0000VW\u0005"+
		"\t\u0000\u0000WY\u0003\n\u0005\u0000XT\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u0005\u0000"+
		"\u0000^`\u0001\u0000\u0000\u0000_N\u0001\u0000\u0000\u0000_P\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0006\u0000\u0000bc\u0003"+
		"\u0002\u0001\u0000cd\u0005\u0007\u0000\u0000df\u0001\u0000\u0000\u0000"+
		"eD\u0001\u0000\u0000\u0000eH\u0001\u0000\u0000\u0000eL\u0001\u0000\u0000"+
		"\u0000f\t\u0001\u0000\u0000\u0000gh\u0007\u0000\u0000\u0000h\u000b\u0001"+
		"\u0000\u0000\u0000io\u0003\u000e\u0007\u0000jk\u0003\u0010\b\u0000kl\u0003"+
		"\u000e\u0007\u0000ln\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p\r\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000r{\u0005 \u0000"+
		"\u0000s{\u0005\u001f\u0000\u0000tu\u0005\u0004\u0000\u0000uv\u0003\f\u0006"+
		"\u0000vw\u0005\u0005\u0000\u0000w{\u0001\u0000\u0000\u0000x{\u0005!\u0000"+
		"\u0000y{\u0005\"\u0000\u0000zr\u0001\u0000\u0000\u0000zs\u0001\u0000\u0000"+
		"\u0000zt\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0007\u0001\u0000\u0000"+
		"}\u0011\u0001\u0000\u0000\u0000\t\u0019#:AZ_eoz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}