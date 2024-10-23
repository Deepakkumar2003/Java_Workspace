package com.jsp.ExceptionHandling;

public class DemoExp6 extends Exception{


}
public class Test{
	public static void main(String[] args) {
		try {
		m1();
		} catch ( DemoExp e) {
			System.out.println("Catch extends");
			
		}
		System.out.println("main ends");
	}
	public static m1() throws DemoExp
	{
		System.out.println("m1 starts");
		throw new DemoExp();
	}
}
}
