// Generated from exemplo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exemploParser}.
 */
public interface exemploListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exemploParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(exemploParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(exemploParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(exemploParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(exemploParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(exemploParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(exemploParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#statms}.
	 * @param ctx the parse tree
	 */
	void enterStatms(exemploParser.StatmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#statms}.
	 * @param ctx the parse tree
	 */
	void exitStatms(exemploParser.StatmsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void enterAssign(exemploParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void exitAssign(exemploParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void enterPrint(exemploParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void exitPrint(exemploParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void enterIf(exemploParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void exitIf(exemploParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void enterWhile(exemploParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void exitWhile(exemploParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void enterReturn(exemploParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link exemploParser#statm}.
	 * @param ctx the parse tree
	 */
	void exitReturn(exemploParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(exemploParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(exemploParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(exemploParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(exemploParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(exemploParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(exemploParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#summ}.
	 * @param ctx the parse tree
	 */
	void enterSumm(exemploParser.SummContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#summ}.
	 * @param ctx the parse tree
	 */
	void exitSumm(exemploParser.SummContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(exemploParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(exemploParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(exemploParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(exemploParser.AtomContext ctx);
}