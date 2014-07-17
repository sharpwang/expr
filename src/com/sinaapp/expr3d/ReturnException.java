package com.sinaapp.expr3d;



public class ReturnException extends JumpException {
	ReturnException(NodeValue value){ super(value); }
	NodeValue getReturnValue(){ return value; }
}
