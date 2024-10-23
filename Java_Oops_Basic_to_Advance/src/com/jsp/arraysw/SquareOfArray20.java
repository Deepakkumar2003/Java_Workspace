package com.jsp.arraysw;

public class SquareOfArray20 {
	public static void main(String[] args) {
		
		int[] ar= {44,5,4,9,11,5,22,22,4,9,11};
		int[] sar=new int[ar.length];
		int i=0;
		for(int a:ar) {
			System.out.print(a+"\t");
			sar[i]=a*a;
			i++;
		}
		System.out.println();
		for(int s:sar) {
			System.out.print(s+"\t");
		}
	}


}
