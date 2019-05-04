// Generated from /home/amr/IdeaProjects/COOL Compiler/Cool.g4 by ANTLR 4.7.2
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
		T__0=1, CLASS=2, INHERITS=3, NEW=4, SELF_TYPE=5, SELF=6, INT=7, STRING=8, 
		VOID=9, BOOL=10, TRUE=11, FALSE=12, ISVOID=13, IO=14, IF=15, THEN=16, 
		ELSE=17, FI=18, CASE=19, OF=20, ESAC=21, WHILE=22, LOOP=23, POOL=24, LET=25, 
		IN=26, OP_ASSIGNMENT=27, OP_ADD=28, OP_SUB=29, OP_MUL=30, OP_DIV=31, RELOP_LT=32, 
		RELOP_LE=33, RELOP_EQ=34, OP_NOT=35, OP_INV=36, SEMICOLON=37, OPENING_CURLY_BRACKET=38, 
		CLOSING_CURLY_BRACKET=39, OPENING_BRACKET=40, CLOSING_BRACKET=41, OPENING_SQUARE_BRACKET=42, 
		CLOSING_SQUARE_BRACKET=43, COMMA=44, COLON=45, DOT=46, AT=47, SINGLELINECOMMENTSTART=48, 
		NUM=49, LITERAL=50, ID=51, WS=52, SINGLELINECOMMENT=53, BlockComment=54, 
		ErrorChar=55;
	public static final int
		RULE_program = 0, RULE_classDefiniton = 1, RULE_featureDefinition = 2, 
		RULE_expr = 3, RULE_expr_ = 4, RULE_term = 5, RULE_term_ = 6, RULE_value = 7, 
		RULE_assignmentStmt = 8, RULE_featureCall = 9, RULE_memberAccess = 10, 
		RULE_ifStmt = 11, RULE_matchedIfStmt = 12, RULE_openIfStmt = 13, RULE_caseStmt = 14, 
		RULE_letStmt = 15, RULE_whileStmt = 16, RULE_block = 17, RULE_newObject = 18, 
		RULE_isvoidExpr = 19, RULE_invrseExpr = 20, RULE_notExpr = 21, RULE_exprList = 22, 
		RULE_exprList_ = 23, RULE_formal = 24, RULE_formalsList = 25, RULE_formalsList_ = 26, 
		RULE_variableDeclaration = 27, RULE_type = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefiniton", "featureDefinition", "expr", "expr_", "term", 
			"term_", "value", "assignmentStmt", "featureCall", "memberAccess", "ifStmt", 
			"matchedIfStmt", "openIfStmt", "caseStmt", "letStmt", "whileStmt", "block", 
			"newObject", "isvoidExpr", "invrseExpr", "notExpr", "exprList", "exprList_", 
			"formal", "formalsList", "formalsList_", "variableDeclaration", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'<-'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", 
			"'='", null, "'~'", "';'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"','", "':'", "'.'", "'@'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CLASS", "INHERITS", "NEW", "SELF_TYPE", "SELF", "INT", "STRING", 
			"VOID", "BOOL", "TRUE", "FALSE", "ISVOID", "IO", "IF", "THEN", "ELSE", 
			"FI", "CASE", "OF", "ESAC", "WHILE", "LOOP", "POOL", "LET", "IN", "OP_ASSIGNMENT", 
			"OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "RELOP_LT", "RELOP_LE", "RELOP_EQ", 
			"OP_NOT", "OP_INV", "SEMICOLON", "OPENING_CURLY_BRACKET", "CLOSING_CURLY_BRACKET", 
			"OPENING_BRACKET", "CLOSING_BRACKET", "OPENING_SQUARE_BRACKET", "CLOSING_SQUARE_BRACKET", 
			"COMMA", "COLON", "DOT", "AT", "SINGLELINECOMMENTSTART", "NUM", "LITERAL", 
			"ID", "WS", "SINGLELINECOMMENT", "BlockComment", "ErrorChar"
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
		public List<ClassDefinitonContext> classDefiniton() {
			return getRuleContexts(ClassDefinitonContext.class);
		}
		public ClassDefinitonContext classDefiniton(int i) {
			return getRuleContext(ClassDefinitonContext.class,i);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(58);
				classDefiniton();
				}
				}
				setState(63);
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

	public static class ClassDefinitonContext extends ParserRuleContext {
		public ClassDefinitonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefiniton; }
	 
		public ClassDefinitonContext() { }
		public void copyFrom(ClassDefinitonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDefinitionRuleContext extends ClassDefinitonContext {
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode OPENING_CURLY_BRACKET() { return getToken(CoolParser.OPENING_CURLY_BRACKET, 0); }
		public TerminalNode CLOSING_CURLY_BRACKET() { return getToken(CoolParser.CLOSING_CURLY_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolParser.SEMICOLON, 0); }
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FeatureDefinitionContext> featureDefinition() {
			return getRuleContexts(FeatureDefinitionContext.class);
		}
		public FeatureDefinitionContext featureDefinition(int i) {
			return getRuleContext(FeatureDefinitionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDefinitionRuleContext(ClassDefinitonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterClassDefinitionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitClassDefinitionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitClassDefinitionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitonContext classDefiniton() throws RecognitionException {
		ClassDefinitonContext _localctx = new ClassDefinitonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefiniton);
		int _la;
		try {
			int _alt;
			_localctx = new ClassDefinitionRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CLASS);
			setState(65);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INHERITS:
				{
				setState(66);
				match(INHERITS);
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELF_TYPE:
				case INT:
				case STRING:
				case VOID:
				case BOOL:
				case IO:
					{
					setState(67);
					type();
					}
					break;
				case ID:
					{
					setState(68);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OPENING_CURLY_BRACKET:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(74);
			match(OPENING_CURLY_BRACKET);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					variableDeclaration();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(81);
				featureDefinition();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(CLOSING_CURLY_BRACKET);
			setState(88);
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

	public static class FeatureDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode OPENING_BRACKET() { return getToken(CoolParser.OPENING_BRACKET, 0); }
		public TerminalNode CLOSING_BRACKET() { return getToken(CoolParser.CLOSING_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode OPENING_CURLY_BRACKET() { return getToken(CoolParser.OPENING_CURLY_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSING_CURLY_BRACKET() { return getToken(CoolParser.CLOSING_CURLY_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolParser.SEMICOLON, 0); }
		public FormalsListContext formalsList() {
			return getRuleContext(FormalsListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OP_ASSIGNMENT() { return getToken(CoolParser.OP_ASSIGNMENT, 0); }
		public FeatureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFeatureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFeatureDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFeatureDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureDefinitionContext featureDefinition() throws RecognitionException {
		FeatureDefinitionContext _localctx = new FeatureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_featureDefinition);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				setState(91);
				match(OPENING_BRACKET);
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(92);
					formalsList();
					}
					break;
				case CLOSING_BRACKET:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96);
				match(CLOSING_BRACKET);
				setState(97);
				match(COLON);
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(98);
					match(ID);
					}
					break;
				case SELF_TYPE:
				case INT:
				case STRING:
				case VOID:
				case BOOL:
				case IO:
					{
					setState(99);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102);
				match(OPENING_CURLY_BRACKET);
				setState(103);
				expr();
				setState(104);
				match(CLOSING_CURLY_BRACKET);
				setState(105);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ID);
				setState(108);
				match(COLON);
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELF_TYPE:
				case INT:
				case STRING:
				case VOID:
				case BOOL:
				case IO:
					{
					setState(109);
					type();
					}
					break;
				case ID:
					{
					setState(110);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_ASSIGNMENT:
					{
					setState(113);
					match(OP_ASSIGNMENT);
					setState(114);
					expr();
					}
					break;
				case SEMICOLON:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118);
				match(SEMICOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_Context expr_() {
			return getRuleContext(Expr_Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			term();
			setState(122);
			expr_();
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

	public static class Expr_Context extends ParserRuleContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_Context expr_() {
			return getRuleContext(Expr_Context.class,0);
		}
		public TerminalNode OP_ADD() { return getToken(CoolParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(CoolParser.OP_SUB, 0); }
		public TerminalNode RELOP_EQ() { return getToken(CoolParser.RELOP_EQ, 0); }
		public TerminalNode RELOP_LE() { return getToken(CoolParser.RELOP_LE, 0); }
		public TerminalNode RELOP_LT() { return getToken(CoolParser.RELOP_LT, 0); }
		public Expr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_Context expr_() throws RecognitionException {
		Expr_Context _localctx = new Expr_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((Expr_Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ADD) | (1L << OP_SUB) | (1L << RELOP_LT) | (1L << RELOP_LE) | (1L << RELOP_EQ))) != 0)) ) {
					((Expr_Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				term();
				setState(126);
				expr_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TermContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Term_Context term_() {
			return getRuleContext(Term_Context.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			value();
			setState(132);
			term_();
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

	public static class Term_Context extends ParserRuleContext {
		public Token op;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Term_Context term_() {
			return getRuleContext(Term_Context.class,0);
		}
		public TerminalNode OP_MUL() { return getToken(CoolParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(CoolParser.OP_DIV, 0); }
		public Term_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterTerm_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitTerm_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitTerm_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_Context term_() throws RecognitionException {
		Term_Context _localctx = new Term_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_term_);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((Term_Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
					((Term_Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				value();
				setState(136);
				term_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ValueContext extends ParserRuleContext {
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public FeatureCallContext featureCall() {
			return getRuleContext(FeatureCallContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public LetStmtContext letStmt() {
			return getRuleContext(LetStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public IsvoidExprContext isvoidExpr() {
			return getRuleContext(IsvoidExprContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public InvrseExprContext invrseExpr() {
			return getRuleContext(InvrseExprContext.class,0);
		}
		public TerminalNode OPENING_BRACKET() { return getToken(CoolParser.OPENING_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSING_BRACKET() { return getToken(CoolParser.CLOSING_BRACKET, 0); }
		public TerminalNode SELF() { return getToken(CoolParser.SELF, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode NUM() { return getToken(CoolParser.NUM, 0); }
		public TerminalNode LITERAL() { return getToken(CoolParser.LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CoolParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoolParser.FALSE, 0); }
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(141);
				assignmentStmt();
				}
				break;
			case 2:
				{
				setState(142);
				featureCall();
				}
				break;
			case 3:
				{
				setState(143);
				ifStmt();
				}
				break;
			case 4:
				{
				setState(144);
				caseStmt();
				}
				break;
			case 5:
				{
				setState(145);
				letStmt();
				}
				break;
			case 6:
				{
				setState(146);
				whileStmt();
				}
				break;
			case 7:
				{
				setState(147);
				block();
				}
				break;
			case 8:
				{
				setState(148);
				newObject();
				}
				break;
			case 9:
				{
				setState(149);
				isvoidExpr();
				}
				break;
			case 10:
				{
				setState(150);
				notExpr();
				}
				break;
			case 11:
				{
				setState(151);
				invrseExpr();
				}
				break;
			case 12:
				{
				setState(152);
				match(OPENING_BRACKET);
				setState(153);
				expr();
				setState(154);
				match(CLOSING_BRACKET);
				}
				break;
			case 13:
				{
				setState(156);
				match(SELF);
				}
				break;
			case 14:
				{
				setState(157);
				match(ID);
				}
				break;
			case 15:
				{
				setState(158);
				match(NUM);
				}
				break;
			case 16:
				{
				setState(159);
				match(LITERAL);
				}
				break;
			case 17:
				{
				setState(160);
				match(TRUE);
				}
				break;
			case 18:
				{
				setState(161);
				match(FALSE);
				}
				break;
			}
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(164);
				memberAccess();
				}
				break;
			case 2:
				{
				}
				break;
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
	 
		public AssignmentStmtContext() { }
		public void copyFrom(AssignmentStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentStmtRuleContext extends AssignmentStmtContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode OP_ASSIGNMENT() { return getToken(CoolParser.OP_ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStmtRuleContext(AssignmentStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterAssignmentStmtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitAssignmentStmtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitAssignmentStmtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentStmt);
		try {
			_localctx = new AssignmentStmtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(OP_ASSIGNMENT);
			setState(170);
			expr();
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

	public static class FeatureCallContext extends ParserRuleContext {
		public FeatureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureCall; }
	 
		public FeatureCallContext() { }
		public void copyFrom(FeatureCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FeatureCallRuleContext extends FeatureCallContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode OPENING_BRACKET() { return getToken(CoolParser.OPENING_BRACKET, 0); }
		public TerminalNode CLOSING_BRACKET() { return getToken(CoolParser.CLOSING_BRACKET, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FeatureCallRuleContext(FeatureCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFeatureCallRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFeatureCallRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFeatureCallRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureCallContext featureCall() throws RecognitionException {
		FeatureCallContext _localctx = new FeatureCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_featureCall);
		try {
			_localctx = new FeatureCallRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(173);
			match(OPENING_BRACKET);
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case SELF:
			case TRUE:
			case FALSE:
			case ISVOID:
			case IF:
			case CASE:
			case WHILE:
			case LET:
			case OP_NOT:
			case OP_INV:
			case OPENING_CURLY_BRACKET:
			case OPENING_BRACKET:
			case NUM:
			case LITERAL:
			case ID:
				{
				setState(174);
				exprList();
				}
				break;
			case CLOSING_BRACKET:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			match(CLOSING_BRACKET);
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

	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
		public FeatureCallContext featureCall() {
			return getRuleContext(FeatureCallContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_memberAccess);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AT:
					{
					setState(180);
					match(AT);
					setState(183);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELF_TYPE:
					case INT:
					case STRING:
					case VOID:
					case BOOL:
					case IO:
						{
						setState(181);
						type();
						}
						break;
					case ID:
						{
						setState(182);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case DOT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188);
				match(DOT);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(189);
					featureCall();
					}
					break;
				case 2:
					{
					setState(190);
					match(ID);
					}
					break;
				}
				setState(193);
				memberAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IfStmtContext extends ParserRuleContext {
		public MatchedIfStmtContext matchedIfStmt() {
			return getRuleContext(MatchedIfStmtContext.class,0);
		}
		public OpenIfStmtContext openIfStmt() {
			return getRuleContext(OpenIfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStmt);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				matchedIfStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				openIfStmt();
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

	public static class MatchedIfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public List<MatchedIfStmtContext> matchedIfStmt() {
			return getRuleContexts(MatchedIfStmtContext.class);
		}
		public MatchedIfStmtContext matchedIfStmt(int i) {
			return getRuleContext(MatchedIfStmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public MatchedIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedIfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterMatchedIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitMatchedIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitMatchedIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedIfStmtContext matchedIfStmt() throws RecognitionException {
		MatchedIfStmtContext _localctx = new MatchedIfStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matchedIfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(IF);
			setState(202);
			expr();
			setState(203);
			match(THEN);
			setState(204);
			matchedIfStmt();
			setState(205);
			match(ELSE);
			setState(206);
			matchedIfStmt();
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

	public static class OpenIfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public MatchedIfStmtContext matchedIfStmt() {
			return getRuleContext(MatchedIfStmtContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public OpenIfStmtContext openIfStmt() {
			return getRuleContext(OpenIfStmtContext.class,0);
		}
		public OpenIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openIfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterOpenIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitOpenIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitOpenIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenIfStmtContext openIfStmt() throws RecognitionException {
		OpenIfStmtContext _localctx = new OpenIfStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_openIfStmt);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(IF);
				setState(209);
				expr();
				setState(210);
				match(THEN);
				setState(211);
				ifStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(IF);
				setState(214);
				expr();
				setState(215);
				match(THEN);
				setState(216);
				matchedIfStmt();
				setState(217);
				match(ELSE);
				setState(218);
				openIfStmt();
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

	public static class CaseStmtContext extends ParserRuleContext {
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
	 
		public CaseStmtContext() { }
		public void copyFrom(CaseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseStmtRuleContext extends CaseStmtContext {
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoolParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolParser.COLON, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public CaseStmtRuleContext(CaseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterCaseStmtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitCaseStmtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitCaseStmtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_caseStmt);
		int _la;
		try {
			_localctx = new CaseStmtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CASE);
			setState(223);
			expr();
			setState(224);
			match(OF);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(ID);
				setState(226);
				match(COLON);
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELF_TYPE:
				case INT:
				case STRING:
				case VOID:
				case BOOL:
				case IO:
					{
					setState(227);
					type();
					}
					break;
				case ID:
					{
					setState(228);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231);
				match(T__0);
				setState(232);
				expr();
				setState(233);
				match(SEMICOLON);
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(239);
			match(ESAC);
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

	public static class LetStmtContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoolParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolParser.COLON, i);
		}
		public List<TerminalNode> OP_ASSIGNMENT() { return getTokens(CoolParser.OP_ASSIGNMENT); }
		public TerminalNode OP_ASSIGNMENT(int i) {
			return getToken(CoolParser.OP_ASSIGNMENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public LetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitLetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitLetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStmtContext letStmt() throws RecognitionException {
		LetStmtContext _localctx = new LetStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_letStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(LET);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				match(ID);
				setState(243);
				match(COLON);
				setState(246);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELF_TYPE:
				case INT:
				case STRING:
				case VOID:
				case BOOL:
				case IO:
					{
					setState(244);
					type();
					}
					break;
				case ID:
					{
					setState(245);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(248);
				match(OP_ASSIGNMENT);
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(249);
					expr();
					}
					break;
				}
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(256);
			match(IN);
			setState(257);
			expr();
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

	public static class WhileStmtContext extends ParserRuleContext {
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	 
		public WhileStmtContext() { }
		public void copyFrom(WhileStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStmtRuleContext extends WhileStmtContext {
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public WhileStmtRuleContext(WhileStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterWhileStmtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitWhileStmtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitWhileStmtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileStmt);
		try {
			_localctx = new WhileStmtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(WHILE);
			setState(260);
			expr();
			setState(261);
			match(LOOP);
			setState(262);
			expr();
			setState(263);
			match(POOL);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockRuleContext extends BlockContext {
		public TerminalNode OPENING_CURLY_BRACKET() { return getToken(CoolParser.OPENING_CURLY_BRACKET, 0); }
		public TerminalNode CLOSING_CURLY_BRACKET() { return getToken(CoolParser.CLOSING_CURLY_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public BlockRuleContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterBlockRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitBlockRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitBlockRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			_localctx = new BlockRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(OPENING_CURLY_BRACKET);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				expr();
				setState(267);
				match(SEMICOLON);
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << ISVOID) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << OP_NOT) | (1L << OP_INV) | (1L << OPENING_CURLY_BRACKET) | (1L << OPENING_BRACKET) | (1L << NUM) | (1L << LITERAL) | (1L << ID))) != 0) );
			setState(273);
			match(CLOSING_CURLY_BRACKET);
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

	public static class NewObjectContext extends ParserRuleContext {
		public NewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObject; }
	 
		public NewObjectContext() { }
		public void copyFrom(NewObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewObjectRuleContext extends NewObjectContext {
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public NewObjectRuleContext(NewObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterNewObjectRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitNewObjectRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitNewObjectRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjectContext newObject() throws RecognitionException {
		NewObjectContext _localctx = new NewObjectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_newObject);
		try {
			_localctx = new NewObjectRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(NEW);
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF_TYPE:
			case INT:
			case STRING:
			case VOID:
			case BOOL:
			case IO:
				{
				setState(276);
				type();
				}
				break;
			case ID:
				{
				setState(277);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IsvoidExprContext extends ParserRuleContext {
		public IsvoidExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isvoidExpr; }
	 
		public IsvoidExprContext() { }
		public void copyFrom(IsvoidExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IsvoidExprRuleContext extends IsvoidExprContext {
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidExprRuleContext(IsvoidExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterIsvoidExprRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitIsvoidExprRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitIsvoidExprRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsvoidExprContext isvoidExpr() throws RecognitionException {
		IsvoidExprContext _localctx = new IsvoidExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_isvoidExpr);
		try {
			_localctx = new IsvoidExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ISVOID);
			setState(281);
			expr();
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

	public static class InvrseExprContext extends ParserRuleContext {
		public InvrseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invrseExpr; }
	 
		public InvrseExprContext() { }
		public void copyFrom(InvrseExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvrseExprRuleContext extends InvrseExprContext {
		public TerminalNode OP_INV() { return getToken(CoolParser.OP_INV, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InvrseExprRuleContext(InvrseExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterInvrseExprRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitInvrseExprRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitInvrseExprRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvrseExprContext invrseExpr() throws RecognitionException {
		InvrseExprContext _localctx = new InvrseExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_invrseExpr);
		try {
			_localctx = new InvrseExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(OP_INV);
			setState(284);
			expr();
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

	public static class NotExprContext extends ParserRuleContext {
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
	 
		public NotExprContext() { }
		public void copyFrom(NotExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprRuleContext extends NotExprContext {
		public TerminalNode OP_NOT() { return getToken(CoolParser.OP_NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprRuleContext(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterNotExprRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitNotExprRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitNotExprRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notExpr);
		try {
			_localctx = new NotExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(OP_NOT);
			setState(287);
			expr();
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

	public static class ExprListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprList_Context exprList_() {
			return getRuleContext(ExprList_Context.class,0);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr();
			setState(290);
			exprList_();
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

	public static class ExprList_Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CoolParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprList_Context exprList_() {
			return getRuleContext(ExprList_Context.class,0);
		}
		public ExprList_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterExprList_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitExprList_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitExprList_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprList_Context exprList_() throws RecognitionException {
		ExprList_Context _localctx = new ExprList_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprList_);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(COMMA);
				setState(293);
				expr();
				setState(294);
				exprList_();
				}
				break;
			case CLOSING_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FormalContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(ID);
			setState(300);
			match(COLON);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF_TYPE:
			case INT:
			case STRING:
			case VOID:
			case BOOL:
			case IO:
				{
				setState(301);
				type();
				}
				break;
			case ID:
				{
				setState(302);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FormalsListContext extends ParserRuleContext {
		public FormalContext formal() {
			return getRuleContext(FormalContext.class,0);
		}
		public FormalsList_Context formalsList_() {
			return getRuleContext(FormalsList_Context.class,0);
		}
		public FormalsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFormalsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFormalsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFormalsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalsListContext formalsList() throws RecognitionException {
		FormalsListContext _localctx = new FormalsListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formalsList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			formal();
			setState(306);
			formalsList_();
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

	public static class FormalsList_Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CoolParser.COMMA, 0); }
		public FormalContext formal() {
			return getRuleContext(FormalContext.class,0);
		}
		public FormalsList_Context formalsList_() {
			return getRuleContext(FormalsList_Context.class,0);
		}
		public FormalsList_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalsList_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFormalsList_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFormalsList_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFormalsList_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalsList_Context formalsList_() throws RecognitionException {
		FormalsList_Context _localctx = new FormalsList_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_formalsList_);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(COMMA);
				setState(309);
				formal();
				setState(310);
				formalsList_();
				}
				break;
			case CLOSING_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
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
		public TerminalNode OP_ASSIGNMENT() { return getToken(CoolParser.OP_ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 54, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(316);
			match(COLON);
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF_TYPE:
			case INT:
			case STRING:
			case VOID:
			case BOOL:
			case IO:
				{
				setState(317);
				type();
				}
				break;
			case ID:
				{
				setState(318);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_ASSIGNMENT:
				{
				setState(321);
				match(OP_ASSIGNMENT);
				setState(322);
				expr();
				}
				break;
			case SEMICOLON:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(326);
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
		public TerminalNode SELF_TYPE() { return getToken(CoolParser.SELF_TYPE, 0); }
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
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF_TYPE) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL) | (1L << IO))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\3\3\7\3O\n\3\f"+
		"\3\16\3R\13\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4a\n\4\3\4\3\4\3\4\3\4\5\4g\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4r\n\4\3\4\3\4\3\4\5\4w\n\4\3\4\5\4z\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0084\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00a5\n\t\3\t\3\t\5\t\u00a9\n\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\5\13\u00b3\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ba\n\f\3\f"+
		"\5\f\u00bd\n\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\f\3\f\5\f\u00c6\n\f\3\r\3\r"+
		"\5\r\u00ca\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00df\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00e8\n\20\3\20\3\20\3\20\3\20\6\20\u00ee\n"+
		"\20\r\20\16\20\u00ef\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00f9\n\21"+
		"\3\21\3\21\5\21\u00fd\n\21\6\21\u00ff\n\21\r\21\16\21\u0100\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\6\23\u0110\n\23"+
		"\r\23\16\23\u0111\3\23\3\23\3\24\3\24\3\24\5\24\u0119\n\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u012c\n\31\3\32\3\32\3\32\3\32\5\32\u0132\n\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u013c\n\34\3\35\3\35\3\35\3\35\5\35\u0142"+
		"\n\35\3\35\3\35\3\35\5\35\u0147\n\35\3\35\3\35\3\36\3\36\3\36\2\2\37\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\4\2\36"+
		"\37\"$\3\2 !\5\2\7\7\t\f\20\20\2\u0160\2?\3\2\2\2\4B\3\2\2\2\6y\3\2\2"+
		"\2\b{\3\2\2\2\n\u0083\3\2\2\2\f\u0085\3\2\2\2\16\u008d\3\2\2\2\20\u00a4"+
		"\3\2\2\2\22\u00aa\3\2\2\2\24\u00ae\3\2\2\2\26\u00c5\3\2\2\2\30\u00c9\3"+
		"\2\2\2\32\u00cb\3\2\2\2\34\u00de\3\2\2\2\36\u00e0\3\2\2\2 \u00f3\3\2\2"+
		"\2\"\u0105\3\2\2\2$\u010b\3\2\2\2&\u0115\3\2\2\2(\u011a\3\2\2\2*\u011d"+
		"\3\2\2\2,\u0120\3\2\2\2.\u0123\3\2\2\2\60\u012b\3\2\2\2\62\u012d\3\2\2"+
		"\2\64\u0133\3\2\2\2\66\u013b\3\2\2\28\u013d\3\2\2\2:\u014a\3\2\2\2<>\5"+
		"\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BC"+
		"\7\4\2\2CJ\7\65\2\2DG\7\5\2\2EH\5:\36\2FH\7\65\2\2GE\3\2\2\2GF\3\2\2\2"+
		"HK\3\2\2\2IK\3\2\2\2JD\3\2\2\2JI\3\2\2\2KL\3\2\2\2LP\7(\2\2MO\58\35\2"+
		"NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QV\3\2\2\2RP\3\2\2\2SU\5\6\4\2"+
		"TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7)\2\2"+
		"Z[\7\'\2\2[\5\3\2\2\2\\]\7\65\2\2]`\7*\2\2^a\5\64\33\2_a\3\2\2\2`^\3\2"+
		"\2\2`_\3\2\2\2ab\3\2\2\2bc\7+\2\2cf\7/\2\2dg\7\65\2\2eg\5:\36\2fd\3\2"+
		"\2\2fe\3\2\2\2gh\3\2\2\2hi\7(\2\2ij\5\b\5\2jk\7)\2\2kl\7\'\2\2lz\3\2\2"+
		"\2mn\7\65\2\2nq\7/\2\2or\5:\36\2pr\7\65\2\2qo\3\2\2\2qp\3\2\2\2rv\3\2"+
		"\2\2st\7\35\2\2tw\5\b\5\2uw\3\2\2\2vs\3\2\2\2vu\3\2\2\2wx\3\2\2\2xz\7"+
		"\'\2\2y\\\3\2\2\2ym\3\2\2\2z\7\3\2\2\2{|\5\f\7\2|}\5\n\6\2}\t\3\2\2\2"+
		"~\177\t\2\2\2\177\u0080\5\f\7\2\u0080\u0081\5\n\6\2\u0081\u0084\3\2\2"+
		"\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\13\3\2"+
		"\2\2\u0085\u0086\5\20\t\2\u0086\u0087\5\16\b\2\u0087\r\3\2\2\2\u0088\u0089"+
		"\t\3\2\2\u0089\u008a\5\20\t\2\u008a\u008b\5\16\b\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u008c\3\2\2\2\u008e\17"+
		"\3\2\2\2\u008f\u00a5\5\22\n\2\u0090\u00a5\5\24\13\2\u0091\u00a5\5\30\r"+
		"\2\u0092\u00a5\5\36\20\2\u0093\u00a5\5 \21\2\u0094\u00a5\5\"\22\2\u0095"+
		"\u00a5\5$\23\2\u0096\u00a5\5&\24\2\u0097\u00a5\5(\25\2\u0098\u00a5\5,"+
		"\27\2\u0099\u00a5\5*\26\2\u009a\u009b\7*\2\2\u009b\u009c\5\b\5\2\u009c"+
		"\u009d\7+\2\2\u009d\u00a5\3\2\2\2\u009e\u00a5\7\b\2\2\u009f\u00a5\7\65"+
		"\2\2\u00a0\u00a5\7\63\2\2\u00a1\u00a5\7\64\2\2\u00a2\u00a5\7\r\2\2\u00a3"+
		"\u00a5\7\16\2\2\u00a4\u008f\3\2\2\2\u00a4\u0090\3\2\2\2\u00a4\u0091\3"+
		"\2\2\2\u00a4\u0092\3\2\2\2\u00a4\u0093\3\2\2\2\u00a4\u0094\3\2\2\2\u00a4"+
		"\u0095\3\2\2\2\u00a4\u0096\3\2\2\2\u00a4\u0097\3\2\2\2\u00a4\u0098\3\2"+
		"\2\2\u00a4\u0099\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4"+
		"\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a9\5\26\f\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\21\3\2\2"+
		"\2\u00aa\u00ab\7\65\2\2\u00ab\u00ac\7\35\2\2\u00ac\u00ad\5\b\5\2\u00ad"+
		"\23\3\2\2\2\u00ae\u00af\7\65\2\2\u00af\u00b2\7*\2\2\u00b0\u00b3\5.\30"+
		"\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5\25\3\2\2\2\u00b6\u00b9\7\61\2\2\u00b7"+
		"\u00ba\5:\36\2\u00b8\u00ba\7\65\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3"+
		"\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\7\60\2\2\u00bf\u00c2\5"+
		"\24\13\2\u00c0\u00c2\7\65\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2"+
		"\u00c2\u00c3\3\2\2\2\u00c3\u00c6\5\26\f\2\u00c4\u00c6\3\2\2\2\u00c5\u00bc"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\27\3\2\2\2\u00c7\u00ca\5\32\16\2\u00c8"+
		"\u00ca\5\34\17\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\31\3\2"+
		"\2\2\u00cb\u00cc\7\21\2\2\u00cc\u00cd\5\b\5\2\u00cd\u00ce\7\22\2\2\u00ce"+
		"\u00cf\5\32\16\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\5\32\16\2\u00d1\33\3"+
		"\2\2\2\u00d2\u00d3\7\21\2\2\u00d3\u00d4\5\b\5\2\u00d4\u00d5\7\22\2\2\u00d5"+
		"\u00d6\5\30\r\2\u00d6\u00df\3\2\2\2\u00d7\u00d8\7\21\2\2\u00d8\u00d9\5"+
		"\b\5\2\u00d9\u00da\7\22\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\7\23\2\2"+
		"\u00dc\u00dd\5\34\17\2\u00dd\u00df\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d7"+
		"\3\2\2\2\u00df\35\3\2\2\2\u00e0\u00e1\7\25\2\2\u00e1\u00e2\5\b\5\2\u00e2"+
		"\u00ed\7\26\2\2\u00e3\u00e4\7\65\2\2\u00e4\u00e7\7/\2\2\u00e5\u00e8\5"+
		":\36\2\u00e6\u00e8\7\65\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\7\3\2\2\u00ea\u00eb\5\b\5\2\u00eb\u00ec\7\'"+
		"\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e3\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\27"+
		"\2\2\u00f2\37\3\2\2\2\u00f3\u00fe\7\33\2\2\u00f4\u00f5\7\65\2\2\u00f5"+
		"\u00f8\7/\2\2\u00f6\u00f9\5:\36\2\u00f7\u00f9\7\65\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\7\35\2\2\u00fb"+
		"\u00fd\5\b\5\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00f4\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\34\2\2\u0103\u0104\5"+
		"\b\5\2\u0104!\3\2\2\2\u0105\u0106\7\30\2\2\u0106\u0107\5\b\5\2\u0107\u0108"+
		"\7\31\2\2\u0108\u0109\5\b\5\2\u0109\u010a\7\32\2\2\u010a#\3\2\2\2\u010b"+
		"\u010f\7(\2\2\u010c\u010d\5\b\5\2\u010d\u010e\7\'\2\2\u010e\u0110\3\2"+
		"\2\2\u010f\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7)\2\2\u0114%\3\2\2\2\u0115"+
		"\u0118\7\6\2\2\u0116\u0119\5:\36\2\u0117\u0119\7\65\2\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0117\3\2\2\2\u0119\'\3\2\2\2\u011a\u011b\7\17\2\2\u011b"+
		"\u011c\5\b\5\2\u011c)\3\2\2\2\u011d\u011e\7&\2\2\u011e\u011f\5\b\5\2\u011f"+
		"+\3\2\2\2\u0120\u0121\7%\2\2\u0121\u0122\5\b\5\2\u0122-\3\2\2\2\u0123"+
		"\u0124\5\b\5\2\u0124\u0125\5\60\31\2\u0125/\3\2\2\2\u0126\u0127\7.\2\2"+
		"\u0127\u0128\5\b\5\2\u0128\u0129\5\60\31\2\u0129\u012c\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u012a\3\2\2\2\u012c\61\3\2\2\2\u012d"+
		"\u012e\7\65\2\2\u012e\u0131\7/\2\2\u012f\u0132\5:\36\2\u0130\u0132\7\65"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\63\3\2\2\2\u0133\u0134"+
		"\5\62\32\2\u0134\u0135\5\66\34\2\u0135\65\3\2\2\2\u0136\u0137\7.\2\2\u0137"+
		"\u0138\5\62\32\2\u0138\u0139\5\66\34\2\u0139\u013c\3\2\2\2\u013a\u013c"+
		"\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u013a\3\2\2\2\u013c\67\3\2\2\2\u013d"+
		"\u013e\7\65\2\2\u013e\u0141\7/\2\2\u013f\u0142\5:\36\2\u0140\u0142\7\65"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0146\3\2\2\2\u0143"+
		"\u0144\7\35\2\2\u0144\u0147\5\b\5\2\u0145\u0147\3\2\2\2\u0146\u0143\3"+
		"\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\'\2\2\u0149"+
		"9\3\2\2\2\u014a\u014b\t\4\2\2\u014b;\3\2\2\2#?GJPV`fqvy\u0083\u008d\u00a4"+
		"\u00a8\u00b2\u00b9\u00bc\u00c1\u00c5\u00c9\u00de\u00e7\u00ef\u00f8\u00fc"+
		"\u0100\u0111\u0118\u012b\u0131\u013b\u0141\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}