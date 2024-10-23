package com.jsp.String;

public class RemoveDup23 {

	public static void main(String[] args) {
		String s1="Ramana";
		String s2=" ";
		for(int i=0; i<s1.length(); i++) {
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)==-1) {
				s2+=ch;//s2+=s1.charAt(i)
			}
		}
		System.out.println(s2);
		
	}

}
