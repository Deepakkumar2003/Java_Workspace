package com.jsp.ExceptionHandling;

public class InsufficientBalException extends Exception{
public InsufficientBalException() {
	super("low balance");
}
public InsufficientBalException(String m)
{
	super(m);
}
}
