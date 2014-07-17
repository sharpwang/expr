/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
/** Represents a variable definition (name,type) in symbol table */
package com.sinaapp.expr3d;

public class VariableSymbol extends Symbol {
	NodeValue value;
    public VariableSymbol(String name) { super(name); value = new NodeValue();}
    public void setValue(NodeValue value){ this.value = value; }
    public NodeValue getValue(){ return value; }
}
