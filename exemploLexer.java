// Generated from exemplo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exemploLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, INPUT=24, 
		ELSE=25, ID=26, WS=27, NUMBER=28, INT=29, FLOAT=30, STRING=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "INPUT", "ELSE", 
			"ID", "WS", "NUMBER", "INT", "FLOAT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "')'", "','", "'{'", "'}'", "'='", "';'", "'print'", 
			"'if'", "'while'", "'for'", "'return'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'input'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INPUT", "ELSE", "ID", "WS", "NUMBER", "INT", "FLOAT", "STRING"
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


	public exemploLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "exemplo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\6\33\u0092\n\33\r\33\16\33\u0093\3\33\7\33\u0097\n\33\f"+
		"\33\16\33\u009a\13\33\3\34\6\34\u009d\n\34\r\34\16\34\u009e\3\34\3\34"+
		"\3\35\3\35\5\35\u00a5\n\35\3\36\6\36\u00a8\n\36\r\36\16\36\u00a9\3\37"+
		"\3\37\3\37\5\37\u00af\n\37\3 \3 \7 \u00b3\n \f \16 \u00b6\13 \3 \3 \2"+
		"\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!\3\2\7\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\3\2\62;\3\2$$"+
		"\2\u00bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2"+
		"\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2"+
		"\25Y\3\2\2\2\27\\\3\2\2\2\31b\3\2\2\2\33f\3\2\2\2\35m\3\2\2\2\37o\3\2"+
		"\2\2!q\3\2\2\2#t\3\2\2\2%w\3\2\2\2\'z\3\2\2\2)}\3\2\2\2+\177\3\2\2\2-"+
		"\u0081\3\2\2\2/\u0083\3\2\2\2\61\u0085\3\2\2\2\63\u008b\3\2\2\2\65\u0091"+
		"\3\2\2\2\67\u009c\3\2\2\29\u00a4\3\2\2\2;\u00a7\3\2\2\2=\u00ab\3\2\2\2"+
		"?\u00b0\3\2\2\2AB\7f\2\2BC\7g\2\2CD\7h\2\2D\4\3\2\2\2EF\7*\2\2F\6\3\2"+
		"\2\2GH\7+\2\2H\b\3\2\2\2IJ\7.\2\2J\n\3\2\2\2KL\7}\2\2L\f\3\2\2\2MN\7\177"+
		"\2\2N\16\3\2\2\2OP\7?\2\2P\20\3\2\2\2QR\7=\2\2R\22\3\2\2\2ST\7r\2\2TU"+
		"\7t\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X\24\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\26\3"+
		"\2\2\2\\]\7y\2\2]^\7j\2\2^_\7k\2\2_`\7n\2\2`a\7g\2\2a\30\3\2\2\2bc\7h"+
		"\2\2cd\7q\2\2de\7t\2\2e\32\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7v\2\2ij\7w\2\2"+
		"jk\7t\2\2kl\7p\2\2l\34\3\2\2\2mn\7@\2\2n\36\3\2\2\2op\7>\2\2p \3\2\2\2"+
		"qr\7@\2\2rs\7?\2\2s\"\3\2\2\2tu\7>\2\2uv\7?\2\2v$\3\2\2\2wx\7?\2\2xy\7"+
		"?\2\2y&\3\2\2\2z{\7#\2\2{|\7?\2\2|(\3\2\2\2}~\7-\2\2~*\3\2\2\2\177\u0080"+
		"\7/\2\2\u0080,\3\2\2\2\u0081\u0082\7,\2\2\u0082.\3\2\2\2\u0083\u0084\7"+
		"\61\2\2\u0084\60\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088"+
		"\7r\2\2\u0088\u0089\7w\2\2\u0089\u008a\7v\2\2\u008a\62\3\2\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f"+
		"\64\3\2\2\2\u0090\u0092\t\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098\3\2\2\2\u0095\u0097"+
		"\t\3\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\66\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\t\4\2"+
		"\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\34\2\2\u00a18\3\2\2\2\u00a2"+
		"\u00a5\5;\36\2\u00a3\u00a5\5=\37\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5:\3\2\2\2\u00a6\u00a8\t\5\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa<\3\2\2\2\u00ab"+
		"\u00ae\5;\36\2\u00ac\u00ad\7\60\2\2\u00ad\u00af\5;\36\2\u00ae\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af>\3\2\2\2\u00b0\u00b4\7$\2\2\u00b1\u00b3"+
		"\n\6\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7$"+
		"\2\2\u00b8@\3\2\2\2\n\2\u0093\u0098\u009e\u00a4\u00a9\u00ae\u00b4\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}