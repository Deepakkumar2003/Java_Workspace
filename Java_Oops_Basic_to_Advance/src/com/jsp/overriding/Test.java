package com.jsp.overriding;
class A
{
	void m1()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("hellow");//o/p
	}
}
class Test {
public static void main(String[] args) {
	B b=new B();
	b.m1();
		
	
}
}
