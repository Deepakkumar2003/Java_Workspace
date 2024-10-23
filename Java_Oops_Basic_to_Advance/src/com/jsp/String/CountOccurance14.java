package com.jsp.String;

public class CountOccurance14 {

	public static void main(String[] args) {
		String s1="developer";
		int count=s1.length()-s1.replace("e","").length();
        System.out.println(count);
	}

}
