package com.sinaapp.expr3d;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Expr {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prog(); // parse
        EvalVisitor eval = new EvalVisitor();
        Library3D library = new Library3D(eval);
        eval.setLibrary(library);
        library.load3DData();
        
        NodeValue v = eval.visit(tree);
        System.out.println(v.toString());        	
        
        int loop = eval.getLoopCounter();
        int newIndex = 0;
        while(loop > 0){
        	loop-- ;
        	newIndex++;
        	library.setCurrentIndex(newIndex);
            EvalVisitor eval0 = new EvalVisitor();
            eval0.setLibrary(library);
            eval0.setLoopCounter(loop);
            library.setVisitor(eval0);
        	NodeValue v0 = eval0.visit(tree);
            System.out.println(v0.toString());        	
        }
        
	}

}

