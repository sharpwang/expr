package com.sinaapp.expr3d;

public class InnerShiWei extends InnerFunction implements Parsable {

	InnerShiWei(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue parse() {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		v.__integer = lib.getData(4);
		return v;
	}

}
