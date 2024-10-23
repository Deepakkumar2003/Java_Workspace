package com.jsp.arraysw;

public class LastKeyMatch16 {

	public static int search(int[] ar,int key) {
		int i=0;
		int ki=0;
		for(int a:ar) {
			if(a==key)
				{ki=i;}
			i++;
		}
		if(ar[ki]==key)return ki;
		else return -1;
		
	}
	public static void main(String[] args) {

		int[] ar= {100,2,35,2,2,45,6,42,55,100,77,100};
		int key=100;
		System.out.println(search(ar,key));
	}
}