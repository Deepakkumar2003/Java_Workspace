package com.jsp.String;

public class RevWordString24 {

	public static void main(String[] args) {
		String s="java is easy";
		String s2=" ";
		int i=0;
		int j=0;
		int len=s.length();
		while(j<len) {
			while(j<len && s.charAt(j)!=' ')
				j++;
			int k=j-1;
			String temp=" ";
			while (k>=i) {
				temp+=s.charAt(k);
				k--;
			}
			s2+=temp;
			if(j<len)
				s2+=" ";
			j++;
			i=j;
			}
		System.out.println(s2);
			
		}

	}


