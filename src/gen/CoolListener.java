package gen;// Generated from /home/amr/IdeaProjects/COOL Compiler/Cool.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link CoolParser#classDefiniton}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinitionRule(CoolParser.ClassDefinitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link CoolParser#classDefiniton}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinitionRule(CoolParser.ClassDefinitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(CoolParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(CoolParser.GlobalsContext ctx);
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
	 * Enter a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link CoolParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmtRule(CoolParser.AssignmentStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link CoolParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmtRule(CoolParser.AssignmentStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link CoolParser#featureCall}.
	 * @param ctx the parse tree
	 */
	void enterFeatureCallRule(CoolParser.FeatureCallRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link CoolParser#featureCall}.
	 * @param ctx the parse tree
	 */
	void exitFeatureCallRule(CoolParser.FeatureCallRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(CoolParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(CoolParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link CoolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtRule(CoolParser.IfStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link CoolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtRule(CoolParser.IfStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link CoolParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmtRule(CoolParser.CaseStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link CoolParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmtRule(CoolParser.CaseStmtRuleContext ctx);
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
	 * Enter a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link CoolParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmtRule(CoolParser.WhileStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link CoolParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmtRule(CoolParser.WhileStmtRuleContext ctx);
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
	 * Enter a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link CoolParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectRule(CoolParser.NewObjectRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link CoolParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectRule(CoolParser.NewObjectRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link CoolParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoidExprRule(CoolParser.IsvoidExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link CoolParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoidExprRule(CoolParser.IsvoidExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link CoolParser#invrseExpr}.
	 * @param ctx the parse tree
	 */
	void enterInvrseExprRule(CoolParser.InvrseExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link CoolParser#invrseExpr}.
	 * @param ctx the parse tree
	 */
	void exitInvrseExprRule(CoolParser.InvrseExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link CoolParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExprRule(CoolParser.NotExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link CoolParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExprRule(CoolParser.NotExprRuleContext ctx);
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