class	A
{
	A (int i)
	{
		System.out.println("A_ cons");//1
    }
}
class B extends A
{
	B()
	{
		this(10);
		System.out.println("B_ cons");//3
	}
	B(int i)
	{
			super(10);
		System.out.println("B_2_ cons");//2
    }
}
class Test14 
{
	public static void main(String[] args) 
	{
		new B();
	}
}
