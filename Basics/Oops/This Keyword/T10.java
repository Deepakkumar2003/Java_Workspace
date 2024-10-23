class A
{
	A()
	{
		System.out.println("No Arg");
	}
	A(int i)
	{
		this();
		System.out.println("paramm int arg const");
	}
}
class  T10
{
	public static void main(String[] args) 
	{
		new A(10);
	}
}
