package com.jsp.arraysw;

import java.util.Scanner;

public class reverse1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of elemnts");
		int size=s.nextInt();
		int [] a=new int[size];
		for(int i=0; i<size; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("____________________________");
		for(int i=size-1; i>=0; i--) {
			System.out.println(a[i]);

	}

}
}
