// Generated from /home/amr/IdeaProjects/COOL Compiler/Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SingleLineComment=1, BlockComment=2, CLASS=3, INHERITS=4, NEW=5, SELF_TYPE=6, 
		SELF=7, INT=8, STRING=9, VOID=10, BOOL=11, TRUE=12, FALSE=13, ISVOID=14, 
		IF=15, THEN=16, ELSE=17, FI=18, CASE=19, OF=20, ESAC=21, WHILE=22, LOOP=23, 
		POOL=24, LET=25, IN=26, OP_ASSIGNMENT=27, OP_ADD=28, OP_SUB=29, OP_MUL=30, 
		OP_DIV=31, RELOP_LT=32, RELOP_LE=33, RELOP_EQ=34, OP_NOT=35, OP_INV=36, 
		SEMICOLON=37, FORWARD_CURLY_BRACKET=38, BACKWARD_CURLY_BRACKET=39, FORWARD_BRACKET=40, 
		BACKWARD_BRACKET=41, FORWARD_SQUARE_BRACKET=42, BACKWARD_SQUARE_BRACKET=43, 
		COMMA=44, COLON=45, DOT=46, AT=47, NUM=48, LITERAL=49, ID=50, WS=51, ErrorChar=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SingleLineComment", "BlockComment", "CLASS", "INHERITS", "NEW", "type",
			"SELF", "integer", "STRING", "VOID", "BOOL", "TRUE", "FALSE", "ISVOID", "IF",
			"THEN", "ELSE", "FI", "CASE", "OF", "ESAC", "WHILE", "LOOP", "POOL", 
			"let", "in", "rarrow", "plus", "minus", "OP_MUL", "div",
			"lt", "le", "equals", "not", "OP_INV", "semi",
			"lbrace", "rbrace", "lparen",
			"rparen", "FORWARD_SQUARE_BRACKET", "BACKWARD_SQUARE_BRACKET",
			"COMMA", "COLON", "DOT", "AT", "NUM", "LITERAL", "identifier", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'class'", "'inherits'", "'new'", "'SELF_TYPE'", "'self'", 
			"'Int'", "'String'", "'Void'", "'Bool'", "'true'", "'false'", "'isvoid'", 
			"'if'", "'then'", "'else'", "'fi'", "'case'", "'of'", "'esac'", "'while'", 
			"'loop'", "'pool'", "'let'", "'in'", "'<-'", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'<='", "'='", "'not'", "'~'", "';'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "','", "':'", "'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SingleLineComment", "BlockComment", "CLASS", "INHERITS", "NEW", 
			"SELF_TYPE", "SELF", "INT", "STRING", "VOID", "BOOL", "TRUE", "FALSE", 
			"ISVOID", "IF", "THEN", "ELSE", "FI", "CASE", "OF", "ESAC", "WHILE", 
			"LOOP", "POOL", "LET", "IN", "OP_ASSIGNMENT", "OP_ADD", "OP_SUB", "OP_MUL", 
			"OP_DIV", "RELOP_LT", "RELOP_LE", "RELOP_EQ", "OP_NOT", "OP_INV", "SEMICOLON", 
			"FORWARD_CURLY_BRACKET", "BACKWARD_CURLY_BRACKET", "FORWARD_BRACKET", 
			"BACKWARD_BRACKET", "FORWARD_SQUARE_BRACKET", "BACKWARD_SQUARE_BRACKET", 
			"COMMA", "COLON", "DOT", "AT", "NUM", "LITERAL", "ID", "WS", "ErrorChar"
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0160\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\5\2v\n\2\3"+
		"\3\3\3\7\3z\n\3\f\3\16\3}\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\5\61\u012d\n\61\3\61\6\61\u0130\n\61\r\61\16\61\u0131\3\61"+
		"\3\61\7\61\u0136\n\61\f\61\16\61\u0139\13\61\5\61\u013b\n\61\3\61\3\61"+
		"\5\61\u013f\n\61\3\61\6\61\u0142\n\61\r\61\16\61\u0143\5\61\u0146\n\61"+
		"\3\62\3\62\7\62\u014a\n\62\f\62\16\62\u014d\13\62\3\62\3\62\3\63\3\63"+
		"\7\63\u0153\n\63\f\63\16\63\u0156\13\63\3\64\6\64\u0159\n\64\r\64\16\64"+
		"\u015a\3\64\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66\3\2\13\5\2\62;C\\c|\3\3\f\f\4\2--//\3\2\62;\4"+
		"\2GGgg\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5"+
		"w\3\2\2\2\7\u0080\3\2\2\2\t\u0086\3\2\2\2\13\u008f\3\2\2\2\r\u0093\3\2"+
		"\2\2\17\u009d\3\2\2\2\21\u00a2\3\2\2\2\23\u00a6\3\2\2\2\25\u00ad\3\2\2"+
		"\2\27\u00b2\3\2\2\2\31\u00b7\3\2\2\2\33\u00bc\3\2\2\2\35\u00c2\3\2\2\2"+
		"\37\u00c9\3\2\2\2!\u00cc\3\2\2\2#\u00d1\3\2\2\2%\u00d6\3\2\2\2\'\u00d9"+
		"\3\2\2\2)\u00de\3\2\2\2+\u00e1\3\2\2\2-\u00e6\3\2\2\2/\u00ec\3\2\2\2\61"+
		"\u00f1\3\2\2\2\63\u00f6\3\2\2\2\65\u00fa\3\2\2\2\67\u00fd\3\2\2\29\u0100"+
		"\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0106\3\2\2\2A\u0108\3\2\2\2C"+
		"\u010a\3\2\2\2E\u010d\3\2\2\2G\u010f\3\2\2\2I\u0113\3\2\2\2K\u0115\3\2"+
		"\2\2M\u0117\3\2\2\2O\u0119\3\2\2\2Q\u011b\3\2\2\2S\u011d\3\2\2\2U\u011f"+
		"\3\2\2\2W\u0121\3\2\2\2Y\u0123\3\2\2\2[\u0125\3\2\2\2]\u0127\3\2\2\2_"+
		"\u0129\3\2\2\2a\u012c\3\2\2\2c\u0147\3\2\2\2e\u0150\3\2\2\2g\u0158\3\2"+
		"\2\2i\u015e\3\2\2\2kl\7/\2\2lm\7/\2\2mq\3\2\2\2np\t\2\2\2on\3\2\2\2ps"+
		"\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tv\t\3\2\2ut\3\2\2\2v"+
		"\4\3\2\2\2w{\7,\2\2xz\t\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2"+
		"|~\3\2\2\2}{\3\2\2\2~\177\7,\2\2\177\6\3\2\2\2\u0080\u0081\7e\2\2\u0081"+
		"\u0082\7n\2\2\u0082\u0083\7c\2\2\u0083\u0084\7u\2\2\u0084\u0085\7u\2\2"+
		"\u0085\b\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7j"+
		"\2\2\u0089\u008a\7g\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7v\2\2\u008d\u008e\7u\2\2\u008e\n\3\2\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7y\2\2\u0092\f\3\2\2\2\u0093\u0094\7U\2\2\u0094\u0095"+
		"\7G\2\2\u0095\u0096\7N\2\2\u0096\u0097\7H\2\2\u0097\u0098\7a\2\2\u0098"+
		"\u0099\7V\2\2\u0099\u009a\7[\2\2\u009a\u009b\7R\2\2\u009b\u009c\7G\2\2"+
		"\u009c\16\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7"+
		"n\2\2\u00a0\u00a1\7h\2\2\u00a1\20\3\2\2\2\u00a2\u00a3\7K\2\2\u00a3\u00a4"+
		"\7p\2\2\u00a4\u00a5\7v\2\2\u00a5\22\3\2\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7i\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7X\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7f\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7D\2\2\u00b3"+
		"\u00b4\7q\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7n\2\2\u00b6\30\3\2\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7g\2\2"+
		"\u00bb\32\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7"+
		"n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\34\3\2\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7q\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7f\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7h\2\2\u00cb \3\2\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7j\2\2\u00ce"+
		"\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5$\3\2\2\2\u00d6"+
		"\u00d7\7h\2\2\u00d7\u00d8\7k\2\2\u00d8&\3\2\2\2\u00d9\u00da\7e\2\2\u00da"+
		"\u00db\7c\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7g\2\2\u00dd(\3\2\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7h\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7u\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7e\2\2\u00e5,\3\2\2\2\u00e6"+
		"\u00e7\7y\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7n\2\2"+
		"\u00ea\u00eb\7g\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7q\2"+
		"\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7r\2\2\u00f0\60\3\2\2\2\u00f1\u00f2"+
		"\7r\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\62\3\2\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7v\2\2\u00f9"+
		"\64\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\66\3\2\2\2\u00fd"+
		"\u00fe\7>\2\2\u00fe\u00ff\7/\2\2\u00ff8\3\2\2\2\u0100\u0101\7-\2\2\u0101"+
		":\3\2\2\2\u0102\u0103\7/\2\2\u0103<\3\2\2\2\u0104\u0105\7,\2\2\u0105>"+
		"\3\2\2\2\u0106\u0107\7\61\2\2\u0107@\3\2\2\2\u0108\u0109\7>\2\2\u0109"+
		"B\3\2\2\2\u010a\u010b\7>\2\2\u010b\u010c\7?\2\2\u010cD\3\2\2\2\u010d\u010e"+
		"\7?\2\2\u010eF\3\2\2\2\u010f\u0110\7p\2\2\u0110\u0111\7q\2\2\u0111\u0112"+
		"\7v\2\2\u0112H\3\2\2\2\u0113\u0114\7\u0080\2\2\u0114J\3\2\2\2\u0115\u0116"+
		"\7=\2\2\u0116L\3\2\2\2\u0117\u0118\7}\2\2\u0118N\3\2\2\2\u0119\u011a\7"+
		"\177\2\2\u011aP\3\2\2\2\u011b\u011c\7*\2\2\u011cR\3\2\2\2\u011d\u011e"+
		"\7+\2\2\u011eT\3\2\2\2\u011f\u0120\7]\2\2\u0120V\3\2\2\2\u0121\u0122\7"+
		"_\2\2\u0122X\3\2\2\2\u0123\u0124\7.\2\2\u0124Z\3\2\2\2\u0125\u0126\7<"+
		"\2\2\u0126\\\3\2\2\2\u0127\u0128\7\60\2\2\u0128^\3\2\2\2\u0129\u012a\7"+
		"B\2\2\u012a`\3\2\2\2\u012b\u012d\t\4\2\2\u012c\u012b\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130\t\5\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013a\3\2"+
		"\2\2\u0133\u0137\7\60\2\2\u0134\u0136\t\5\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u0133\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u0145\3\2\2\2\u013c\u013e\t\6\2\2\u013d\u013f\t\4\2\2\u013e\u013d\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142\t\5\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0146\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"b\3\2\2\2\u0147\u014b\7$\2\2\u0148\u014a\n\7\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7$\2\2\u014fd\3\2\2\2\u0150\u0154"+
		"\t\b\2\2\u0151\u0153\t\t\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155f\3\2\2\2\u0156\u0154\3\2\2\2"+
		"\u0157\u0159\t\n\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b\64\2\2"+
		"\u015dh\3\2\2\2\u015e\u015f\13\2\2\2\u015fj\3\2\2\2\20\2qu{\u012c\u0131"+
		"\u0137\u013a\u013e\u0143\u0145\u014b\u0154\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}