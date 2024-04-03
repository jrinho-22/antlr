// Generated from rules.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class rulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUBTRACT=2, MULTIPLY=3, DIVIDE_FLOAT=4, DIVIDE_INT=5, REMAINDER=6, 
		EXPONENTIAL=7, LPAREN=8, RPAREN=9, PREV=10, ARMAZENAR=11, INT=12, REAL=13, 
		WS=14, NEWLINE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "SUBTRACT", "MULTIPLY", "DIVIDE_FLOAT", "DIVIDE_INT", "REMAINDER", 
			"EXPONENTIAL", "LPAREN", "RPAREN", "PREV", "ARMAZENAR", "INT", "REAL", 
			"WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'|'", "'/'", "'%'", "'^'", "'('", "')'", 
			"'RES'", "'MEM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE_FLOAT", "DIVIDE_INT", "REMAINDER", 
			"EXPONENTIAL", "LPAREN", "RPAREN", "PREV", "ARMAZENAR", "INT", "REAL", 
			"WS", "NEWLINE"
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


	public rulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

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
		"\u0004\u0000\u000fl\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b"+
		";\b\u000b\u000b\u000b\f\u000b<\u0001\f\u0003\f@\b\f\u0001\f\u0004\fC\b"+
		"\f\u000b\f\f\fD\u0001\f\u0001\f\u0005\fI\b\f\n\f\f\fL\t\f\u0001\f\u0003"+
		"\fO\b\f\u0001\f\u0001\f\u0004\fS\b\f\u000b\f\f\fT\u0001\f\u0003\fX\b\f"+
		"\u0001\f\u0004\f[\b\f\u000b\f\f\f\\\u0003\f_\b\f\u0001\r\u0004\rb\b\r"+
		"\u000b\r\f\rc\u0001\r\u0001\r\u0001\u000e\u0003\u000ei\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0002\u0001\u0000"+
		"09\u0003\u0000\t\t\f\r  w\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000"+
		"\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001"+
		"\u0000\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f-\u0001\u0000\u0000"+
		"\u0000\u0011/\u0001\u0000\u0000\u0000\u00131\u0001\u0000\u0000\u0000\u0015"+
		"5\u0001\u0000\u0000\u0000\u0017:\u0001\u0000\u0000\u0000\u0019^\u0001"+
		"\u0000\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001dh\u0001\u0000\u0000"+
		"\u0000\u001f \u0005+\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005"+
		"-\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005*\u0000\u0000$\u0006"+
		"\u0001\u0000\u0000\u0000%&\u0005|\u0000\u0000&\b\u0001\u0000\u0000\u0000"+
		"\'(\u0005/\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005%\u0000\u0000"+
		"*\f\u0001\u0000\u0000\u0000+,\u0005^\u0000\u0000,\u000e\u0001\u0000\u0000"+
		"\u0000-.\u0005(\u0000\u0000.\u0010\u0001\u0000\u0000\u0000/0\u0005)\u0000"+
		"\u00000\u0012\u0001\u0000\u0000\u000012\u0005R\u0000\u000023\u0005E\u0000"+
		"\u000034\u0005S\u0000\u00004\u0014\u0001\u0000\u0000\u000056\u0005M\u0000"+
		"\u000067\u0005E\u0000\u000078\u0005M\u0000\u00008\u0016\u0001\u0000\u0000"+
		"\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0018"+
		"\u0001\u0000\u0000\u0000>@\u0005-\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000AC\u0007\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FJ\u0005"+
		".\u0000\u0000GI\u0007\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K_\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MO\u0005-\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PR\u0005.\u0000\u0000QS\u0007\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U_\u0001\u0000\u0000\u0000VX\u0005-\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000Y[\u0007"+
		"\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^?\u0001\u0000\u0000\u0000^N\u0001\u0000\u0000\u0000^W\u0001\u0000"+
		"\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`b\u0007\u0001\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0006\r\u0000"+
		"\u0000f\u001c\u0001\u0000\u0000\u0000gi\u0005\r\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005"+
		"\n\u0000\u0000k\u001e\u0001\u0000\u0000\u0000\f\u0000<?DJNTW\\^ch\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}