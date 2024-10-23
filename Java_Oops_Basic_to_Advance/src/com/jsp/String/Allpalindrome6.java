package com.jsp.String;

public class Allpalindrome6 {
 public static void main(String[] args) {
	String s1="banana";
	
	//System.out.println(isPalindrome(s1,0,3));
	//System.out.println(ispalindrome(s1,1,3));
	
	
	for(int i=0; i<s1.length()-1; i++) {
		for(int j=i+1;j<s1.length(); j++) {
			if(isPalindrome(s1,i,j)) {
				System.out.println(s1.substring(i,j+1));
			}
		}
	}
 }
	static boolean isPalindrome(String s,int start, int end) {
	int i=start,j=end ;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
  }
