package com.jsp.String;

public class StringInitCap18 {

	public static void main(String[] args) {
		String s="deepak is a engineering student";
		char []ch=s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			char ch1=ch[i];
			if(ch1>='a' && ch1<='z') {
				if(i==0 || ch[i-1]==' ') {
					ch[i]=(char)(ch[i]-32);
				}
			}
			System.out.println(ch);
		}
		
	}

}