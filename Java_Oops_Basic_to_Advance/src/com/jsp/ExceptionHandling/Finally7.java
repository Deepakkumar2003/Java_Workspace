package com.jsp.ExceptionHandling;

public class Finally7 {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println("try starts");
			int a=10/0;
		} catch (NullPointerException e) {
			System.out.println("exp handled");
		}
		finally {
			System.out.println("finally executes");
		}
		System.out.println("main ends");

	}

}
