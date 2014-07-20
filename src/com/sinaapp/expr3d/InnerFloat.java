package com.sinaapp.expr3d;



public class InnerFloat extends InnerFunction implements Parsable {

	InnerFloat(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	public NodeValue parse() {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.FLOAT);
		NodeValue v0 = visit(lib.getCtx().expr(0));
		if(v0.type == NodeValue.FLOAT) v.__float = v0.__float;
		else v.__float = (float)v0.__integer;
		return v;
	}

}
