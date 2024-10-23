package com.jsp.binding;
class A{
	static void m1()
	{
		System.out.println("m1() A");
	}
}
class B extends A{
	static void m1(){//hidden from JVM
		System.out.println("m1() B");
	}
}

public class Test {

	public static void main(String[] args) {
		A a=new B();
		a.m1();

	}

}
