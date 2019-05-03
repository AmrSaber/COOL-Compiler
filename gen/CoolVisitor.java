// Generated from C:/Users/Mohamed Mamdouh/Desktop/Draft/COOL-Compiler\Cool.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link CoolParser#classDefiniton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefiniton(CoolParser.ClassDefinitonContext ctx);
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
	 * Visit a parse tree produced by {@link CoolParser#expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_(CoolParser.Expr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CoolParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#term_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_(CoolParser.Term_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CoolParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(CoolParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#featureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureCall(CoolParser.FeatureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#memberAccess_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess_(CoolParser.MemberAccess_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#memberAcess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAcess(CoolParser.MemberAcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CoolParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#caseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStmt(CoolParser.CaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(CoolParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CoolParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CoolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(CoolParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#isvoidExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoidExpr(CoolParser.IsvoidExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#invrseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvrseExpr(CoolParser.InvrseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(CoolParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(CoolParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#exprList_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList_(CoolParser.ExprList_Context ctx);
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
	 * Visit a parse tree produced by {@link CoolParser#formalsList_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalsList_(CoolParser.FormalsList_Context ctx);
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