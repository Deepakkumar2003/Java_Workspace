package com.jsp.overriding;
class H{
class I extends H
{
int j; //specific variable
void m1()// specific method
{
	System.out.println("m1() specific method");
}
}

public class Test6 {

	public static void main(String[] args) {
		H h=new I();
		System.out.println(h.j);//cte
		h.m1();//cte
	}
}
//using upcasted reference we can not access specific properties.
