package com.sinaapp.expr3d;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.RuleNode;

import com.sinaapp.expr3d.ExprParser.ArrIndexContext;
import com.sinaapp.expr3d.ExprParser.ArrListContext;
import com.sinaapp.expr3d.ExprParser.AssignStatContext;
import com.sinaapp.expr3d.ExprParser.BlockContext;
import com.sinaapp.expr3d.ExprParser.BoolNotContext;
import com.sinaapp.expr3d.ExprParser.BreakStatContext;
import com.sinaapp.expr3d.ExprParser.CompareContext;
import com.sinaapp.expr3d.ExprParser.ExprRefContext;
import com.sinaapp.expr3d.ExprParser.FloatContext;
import com.sinaapp.expr3d.ExprParser.ForStatContext;
import com.sinaapp.expr3d.ExprParser.FuncCallContext;
import com.sinaapp.expr3d.ExprParser.FuncDefContext;
import com.sinaapp.expr3d.ExprParser.HzFuncCallContext;
import com.sinaapp.expr3d.ExprParser.HzFuncDefContext;
import com.sinaapp.expr3d.ExprParser.IdContext;
import com.sinaapp.expr3d.ExprParser.IfStatContext;
import com.sinaapp.expr3d.ExprParser.IntContext;
import com.sinaapp.expr3d.ExprParser.JumpStatContext;
import com.sinaapp.expr3d.ExprParser.MultiContext;
import com.sinaapp.expr3d.ExprParser.PlusContext;
import com.sinaapp.expr3d.ExprParser.ProgContext;
import com.sinaapp.expr3d.ExprParser.RelAndContext;
import com.sinaapp.expr3d.ExprParser.ReturnStatContext;
import com.sinaapp.expr3d.ExprParser.UnaryContext;


public class EvalVisitor extends ExprBaseVisitor<NodeValue> {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    NodeValue valueReturn = new NodeValue(NodeValue.VOID); //for return in block to function
    boolean visitNextChild = true;

	@Override
	public NodeValue visitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
        globals = new GlobalScope(null);
        currentScope = globals;
        
