package gen;// Generated from /home/amr/IdeaProjects/COOLCompiler/Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link CoolParser#classDefiniton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinitionRule(CoolParser.ClassDefinitionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(CoolParser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#featureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureDefinition(CoolParser.FeatureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CoolParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CoolParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CoolParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link CoolParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmtRule(CoolParser.AssignmentStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link CoolParser#featureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureCallRule(CoolParser.FeatureCallRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(CoolParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link CoolParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtRule(CoolParser.IfStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link CoolParser#caseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStmtRule(CoolParser.CaseStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(CoolParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link CoolParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmtRule(CoolParser.WhileStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CoolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link CoolParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectRule(CoolParser.NewObjectRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link CoolParser#isvoidExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoidExprRule(CoolParser.IsvoidExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link CoolParser#invrseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvrseExprRule(CoolParser.InvrseExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link CoolParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExprRule(CoolParser.NotExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(CoolParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(CoolParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#formalsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalsList(CoolParser.FormalsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CoolParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CoolParser.TypeContext ctx);
}