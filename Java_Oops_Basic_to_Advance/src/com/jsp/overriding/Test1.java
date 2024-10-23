package com.jsp.overriding;
class TVS{
	void m1()
	{
		System.out.println("X-plus");
	}
}
class Apache extends TVS{
		void m1()
		{
			System.out.println("Apache 160");
		}
		}
class Test1 {
	public static void main(String[] args) {
		Apache a1= new Apache();
		a1.m1();
		TVS t1=new TVS();
		t1.m1();
		
		
	}

}