		return super.visitProg(ctx);
	}


    void saveScope(ParserRuleContext ctx, Scope s) { 
    	scopes.put(ctx, s); 
    }
    
	@Override
	public NodeValue visitInt(IntContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		v.__integer = Integer.parseInt(ctx.getText());
		return v;
	}

	@Override
	public NodeValue visitFloat(FloatContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.FLOAT);
		v.__float = Float.parseFloat(ctx.getText());
		return v;
	}

	@Override
	public NodeValue visitArrList(ArrListContext ctx) {
		// TODO Auto-generated method stub
		List<NodeValue> arrValue = new ArrayList<NodeValue>();
		Integer count = ctx.getChildCount();
		NodeValue v = new NodeValue( NodeValue.LIST);
		for(int i=0; i<ctx.expr().size(); i++){
			NodeValue v0 = visit(ctx.expr(i));
			if(v0.type == NodeValue.INTEGER)
				v.__list.add(v0.__integer);
			else
				v.__list.add((int)Math.floor((double)v0.__float));
		}
		return v;
	}

	@Override
	public NodeValue visitId(IdContext ctx) {
		// TODO Auto-generated method stub
		String name = ctx.ID().getSymbol().getText();
		VariableSymbol sym =  (VariableSymbol)currentScope.resolve(name);
		NodeValue v = sym.getValue();
		return v;
	}

	@Override
	public NodeValue visitBoolNot(BoolNotContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue( NodeValue.INTEGER);
		NodeValue v0 = visit(ctx.expr());
		if(v0.__integer == 0)
			v.__integer = 1;			
		else
			v.__integer = 0;
		return v;
		
	}

	@Override
	public NodeValue visitUnary(UnaryContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue();
		NodeValue v0 = visit(ctx.expr());
		v.type = v0.type;
		if(v.type == NodeValue.INTEGER)
			v.__integer = 0 - v0.__integer;
		else
			v.__float = 0.0f - v0.__float;
		return v;
	}

	@Override
	public NodeValue visitArrIndex(ArrIndexContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		NodeValue v0 = visit(ctx.expr(0));
		NodeValue v1 = visit(ctx.expr(1));
		int idx = 0;
		if(v1.type == NodeValue.FLOAT)
			idx = (int)Math.floor((double)v1.__float);
		else
			idx = v1.__integer;
				
		v.__integer = v0.__list.get(idx - 1);
		return v;
	}

	@Override
	public NodeValue visitPlus(PlusContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v0 = visit(ctx.expr(0));
		NodeValue v1 = visit(ctx.expr(1));
		
		NodeValue v = new NodeValue();
		if(v0.type == v1.type)
			v.type = v0.type;
		else
			v.type = NodeValue.FLOAT;
		
		float f0, f1, f;
		if(v0.type == NodeValue.INTEGER)
			f0 = (float)v0.__integer;
		else
			f0 = v0.__float;
		if(v1.type == NodeValue.INTEGER)
			f1 = (float)v1.__integer;
		else
			f1 = v1.__float;
		
		if(ctx.op.getText().equals("+"))
			f = f0 + f1;
		else
			f = f0 - f1;
		
		if(v.type == NodeValue.INTEGER)
			v.__integer = (int)f;
		else
			v.__float = f;
		
		return v;		
	}

	@Override
	public NodeValue visitMulti(MultiContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v0 = visit(ctx.expr(0));
		NodeValue v1 = visit(ctx.expr(1));
		
		NodeValue v = new NodeValue();
		if(v0.type == v1.type)
			v.type = v0.type;
		else
			v.type = NodeValue.FLOAT;
		
		float f0=0.0f, f1=0.0f, f=0.0f;
		if(v0.type == NodeValue.INTEGER)
			f0 = (float)v0.__integer;
		else
			f0 = v0.__float;
		if(v1.type == NodeValue.INTEGER)
			f1 = (float)v1.__integer;
		else
			f1 = v1.__float;
		
		if(ctx.op.getText().equals("*"))
			f = f0 * f1;
		else if(ctx.op.getText().equals("/")){
			if(Math.abs(f1) < 0.00000000001f)
				f = f0;
			else
				f = f0 / f1;
		}
		else if(ctx.op.getText().equals("%")){
			f = f0 % f1;
		}
		
		if(v.type == NodeValue.INTEGER)
			v.__integer = (int)f;
		else
			v.__float = f;
		
		return v;		
	}

	@Override
	public NodeValue visitRelAnd(RelAndContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v0 = visit(ctx.expr(0));
		NodeValue v1 = visit(ctx.expr(1));
		
		NodeValue v = new NodeValue();
		
		if(v0.type == NodeValue.INTEGER){
			v.type = NodeValue.INTEGER;
			
			boolean b0 = (v0.__integer == 1);
			boolean b1 = (v1.__integer == 1);
			boolean b;
			if(ctx.op.getText().equals("&&"))
				b = b0 && b1;
			else
				b = b0 || b1;
			
			if(b == true)
				v.__integer = 1;
			else
				v.__integer = 0;
		}
		else{
			v.type = NodeValue.LIST;
			List<Integer> arr = new ArrayList<Integer>();
			if(ctx.op.getText().equals("&&")){
				for(int i=0; i<v0.__list.size(); i++){
					int m = v0.__list.get(i);
					for(int j=0; j<v1.__list.size(); j++){
						int n = v1.__list.get(j);
						if(m == n){
							boolean exists = false;
							for(int k=0; k<arr.size(); k++ ){
								int o = arr.get(k);
								if(m == o){
									exists = true;
									break;
								}
							}
							if(!exists) arr.add(m);
						}
					}
				}
			}
			else{
				for(int i=0; i<v0.__list.size(); i++){
					arr.add(v0.__list.get(i));
				}
				for(int i=0; i<v1.__list.size(); i++){
					int m = v1.__list.get(i);
					boolean exists = false;
					for(int j=0; j<arr.size(); j++){
						int n = arr.get(j);
						if(m == n){ 
							exists = true;
							break;
						}
					}
					if(!exists) arr.add(m);				
				}				
			}
			v.__list = arr;
		}
		
		return v;
	}



	@Override
	public NodeValue visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        
        NodeValue v = new NodeValue();
    	v = visitChildren(ctx);

        currentScope = currentScope.getEnclosingScope();
        return v;
	}


	@Override
	public NodeValue visitFuncDef(FuncDefContext ctx) {
		// TODO Auto-generated method stub
		String name = ctx.ID().getSymbol().getText();
			
	    // push new scope by making new one that points to enclosing scope
	    FunctionSymbol function = new FunctionSymbol(name, currentScope);
	    currentScope.define(function); // Define function in current scope
	    saveScope(ctx, function);      // Push: set function's parent to current
	    currentScope = function;       // Current scope is now function scope
	
	    int n = ctx.args().ID().size();
	    for(int i=0; i<n; i++){
	    	String name1 = ctx.args().ID(i).getSymbol().getText();
	    	VariableSymbol sym = new VariableSymbol(name1);
	    	function.define(sym);
	    }
	    
		function.setBlock(ctx.block());
		
		currentScope = currentScope.getEnclosingScope();
		return new NodeValue(); //return void
	}


	@Override
	public NodeValue visitAssignStat(AssignStatContext ctx) {
		// TODO Auto-generated method stub
		String name = ctx.ID().getSymbol().getText();
		VariableSymbol sym = null;
		sym = (VariableSymbol) currentScope.resolve(name); //search this scope or father scope to find sym if already exists
		if(sym == null){
			sym = new VariableSymbol(name);
			currentScope.define(sym);
		}
		
		if(ctx.expr().size() == 1){
			NodeValue v = visit(ctx.expr(0));
			sym.setValue(v);		
			System.out.println(name + "," + v.toString());
		}
		else{											//change the list
			NodeValue v0 = visit(ctx.expr(0));
			int idx = v0.__integer;
			if(v0.type == NodeValue.FLOAT){
				idx = (int)Math.floor((double)v0.__float);				
			}
			
			NodeValue v1 = visit(ctx.expr(1));
			int value = v1.__integer;
			if(v1.type == NodeValue.FLOAT){
				value = (int)Math.floor((double)v1.__float);
			}
			
			NodeValue v = sym.getValue();
			v.__list.set(idx - 1, value);
			sym.setValue(v);
			System.out.println(name + "," + v.toString());
			
		}
		return new NodeValue(); //return void
	}


	@Override
	public NodeValue visitFuncCall(FuncCallContext ctx) {
		// TODO Auto-generated method stub
		String name = ctx.ID().getSymbol().getText();
		FunctionSymbol function = (FunctionSymbol)currentScope.resolve(name);
		int m = function.arguments.size();
		int n = ctx.exprList().expr().size();
		for(int i = 0; i<m && i<n; i++){ //assert m == n, else raise error
			//VariableSymbol
			VariableSymbol sym = (VariableSymbol) function.getArgumentAt(i);
			NodeValue v = visit(ctx.exprList().expr(i));
			sym.setValue(v);
		}
		
		currentScope = function;
		NodeValue v = visit(function.block());
        visitNextChild = true;
		currentScope = function.getEnclosingScope();
		
		System.out.println(name + "," + v.toString());
		return v;	
	}

	@Override
	protected NodeValue defaultResult() {
		// TODO Auto-generated method stub
		return new NodeValue(NodeValue.VOID); //default, return void
	}


	
	@Override
	protected boolean shouldVisitNextChild(RuleNode node,
			NodeValue currentResult) {
		// TODO Auto-generated method stub
		return visitNextChild;
	}


	@Override
	protected NodeValue aggregateResult(NodeValue aggregate,
			NodeValue nextResult) {
		// TODO Auto-generated method stub
		//return super.aggregateResult(aggregate, nextResult);
		return valueReturn;
	}


	@Override
	public NodeValue visitReturnStat(ReturnStatContext ctx){
		// TODO Auto-generated method stub
		if(ctx.expr() != null){
			valueReturn = visit(ctx.expr());;
		}
		visitNextChild = false;
		return valueReturn;
	}


	@Override
	public NodeValue visitIfStat(IfStatContext ctx) {
		// TODO Auto-generated method stub
		NodeValue v0 = visit(ctx.expr());
		int n = ctx.slist().size();
		if(v0.__integer == 1){
			NodeValue v1 = visit(ctx.slist(0));
		}
		else if(n == 2){
			NodeValue v2 = visit(ctx.slist(1));
		}
		return new NodeValue();
	}


	@Override
	public NodeValue visitForStat(ForStatContext ctx) {
		// TODO Auto-generated method stub
		//'for' assignStat 'to' expr 	slist
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        NodeValue v0 = visit(ctx.assignStat());
        NodeValue v1 = visit(ctx.expr());
        String name = ctx.assignStat().ID().getSymbol().getText();
        VariableSymbol sym = (VariableSymbol)currentScope.resolve(name);
        NodeValue v2 = sym.getValue();
        int i = v2.__integer;
        while(i <= v1.__integer){
        	visit(ctx.slist());
        	if(!visitNextChild) break;
        	i = i + 1;
        	v2.__integer = i;
        	sym.setValue(v2);
        }
        visitNextChild = true;
        currentScope = currentScope.getEnclosingScope();
        return new NodeValue();	
	}


	@Override
	public NodeValue visitBreakStat(BreakStatContext ctx) {
		// TODO Auto-generated method stub
		visitNextChild = false;
		return new NodeValue();
	}


	@Override
	public NodeValue visitJumpStat(JumpStatContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJumpStat(ctx);
	}


	@Override
	public NodeValue visitCompare(CompareContext ctx) {
		// TODO Auto-generated method stub
		//'>'|'>='|'=='|'=<'|'<'
		NodeValue v0 = visit(ctx.expr(0));
		NodeValue v1 = visit(ctx.expr(1));
		float f0 = v0.__integer + v0.__float;
		float f1 = v1.__integer + v1.__float;
		boolean ret = false;
		String op = ctx.op.getText();
		if(op.equals(">")) ret = f0 > f1;
		else if(op.equals(">=")) ret = f0 >= f1;
		else if(op.equals("==")) ret = f0 == f1;
		else if(op.equals("<=")) ret = f0 <= f1;
		else if(op.equals("<")) ret = f0 < f1;
		NodeValue v = new NodeValue(NodeValue.INTEGER);
		if(ret == true) v.__integer = 1; else v.__integer = 0;
		return v;
	}


	@Override
	public NodeValue visitExprRef(ExprRefContext ctx) {
		// TODO Auto-generated method stub
		return visit(ctx.expr());
	}


	@Override
	public NodeValue visitHzFuncCall(HzFuncCallContext ctx) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String name = ctx.HZID().getSymbol().getText();
		FunctionSymbol function = (FunctionSymbol)currentScope.resolve(name);
		int m = function.arguments.size();
		
		if(ctx.exprList() != null){
			int n = ctx.exprList().expr().size();
			for(int i = 0; i<m && i<n; i++){ //assert m == n, else raise error
				//VariableSymbol
				VariableSymbol sym = (VariableSymbol) function.getArgumentAt(i);
				NodeValue v = visit(ctx.exprList().expr(i));
				sym.setValue(v);
			}
		}
		currentScope = function;
		NodeValue v = visit(function.block());
        visitNextChild = true;
		currentScope = function.getEnclosingScope();
		
		System.out.println(name + "," + v.toString());
		return v;	

	}


	@Override
	public NodeValue visitHzFuncDef(HzFuncDefContext ctx) {
		// TODO Auto-generated method stub
		String name = ctx.HZID().getSymbol().getText();
			
	    // push new scope by making new one that points to enclosing scope
	    FunctionSymbol function = new FunctionSymbol(name, currentScope);
	    currentScope.define(function); // Define function in current scope
	    saveScope(ctx, function);      // Push: set function's parent to current
	    currentScope = function;       // Current scope is now function scope
	
	    if(ctx.args() != null){
		    int n = ctx.args().ID().size();
		    for(int i=0; i<n; i++){
		    	String name1 = ctx.args().ID(i).getSymbol().getText();
		    	VariableSymbol sym = new VariableSymbol(name1);
		    	function.define(sym);
		    }
	    }
		    
		function.setBlock(ctx.block());
		
		currentScope = currentScope.getEnclosingScope();
		return new NodeValue(); //return void
	}

//	


}
