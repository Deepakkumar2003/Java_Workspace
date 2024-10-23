package com.jsp.arraysw;

import java.util.Scanner;

public class StringEven {

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
			if(i%2!=0) {
			System.out.println(a[i]);

	}

}

}
}
