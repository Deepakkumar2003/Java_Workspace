package com.jsp.ExceptionHandling;

public class Throw5 {

	public static void main(String[] args) {
		m1();

	}
	static void m1() {
		System.out.println("m1 starts");
		throw new ArithmeticException();
	}

}
