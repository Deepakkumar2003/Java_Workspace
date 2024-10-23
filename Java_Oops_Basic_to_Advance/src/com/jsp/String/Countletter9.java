package com.jsp.String;

public class Countletter9 {

	public static void main(String[] args) {
	String s="Java is @# 123";
	int uc=0, lc=0, nc=0, sp=0;
	for(int i=0; i<s.length(); i++) {
		char ch=s.charAt(i);
		if(ch>='A'&& ch<='Z') uc++;
		else if(ch>='a'&& ch<='z') lc++;
		
		else if(ch>='0' && ch<='9') nc++;
		else
			sp++;
	}
	System.out.println("upper case count=" +uc);
	System.out.println("lower case count=" +lc);
	System.out.println("numeric count=" +nc);
	System.out.println("special case count=" +sp);

	}

}
