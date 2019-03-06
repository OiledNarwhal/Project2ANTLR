// Generated from Project2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Project2Parser}.
 */
public interface Project2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Project2Parser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(Project2Parser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(Project2Parser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(Project2Parser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(Project2Parser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#topExpr}.
	 * @param ctx the parse tree
	 */
	void enterTopExpr(Project2Parser.TopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#topExpr}.
	 * @param ctx the parse tree
	 */
	void exitTopExpr(Project2Parser.TopExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Project2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Project2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Project2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Project2Parser.ExprContext ctx);
}