package com.jsp.String;

public class AddingNumber12 {

	public static void main(String[] args) {
		String s1="ab12cd34mg5y5trt4t54";
	
		char [] a=s1.toCharArray();
		int sum=0;
		int i=0;
		while(i<a.length) {
			if(a[i]>='0' && a[i]<='9') {
				String s2=" ";
				s2+=a[i];
				i++;
				while(i<a.length && a[i]>='0' && a[i]<='9'){
					s2+=a[i];
					i++;
				}
				sum+=Integer.parseInt(s2);
			}
						
i++;
	}

}


}
