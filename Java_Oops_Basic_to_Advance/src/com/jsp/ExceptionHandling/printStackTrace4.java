package com.jsp.ExceptionHandling;

public class printStackTrace4 {

	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	static void m1() {
		System.out.println("m1 starts");
		m2();
		System.out.println("m1 ends");
	}
	static void m2() {
		System.out.println("m2 starts");
	
		try {
			m3();
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled in m2");
			
		}
		System.out.println("m2 ends");
	}
	static void m3() {
		System.out.println("m3 starts");
		int a=2/0;
		System.out.println("m3ends");
	}

}



