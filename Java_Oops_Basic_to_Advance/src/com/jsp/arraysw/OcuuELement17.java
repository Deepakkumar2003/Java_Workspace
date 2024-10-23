package com.jsp.arraysw;  //how much timr one slement occurs
public class OcuuELement17 {

public static void occurence(int[] ar) {
		for(int a:ar) {
			int count=0; 
			for(int a1:ar) {
				if(a1==a) 
				{
				count++;
					}
			}
			System.out.println(a+"="+count+" ");
		}
	}
public static void main(String[] args) {
	int[] ar= {5,8,2,6,7,34,23,67,88,56,6,55,88};
occurence(ar);
}
}