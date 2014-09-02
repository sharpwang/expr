package com.sinaapp.expr3d;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;  
import org.apache.logging.log4j.Logger;  

public class Expr {
	static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		logger.trace("programm begins");
		try{
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
	        List<List<Integer>> arr = DBHelper2.Load3DData();
	        library.attach3DData(arr);
	        //library.load3DData();
	        NodeValue v = null;
	        try{
	        	v = eval.visit(tree);
		        System.out.print(v.toString());
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
		        	v = eval0.visit(tree);
			        System.out.print(v.toString());
		        }
	        }
	        catch(AppException e){
	        	System.out.print(e.getMessage());	        	
	        }   
		}
		catch(Exception e){
			e.printStackTrace(); //--
		}
		logger.trace("programm ends");
	}
}

