package com.jsp.arraysw;

import java.sql.SQLOutput;

public class minElement14 {

	public static void main(String[] args) {
		int [] a= {23,45,64,6,6,54,65,6,34,23,33,33,1};
		int min= a[0];
		for(int n:a)
		{
			if(n<min)
		
		min=n;

	}
	System.out.println(min);

}
}
