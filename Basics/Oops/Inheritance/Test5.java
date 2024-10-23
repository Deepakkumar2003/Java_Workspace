class A //Blocks in inheritance
{
	static
	{
		System.out.println("SB A");
	}
}
class B extends A
{
	static 
	{
		System.out.println("SB B");
	}
}
	
class  Test5
{
	public static void main(String[] args) 
	{
		new B();
	}
}
