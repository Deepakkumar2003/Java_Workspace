package com.jsp.String;

public class Palindrome4 {
	static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		int i=0, j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
		
		}

	public static void main(String[] args) {
		
System.out.println(isPalindrome("madam"));
	}

}
