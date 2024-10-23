package com.jsp.arraysw;

public class maxElement13 {

	public static void main(String[] args) {
	int [] a= {23,45,64,6,6,54,65,6,34,23,33,33,0};
	int max=0;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>max)
		
			max=a[i] ;
	}
		System.out.println(max);
	}

	}
