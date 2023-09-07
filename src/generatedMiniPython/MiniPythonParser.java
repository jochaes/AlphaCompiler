// Generated from /Users/gilda/Desktop/Repositorios/AlphaCompiler/Proyecto1G4/MiniPythonParser.g4 by ANTLR 4.12.0
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
		INDENT=1, DEDENT=2, COMMA=3, COLON=4, OPENPARENTHESIS=5, CLOSEPARENTHESIS=6, 
		OPENCURLYBRACE=7, CLOSECURLYBRACE=8, OPENSQRBRACKET=9, CLOSESQRBRACKET=10, 
		DOUBLEQUOTES=11, SINGLEQUOTE=12, PLUSSIGN=13, MINUSSIGN=14, ASTERISK=15, 
		SLASH=16, LESSTHAN=17, GREATERTHAN=18, LESSTHANEQUAL=19, GREATERTHANEQUAL=20, 
		COMPARISON=21, DEF=22, IF=23, WHILE=24, ELSE=25, IN=26, DO=27, CONST=28, 
		VAR=29, IDENTIFIER=30, INTEGER=31, CHARCONST=32, STRING=33, NL=34, FOR=35, 
		RETURN=36, NEWLINE=37, PRINT=38, ASSIGNMENT=39, FLOAT=40, LEN=41;
	public static final int
		RULE_program = 0, RULE_mainStatement = 1, RULE_statement = 2, RULE_defStatement = 3, 
		RULE_argList = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, RULE_forStatement = 7, 
		RULE_returnStatement = 8, RULE_printStatement = 9, RULE_assignStatement = 10, 
		RULE_functionCallStatement = 11, RULE_expressionStatement = 12, RULE_sequence = 13, 
		RULE_expression = 14, RULE_comparison = 15, RULE_comparisonOperator = 16, 
		RULE_additionExpression = 17, RULE_additionFactor = 18, RULE_multiplicationExpression = 19, 
		RULE_multiplicationFactor = 20, RULE_elementExpression = 21, RULE_elementAccess = 22, 
		RULE_expressionList = 23, RULE_primitiveExpression = 24, RULE_listExpression = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainStatement", "statement", "defStatement", "argList", "ifStatement", 
			"whileStatement", "forStatement", "returnStatement", "printStatement", 
			"assignStatement", "functionCallStatement", "expressionStatement", "sequence", 
			"expression", "comparison", "comparisonOperator", "additionExpression", 
			"additionFactor", "multiplicationExpression", "multiplicationFactor", 
			"elementExpression", "elementAccess", "expressionList", "primitiveExpression", 
			"listExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "','", "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'\"'", "'''", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'def'", "'if'", "'while'", "'else'", "'in'", "'do'", "'const'", 
			"'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "COMMA", "COLON", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"OPENCURLYBRACE", "CLOSECURLYBRACE", "OPENSQRBRACKET", "CLOSESQRBRACKET", 
			"DOUBLEQUOTES", "SINGLEQUOTE", "PLUSSIGN", "MINUSSIGN", "ASTERISK", "SLASH", 
			"LESSTHAN", "GREATERTHAN", "LESSTHANEQUAL", "GREATERTHANEQUAL", "COMPARISON", 
			"DEF", "IF", "WHILE", "ELSE", "IN", "DO", "CONST", "VAR", "IDENTIFIER", 
			"INTEGER", "CHARCONST", "STRING", "NL", "FOR", "RETURN", "NEWLINE", "PRINT", 
			"ASSIGNMENT", "FLOAT", "LEN"
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
		public List<MainStatementContext> mainStatement() {
			return getRuleContexts(MainStatementContext.class);
		}
		public MainStatementContext mainStatement(int i) {
			return getRuleContext(MainStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			mainStatement();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF || _la==IDENTIFIER) {
				{
				{
				setState(53);
				mainStatement();
				}
				}
				setState(58);
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
	public static class MainStatementContext extends ParserRuleContext {
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainStatement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				defStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				assignStatement();
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
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				returnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				assignStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				functionCallStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				expressionStatement();
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
	public static class DefStatementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(MiniPythonParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode COLON() { return getToken(MiniPythonParser.COLON, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(DEF);
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(OPENPARENTHESIS);
			setState(76);
			argList();
			setState(77);
			match(CLOSEPARENTHESIS);
			setState(78);
			match(COLON);
			setState(79);
			sequence();
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
	public static class ArgListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniPythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniPythonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPythonParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(81);
				match(IDENTIFIER);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(82);
					match(COMMA);
					setState(83);
					match(IDENTIFIER);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPythonParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(MiniPythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MiniPythonParser.COLON, i);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPythonParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IF);
			setState(92);
			expression();
			setState(93);
			match(COLON);
			setState(94);
			sequence();
			setState(95);
			match(ELSE);
			setState(96);
			match(COLON);
			setState(97);
			sequence();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniPythonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPythonParser.COLON, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(WHILE);
			setState(100);
			expression();
			setState(101);
			match(COLON);
			setState(102);
			sequence();
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniPythonParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(MiniPythonParser.IN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPythonParser.COLON, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(FOR);
			setState(105);
			expression();
			setState(106);
			match(IN);
			setState(107);
			expressionList();
			setState(108);
			match(COLON);
			setState(109);
			sequence();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniPythonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(RETURN);
			setState(112);
			expression();
			setState(113);
			match(NEWLINE);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MiniPythonParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PRINT);
			setState(116);
			expression();
			setState(117);
			match(NEWLINE);
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
	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(MiniPythonParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFIER);
			setState(120);
			match(ASSIGNMENT);
			setState(121);
			expression();
			setState(122);
			match(NEWLINE);
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
	public static class FunctionCallStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(OPENPARENTHESIS);
			setState(126);
			expressionList();
			setState(127);
			match(NEWLINE);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			expressionList();
			setState(130);
			match(NEWLINE);
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
	public static class SequenceContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(MiniPythonParser.INDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(MiniPythonParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MiniPythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniPythonParser.NEWLINE, i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(INDENT);
			setState(133);
			statement();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(134);
				match(NEWLINE);
				setState(135);
				statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(DEDENT);
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
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			additionExpression();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) {
				{
				{
				setState(144);
				comparison();
				}
				}
				setState(149);
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
	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			comparisonOperator();
			setState(151);
			additionExpression();
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(MiniPythonParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(MiniPythonParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(MiniPythonParser.LESSTHANEQUAL, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(MiniPythonParser.GREATERTHANEQUAL, 0); }
		public TerminalNode COMPARISON() { return getToken(MiniPythonParser.COMPARISON, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) ) {
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
	public static class AdditionExpressionContext extends ParserRuleContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public List<AdditionFactorContext> additionFactor() {
			return getRuleContexts(AdditionFactorContext.class);
		}
		public AdditionFactorContext additionFactor(int i) {
			return getRuleContext(AdditionFactorContext.class,i);
		}
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			multiplicationExpression();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUSSIGN || _la==MINUSSIGN) {
				{
				{
				setState(156);
				additionFactor();
				}
				}
				setState(161);
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
	public static class AdditionFactorContext extends ParserRuleContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public TerminalNode PLUSSIGN() { return getToken(MiniPythonParser.PLUSSIGN, 0); }
		public TerminalNode MINUSSIGN() { return getToken(MiniPythonParser.MINUSSIGN, 0); }
		public AdditionFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionFactor; }
	}

	public final AdditionFactorContext additionFactor() throws RecognitionException {
		AdditionFactorContext _localctx = new AdditionFactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additionFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==PLUSSIGN || _la==MINUSSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			multiplicationExpression();
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
	public static class MultiplicationExpressionContext extends ParserRuleContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public List<MultiplicationFactorContext> multiplicationFactor() {
			return getRuleContexts(MultiplicationFactorContext.class);
		}
		public MultiplicationFactorContext multiplicationFactor(int i) {
			return getRuleContext(MultiplicationFactorContext.class,i);
		}
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			elementExpression();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISK || _la==SLASH) {
				{
				{
				setState(166);
				multiplicationFactor();
				}
				}
				setState(171);
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
	public static class MultiplicationFactorContext extends ParserRuleContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(MiniPythonParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(MiniPythonParser.SLASH, 0); }
		public MultiplicationFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationFactor; }
	}

	public final MultiplicationFactorContext multiplicationFactor() throws RecognitionException {
		MultiplicationFactorContext _localctx = new MultiplicationFactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicationFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==ASTERISK || _la==SLASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(173);
			elementExpression();
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
	public static class ElementExpressionContext extends ParserRuleContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public List<ElementAccessContext> elementAccess() {
			return getRuleContexts(ElementAccessContext.class);
		}
		public ElementAccessContext elementAccess(int i) {
			return getRuleContext(ElementAccessContext.class,i);
		}
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			primitiveExpression();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENSQRBRACKET) {
				{
				{
				setState(176);
				elementAccess();
				}
				}
				setState(181);
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
	public static class ElementAccessContext extends ParserRuleContext {
		public TerminalNode OPENSQRBRACKET() { return getToken(MiniPythonParser.OPENSQRBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSESQRBRACKET() { return getToken(MiniPythonParser.CLOSESQRBRACKET, 0); }
		public ElementAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAccess; }
	}

	public final ElementAccessContext elementAccess() throws RecognitionException {
		ElementAccessContext _localctx = new ElementAccessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elementAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(OPENSQRBRACKET);
			setState(183);
			expression();
			setState(184);
			match(CLOSESQRBRACKET);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPythonParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3314641027616L) != 0)) {
				{
				setState(186);
				expression();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(187);
					match(COMMA);
					setState(188);
					expression();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class PrimitiveExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniPythonParser.INTEGER, 0); }
		public TerminalNode MINUSSIGN() { return getToken(MiniPythonParser.MINUSSIGN, 0); }
		public TerminalNode FLOAT() { return getToken(MiniPythonParser.FLOAT, 0); }
		public TerminalNode CHARCONST() { return getToken(MiniPythonParser.CHARCONST, 0); }
		public TerminalNode STRING() { return getToken(MiniPythonParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public TerminalNode LEN() { return getToken(MiniPythonParser.LEN, 0); }
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primitiveExpression);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSSIGN) {
					{
					setState(196);
					match(MINUSSIGN);
					}
				}

				setState(199);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSSIGN) {
					{
					setState(200);
					match(MINUSSIGN);
					}
				}

				setState(203);
				match(FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(CHARCONST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(IDENTIFIER);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENPARENTHESIS) {
					{
					setState(207);
					match(OPENPARENTHESIS);
					setState(208);
					expressionList();
					setState(209);
					match(CLOSEPARENTHESIS);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				match(OPENPARENTHESIS);
				setState(214);
				expression();
				setState(215);
				match(CLOSEPARENTHESIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				listExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				match(LEN);
				setState(219);
				match(OPENPARENTHESIS);
				setState(220);
				expression();
				setState(221);
				match(CLOSEPARENTHESIS);
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
	public static class ListExpressionContext extends ParserRuleContext {
		public TerminalNode OPENSQRBRACKET() { return getToken(MiniPythonParser.OPENSQRBRACKET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CLOSESQRBRACKET() { return getToken(MiniPythonParser.CLOSESQRBRACKET, 0); }
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(OPENSQRBRACKET);
			setState(226);
			expressionList();
			setState(227);
			match(CLOSESQRBRACKET);
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
		"\u0004\u0001)\u00e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000"+
		"\n\u0000\f\u0000:\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004"+
		"X\t\u0004\u0003\u0004Z\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u0089\b\r\n\r\f\r\u008c\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0092\b\u000e\n\u000e\f\u000e\u0095\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u009e\b\u0011\n\u0011\f\u0011\u00a1\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00a8\b\u0013\n\u0013\f\u0013"+
		"\u00ab\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u00b2\b\u0015\n\u0015\f\u0015\u00b5\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u00be\b\u0017\n\u0017\f\u0017\u00c1\t\u0017\u0003\u0017\u00c3\b"+
		"\u0017\u0001\u0018\u0003\u0018\u00c6\b\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00ca\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00d4\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e0\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02\u0000\u0003\u0001\u0000\u0011\u0015\u0001\u0000"+
		"\r\u000e\u0001\u0000\u000f\u0010\u00e7\u00004\u0001\u0000\u0000\u0000"+
		"\u0002=\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006I"+
		"\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\fc\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010"+
		"o\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014w\u0001"+
		"\u0000\u0000\u0000\u0016|\u0001\u0000\u0000\u0000\u0018\u0081\u0001\u0000"+
		"\u0000\u0000\u001a\u0084\u0001\u0000\u0000\u0000\u001c\u008f\u0001\u0000"+
		"\u0000\u0000\u001e\u0096\u0001\u0000\u0000\u0000 \u0099\u0001\u0000\u0000"+
		"\u0000\"\u009b\u0001\u0000\u0000\u0000$\u00a2\u0001\u0000\u0000\u0000"+
		"&\u00a5\u0001\u0000\u0000\u0000(\u00ac\u0001\u0000\u0000\u0000*\u00af"+
		"\u0001\u0000\u0000\u0000,\u00b6\u0001\u0000\u0000\u0000.\u00c2\u0001\u0000"+
		"\u0000\u00000\u00df\u0001\u0000\u0000\u00002\u00e1\u0001\u0000\u0000\u0000"+
		"48\u0003\u0002\u0001\u000057\u0003\u0002\u0001\u000065\u0001\u0000\u0000"+
		"\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009\u0001\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		";>\u0003\u0006\u0003\u0000<>\u0003\u0014\n\u0000=;\u0001\u0000\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?H\u0003\n\u0005"+
		"\u0000@H\u0003\u0010\b\u0000AH\u0003\u0012\t\u0000BH\u0003\f\u0006\u0000"+
		"CH\u0003\u000e\u0007\u0000DH\u0003\u0014\n\u0000EH\u0003\u0016\u000b\u0000"+
		"FH\u0003\u0018\f\u0000G?\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000"+
		"GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000"+
		"\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0005\u0016\u0000\u0000"+
		"JK\u0005\u001e\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0003\b\u0004\u0000"+
		"MN\u0005\u0006\u0000\u0000NO\u0005\u0004\u0000\u0000OP\u0003\u001a\r\u0000"+
		"P\u0007\u0001\u0000\u0000\u0000QV\u0005\u001e\u0000\u0000RS\u0005\u0003"+
		"\u0000\u0000SU\u0005\u001e\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YQ\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005\u0017"+
		"\u0000\u0000\\]\u0003\u001c\u000e\u0000]^\u0005\u0004\u0000\u0000^_\u0003"+
		"\u001a\r\u0000_`\u0005\u0019\u0000\u0000`a\u0005\u0004\u0000\u0000ab\u0003"+
		"\u001a\r\u0000b\u000b\u0001\u0000\u0000\u0000cd\u0005\u0018\u0000\u0000"+
		"de\u0003\u001c\u000e\u0000ef\u0005\u0004\u0000\u0000fg\u0003\u001a\r\u0000"+
		"g\r\u0001\u0000\u0000\u0000hi\u0005#\u0000\u0000ij\u0003\u001c\u000e\u0000"+
		"jk\u0005\u001a\u0000\u0000kl\u0003.\u0017\u0000lm\u0005\u0004\u0000\u0000"+
		"mn\u0003\u001a\r\u0000n\u000f\u0001\u0000\u0000\u0000op\u0005$\u0000\u0000"+
		"pq\u0003\u001c\u000e\u0000qr\u0005%\u0000\u0000r\u0011\u0001\u0000\u0000"+
		"\u0000st\u0005&\u0000\u0000tu\u0003\u001c\u000e\u0000uv\u0005%\u0000\u0000"+
		"v\u0013\u0001\u0000\u0000\u0000wx\u0005\u001e\u0000\u0000xy\u0005\'\u0000"+
		"\u0000yz\u0003\u001c\u000e\u0000z{\u0005%\u0000\u0000{\u0015\u0001\u0000"+
		"\u0000\u0000|}\u0005\u001e\u0000\u0000}~\u0005\u0005\u0000\u0000~\u007f"+
		"\u0003.\u0017\u0000\u007f\u0080\u0005%\u0000\u0000\u0080\u0017\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0003.\u0017\u0000\u0082\u0083\u0005%\u0000\u0000"+
		"\u0083\u0019\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000"+
		"\u0085\u008a\u0003\u0004\u0002\u0000\u0086\u0087\u0005%\u0000\u0000\u0087"+
		"\u0089\u0003\u0004\u0002\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0002\u0000\u0000\u008e"+
		"\u001b\u0001\u0000\u0000\u0000\u008f\u0093\u0003\"\u0011\u0000\u0090\u0092"+
		"\u0003\u001e\u000f\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u001d\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0003 \u0010\u0000\u0097\u0098\u0003"+
		"\"\u0011\u0000\u0098\u001f\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0000"+
		"\u0000\u0000\u009a!\u0001\u0000\u0000\u0000\u009b\u009f\u0003&\u0013\u0000"+
		"\u009c\u009e\u0003$\u0012\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0#\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0001\u0000\u0000\u00a3\u00a4"+
		"\u0003&\u0013\u0000\u00a4%\u0001\u0000\u0000\u0000\u00a5\u00a9\u0003*"+
		"\u0015\u0000\u00a6\u00a8\u0003(\u0014\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\'\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0002\u0000\u0000"+
		"\u00ad\u00ae\u0003*\u0015\u0000\u00ae)\u0001\u0000\u0000\u0000\u00af\u00b3"+
		"\u00030\u0018\u0000\u00b0\u00b2\u0003,\u0016\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4+\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\t\u0000\u0000"+
		"\u00b7\u00b8\u0003\u001c\u000e\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9"+
		"-\u0001\u0000\u0000\u0000\u00ba\u00bf\u0003\u001c\u000e\u0000\u00bb\u00bc"+
		"\u0005\u0003\u0000\u0000\u00bc\u00be\u0003\u001c\u000e\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00ba"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3/\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c6\u0005\u000e\u0000\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00e0\u0005\u001f\u0000\u0000\u00c8\u00ca\u0005"+
		"\u000e\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00e0\u0005"+
		"(\u0000\u0000\u00cc\u00e0\u0005 \u0000\u0000\u00cd\u00e0\u0005!\u0000"+
		"\u0000\u00ce\u00d3\u0005\u001e\u0000\u0000\u00cf\u00d0\u0005\u0005\u0000"+
		"\u0000\u00d0\u00d1\u0003.\u0017\u0000\u00d1\u00d2\u0005\u0006\u0000\u0000"+
		"\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00e0\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6\u00d7\u0003\u001c\u000e\u0000"+
		"\u00d7\u00d8\u0005\u0006\u0000\u0000\u00d8\u00e0\u0001\u0000\u0000\u0000"+
		"\u00d9\u00e0\u00032\u0019\u0000\u00da\u00db\u0005)\u0000\u0000\u00db\u00dc"+
		"\u0005\u0005\u0000\u0000\u00dc\u00dd\u0003\u001c\u000e\u0000\u00dd\u00de"+
		"\u0005\u0006\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00c5"+
		"\u0001\u0000\u0000\u0000\u00df\u00c9\u0001\u0000\u0000\u0000\u00df\u00cc"+
		"\u0001\u0000\u0000\u0000\u00df\u00cd\u0001\u0000\u0000\u0000\u00df\u00ce"+
		"\u0001\u0000\u0000\u0000\u00df\u00d5\u0001\u0000\u0000\u0000\u00df\u00d9"+
		"\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000\u00e01\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005\t\u0000\u0000\u00e2\u00e3\u0003."+
		"\u0017\u0000\u00e3\u00e4\u0005\n\u0000\u0000\u00e43\u0001\u0000\u0000"+
		"\u0000\u00108=GVY\u008a\u0093\u009f\u00a9\u00b3\u00bf\u00c2\u00c5\u00c9"+
		"\u00d3\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}