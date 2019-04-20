// Generated from /media/aim/384548B632E10D23/work/college/4th year computer/2nd semester/Compilers/cool/project/COOL-Compiler/Cool.g4 by ANTLR 4.7.2
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
		IO=15, IF=16, THEN=17, ELSE=18, FI=19, CASE=20, OF=21, ESAC=22, WHILE=23, 
		LOOP=24, POOL=25, LET=26, IN=27, OP_ASSIGNMENT=28, OP_ADD=29, OP_SUB=30, 
		OP_MUL=31, OP_DIV=32, RELOP_LT=33, RELOP_LE=34, RELOP_EQ=35, OP_NOT=36, 
		OP_INV=37, SEMICOLON=38, FORWARD_CURLY_BRACKET=39, BACKWARD_CURLY_BRACKET=40, 
		FORWARD_BRACKET=41, BACKWARD_BRACKET=42, FORWARD_SQUARE_BRACKET=43, BACKWARD_SQUARE_BRACKET=44, 
		COMMA=45, COLON=46, DOT=47, AT=48, NUM=49, LITERAL=50, ID=51, WS=52, ErrorChar=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SingleLineComment", "BlockComment", "CLASS", "INHERITS", "NEW", "SELF_TYPE", 
			"SELF", "INT", "STRING", "VOID", "BOOL", "TRUE", "FALSE", "ISVOID", "IO", 
			"IF", "THEN", "ELSE", "FI", "CASE", "OF", "ESAC", "WHILE", "LOOP", "POOL", 
			"LET", "IN", "OP_ASSIGNMENT", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", 
			"RELOP_LT", "RELOP_LE", "RELOP_EQ", "OP_NOT", "OP_INV", "SEMICOLON", 
			"FORWARD_CURLY_BRACKET", "BACKWARD_CURLY_BRACKET", "FORWARD_BRACKET", 
			"BACKWARD_BRACKET", "FORWARD_SQUARE_BRACKET", "BACKWARD_SQUARE_BRACKET", 
			"COMMA", "COLON", "DOT", "AT", "NUM", "LITERAL", "ID", "WS", "ErrorChar", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'class'", "'inherits'", "'new'", "'SELF_TYPE'", "'self'", 
			"'Int'", "'String'", "'Void'", "'Bool'", "'true'", "'false'", "'isvoid'", 
			null, "'if'", "'then'", "'else'", "'fi'", "'case'", "'of'", "'esac'", 
			"'while'", "'loop'", "'pool'", "'let'", "'in'", "'<-'", "'+'", "'-'", 
			"'*'", "'/'", "'<'", "'<='", "'='", "'not'", "'~'", "';'", "'{'", "'}'", 
			"'('", "')'", "'['", "']'", "','", "':'", "'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SingleLineComment", "BlockComment", "CLASS", "INHERITS", "NEW", 
			"SELF_TYPE", "SELF", "INT", "STRING", "VOID", "BOOL", "TRUE", "FALSE", 
			"ISVOID", "IO", "IF", "THEN", "ELSE", "FI", "CASE", "OF", "ESAC", "WHILE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\7\2\u00a6"+
		"\n\2\f\2\16\2\u00a9\13\2\3\2\5\2\u00ac\n\2\3\3\3\3\7\3\u00b0\n\3\f\3\16"+
		"\3\u00b3\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\5\62\u0166\n\62\3\62\6\62\u0169\n\62\r\62\16\62\u016a\3\62\3"+
		"\62\7\62\u016f\n\62\f\62\16\62\u0172\13\62\5\62\u0174\n\62\3\62\3\62\5"+
		"\62\u0178\n\62\3\62\6\62\u017b\n\62\r\62\16\62\u017c\5\62\u017f\n\62\3"+
		"\63\3\63\7\63\u0183\n\63\f\63\16\63\u0186\13\63\3\63\3\63\3\64\3\64\7"+
		"\64\u018c\n\64\f\64\16\64\u018f\13\64\3\65\6\65\u0192\n\65\r\65\16\65"+
		"\u0193\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H"+
		"\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\2\2Q\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q\2s\2u\2w\2y"+
		"\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2"+
		"\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\3\2$\5\2\62;C\\c|\3\3\f\f\4\2--//\3\2\62;\4\2GGgg\5\2\f\f\17\17$$\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOo"+
		"o\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2"+
		"XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01be\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3\u00a1\3\2\2\2\5\u00ad\3\2\2\2"+
		"\7\u00b6\3\2\2\2\t\u00bc\3\2\2\2\13\u00c5\3\2\2\2\r\u00c9\3\2\2\2\17\u00d3"+
		"\3\2\2\2\21\u00d8\3\2\2\2\23\u00dc\3\2\2\2\25\u00e3\3\2\2\2\27\u00e8\3"+
		"\2\2\2\31\u00ed\3\2\2\2\33\u00f2\3\2\2\2\35\u00f8\3\2\2\2\37\u00ff\3\2"+
		"\2\2!\u0102\3\2\2\2#\u0105\3\2\2\2%\u010a\3\2\2\2\'\u010f\3\2\2\2)\u0112"+
		"\3\2\2\2+\u0117\3\2\2\2-\u011a\3\2\2\2/\u011f\3\2\2\2\61\u0125\3\2\2\2"+
		"\63\u012a\3\2\2\2\65\u012f\3\2\2\2\67\u0133\3\2\2\29\u0136\3\2\2\2;\u0139"+
		"\3\2\2\2=\u013b\3\2\2\2?\u013d\3\2\2\2A\u013f\3\2\2\2C\u0141\3\2\2\2E"+
		"\u0143\3\2\2\2G\u0146\3\2\2\2I\u0148\3\2\2\2K\u014c\3\2\2\2M\u014e\3\2"+
		"\2\2O\u0150\3\2\2\2Q\u0152\3\2\2\2S\u0154\3\2\2\2U\u0156\3\2\2\2W\u0158"+
		"\3\2\2\2Y\u015a\3\2\2\2[\u015c\3\2\2\2]\u015e\3\2\2\2_\u0160\3\2\2\2a"+
		"\u0162\3\2\2\2c\u0165\3\2\2\2e\u0180\3\2\2\2g\u0189\3\2\2\2i\u0191\3\2"+
		"\2\2k\u0197\3\2\2\2m\u0199\3\2\2\2o\u019b\3\2\2\2q\u019d\3\2\2\2s\u019f"+
		"\3\2\2\2u\u01a1\3\2\2\2w\u01a3\3\2\2\2y\u01a5\3\2\2\2{\u01a7\3\2\2\2}"+
		"\u01a9\3\2\2\2\177\u01ab\3\2\2\2\u0081\u01ad\3\2\2\2\u0083\u01af\3\2\2"+
		"\2\u0085\u01b1\3\2\2\2\u0087\u01b3\3\2\2\2\u0089\u01b5\3\2\2\2\u008b\u01b7"+
		"\3\2\2\2\u008d\u01b9\3\2\2\2\u008f\u01bb\3\2\2\2\u0091\u01bd\3\2\2\2\u0093"+
		"\u01bf\3\2\2\2\u0095\u01c1\3\2\2\2\u0097\u01c3\3\2\2\2\u0099\u01c5\3\2"+
		"\2\2\u009b\u01c7\3\2\2\2\u009d\u01c9\3\2\2\2\u009f\u01cb\3\2\2\2\u00a1"+
		"\u00a2\7/\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a6\t\2\2"+
		"\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\t\3\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\4\3\2\2\2\u00ad\u00b1\7,\2\2\u00ae\u00b0\t\2\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5"+
		"\6\3\2\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7c\2\2\u00b9"+
		"\u00ba\7u\2\2\u00ba\u00bb\7u\2\2\u00bb\b\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7k\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7u\2\2\u00c4\n\3\2"+
		"\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7y\2\2\u00c8\f"+
		"\3\2\2\2\u00c9\u00ca\7U\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7N\2\2\u00cc"+
		"\u00cd\7H\2\2\u00cd\u00ce\7a\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d0\7[\2\2"+
		"\u00d0\u00d1\7R\2\2\u00d1\u00d2\7G\2\2\u00d2\16\3\2\2\2\u00d3\u00d4\7"+
		"u\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7h\2\2\u00d7\20"+
		"\3\2\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7v\2\2\u00db"+
		"\22\3\2\2\2\u00dc\u00dd\7U\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7i\2\2\u00e2\24\3\2\2\2\u00e3"+
		"\u00e4\7X\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7f\2\2"+
		"\u00e7\26\3\2\2\2\u00e8\u00e9\7D\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7"+
		"q\2\2\u00eb\u00ec\7n\2\2\u00ec\30\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef"+
		"\7t\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7g\2\2\u00f1\32\3\2\2\2\u00f2\u00f3"+
		"\7h\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7u\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\34\3\2\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7u\2\2\u00fa"+
		"\u00fb\7x\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7f\2\2"+
		"\u00fe\36\3\2\2\2\u00ff\u0100\5}?\2\u0100\u0101\5\u0089E\2\u0101 \3\2"+
		"\2\2\u0102\u0103\7k\2\2\u0103\u0104\7h\2\2\u0104\"\3\2\2\2\u0105\u0106"+
		"\7v\2\2\u0106\u0107\7j\2\2\u0107\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109"+
		"$\3\2\2\2\u010a\u010b\7g\2\2\u010b\u010c\7n\2\2\u010c\u010d\7u\2\2\u010d"+
		"\u010e\7g\2\2\u010e&\3\2\2\2\u010f\u0110\7h\2\2\u0110\u0111\7k\2\2\u0111"+
		"(\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7c\2\2\u0114\u0115\7u\2\2\u0115"+
		"\u0116\7g\2\2\u0116*\3\2\2\2\u0117\u0118\7q\2\2\u0118\u0119\7h\2\2\u0119"+
		",\3\2\2\2\u011a\u011b\7g\2\2\u011b\u011c\7u\2\2\u011c\u011d\7c\2\2\u011d"+
		"\u011e\7e\2\2\u011e.\3\2\2\2\u011f\u0120\7y\2\2\u0120\u0121\7j\2\2\u0121"+
		"\u0122\7k\2\2\u0122\u0123\7n\2\2\u0123\u0124\7g\2\2\u0124\60\3\2\2\2\u0125"+
		"\u0126\7n\2\2\u0126\u0127\7q\2\2\u0127\u0128\7q\2\2\u0128\u0129\7r\2\2"+
		"\u0129\62\3\2\2\2\u012a\u012b\7r\2\2\u012b\u012c\7q\2\2\u012c\u012d\7"+
		"q\2\2\u012d\u012e\7n\2\2\u012e\64\3\2\2\2\u012f\u0130\7n\2\2\u0130\u0131"+
		"\7g\2\2\u0131\u0132\7v\2\2\u0132\66\3\2\2\2\u0133\u0134\7k\2\2\u0134\u0135"+
		"\7p\2\2\u01358\3\2\2\2\u0136\u0137\7>\2\2\u0137\u0138\7/\2\2\u0138:\3"+
		"\2\2\2\u0139\u013a\7-\2\2\u013a<\3\2\2\2\u013b\u013c\7/\2\2\u013c>\3\2"+
		"\2\2\u013d\u013e\7,\2\2\u013e@\3\2\2\2\u013f\u0140\7\61\2\2\u0140B\3\2"+
		"\2\2\u0141\u0142\7>\2\2\u0142D\3\2\2\2\u0143\u0144\7>\2\2\u0144\u0145"+
		"\7?\2\2\u0145F\3\2\2\2\u0146\u0147\7?\2\2\u0147H\3\2\2\2\u0148\u0149\7"+
		"p\2\2\u0149\u014a\7q\2\2\u014a\u014b\7v\2\2\u014bJ\3\2\2\2\u014c\u014d"+
		"\7\u0080\2\2\u014dL\3\2\2\2\u014e\u014f\7=\2\2\u014fN\3\2\2\2\u0150\u0151"+
		"\7}\2\2\u0151P\3\2\2\2\u0152\u0153\7\177\2\2\u0153R\3\2\2\2\u0154\u0155"+
		"\7*\2\2\u0155T\3\2\2\2\u0156\u0157\7+\2\2\u0157V\3\2\2\2\u0158\u0159\7"+
		"]\2\2\u0159X\3\2\2\2\u015a\u015b\7_\2\2\u015bZ\3\2\2\2\u015c\u015d\7."+
		"\2\2\u015d\\\3\2\2\2\u015e\u015f\7<\2\2\u015f^\3\2\2\2\u0160\u0161\7\60"+
		"\2\2\u0161`\3\2\2\2\u0162\u0163\7B\2\2\u0163b\3\2\2\2\u0164\u0166\t\4"+
		"\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0169\t\5\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u0173\3\2\2\2\u016c\u0170\7\60\2\2\u016d"+
		"\u016f\t\5\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u016c\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u017e\3\2\2\2\u0175\u0177\t\6"+
		"\2\2\u0176\u0178\t\4\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u017b\t\5\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u0175\3\2\2\2\u017e\u017f\3\2\2\2\u017fd\3\2\2\2\u0180\u0184\7$\2\2\u0181"+
		"\u0183\n\7\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\7$\2\2\u0188f\3\2\2\2\u0189\u018d\t\b\2\2\u018a\u018c\t\t\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018eh\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\t\n\2\2\u0191\u0190"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\b\65\2\2\u0196j\3\2\2\2\u0197\u0198\13\2\2"+
		"\2\u0198l\3\2\2\2\u0199\u019a\t\13\2\2\u019an\3\2\2\2\u019b\u019c\t\f"+
		"\2\2\u019cp\3\2\2\2\u019d\u019e\t\r\2\2\u019er\3\2\2\2\u019f\u01a0\t\16"+
		"\2\2\u01a0t\3\2\2\2\u01a1\u01a2\t\6\2\2\u01a2v\3\2\2\2\u01a3\u01a4\t\17"+
		"\2\2\u01a4x\3\2\2\2\u01a5\u01a6\t\20\2\2\u01a6z\3\2\2\2\u01a7\u01a8\t"+
		"\21\2\2\u01a8|\3\2\2\2\u01a9\u01aa\t\22\2\2\u01aa~\3\2\2\2\u01ab\u01ac"+
		"\t\23\2\2\u01ac\u0080\3\2\2\2\u01ad\u01ae\t\24\2\2\u01ae\u0082\3\2\2\2"+
		"\u01af\u01b0\t\25\2\2\u01b0\u0084\3\2\2\2\u01b1\u01b2\t\26\2\2\u01b2\u0086"+
		"\3\2\2\2\u01b3\u01b4\t\27\2\2\u01b4\u0088\3\2\2\2\u01b5\u01b6\t\30\2\2"+
		"\u01b6\u008a\3\2\2\2\u01b7\u01b8\t\31\2\2\u01b8\u008c\3\2\2\2\u01b9\u01ba"+
		"\t\32\2\2\u01ba\u008e\3\2\2\2\u01bb\u01bc\t\33\2\2\u01bc\u0090\3\2\2\2"+
		"\u01bd\u01be\t\34\2\2\u01be\u0092\3\2\2\2\u01bf\u01c0\t\35\2\2\u01c0\u0094"+
		"\3\2\2\2\u01c1\u01c2\t\36\2\2\u01c2\u0096\3\2\2\2\u01c3\u01c4\t\37\2\2"+
		"\u01c4\u0098\3\2\2\2\u01c5\u01c6\t \2\2\u01c6\u009a\3\2\2\2\u01c7\u01c8"+
		"\t!\2\2\u01c8\u009c\3\2\2\2\u01c9\u01ca\t\"\2\2\u01ca\u009e\3\2\2\2\u01cb"+
		"\u01cc\t#\2\2\u01cc\u00a0\3\2\2\2\20\2\u00a7\u00ab\u00b1\u0165\u016a\u0170"+
		"\u0173\u0177\u017c\u017e\u0184\u018d\u0193\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}