package com.jsp.arraysw;

import java.util.Scanner;

public class charreverse2 {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the size of array");
	int size=s.nextInt();
		char [] a=new char[size];
		for(int i=0; i<size; i++) {
			String s1=s.next();
			a[i]=s1.charAt(0);
		}
		System.out.println("____________________________");
		for(int i=size-1; i>=0; i--) {
			System.out.println(a[i]);
	}
	}
}
