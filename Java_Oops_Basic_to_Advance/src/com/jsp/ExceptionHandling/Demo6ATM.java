package com.jsp.ExceptionHandling;

import java.util.Scanner;

public class Demo6ATM {

	public static void main(String[] args) {
		Account a=new Account(500);
		Scanner scn=new Scanner(System.in);
		System.out.println("enter amount");
		int amt=scn.nextInt();
		try {
			a.withDraw(amt);
			System.out.println("plz collect money");
		} catch (InsufficientBalException e) {
			System.out.println(e.getMessage());
		}
	}

}
