package gen;// Generated from /home/amr/IdeaProjects/COOLCompiler/Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		RULE_program = 0, RULE_classDefiniton = 1, RULE_globals = 2, RULE_featureDefinition = 3, 
		RULE_expr = 4, RULE_term = 5, RULE_value = 6, RULE_assignmentStmt = 7, 
		RULE_featureCall = 8, RULE_memberAccess = 9, RULE_ifStmt = 10, RULE_caseStmt = 11, 
		RULE_letStmt = 12, RULE_whileStmt = 13, RULE_block = 14, RULE_newObject = 15, 
		RULE_isvoidExpr = 16, RULE_invrseExpr = 17, RULE_notExpr = 18, RULE_exprList = 19, 
		RULE_formal = 20, RULE_formalsList = 21, RULE_variableDeclaration = 22, 
		RULE_type = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefiniton", "globals", "featureDefinition", "expr", 
			"term", "value", "assignmentStmt", "featureCall", "memberAccess", "ifStmt", 
			"caseStmt", "letStmt", "whileStmt", "block", "newObject", "isvoidExpr", 
			"invrseExpr", "notExpr", "exprList", "formal", "formalsList", "variableDeclaration", 
			"type"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(48);
				classDefiniton();
				}
				}
				setState(53);
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
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public TerminalNode CLOSING_CURLY_BRACKET() { return getToken(CoolParser.CLOSING_CURLY_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolParser.SEMICOLON, 0); }
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
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
			_localctx = new ClassDefinitionRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(CLASS);
			setState(55);
			match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(56);
				match(INHERITS);
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELF_TYPE:
				case INT:
				case STRING:
				case VOID:
				case BOOL:
				case IO:
					{
					setState(57);
					type();
					}
					break;
				case ID:
					{
					setState(58);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(63);
			match(OPENING_CURLY_BRACKET);
			setState(64);
			globals();
			setState(65);
			match(CLOSING_CURLY_BRACKET);
			setState(66);
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

	public static class GlobalsContext extends ParserRuleContext {
		public List<FeatureDefinitionContext> featureDefinition() {
			return getRuleContexts(FeatureDefinitionContext.class);
		}
		public FeatureDefinitionContext featureDefinition(int i) {
			return getRuleContext(FeatureDefinitionContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitGlobals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitGlobals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << ISVOID) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << OP_SUB) | (1L << OP_NOT) | (1L << OP_INV) | (1L << OPENING_CURLY_BRACKET) | (1L << OPENING_BRACKET) | (1L << NUM) | (1L << LITERAL) | (1L << ID))) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					{
					setState(68);
					variableDeclaration();
					setState(69);
					match(SEMICOLON);
					}
					}
					break;
				case 2:
					{
					setState(71);
					featureDefinition();
					}
					break;
				case 3:
					{
					setState(72);
					expr(0);
					}
					break;
				}
				}
				setState(77);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalsListContext formalsList() {
			return getRuleContext(FormalsListContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_featureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(OPENING_BRACKET);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(80);
				formalsList(0);
				}
			}

			setState(83);
			match(CLOSING_BRACKET);
			setState(84);
			match(COLON);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(85);
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
				setState(86);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			match(OPENING_CURLY_BRACKET);
			setState(90);
			expr(0);
			setState(91);
			match(CLOSING_CURLY_BRACKET);
			setState(92);
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

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OP_ADD() { return getToken(CoolParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(CoolParser.OP_SUB, 0); }
		public TerminalNode RELOP_EQ() { return getToken(CoolParser.RELOP_EQ, 0); }
		public TerminalNode RELOP_LE() { return getToken(CoolParser.RELOP_LE, 0); }
		public TerminalNode RELOP_LT() { return getToken(CoolParser.RELOP_LT, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(97);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(98);
					((ExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ADD) | (1L << OP_SUB) | (1L << RELOP_LT) | (1L << RELOP_LE) | (1L << RELOP_EQ))) != 0)) ) {
						((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(99);
					term(0);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Token op;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode OP_MUL() { return getToken(CoolParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(CoolParser.OP_DIV, 0); }
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
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					((TermContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==OP_MUL || _la==OP_DIV) ) {
						((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(110);
					value();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(CoolParser.OPENING_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSING_BRACKET() { return getToken(CoolParser.CLOSING_BRACKET, 0); }
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
		public TerminalNode SELF() { return getToken(CoolParser.SELF, 0); }
		public TerminalNode OP_SUB() { return getToken(CoolParser.OP_SUB, 0); }
		public TerminalNode NUM() { return getToken(CoolParser.NUM, 0); }
		public TerminalNode LITERAL() { return getToken(CoolParser.LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CoolParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoolParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
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
		enterRule(_localctx, 12, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(116);
				match(OPENING_BRACKET);
				setState(117);
				expr(0);
				setState(118);
				match(CLOSING_BRACKET);
				}
				break;
			case 2:
				{
				setState(120);
				assignmentStmt();
				}
				break;
			case 3:
				{
				setState(121);
				featureCall();
				}
				break;
			case 4:
				{
				setState(122);
				ifStmt();
				}
				break;
			case 5:
				{
				setState(123);
				caseStmt();
				}
				break;
			case 6:
				{
				setState(124);
				letStmt();
				}
				break;
			case 7:
				{
				setState(125);
				whileStmt();
				}
				break;
			case 8:
				{
				setState(126);
				block();
				}
				break;
			case 9:
				{
				setState(127);
				newObject();
				}
				break;
			case 10:
				{
				setState(128);
				isvoidExpr();
				}
				break;
			case 11:
				{
				setState(129);
				notExpr();
				}
				break;
			case 12:
				{
				setState(130);
				invrseExpr();
				}
				break;
			case 13:
				{
				setState(131);
				match(SELF);
				}
				break;
			case 14:
				{
				setState(132);
				match(OP_SUB);
				setState(133);
				match(NUM);
				}
				break;
			case 15:
				{
				setState(134);
				match(LITERAL);
				}
				break;
			case 16:
				{
				setState(135);
				match(TRUE);
				}
				break;
			case 17:
				{
				setState(136);
				match(FALSE);
				}
				break;
			case 18:
				{
				setState(137);
				match(NUM);
				}
				break;
			case 19:
				{
				setState(138);
				match(ID);
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
		enterRule(_localctx, 14, RULE_assignmentStmt);
		try {
			_localctx = new AssignmentStmtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(OP_ASSIGNMENT);
			setState(143);
			expr(0);
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
		enterRule(_localctx, 16, RULE_featureCall);
		int _la;
		try {
			_localctx = new FeatureCallRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(OPENING_BRACKET);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << ISVOID) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << OP_SUB) | (1L << OP_NOT) | (1L << OP_INV) | (1L << OPENING_CURLY_BRACKET) | (1L << OPENING_BRACKET) | (1L << NUM) | (1L << LITERAL) | (1L << ID))) != 0)) {
				{
				setState(147);
				exprList(0);
				}
			}

			setState(150);
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
		public FeatureCallContext featureCall() {
			return getRuleContext(FeatureCallContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
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
		enterRule(_localctx, 18, RULE_memberAccess);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(152);
					match(AT);
					setState(155);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELF_TYPE:
					case INT:
					case STRING:
					case VOID:
					case BOOL:
					case IO:
						{
						setState(153);
						type();
						}
						break;
					case ID:
						{
						setState(154);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(159);
				match(DOT);
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(160);
					featureCall();
					}
					break;
				case 2:
					{
					setState(161);
					match(ID);
					}
					break;
				}
				setState(164);
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
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	 
		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtRuleContext extends IfStmtContext {
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public IfStmtRuleContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterIfStmtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitIfStmtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitIfStmtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		int _la;
		try {
			_localctx = new IfStmtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(169);
			expr(0);
			setState(170);
			match(THEN);
			setState(171);
			expr(0);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(172);
				match(ELSE);
				setState(173);
				expr(0);
				}
			}

			setState(176);
			match(FI);
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
		enterRule(_localctx, 22, RULE_caseStmt);
		int _la;
		try {
			_localctx = new CaseStmtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(CASE);
			setState(179);
			expr(0);
			setState(180);
			match(OF);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				match(ID);
				setState(182);
				match(COLON);
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELF_TYPE:
				case INT:
				case STRING:
				case VOID:
				case BOOL:
				case IO:
					{
					setState(183);
					type();
					}
					break;
				case ID:
					{
					setState(184);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187);
				match(T__0);
				setState(188);
				expr(0);
				setState(189);
				match(SEMICOLON);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(195);
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
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
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
		enterRule(_localctx, 24, RULE_letStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LET);
			setState(198);
			variableDeclaration();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(199);
				match(COMMA);
				setState(200);
				variableDeclaration();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(IN);
			setState(207);
			expr(0);
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
		enterRule(_localctx, 26, RULE_whileStmt);
		try {
			_localctx = new WhileStmtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(WHILE);
			setState(210);
			expr(0);
			setState(211);
			match(LOOP);
			setState(212);
			expr(0);
			setState(213);
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(OPENING_CURLY_BRACKET);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				expr(0);
				setState(217);
				match(SEMICOLON);
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << ISVOID) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << OP_SUB) | (1L << OP_NOT) | (1L << OP_INV) | (1L << OPENING_CURLY_BRACKET) | (1L << OPENING_BRACKET) | (1L << NUM) | (1L << LITERAL) | (1L << ID))) != 0) );
			setState(223);
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
		enterRule(_localctx, 30, RULE_newObject);
		try {
			_localctx = new NewObjectRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(NEW);
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF_TYPE:
			case INT:
			case STRING:
			case VOID:
			case BOOL:
			case IO:
				{
				setState(226);
				type();
				}
				break;
			case ID:
				{
				setState(227);
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
		enterRule(_localctx, 32, RULE_isvoidExpr);
		try {
			_localctx = new IsvoidExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ISVOID);
			setState(231);
			expr(0);
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
		enterRule(_localctx, 34, RULE_invrseExpr);
		try {
			_localctx = new InvrseExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(OP_INV);
			setState(234);
			expr(0);
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
		enterRule(_localctx, 36, RULE_notExpr);
		try {
			_localctx = new NotExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(OP_NOT);
			setState(237);
			expr(0);
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
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CoolParser.COMMA, 0); }
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
		return exprList(0);
	}

	private ExprListContext exprList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprListContext _localctx = new ExprListContext(_ctx, _parentState);
		ExprListContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exprList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(240);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprList);
					setState(242);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(243);
					match(COMMA);
					setState(244);
					expr(0);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 40, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ID);
			setState(251);
			match(COLON);
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF_TYPE:
			case INT:
			case STRING:
			case VOID:
			case BOOL:
			case IO:
				{
				setState(252);
				type();
				}
				break;
			case ID:
				{
				setState(253);
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
		public FormalsListContext formalsList() {
			return getRuleContext(FormalsListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CoolParser.COMMA, 0); }
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
		return formalsList(0);
	}

	private FormalsListContext formalsList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormalsListContext _localctx = new FormalsListContext(_ctx, _parentState);
		FormalsListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_formalsList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			formal();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FormalsListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_formalsList);
					setState(259);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(260);
					match(COMMA);
					setState(261);
					formal();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
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
		enterRule(_localctx, 44, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
			match(COLON);
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF_TYPE:
			case INT:
			case STRING:
			case VOID:
			case BOOL:
			case IO:
				{
				setState(269);
				type();
				}
				break;
			case ID:
				{
				setState(270);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGNMENT) {
				{
				setState(273);
				match(OP_ASSIGNMENT);
				setState(274);
				expr(0);
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
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return term_sempred((TermContext)_localctx, predIndex);
		case 19:
			return exprList_sempred((ExprListContext)_localctx, predIndex);
		case 21:
			return formalsList_sempred((FormalsListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprList_sempred(ExprListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean formalsList_sempred(FormalsListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u011a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\5\3@\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3"+
		"\5\3\5\5\5T\n\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7r\n"+
		"\7\f\7\16\7u\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\5\n\u0097\n\n\3\n\3\n\3\13\3\13\3\13\5\13\u009e\n\13\5\13"+
		"\u00a0\n\13\3\13\3\13\3\13\5\13\u00a5\n\13\3\13\3\13\5\13\u00a9\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00bc\n\r\3\r\3\r\3\r\3\r\6\r\u00c2\n\r\r\r\16\r\u00c3\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\7\16\u00cc\n\16\f\16\16\16\u00cf\13\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\6\20\u00de\n\20"+
		"\r\20\16\20\u00df\3\20\3\20\3\21\3\21\3\21\5\21\u00e7\n\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00f8"+
		"\n\25\f\25\16\25\u00fb\13\25\3\26\3\26\3\26\3\26\5\26\u0101\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0109\n\27\f\27\16\27\u010c\13\27\3\30"+
		"\3\30\3\30\3\30\5\30\u0112\n\30\3\30\3\30\5\30\u0116\n\30\3\31\3\31\3"+
		"\31\2\6\n\f(,\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\5\4\2\36\37\"$\3\2 !\5\2\7\7\t\f\20\20\2\u012d\2\65\3\2\2\2\48\3\2\2"+
		"\2\6M\3\2\2\2\bP\3\2\2\2\n`\3\2\2\2\fk\3\2\2\2\16\u008d\3\2\2\2\20\u008f"+
		"\3\2\2\2\22\u0093\3\2\2\2\24\u00a8\3\2\2\2\26\u00aa\3\2\2\2\30\u00b4\3"+
		"\2\2\2\32\u00c7\3\2\2\2\34\u00d3\3\2\2\2\36\u00d9\3\2\2\2 \u00e3\3\2\2"+
		"\2\"\u00e8\3\2\2\2$\u00eb\3\2\2\2&\u00ee\3\2\2\2(\u00f1\3\2\2\2*\u00fc"+
		"\3\2\2\2,\u0102\3\2\2\2.\u010d\3\2\2\2\60\u0117\3\2\2\2\62\64\5\4\3\2"+
		"\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2"+
		"\67\65\3\2\2\289\7\4\2\29?\7\65\2\2:=\7\5\2\2;>\5\60\31\2<>\7\65\2\2="+
		";\3\2\2\2=<\3\2\2\2>@\3\2\2\2?:\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7(\2\2B"+
		"C\5\6\4\2CD\7)\2\2DE\7\'\2\2E\5\3\2\2\2FG\5.\30\2GH\7\'\2\2HL\3\2\2\2"+
		"IL\5\b\5\2JL\5\n\6\2KF\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2N\7\3\2\2\2OM\3\2\2\2PQ\7\65\2\2QS\7*\2\2RT\5,\27\2SR\3\2\2"+
		"\2ST\3\2\2\2TU\3\2\2\2UV\7+\2\2VY\7/\2\2WZ\7\65\2\2XZ\5\60\31\2YW\3\2"+
		"\2\2YX\3\2\2\2Z[\3\2\2\2[\\\7(\2\2\\]\5\n\6\2]^\7)\2\2^_\7\'\2\2_\t\3"+
		"\2\2\2`a\b\6\1\2ab\5\f\7\2bh\3\2\2\2cd\f\4\2\2de\t\2\2\2eg\5\f\7\2fc\3"+
		"\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\13\3\2\2\2jh\3\2\2\2kl\b\7\1\2l"+
		"m\5\16\b\2ms\3\2\2\2no\f\4\2\2op\t\3\2\2pr\5\16\b\2qn\3\2\2\2ru\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2t\r\3\2\2\2us\3\2\2\2vw\7*\2\2wx\5\n\6\2xy\7+\2"+
		"\2y\u008e\3\2\2\2z\u008e\5\20\t\2{\u008e\5\22\n\2|\u008e\5\26\f\2}\u008e"+
		"\5\30\r\2~\u008e\5\32\16\2\177\u008e\5\34\17\2\u0080\u008e\5\36\20\2\u0081"+
		"\u008e\5 \21\2\u0082\u008e\5\"\22\2\u0083\u008e\5&\24\2\u0084\u008e\5"+
		"$\23\2\u0085\u008e\7\b\2\2\u0086\u0087\7\37\2\2\u0087\u008e\7\63\2\2\u0088"+
		"\u008e\7\64\2\2\u0089\u008e\7\r\2\2\u008a\u008e\7\16\2\2\u008b\u008e\7"+
		"\63\2\2\u008c\u008e\7\65\2\2\u008dv\3\2\2\2\u008dz\3\2\2\2\u008d{\3\2"+
		"\2\2\u008d|\3\2\2\2\u008d}\3\2\2\2\u008d~\3\2\2\2\u008d\177\3\2\2\2\u008d"+
		"\u0080\3\2\2\2\u008d\u0081\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0083\3\2"+
		"\2\2\u008d\u0084\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008d"+
		"\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\17\3\2\2\2\u008f\u0090\7\65\2\2\u0090\u0091"+
		"\7\35\2\2\u0091\u0092\5\n\6\2\u0092\21\3\2\2\2\u0093\u0094\7\65\2\2\u0094"+
		"\u0096\7*\2\2\u0095\u0097\5(\25\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7+\2\2\u0099\23\3\2\2\2\u009a\u009d"+
		"\7\61\2\2\u009b\u009e\5\60\31\2\u009c\u009e\7\65\2\2\u009d\u009b\3\2\2"+
		"\2\u009d\u009c\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\7\60\2\2\u00a2\u00a5\5\22\n\2"+
		"\u00a3\u00a5\7\65\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a9\5\24\13\2\u00a7\u00a9\3\2\2\2\u00a8\u009f\3\2\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac"+
		"\5\n\6\2\u00ac\u00ad\7\22\2\2\u00ad\u00b0\5\n\6\2\u00ae\u00af\7\23\2\2"+
		"\u00af\u00b1\5\n\6\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\7\24\2\2\u00b3\27\3\2\2\2\u00b4\u00b5\7\25\2\2\u00b5"+
		"\u00b6\5\n\6\2\u00b6\u00c1\7\26\2\2\u00b7\u00b8\7\65\2\2\u00b8\u00bb\7"+
		"/\2\2\u00b9\u00bc\5\60\31\2\u00ba\u00bc\7\65\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\3\2\2\u00be\u00bf\5\n"+
		"\6\2\u00bf\u00c0\7\'\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\7\27\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\7\33\2\2\u00c8"+
		"\u00cd\5.\30\2\u00c9\u00ca\7.\2\2\u00ca\u00cc\5.\30\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\34\2\2\u00d1\u00d2\5"+
		"\n\6\2\u00d2\33\3\2\2\2\u00d3\u00d4\7\30\2\2\u00d4\u00d5\5\n\6\2\u00d5"+
		"\u00d6\7\31\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8\7\32\2\2\u00d8\35\3\2"+
		"\2\2\u00d9\u00dd\7(\2\2\u00da\u00db\5\n\6\2\u00db\u00dc\7\'\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7)\2\2\u00e2"+
		"\37\3\2\2\2\u00e3\u00e6\7\6\2\2\u00e4\u00e7\5\60\31\2\u00e5\u00e7\7\65"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7!\3\2\2\2\u00e8\u00e9"+
		"\7\17\2\2\u00e9\u00ea\5\n\6\2\u00ea#\3\2\2\2\u00eb\u00ec\7&\2\2\u00ec"+
		"\u00ed\5\n\6\2\u00ed%\3\2\2\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\5\n\6\2\u00f0"+
		"\'\3\2\2\2\u00f1\u00f2\b\25\1\2\u00f2\u00f3\5\n\6\2\u00f3\u00f9\3\2\2"+
		"\2\u00f4\u00f5\f\4\2\2\u00f5\u00f6\7.\2\2\u00f6\u00f8\5\n\6\2\u00f7\u00f4"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		")\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\65\2\2\u00fd\u0100\7/\2\2"+
		"\u00fe\u0101\5\60\31\2\u00ff\u0101\7\65\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101+\3\2\2\2\u0102\u0103\b\27\1\2\u0103\u0104\5*\26\2"+
		"\u0104\u010a\3\2\2\2\u0105\u0106\f\4\2\2\u0106\u0107\7.\2\2\u0107\u0109"+
		"\5*\26\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b-\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\65\2\2"+
		"\u010e\u0111\7/\2\2\u010f\u0112\5\60\31\2\u0110\u0112\7\65\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\7\35\2\2"+
		"\u0114\u0116\5\n\6\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116/\3"+
		"\2\2\2\u0117\u0118\t\4\2\2\u0118\61\3\2\2\2\34\65=?KMSYhs\u008d\u0096"+
		"\u009d\u009f\u00a4\u00a8\u00b0\u00bb\u00c3\u00cd\u00df\u00e6\u00f9\u0100"+
		"\u010a\u0111\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}