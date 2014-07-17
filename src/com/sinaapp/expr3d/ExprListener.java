// Generated from Expr.g4 by ANTLR 4.2.2

package com.sinaapp.expr3d;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#continueStat}.
	 * @param ctx the parse tree
	 */
	void enterContinueStat(@NotNull ExprParser.ContinueStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#continueStat}.
	 * @param ctx the parse tree
	 */
	void exitContinueStat(@NotNull ExprParser.ContinueStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#ExprRef}.
	 * @param ctx the parse tree
	 */
	void enterExprRef(@NotNull ExprParser.ExprRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ExprRef}.
	 * @param ctx the parse tree
	 */
	void exitExprRef(@NotNull ExprParser.ExprRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#Int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#Int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull ExprParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#slist}.
	 * @param ctx the parse tree
	 */
	void enterSlist(@NotNull ExprParser.SlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#slist}.
	 * @param ctx the parse tree
	 */
	void exitSlist(@NotNull ExprParser.SlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(@NotNull ExprParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(@NotNull ExprParser.ReturnStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#ArrList}.
	 * @param ctx the parse tree
	 */
	void enterArrList(@NotNull ExprParser.ArrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ArrList}.
	 * @param ctx the parse tree
	 */
	void exitArrList(@NotNull ExprParser.ArrListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ExprParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#Compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull ExprParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#Compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull ExprParser.CompareContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#Plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull ExprParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#Plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull ExprParser.PlusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull ExprParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull ExprParser.IfStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull ExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull ExprParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#ArrIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrIndex(@NotNull ExprParser.ArrIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ArrIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrIndex(@NotNull ExprParser.ArrIndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#jumpStat}.
	 * @param ctx the parse tree
	 */
	void enterJumpStat(@NotNull ExprParser.JumpStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#jumpStat}.
	 * @param ctx the parse tree
	 */
	void exitJumpStat(@NotNull ExprParser.JumpStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(@NotNull ExprParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(@NotNull ExprParser.ExprStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#Multi}.
	 * @param ctx the parse tree
	 */
	void enterMulti(@NotNull ExprParser.MultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#Multi}.
	 * @param ctx the parse tree
	 */
	void exitMulti(@NotNull ExprParser.MultiContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#breakStat}.
	 * @param ctx the parse tree
	 */
	void enterBreakStat(@NotNull ExprParser.BreakStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#breakStat}.
	 * @param ctx the parse tree
	 */
	void exitBreakStat(@NotNull ExprParser.BreakStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ExprParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(@NotNull ExprParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(@NotNull ExprParser.ForStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#Unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull ExprParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#Unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull ExprParser.UnaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull ExprParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull ExprParser.ArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#RelAnd}.
	 * @param ctx the parse tree
	 */
	void enterRelAnd(@NotNull ExprParser.RelAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#RelAnd}.
	 * @param ctx the parse tree
	 */
	void exitRelAnd(@NotNull ExprParser.RelAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#FuncCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull ExprParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#FuncCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull ExprParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#Float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull ExprParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#Float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull ExprParser.FloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull ExprParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull ExprParser.ExprListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#BoolNot}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(@NotNull ExprParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#BoolNot}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(@NotNull ExprParser.BoolNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#Id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull ExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#Id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull ExprParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull ExprParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull ExprParser.AssignStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(@NotNull ExprParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(@NotNull ExprParser.FuncDefContext ctx);
}