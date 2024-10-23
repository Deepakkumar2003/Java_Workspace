package com.jsp.ExceptionHandling;

import java.util.Scanner;


public class Demo2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num : ");
		
		int n;
		while(true) {
			String s=scn.next();

	
		try {
			n=Integer.parseInt(s);
			break;
		}
		catch(NumberFormatException e) {
			System.out.println("wrong input, pls enter num");
		}
	}
			System.out.println("n="+n);

	}

}
