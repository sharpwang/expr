// Generated from Expr.g4 by ANTLR 4.2.2

package com.sinaapp.expr3d;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#Selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(@NotNull ExprParser.SelectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#continueStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStat(@NotNull ExprParser.ContinueStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#HzFuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHzFuncCall(@NotNull ExprParser.HzFuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#ExprRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRef(@NotNull ExprParser.ExprRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull ExprParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#RelOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOr(@NotNull ExprParser.RelOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#slist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlist(@NotNull ExprParser.SlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(@NotNull ExprParser.ReturnStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#ArrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrList(@NotNull ExprParser.ArrListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ExprParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull ExprParser.CompareContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#hzFuncDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHzFuncDef(@NotNull ExprParser.HzFuncDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull ExprParser.PlusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(@NotNull ExprParser.IfStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull ExprParser.StatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#ArrIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrIndex(@NotNull ExprParser.ArrIndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#testStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestStat(@NotNull ExprParser.TestStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#jumpStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStat(@NotNull ExprParser.JumpStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#exprStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(@NotNull ExprParser.ExprStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Multi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti(@NotNull ExprParser.MultiContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#breakStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStat(@NotNull ExprParser.BreakStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ExprParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(@NotNull ExprParser.ForStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(@NotNull ExprParser.UnaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull ExprParser.ArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#RelAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelAnd(@NotNull ExprParser.RelAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#FuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull ExprParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(@NotNull ExprParser.FloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(@NotNull ExprParser.ExprListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#BoolNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(@NotNull ExprParser.BoolNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull ExprParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(@NotNull ExprParser.AssignStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(@NotNull ExprParser.FuncDefContext ctx);
}