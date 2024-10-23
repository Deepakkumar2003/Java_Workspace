package com.jsp.arraysw;  //linear search

public class linearsearch12 {

	public static void main(String[] args) {
		int [] a= {2,3,4,6,64,67,8,9};
		int key=92;
		System.out.println(search(a,key));
	}
	public static int search(int[] a, int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}

}
