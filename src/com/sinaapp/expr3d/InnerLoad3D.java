package com.sinaapp.expr3d;

import java.io.IOException;

public class InnerLoad3D extends InnerFunction implements Parsable {

	InnerLoad3D(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue parse() {
		// TODO Auto-generated method stub
		try{
			lib.load3DData();
		}
		catch(IOException e){
			
		}
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		v.__integer = lib.getDataSize();
		return v;
	}

}
