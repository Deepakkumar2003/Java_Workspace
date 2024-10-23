class A //initialization 
{

	static int i=10; // single line initialization
	int j;
	static
	{ // multiline initialization
		i=10;
	}
	static
	{
		i=15;
	}
}
	class Test
	{
	public static void main(String[] args) 
	{
		System.out.println(A.i);//15
	}
}
