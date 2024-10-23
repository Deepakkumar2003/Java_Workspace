package com.jsp.overriding;

class C{
	
}
class D extends C
{
}
class E extends D{

}
public class Test4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Object obj=new C();
		Object S="Hello";
		C c=new D();
		D d=new E();
		C c2=new E();
	}

}
