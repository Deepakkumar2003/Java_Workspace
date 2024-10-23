package com.jsp.overriding;
class phone
{
	void call()
	{
		System.out.println("calling from 3G");
	}
}
class smartphone extends phone
{ 
	@Override//ITs not mandotry
	void call() {
		System.out.println("calling through 5G");
	}
}
class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartphone s1=new smartphone();
		s1.call();

	}

}
