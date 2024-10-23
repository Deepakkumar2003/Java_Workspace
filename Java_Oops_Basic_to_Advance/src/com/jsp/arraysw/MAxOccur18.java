package com.jsp.arraysw;

public class MAxOccur18 {

	public static void maxocc(int[] ar) {
		int max=ar[0];
		int count1=0;
		for(int a:ar) {
			int count2=0; 
			for(int a1:ar) {
				if(a1==a)count2++;}
				if(count2>count1) {
					count1=count2;max=a;
				}
			}
		if(count1==1)System.out.println(-1);
		else System.out.println(max+" occurs "+count1+" times ");
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {5,8,2,7,34,23,67,56,6,55,88,60,60};
		maxocc(ar);
	}

}
