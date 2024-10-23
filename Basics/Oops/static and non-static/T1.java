class A 
{
	int i=10;
	B m1()
	{
		return new B();
	}
}
		class B
		{
			int i=19;
			static int j=56;
		}
	class T1
	{
	public static void main(String[] args) 
	{
		A a= new A();
		B b= new a.m1();
		System.out.println(b.i); //19
		System.out.println(B.j); //56
	}
}
