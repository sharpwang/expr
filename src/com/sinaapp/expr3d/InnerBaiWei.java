package com.sinaapp.expr3d;

public class InnerBaiWei extends InnerFunction implements Parsable {

	InnerBaiWei(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue parse() {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		v.__integer = lib.getData(3);
		return v;
	}

}
