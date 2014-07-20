package com.sinaapp.expr3d;

import java.util.ArrayList;
import java.util.List;


public class NodeValue {
	public static final int VOID=0, INTEGER=1, FLOAT=2, LIST=3;
	Integer			type;
	Integer			__integer;
	Float			__float;
	List<Integer>	__list;
	public NodeValue(int type){ 
		this.type = type; 
		__integer = 0; 
		__float = 0.0f; 
		if(type == LIST) __list = new ArrayList<Integer>(); 
	}
	public NodeValue() { 
		type = VOID; 
		__integer = 0; 
		__float = 0.0f; 
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();

		String strI = sb.toString();
		switch(type){
		case VOID:
			sb.append("void.");
			break;
		case INTEGER:
			sb.append("integer:");
			sb.append(__integer);
			break;
		case FLOAT:
			sb.append("float:");
			sb.append(__float);
			break;
		case LIST:
			sb.append("list:");
			for(int i=0; i<__list.size(); i++){
				if(i > 0) sb.append(",");
				sb.append(__list.get(i));
			}
			break;
		default:
			sb.append("error.");
		}
		return sb.toString();		
	}
	
	public int getInteger(){
		if(type == FLOAT)
			return (int)Math.floor((double)__float);
		else
			return __integer;
	}
	
	public float getFloat(){
		if(type == INTEGER)
			return (float)__integer;
		else
			return __float;
	}
}
