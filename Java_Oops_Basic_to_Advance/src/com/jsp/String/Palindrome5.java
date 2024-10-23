package com.jsp.String;

public class Palindrome5 {
	public static void main(String[] args) {
		
       String s1="Malayalam";
		
		for(int i=0; i<s1.length()-1; i++) {
			for(int j=i+1; j<=s1.length(); j++) {
			String s2=s1.substring(i,j);
			
    if(Palindrome5.isPallindrome(s2,i,j)) System.out.println(s2);
		}
	}
	}

static boolean isPallindrome(String s,int start, int end) {
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