package com.jsp.upcasting;
// multilevel inheritence

class A
{
	void m1() {
	System.out.println("m1() A");
}
}
class B extends A{
void m2()
{
	System.out.println("m2() B");
}
}
class C extends B{
void m3()
{
	System.out.println("m3() c");
}
}

public class Test {

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		//a.m2();CTE
		//a.m3();
A a1=new B();
a1.m1();
//a1.m2();
//a1.m3();

        B b=new C();
        b.m1();
        b.m2();
	    //b.m3();
A a2=new C();
a2.m1();
//a2.m2();
//a2.m3(); CTE    specific properties
}
}