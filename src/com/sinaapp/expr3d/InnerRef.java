package com.sinaapp.expr3d;

public class InnerRef extends InnerFunction implements Parsable {

	InnerRef(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue parse() {
		// TODO Auto-generated method stub
		NodeValue v1 = visit(lib.getCtx().expr(1));
		int newIndex = v1.getInteger();
		lib.setCurrentIndex(newIndex);
		NodeValue v0 = visit(lib.getCtx().expr(0));
		return v0;
	}

}
