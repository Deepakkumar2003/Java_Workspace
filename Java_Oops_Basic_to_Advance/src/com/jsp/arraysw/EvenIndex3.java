package com.jsp.arraysw;

public class EvenIndex3 {

	public static void main(String[] args) {
		String[] ar= {"hello", "JSP", "Deep", "I LOVE JAVA"};
		for (int i=0; i<ar.length; i++){

			if(i%2==0)
				System.out.println(ar[i]);
		}
	}
}

