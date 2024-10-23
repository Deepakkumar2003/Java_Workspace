package com.jsp.arraysw;

public class MinOccur19 {
	public static void minocc(int[] ar) {
		int min=ar[0];
		int count1=ar.length;
		for(int a:ar) {
			int count2=0; 
			for(int a1:ar) {
				if(a1==a)count2++;}
				if(count2<count1) {
					count1=count2;
					min=a;
				}
			}
		//if(count1==1)System.out.println(-1);
		 System.out.println(min+" occurs "+count1+" times ");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {44,5,4,9,11,5,22,22,4,9,11,44,63};
		minocc(ar);
	}


}
