class A
{
	static
	{
	System.out.println("1, static block A");
}
{
	System.out.println("3, non static block A:");
}
}
class B extends A
{
	static 
		{
	System.out.println("2, static block B");
}
{
	System.out.println("4, non static block B:");
}
}
class Test6 
{
	public static void main(String[] args) 
	{
		new B();
}
}

// blocks in inhertance