package com.sinaapp.expr3d;

import java.util.ArrayList;
import java.util.List;

public class InternalShiWei extends InternalSelection implements Selectable {

	InternalShiWei(Library3D lib) {
		super(lib);
		// TODO Auto-generated constructor stub
	}

	@Override
	public NodeValue select(String op, NodeValue value) {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.LIST);
		List<Integer> __list = new ArrayList<Integer>();
		for(int i=0; i<=9; i++){
			for(int j=0; j<=9; j++){
				for(int k=0; k<=9; k++){
					int o = Math.max(Math.abs(j-k), Math.max(Math.abs(i-j),Math.abs(i-k)));
					int ball = i*100 + j*10 + k;	
					if(op.equals(">") && j > value.getFloat()){
						__list.add(ball);
					}
					else if(op.equals(">=") && j >= value.getFloat()){
						__list.add(ball);
						
					}
					else if(op.equals("==") && j == value.getFloat()){
						__list.add(ball);
						
					}
					else if(op.equals("<") && j < value.getFloat()){
						__list.add(ball);
						
					}
					else if(op.equals("<=") && j <= value.getFloat()){
						__list.add(ball);
						
					}
				}
			}
		} // for i
		
		v.__list = __list;
		return v;
	}

}
