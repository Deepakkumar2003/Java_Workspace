package com.jsp.arraysw;

public class secondhighest15 {

	public static void main(String[] args) {
		
		int [] a= {23,45,64,6,6,54,65,6,34,23,33,33,0};
		int max1=0;
		int max2=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1) {
				max2=a[i];
			}
		}
		System.out.println(max2);
	}

}
