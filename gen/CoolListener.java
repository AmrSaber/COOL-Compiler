// Generated from /media/aim/384548B632E10D23/work/college/4th year computer/2nd semester/Compilers/cool/project/COOL-Compiler/Cool.g4 by ANTLR 4.7.2
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