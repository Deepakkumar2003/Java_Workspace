package com.jsp.arraysw;

public class primenum8 {
	public static boolean isprime(int n) {
		if(n==2) return true;
		for(int i=2; i<n/2; i++) {
			if(n%i==0)return false;
			
		}
		return true;
	}

	public static void main(String[] args) {
	
		int [] ar= {23,45,64,6,6,54,65,6,34,23,33,33,0};
		
		for(int i=0; i<ar.length; i++)
		{
			if(isprime(ar[i]))
				
	
		System.out.println(ar[i]+ " ");

	}

}
}
