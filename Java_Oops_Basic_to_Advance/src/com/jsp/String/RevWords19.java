package com.jsp.String;

public class RevWords19 {

	public static void main(String[] args) {
		String s="java is very easy";
		String s2="";
		String [] s1=s.split(" ");
		for(int i=0; i<s1.length; i++) {
			s2+=rev(s1[i]);
			s2+=" ";
			System.out.println(s2.trim());
		}
		public static String rev(String s) {
			String reverse=" ";
			for(int i=s.length()-1; i>=0; i--) {
				reverse+=s.charAt(i);
			}
			return reverse;
		}

	}

  }
}

