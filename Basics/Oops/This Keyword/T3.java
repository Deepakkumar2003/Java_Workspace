class A 
{
	void m1(A a)
	{
		System.out.println(a);   //201
		System.out.println(this);//101
	}
}
	class T3
	{
	public static void main(String[] args) 
	{
		A a1= new A();
		A a2= new A();
		System.out.println(a1);   //101
		System.out.println(a2);   //201
		a2.m1(a1);                //101
		a1.m1(a2);                //201
	}
}
