package com.jsp.ExceptionHandling;

public class printStackTrace3 {
	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	static void m1() {
		System.out.println("m1 starts");
		try {
			System.out.println(" try starts");
			int a=2/0;
			System.out.println("try ends");
		}
		catch(ArithmeticException e) {
			System.out.println("catch executed");
			e.printStackTrace();
		}
		System.out.println("main ends");
	}

}
