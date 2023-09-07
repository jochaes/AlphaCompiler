// Generated from /Users/gilda/Desktop/Repositorios/AlphaCompiler/Proyecto1G4/MiniPythonScanner.g4 by ANTLR 4.12.0
package generatedMiniPython;

    import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPythonScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, COMMA=3, COLON=4, OPENPARENTHESIS=5, CLOSEPARENTHESIS=6, 
		OPENCURLYBRACE=7, CLOSECURLYBRACE=8, OPENSQRBRACKET=9, CLOSESQRBRACKET=10, 
		DOUBLEQUOTES=11, SINGLEQUOTE=12, PLUSSIGN=13, MINUSSIGN=14, ASTERISK=15, 
		SLASH=16, ASSIGNMENT=17, LESSTHAN=18, GREATERTHAN=19, LESSTHANEQUAL=20, 
		GREATERTHANEQUAL=21, COMPARISON=22, DEF=23, IF=24, WHILE=25, ELSE=26, 
		IN=27, DO=28, CONST=29, VAR=30, RETURN=31, PRINT=32, LEN=33, IDENTIFIER=34, 
		INTEGER=35, FLOAT=36, CHARCONST=37, STRING=38, NEWLINE=39, NL=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMA", "COLON", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENCURLYBRACE", 
			"CLOSECURLYBRACE", "OPENSQRBRACKET", "CLOSESQRBRACKET", "DOUBLEQUOTES", 
			"SINGLEQUOTE", "PLUSSIGN", "MINUSSIGN", "ASTERISK", "SLASH", "ASSIGNMENT", 
			"LESSTHAN", "GREATERTHAN", "LESSTHANEQUAL", "GREATERTHANEQUAL", "COMPARISON", 
			"DEF", "IF", "WHILE", "ELSE", "IN", "DO", "CONST", "VAR", "RETURN", "PRINT", 
			"LEN", "IDENTIFIER", "INTEGER", "FLOAT", "CHARCONST", "STRING", "LETTER", 
			"DIGIT", "NEWLINE", "NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "','", "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'\"'", "'''", "'+'", "'-'", "'*'", "'/'", "'='", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'def'", "'if'", "'while'", "'else'", "'in'", "'do'", 
			"'const'", "'var'", "'return'", "'print'", "'len'", null, null, null, 
			null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "COMMA", "COLON", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"OPENCURLYBRACE", "CLOSECURLYBRACE", "OPENSQRBRACKET", "CLOSESQRBRACKET", 
			"DOUBLEQUOTES", "SINGLEQUOTE", "PLUSSIGN", "MINUSSIGN", "ASTERISK", "SLASH", 
			"ASSIGNMENT", "LESSTHAN", "GREATERTHAN", "LESSTHANEQUAL", "GREATERTHANEQUAL", 
			"COMPARISON", "DEF", "IF", "WHILE", "ELSE", "IN", "DO", "CONST", "VAR", 
			"RETURN", "PRINT", "LEN", "IDENTIFIER", "INTEGER", "FLOAT", "CHARCONST", 
			"STRING", "NEWLINE", "NL", "WS"
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


	    private final DenterHelper denter = new DenterHelper(NL, MiniPythonScanner.INDENT, MiniPythonScanner.DEDENT) {
	        @Override
	        public Token pullToken(){
	            return MiniPythonScanner.super.nextToken();
	        }
	    };

	    @Override
	    public Token nextToken(){
	        return denter.nextToken();
	    }


	public MiniPythonScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniPythonScanner.g4"; }

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
		"\u0004\u0000)\u00fc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u00b5\b\u001f\n\u001f\f\u001f\u00b8\t\u001f\u0001 \u0001"+
		" \u0005 \u00bc\b \n \f \u00bf\t \u0001!\u0001!\u0005!\u00c3\b!\n!\f!\u00c6"+
		"\t!\u0001!\u0001!\u0001!\u0005!\u00cb\b!\n!\f!\u00ce\t!\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u00d3\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0004#\u00db\b#\u000b#\f#\u00dc\u0005#\u00df\b#\n#\f#\u00e2\t#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0003\'\u00ed"+
		"\b\'\u0001\'\u0001\'\u0005\'\u00f1\b\'\n\'\f\'\u00f4\t\'\u0001(\u0004"+
		"(\u00f7\b(\u000b(\f(\u00f8\u0001(\u0001(\u0000\u0000)\u0001\u0003\u0003"+
		"\u0004\u0005\u0005\u0007\u0006\t\u0007\u000b\b\r\t\u000f\n\u0011\u000b"+
		"\u0013\f\u0015\r\u0017\u000e\u0019\u000f\u001b\u0010\u001d\u0011\u001f"+
		"\u0012!\u0013#\u0014%\u0015\'\u0016)\u0017+\u0018-\u0019/\u001a1\u001b"+
		"3\u001c5\u001d7\u001e9\u001f; =!?\"A#C$E%G&I\u0000K\u0000M\'O(Q)\u0001"+
		"\u0000\u0003\u0003\u0000\t\n\r\r  \u0003\u0000AZ__az\u0002\u0000\n\n "+
		" \u0105\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000"+
		"\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0001S"+
		"\u0001\u0000\u0000\u0000\u0003U\u0001\u0000\u0000\u0000\u0005W\u0001\u0000"+
		"\u0000\u0000\u0007Y\u0001\u0000\u0000\u0000\t[\u0001\u0000\u0000\u0000"+
		"\u000b]\u0001\u0000\u0000\u0000\r_\u0001\u0000\u0000\u0000\u000fa\u0001"+
		"\u0000\u0000\u0000\u0011c\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000"+
		"\u0000\u0015g\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019"+
		"k\u0001\u0000\u0000\u0000\u001bm\u0001\u0000\u0000\u0000\u001do\u0001"+
		"\u0000\u0000\u0000\u001fq\u0001\u0000\u0000\u0000!s\u0001\u0000\u0000"+
		"\u0000#u\u0001\u0000\u0000\u0000%x\u0001\u0000\u0000\u0000\'{\u0001\u0000"+
		"\u0000\u0000)~\u0001\u0000\u0000\u0000+\u0082\u0001\u0000\u0000\u0000"+
		"-\u0085\u0001\u0000\u0000\u0000/\u008b\u0001\u0000\u0000\u00001\u0090"+
		"\u0001\u0000\u0000\u00003\u0093\u0001\u0000\u0000\u00005\u0096\u0001\u0000"+
		"\u0000\u00007\u009c\u0001\u0000\u0000\u00009\u00a0\u0001\u0000\u0000\u0000"+
		";\u00a7\u0001\u0000\u0000\u0000=\u00ad\u0001\u0000\u0000\u0000?\u00b1"+
		"\u0001\u0000\u0000\u0000A\u00b9\u0001\u0000\u0000\u0000C\u00c0\u0001\u0000"+
		"\u0000\u0000E\u00cf\u0001\u0000\u0000\u0000G\u00d6\u0001\u0000\u0000\u0000"+
		"I\u00e5\u0001\u0000\u0000\u0000K\u00e7\u0001\u0000\u0000\u0000M\u00e9"+
		"\u0001\u0000\u0000\u0000O\u00ec\u0001\u0000\u0000\u0000Q\u00f6\u0001\u0000"+
		"\u0000\u0000ST\u0005,\u0000\u0000T\u0002\u0001\u0000\u0000\u0000UV\u0005"+
		":\u0000\u0000V\u0004\u0001\u0000\u0000\u0000WX\u0005(\u0000\u0000X\u0006"+
		"\u0001\u0000\u0000\u0000YZ\u0005)\u0000\u0000Z\b\u0001\u0000\u0000\u0000"+
		"[\\\u0005{\u0000\u0000\\\n\u0001\u0000\u0000\u0000]^\u0005}\u0000\u0000"+
		"^\f\u0001\u0000\u0000\u0000_`\u0005[\u0000\u0000`\u000e\u0001\u0000\u0000"+
		"\u0000ab\u0005]\u0000\u0000b\u0010\u0001\u0000\u0000\u0000cd\u0005\"\u0000"+
		"\u0000d\u0012\u0001\u0000\u0000\u0000ef\u0005\'\u0000\u0000f\u0014\u0001"+
		"\u0000\u0000\u0000gh\u0005+\u0000\u0000h\u0016\u0001\u0000\u0000\u0000"+
		"ij\u0005-\u0000\u0000j\u0018\u0001\u0000\u0000\u0000kl\u0005*\u0000\u0000"+
		"l\u001a\u0001\u0000\u0000\u0000mn\u0005/\u0000\u0000n\u001c\u0001\u0000"+
		"\u0000\u0000op\u0005=\u0000\u0000p\u001e\u0001\u0000\u0000\u0000qr\u0005"+
		"<\u0000\u0000r \u0001\u0000\u0000\u0000st\u0005>\u0000\u0000t\"\u0001"+
		"\u0000\u0000\u0000uv\u0005<\u0000\u0000vw\u0005=\u0000\u0000w$\u0001\u0000"+
		"\u0000\u0000xy\u0005>\u0000\u0000yz\u0005=\u0000\u0000z&\u0001\u0000\u0000"+
		"\u0000{|\u0005=\u0000\u0000|}\u0005=\u0000\u0000}(\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005d\u0000\u0000\u007f\u0080\u0005e\u0000\u0000\u0080\u0081"+
		"\u0005f\u0000\u0000\u0081*\u0001\u0000\u0000\u0000\u0082\u0083\u0005i"+
		"\u0000\u0000\u0083\u0084\u0005f\u0000\u0000\u0084,\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005w\u0000\u0000\u0086\u0087\u0005h\u0000\u0000\u0087\u0088"+
		"\u0005i\u0000\u0000\u0088\u0089\u0005l\u0000\u0000\u0089\u008a\u0005e"+
		"\u0000\u0000\u008a.\u0001\u0000\u0000\u0000\u008b\u008c\u0005e\u0000\u0000"+
		"\u008c\u008d\u0005l\u0000\u0000\u008d\u008e\u0005s\u0000\u0000\u008e\u008f"+
		"\u0005e\u0000\u0000\u008f0\u0001\u0000\u0000\u0000\u0090\u0091\u0005i"+
		"\u0000\u0000\u0091\u0092\u0005n\u0000\u0000\u00922\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005d\u0000\u0000\u0094\u0095\u0005o\u0000\u0000\u00954"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005c\u0000\u0000\u0097\u0098\u0005"+
		"o\u0000\u0000\u0098\u0099\u0005n\u0000\u0000\u0099\u009a\u0005s\u0000"+
		"\u0000\u009a\u009b\u0005t\u0000\u0000\u009b6\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005v\u0000\u0000\u009d\u009e\u0005a\u0000\u0000\u009e\u009f\u0005"+
		"r\u0000\u0000\u009f8\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005r\u0000"+
		"\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2\u00a3\u0005t\u0000\u0000\u00a3"+
		"\u00a4\u0005u\u0000\u0000\u00a4\u00a5\u0005r\u0000\u0000\u00a5\u00a6\u0005"+
		"n\u0000\u0000\u00a6:\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005p\u0000"+
		"\u0000\u00a8\u00a9\u0005r\u0000\u0000\u00a9\u00aa\u0005i\u0000\u0000\u00aa"+
		"\u00ab\u0005n\u0000\u0000\u00ab\u00ac\u0005t\u0000\u0000\u00ac<\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005l\u0000\u0000\u00ae\u00af\u0005e\u0000"+
		"\u0000\u00af\u00b0\u0005n\u0000\u0000\u00b0>\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b6\u0003I$\u0000\u00b2\u00b5\u0003I$\u0000\u00b3\u00b5\u0003K%\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7@\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bd\u0003K%\u0000\u00ba\u00bc\u0003"+
		"K%\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00beB\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c4\u0003K%\u0000\u00c1\u00c3\u0003K%\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		".\u0000\u0000\u00c8\u00cc\u0003K%\u0000\u00c9\u00cb\u0003K%\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"D\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0003\u0013\t\u0000\u00d0\u00d3\u0003I$\u0000\u00d1\u00d3\u0003K%\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0013\t\u0000\u00d5"+
		"F\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003\u0011\b\u0000\u00d7\u00e0"+
		"\u0003?\u001f\u0000\u00d8\u00df\u0003?\u001f\u0000\u00d9\u00db\u0007\u0000"+
		"\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d8\u0001\u0000"+
		"\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0003\u0011\b\u0000\u00e4H\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0007\u0001\u0000\u0000\u00e6J\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u000209\u0000\u00e8L\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005\n\u0000\u0000\u00eaN\u0001\u0000\u0000\u0000\u00eb\u00ed\u0005"+
		"\r\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f2\u0005\n\u0000"+
		"\u0000\u00ef\u00f1\u0005 \u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3P\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f7\u0007\u0002\u0000\u0000\u00f6"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0006(\u0000\u0000\u00fbR\u0001"+
		"\u0000\u0000\u0000\r\u0000\u00b4\u00b6\u00bd\u00c4\u00cc\u00d2\u00dc\u00de"+
		"\u00e0\u00ec\u00f2\u00f8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}