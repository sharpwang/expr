package com.sinaapp.expr3d;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class InnerFunction {
	@SuppressWarnings("unused")
	protected Library3D lib;
	InnerFunction(Library3D lib){this.lib = lib;}
	NodeValue visit(ParserRuleContext ctx){return lib.getVisitor().visit(ctx); }
}

