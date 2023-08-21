// Generated from /Users/jochaes/Documents/Repositorios/AlphaCompiler/AlphaScanner.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlphaScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, DOUBLEQUOTES=7, SINGLEQUOTE=8, 
		SUM=9, SUB=10, MUL=11, DIV=12, IF=13, WHILE=14, LET=15, THEN=16, ELSE=17, 
		IN=18, DO=19, BEGIN=20, END=21, CONST=22, VAR=23, ID=24, NUM=25, CONSTLITERAL=26, 
		WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "DOUBLEQUOTES", 
			"SINGLEQUOTE", "SUM", "SUB", "MUL", "DIV", "IF", "WHILE", "LET", "THEN", 
			"ELSE", "IN", "DO", "BEGIN", "END", "CONST", "VAR", "ID", "NUM", "CONSTLITERAL", 
			"LETTER", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'('", "')'", "'~'", "':'", "'\"'", "'''", "'+'", 
			"'-'", "'*'", "'/'", "'if'", "'while'", "'let'", "'then'", "'else'", 
			"'in'", "'do'", "'begin'", "'end'", "'const'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "DOUBLEQUOTES", 
			"SINGLEQUOTE", "SUM", "SUB", "MUL", "DIV", "IF", "WHILE", "LET", "THEN", 
			"ELSE", "IN", "DO", "BEGIN", "END", "CONST", "VAR", "ID", "NUM", "CONSTLITERAL", 
			"WS"
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


	public AlphaScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlphaScanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001b\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0089\b\u0017"+
		"\n\u0017\f\u0017\u008c\t\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u0090"+
		"\b\u0018\n\u0018\f\u0018\u0093\t\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0097\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0004\u001c\u009e\b\u001c\u000b\u001c\f\u001c\u009f\u0001\u001c\u0001"+
		"\u001c\u0000\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u00007\u00009\u001b"+
		"\u0001\u0000\u0002\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u00a5\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"9\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003=\u0001"+
		"\u0000\u0000\u0000\u0005@\u0001\u0000\u0000\u0000\u0007B\u0001\u0000\u0000"+
		"\u0000\tD\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rH\u0001"+
		"\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000"+
		"\u0000\u0013N\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017"+
		"R\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bW\u0001"+
		"\u0000\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001fa\u0001\u0000\u0000"+
		"\u0000!f\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000%n\u0001\u0000"+
		"\u0000\u0000\'q\u0001\u0000\u0000\u0000)w\u0001\u0000\u0000\u0000+{\u0001"+
		"\u0000\u0000\u0000-\u0081\u0001\u0000\u0000\u0000/\u0085\u0001\u0000\u0000"+
		"\u00001\u008d\u0001\u0000\u0000\u00003\u0096\u0001\u0000\u0000\u00005"+
		"\u0098\u0001\u0000\u0000\u00007\u009a\u0001\u0000\u0000\u00009\u009d\u0001"+
		"\u0000\u0000\u0000;<\u0005;\u0000\u0000<\u0002\u0001\u0000\u0000\u0000"+
		"=>\u0005:\u0000\u0000>?\u0005=\u0000\u0000?\u0004\u0001\u0000\u0000\u0000"+
		"@A\u0005(\u0000\u0000A\u0006\u0001\u0000\u0000\u0000BC\u0005)\u0000\u0000"+
		"C\b\u0001\u0000\u0000\u0000DE\u0005~\u0000\u0000E\n\u0001\u0000\u0000"+
		"\u0000FG\u0005:\u0000\u0000G\f\u0001\u0000\u0000\u0000HI\u0005\"\u0000"+
		"\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005\'\u0000\u0000K\u0010\u0001"+
		"\u0000\u0000\u0000LM\u0005+\u0000\u0000M\u0012\u0001\u0000\u0000\u0000"+
		"NO\u0005-\u0000\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005*\u0000\u0000"+
		"Q\u0016\u0001\u0000\u0000\u0000RS\u0005/\u0000\u0000S\u0018\u0001\u0000"+
		"\u0000\u0000TU\u0005i\u0000\u0000UV\u0005f\u0000\u0000V\u001a\u0001\u0000"+
		"\u0000\u0000WX\u0005w\u0000\u0000XY\u0005h\u0000\u0000YZ\u0005i\u0000"+
		"\u0000Z[\u0005l\u0000\u0000[\\\u0005e\u0000\u0000\\\u001c\u0001\u0000"+
		"\u0000\u0000]^\u0005l\u0000\u0000^_\u0005e\u0000\u0000_`\u0005t\u0000"+
		"\u0000`\u001e\u0001\u0000\u0000\u0000ab\u0005t\u0000\u0000bc\u0005h\u0000"+
		"\u0000cd\u0005e\u0000\u0000de\u0005n\u0000\u0000e \u0001\u0000\u0000\u0000"+
		"fg\u0005e\u0000\u0000gh\u0005l\u0000\u0000hi\u0005s\u0000\u0000ij\u0005"+
		"e\u0000\u0000j\"\u0001\u0000\u0000\u0000kl\u0005i\u0000\u0000lm\u0005"+
		"n\u0000\u0000m$\u0001\u0000\u0000\u0000no\u0005d\u0000\u0000op\u0005o"+
		"\u0000\u0000p&\u0001\u0000\u0000\u0000qr\u0005b\u0000\u0000rs\u0005e\u0000"+
		"\u0000st\u0005g\u0000\u0000tu\u0005i\u0000\u0000uv\u0005n\u0000\u0000"+
		"v(\u0001\u0000\u0000\u0000wx\u0005e\u0000\u0000xy\u0005n\u0000\u0000y"+
		"z\u0005d\u0000\u0000z*\u0001\u0000\u0000\u0000{|\u0005c\u0000\u0000|}"+
		"\u0005o\u0000\u0000}~\u0005n\u0000\u0000~\u007f\u0005s\u0000\u0000\u007f"+
		"\u0080\u0005t\u0000\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"v\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084\u0005r\u0000"+
		"\u0000\u0084.\u0001\u0000\u0000\u0000\u0085\u008a\u00035\u001a\u0000\u0086"+
		"\u0089\u00035\u001a\u0000\u0087\u0089\u00037\u001b\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b0\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0091\u00037\u001b\u0000\u008e\u0090\u00037\u001b\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u00922\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u00035\u001a\u0000\u0095\u0097\u00037\u001b\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u00974\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0007\u0000\u0000\u0000\u00996\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u000209\u0000\u009b8\u0001\u0000\u0000\u0000\u009c"+
		"\u009e\u0007\u0001\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0006\u001c\u0000\u0000\u00a2:\u0001\u0000\u0000\u0000\u0006\u0000"+
		"\u0088\u008a\u0091\u0096\u009f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}