package com.sinaapp.expr3d;

public class InnerTest extends InnerFunction implements Parsable {

	InnerTest(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue parse() {
		// TODO Auto-generated method stub
		int n = lib.getCtx().expr().size();
		if(n == 1)
			return lib.getVisitor().visitTestStat0(lib.getCtx().expr(0), null);
		else
			return lib.getVisitor().visitTestStat0(lib.getCtx().expr(0), lib.getCtx().expr(1));
		
	}

}
