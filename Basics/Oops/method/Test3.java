class D //return 
{
	public static void main(String[] args) 
	{
		System.out.println(m2()); //200
	}
	static int m1()
	{
		return 10*20;
	}
	static int m2()
	{
		return m1();
	}
}
