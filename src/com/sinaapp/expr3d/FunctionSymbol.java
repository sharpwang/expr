/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
package com.sinaapp.expr3d;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class FunctionSymbol extends Symbol implements Scope {
    List<Symbol> arguments = new ArrayList<Symbol>();
    Scope enclosingScope;
    ParserRuleContext ctx;

    public FunctionSymbol(String name, Scope enclosingScope) {
        super(name);
        this.enclosingScope = enclosingScope;
    }

    public Symbol resolve(String name) {
    	boolean found = false;
    	Symbol sym = null;
    	for(int i=0; i<arguments.size(); i++){
    		sym = arguments.get(i);
    		if(sym.getName().equals(name)){
    			found = true;
    			break;
    		}
    	}
        if ( found ) return sym;
        // if not here, check any enclosing scope
        if ( getEnclosingScope() != null ) {
            return getEnclosingScope().resolve(name);
        }
        return null; // not found
    }

    public void define(Symbol sym) {
        sym.scope = this; // track the scope in each symbol
        arguments.add(sym);
    }

    public Scope getEnclosingScope() { return enclosingScope; }
    public String getScopeName() { return name; }
    
    public void setBlock(ParserRuleContext prc){ ctx = prc; }
    public ParserRuleContext block() { return ctx; }
    
    public Symbol getArgumentAt(int idx){ return arguments.get(idx); }
    

    public String toString() { return "function"+super.toString()+":"+arguments.toString(); }
}
