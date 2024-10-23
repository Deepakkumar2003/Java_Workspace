package com.jsp.arraysw;

public class indesum5 {
public static void main(String[] args) {
	int [] ar= {23,45,64,6,6,54,65,6,34,23,33,33,0};
	int oddsum=0;
	int evensum=0;
	for(int i=0; i<ar.length; i++)
	{
		if(i%2==0)
			evensum=evensum+ar[i];
		else oddsum=oddsum+ar[i];
	}
	System.out.println("Even sum is "+ evensum);
	System.out.println("Odd sum is "+oddsum);
}
}
