package com.jsp.String;

public class MaxOccuranceOfEach29 {

	public static void main(String[] args) {
		String s="aaccbbbcc";
		char ch2=' ';
		char[] ch=s.toCharArray();
		int max=0;
		for(int i=0; i<ch.length; i++) {
			int count=1;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			if(ch[i]!='\u0000' && count>max)
			{
				ch2=ch[i];
				max=count;
			}
			System.out.println(ch2+"="+max);
		}

	}

}
