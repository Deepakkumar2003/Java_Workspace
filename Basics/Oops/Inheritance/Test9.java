class A
{
	A(int i)
	{
		System.out.println("A(int i)");
	}
}
class B extends A
{

//  here the default constructor can not access the arguments constructor.

	
}
class Test9 
{
	public static void main(String[] args) 
	{
		new B();
	}
}
