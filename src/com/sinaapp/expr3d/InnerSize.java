package com.sinaapp.expr3d;

public class InnerSize extends InnerFunction implements Parsable {

	InnerSize(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue parse() {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		NodeValue v0 = visit(lib.getCtx().expr(0));
		v.__integer = v0.__list.size();
	
		return v;
	}

	
}
