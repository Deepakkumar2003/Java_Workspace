package com.jsp.overriding;
/*
class J{
	void m1()
	{
		System.out.println("m1() overriden method");
	}
}
class K extends J{
	void m1()
	{
		System.out.println("m1 overriden method");
	}
}
public class Test7 {

	public static void main(String[] args) {
		J j =new K();
		j.m1();
	}

}
*/
class J{


		int i=10;
	
}
class K extends J{

		int i=20;
	}

public class Test7 {

	public static void main(String[] args) {
		J j=new K();
		System.out.println(j.i);//10   upcasting
	}

}