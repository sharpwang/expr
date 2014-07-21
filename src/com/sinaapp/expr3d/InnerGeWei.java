package com.sinaapp.expr3d;

public class InnerGeWei extends InnerFunction implements Parsable {

	InnerGeWei(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue parse() {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		v.__integer = lib.getData(5);
		return v;
	}

}
