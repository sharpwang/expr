package com.sinaapp.expr3d;

public class InnerGetData extends InnerFunction implements Parsable {

	InnerGetData(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}


	@Override
	public NodeValue parse() {
		// �����������������һ���Ǵ����У��ڶ��������С������еĲ���������ڵ���0��ʾ�Ǿ���λ�ã����С�������ǰλ�õ����λ�á�
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
