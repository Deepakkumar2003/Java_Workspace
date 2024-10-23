package com.jsp.overriding;
class A1
{
	
}
class B1 extends A1
{
	
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	A1 a=new B1();//implicit upcasting
	A a1= (A)new B();// explicit upcasting
	A a2= new B();
	A a3= (A)new B();
	B b = new B();
	A a4=b;
	A a5= (A) b;
	A a6=b;
	A a7=(A)b;
	}
}