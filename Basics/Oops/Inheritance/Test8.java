class A
{
	A()
	{
	System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
	//Super();
	System.out.println("B()");
	}
	B(int i)
	{
		//super();
		System.out.println("B(int )");
	}
}


class Test8 
{
	public static void main(String[] args) 
	{
		new B();
		new B(10);
	}
}