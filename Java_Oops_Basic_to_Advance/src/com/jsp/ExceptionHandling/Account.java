package com.jsp.ExceptionHandling;

public class Account {
private double bal;
public Account(double b) {
	//bal b;
}
public double getBalamce() {
	return bal;
}
public void withDraw(int amt)throws
InsufficientBalException
{
	if(amt>bal) {
		throw new InsufficientBalException();
	}
	System.out.println("amount dispatched");
	bal-=amt;
	}
}
