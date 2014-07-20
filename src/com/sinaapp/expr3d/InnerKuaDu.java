package com.sinaapp.expr3d;

public class InnerKuaDu extends InnerFunction implements Parsable {

	InnerKuaDu(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue parse() {
		// TODO Auto-generated method stub
		int b = lib.getData(3);
		int s = lib.getData(4);
		int g = lib.getData(5);
		int o = Math.max(Math.abs(b-s), Math.max(Math.abs(b-g), Math.abs(s-g)));
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		v.__integer = o;
		return v;
	}

}
