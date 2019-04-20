// Generated from /media/aim/384548B632E10D23/work/college/4th year computer/2nd semester/Compilers/cool/project/COOL-Compiler/Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_variableDeclaration = 1, RULE_type = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variableDeclaration", "type"
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

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(6);
				variableDeclaration();
				}
				}
				setState(11);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(ID);
			setState(13);
			match(COLON);
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case VOID:
			case BOOL:
			case IO:
				{
				setState(14);
				type();
				}
				break;
			case ID:
				{
				setState(15);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(18);
			match(SEMICOLON);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CoolParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(CoolParser.VOID, 0); }
		public TerminalNode BOOL() { return getToken(CoolParser.BOOL, 0); }
		public TerminalNode IO() { return getToken(CoolParser.IO, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL) | (1L << IO))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\31\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\3\3\5\3\23\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\3\4\2\n\r\21\21\2\27\2\13\3\2\2\2\4"+
		"\16\3\2\2\2\6\26\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2"+
		"\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\17\7\65\2\2\17\22\7\60\2"+
		"\2\20\23\5\6\4\2\21\23\7\65\2\2\22\20\3\2\2\2\22\21\3\2\2\2\23\24\3\2"+
		"\2\2\24\25\7(\2\2\25\5\3\2\2\2\26\27\t\2\2\2\27\7\3\2\2\2\4\13\22";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}