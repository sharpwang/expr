package com.sinaapp.expr3d;

public class InnerGetData extends InnerFunction implements Parsable {

	InnerGetData(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}


	@Override
	public NodeValue parse() {
		// 如果有两个参数，第一个是代表行，第二个代表列。代表行的参数如果大于等于0表示是绝对位置，如果小于零代表当前位置的相对位置。
		int n = lib.getCtx().expr().size();
		int ret = 0;
		if(n == 1){
			NodeValue v0 = visit(lib.getCtx().expr(0));
			int column = v0.getInteger();
			ret = lib.getData(column);
		}
		else{
			NodeValue v0 = visit(lib.getCtx().expr(0));
			NodeValue v1 = visit(lib.getCtx().expr(1));
			int row = v0.getInteger();
			int column = v1.getInteger();
			ret = lib.getData(row, column);
		}
		
		NodeValue v  = new NodeValue(NodeValue.INTEGER);
		v.__integer = ret;
		return v;
	}

}
