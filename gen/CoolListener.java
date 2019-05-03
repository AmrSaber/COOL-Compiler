// Generated from C:/Users/Mohamed Mamdouh/Desktop/Draft/COOL-Compiler\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classDefiniton}.
	 * @param ctx the parse tree
	 */
	void enterClassDefiniton(CoolParser.ClassDefinitonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classDefiniton}.
	 * @param ctx the parse tree
	 */
	void exitClassDefiniton(CoolParser.ClassDefinitonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#featureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFeatureDefinition(CoolParser.FeatureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#featureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFeatureDefinition(CoolParser.FeatureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expr_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_(CoolParser.Expr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expr_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_(CoolParser.Expr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CoolParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CoolParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#term_}.
	 * @param ctx the parse tree
	 */
	void enterTerm_(CoolParser.Term_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#term_}.
	 * @param ctx the parse tree
	 */
	void exitTerm_(CoolParser.Term_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CoolParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CoolParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(CoolParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(CoolParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#featureCall}.
	 * @param ctx the parse tree
	 */
	void enterFeatureCall(CoolParser.FeatureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#featureCall}.
	 * @param ctx the parse tree
	 */
	void exitFeatureCall(CoolParser.FeatureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#memberAccess_}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess_(CoolParser.MemberAccess_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#memberAccess_}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess_(CoolParser.MemberAccess_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#memberAcess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAcess(CoolParser.MemberAcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#memberAcess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAcess(CoolParser.MemberAcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CoolParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CoolParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(CoolParser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(CoolParser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(CoolParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(CoolParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CoolParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CoolParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(CoolParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(CoolParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoidExpr(CoolParser.IsvoidExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoidExpr(CoolParser.IsvoidExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#invrseExpr}.
	 * @param ctx the parse tree
	 */
	void enterInvrseExpr(CoolParser.InvrseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#invrseExpr}.
	 * @param ctx the parse tree
	 */
	void exitInvrseExpr(CoolParser.InvrseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(CoolParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(CoolParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CoolParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CoolParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#exprList_}.
	 * @param ctx the parse tree
	 */
	void enterExprList_(CoolParser.ExprList_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#exprList_}.
	 * @param ctx the parse tree
	 */
	void exitExprList_(CoolParser.ExprList_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CoolParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CoolParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formalsList}.
	 * @param ctx the parse tree
	 */
	void enterFormalsList(CoolParser.FormalsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formalsList}.
	 * @param ctx the parse tree
	 */
	void exitFormalsList(CoolParser.FormalsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formalsList_}.
	 * @param ctx the parse tree
	 */
	void enterFormalsList_(CoolParser.FormalsList_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formalsList_}.
	 * @param ctx the parse tree
	 */
	void exitFormalsList_(CoolParser.FormalsList_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CoolParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CoolParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CoolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CoolParser.TypeContext ctx);
}