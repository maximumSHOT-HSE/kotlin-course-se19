// Generated from Lang.g4 by ANTLR 4.7
package ru.hse.spb.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, VARIABLE=2, FUNCTION=3, WHILE=4, IF=5, ELSE=6, RET=7, IDENTIFIER=8, 
		LITERAL=9, SEPARATOR=10, PLUS=11, MINUS=12, ASTERISK=13, DIVISION=14, 
		REMINDER=15, ASSIGNMENT=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, 
		LT=21, GT=22, LE=23, GE=24, EQ=25, NEQ=26, OR=27, AND=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "VARIABLE", "FUNCTION", "WHILE", "IF", "ELSE", "RET", "IDENTIFIER", 
		"LITERAL", "SEPARATOR", "PLUS", "MINUS", "ASTERISK", "DIVISION", "REMINDER", 
		"ASSIGNMENT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LT", "GT", "LE", 
		"GE", "EQ", "NEQ", "OR", "AND"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'var'", "'fun'", "'while'", "'if'", "'else'", "'ret'", null, 
		null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'('", "')'", "'{'", 
		"'}'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'||'", "'&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "VARIABLE", "FUNCTION", "WHILE", "IF", "ELSE", "RET", "IDENTIFIER", 
		"LITERAL", "SEPARATOR", "PLUS", "MINUS", "ASTERISK", "DIVISION", "REMINDER", 
		"ASSIGNMENT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LT", "GT", "LE", 
		"GE", "EQ", "NEQ", "OR", "AND"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\5\2?\n\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\n\3\n"+
		"\3\n\7\ne\n\n\f\n\16\nh\13\n\5\nj\n\n\3\13\3\13\7\13n\n\13\f\13\16\13"+
		"q\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36\3\2\7\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2"+
		"\62;\2\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\3>\3\2\2\2\5@\3\2\2\2\7D\3\2\2\2\tH\3\2\2\2\13N\3\2\2\2\rQ\3\2"+
		"\2\2\17V\3\2\2\2\21Z\3\2\2\2\23i\3\2\2\2\25k\3\2\2\2\27r\3\2\2\2\31t\3"+
		"\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!|\3\2\2\2#~\3\2\2\2%\u0080"+
		"\3\2\2\2\'\u0082\3\2\2\2)\u0084\3\2\2\2+\u0086\3\2\2\2-\u0088\3\2\2\2"+
		"/\u008a\3\2\2\2\61\u008d\3\2\2\2\63\u0090\3\2\2\2\65\u0093\3\2\2\2\67"+
		"\u0096\3\2\2\29\u0099\3\2\2\2;<\7\17\2\2<?\7\f\2\2=?\t\2\2\2>;\3\2\2\2"+
		">=\3\2\2\2?\4\3\2\2\2@A\7x\2\2AB\7c\2\2BC\7t\2\2C\6\3\2\2\2DE\7h\2\2E"+
		"F\7w\2\2FG\7p\2\2G\b\3\2\2\2HI\7y\2\2IJ\7j\2\2JK\7k\2\2KL\7n\2\2LM\7g"+
		"\2\2M\n\3\2\2\2NO\7k\2\2OP\7h\2\2P\f\3\2\2\2QR\7g\2\2RS\7n\2\2ST\7u\2"+
		"\2TU\7g\2\2U\16\3\2\2\2VW\7t\2\2WX\7g\2\2XY\7v\2\2Y\20\3\2\2\2Z^\t\3\2"+
		"\2[]\t\4\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\22\3\2\2\2`^\3"+
		"\2\2\2aj\7\62\2\2bf\t\5\2\2ce\t\6\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg"+
		"\3\2\2\2gj\3\2\2\2hf\3\2\2\2ia\3\2\2\2ib\3\2\2\2j\24\3\2\2\2ko\7.\2\2"+
		"ln\7\"\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\26\3\2\2\2qo\3\2\2"+
		"\2rs\7-\2\2s\30\3\2\2\2tu\7/\2\2u\32\3\2\2\2vw\7,\2\2w\34\3\2\2\2xy\7"+
		"\61\2\2y\36\3\2\2\2z{\7\'\2\2{ \3\2\2\2|}\7?\2\2}\"\3\2\2\2~\177\7*\2"+
		"\2\177$\3\2\2\2\u0080\u0081\7+\2\2\u0081&\3\2\2\2\u0082\u0083\7}\2\2\u0083"+
		"(\3\2\2\2\u0084\u0085\7\177\2\2\u0085*\3\2\2\2\u0086\u0087\7>\2\2\u0087"+
		",\3\2\2\2\u0088\u0089\7@\2\2\u0089.\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c"+
		"\7?\2\2\u008c\60\3\2\2\2\u008d\u008e\7@\2\2\u008e\u008f\7?\2\2\u008f\62"+
		"\3\2\2\2\u0090\u0091\7?\2\2\u0091\u0092\7?\2\2\u0092\64\3\2\2\2\u0093"+
		"\u0094\7#\2\2\u0094\u0095\7?\2\2\u0095\66\3\2\2\2\u0096\u0097\7~\2\2\u0097"+
		"\u0098\7~\2\2\u00988\3\2\2\2\u0099\u009a\7(\2\2\u009a\u009b\7(\2\2\u009b"+
		":\3\2\2\2\b\2>^fio\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}