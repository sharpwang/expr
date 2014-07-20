package com.sinaapp.expr3d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sinaapp.expr3d.ExprParser.ExprListContext;

public class Library3D {
	private static Map<String, Parsable> functions= new HashMap<String, Parsable>();
	private static Map<String, Selectable> selections = new HashMap<String, Selectable>();
	private final EvalVisitor visitor;
	private List<List<Integer>> data = new ArrayList<List<Integer>>();
	private ExprListContext ctx;
	private int currentIndex;

	Library3D(EvalVisitor visitor){
		this.visitor = visitor; 
		InitInnerFunctions();
		InitInternalSelections();
	}
	
	public void InitInnerFunctions(){
		functions.put("float", new InnerFloat(this));		
		functions.put("size", new InnerSize(this));
		functions.put("load3d", new InnerLoad3D(this));
		functions.put("调入3d", new InnerLoad3D(this));
		functions.put("getdata", new InnerGetData(this));
		functions.put("ref", new InnerRef(this));
		functions.put("跨度", new InnerKuaDu(this));
		functions.put("百位", new InnerBaiWei(this));
	}
	
	public void InitInternalSelections(){
		selections.put("跨度", new InternalKuaDu(this));
		selections.put("百位", new InternalBaiWei(this));
		selections.put("十位", new InternalShiWei(this));
		selections.put("个位", new InternalGeWei(this));
		
	}
	
	public void load3DData() throws IOException{
		BufferedReader in;
		try{
			in = new BufferedReader( new FileReader("./3d.txt"));
		}
		catch(IOException e){
			in = new BufferedReader( new FileReader("./bin/com/sinaapp/expr3d/3d.txt"));		
		}
		
		data.clear();
		String s;
		while((s = in.readLine()) != null){
			try{
				String s0 = s.substring(0, 7);
				String s1 = s.substring(8, 12);
				String s2 = s.substring(13,15);
				String s3 = s.substring(16,18);
				String s4 = s.substring(19,20);
				String s5 = s.substring(21,22);
				String s6 = s.substring(23,24);
				String s7 = s.substring(25,26);
				String s8 = s.substring(27,28);
				String s9 = s.substring(29,30);
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(Integer.parseInt(s0));
				int y = Integer.parseInt(s1);
				int m = Integer.parseInt(s2);
				int d = Integer.parseInt(s3);
				int rq = y*10000 + m*100 + d;
				arr.add(rq);
				arr.add(Integer.parseInt(s4));
				arr.add(Integer.parseInt(s5));
				arr.add(Integer.parseInt(s6));
				arr.add(Integer.parseInt(s7));
				arr.add(Integer.parseInt(s8));
				arr.add(Integer.parseInt(s9));
				data.add(arr);
			}
			catch(IndexOutOfBoundsException e){
				break;
			}
		}
		in.close();
		currentIndex = data.size();
	}
	
	public ExprListContext getCtx() {
		return ctx;
	}
	
	public EvalVisitor getVisitor() {
		return visitor;
	}

	public NodeValue callInnerFunction(String name, ExprListContext ctx) throws NoInnerFunctionException{
		this.ctx = ctx;
		Parsable parser = (Parsable) functions.get(name);
		if(parser == null) throw new NoInnerFunctionException();
		NodeValue v = parser.parse();
		return v;
	}
	
	public NodeValue callInnerSelection(String name, String op, NodeValue value) throws NoInternalSelectionException{
		Selectable selector = (Selectable) selections.get(name);
		if(selector == null) throw new NoInternalSelectionException();
		NodeValue v = selector.select(op, value);
		return v;
	}
	
	public int getDataSize() {
		return data.size();
	}
	
	public int setCurrentIndex(int newIndex) {
		int index  = currentIndex;
		currentIndex = data.size() - newIndex;
		if(currentIndex < 0) currentIndex = 0;
		return index;
	}
	
	public int getData(int row, int column){
		int idx = row - 1;
		if(row < 0) idx = currentIndex + row;
		List<Integer> arr = data.get(idx);
		return arr.get(column - 1);
	}
	
	public int getData(int column){
		return getData(currentIndex, column);
	}
}
