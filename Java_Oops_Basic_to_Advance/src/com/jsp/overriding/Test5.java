package com.jsp.overriding;

class F{
	int i; //generic variables
	void m1() //generic method
	{
	System.out.println("m1()");
}
}
class G extends F
{}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f=new G();   //using upcasted refrence we can access generic properties
System.out.println(f.i);
f.m1();  
	}
}
