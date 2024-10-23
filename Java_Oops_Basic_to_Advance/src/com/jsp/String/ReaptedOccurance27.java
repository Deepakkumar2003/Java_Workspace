package com.jsp.String;

public class ReaptedOccurance27 {

	public static void main(String[] args) {
		String s="Raman Kumar";
		int count=0; 
		char[] ch=s.toCharArray();
		for(char n:ch) {
			count++;
		}
		for(int i=0; i<count; i++) {
			boolean flag=true;
			for(int j=i+1; j<count; j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\u0000';
					flag=false;
				}
			}
			if(!flag)
				ch[i]='\u0000';
			
		}
		for(char n:ch) {
			if(n!='\u0000') System.out.println(n);
		}
		
		

	}

}
