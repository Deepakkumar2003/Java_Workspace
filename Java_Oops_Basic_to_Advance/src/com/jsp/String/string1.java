package com.jsp.String;

public class string1 {

	public static void main(String[] args) {
		
		String s1=new String("abcd");
		System.out.println("s1="+s1);
		
		String s2="abcd";
		System.out.println("s2="+s2);
		
		System.out.println(s1==s1);
		System.out.println(s1.equals(s2));
		
		String s3="Abcd";
		System.out.println("s3="+s3);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
	}

}
