/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
package com.sinaapp.expr3d;
public class Symbol { // A generic programming language symbol
    String name;      // All symbols at least have a name
    Scope scope;      // All symbols know what scope contains them.

    public Symbol(String name) { this.name = name; }
    public String getName() { return name; }

    public String toString() {
        return getName();
    }
}
