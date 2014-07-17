package com.sinaapp.expr3d;

public abstract class JumpException extends Exception {
	NodeValue value;
	JumpException(){value = new NodeValue(); }
	JumpException(NodeValue value){this.value = value; }
}
