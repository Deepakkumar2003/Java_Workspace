package com.jsp.String;

public class ReverseString25 {

	public static void main(String[] args) {
		String s="java is easy";
		String s2=" ";
	
		int i=s.length()-1;
		int j=s.length()-1;
		while(i>=0) {
			while(i>=0 && s.charAt(i)!=' ')
				i--;
			int k=i+1;
			String temp=" ";
			while (k<=j) {
				temp+=s.charAt(k);
				k++;
			}
			s2+=temp;
			if(i>=0)
			s2+=" ";
			i--;
			j=i;
			}
		System.out.println(s2);
			
		}

	}


