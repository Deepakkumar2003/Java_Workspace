class A // non static bolock, is used to reduce constructor code
{ 
	{
	System.out.println("Java is easy");
}
A()        // cconstructor
{
   System.out.println("NO ARG");
}
A(int i)   // constructor
{
	System.out.println("param int arg const");
}
}
	class Test11
	{
	public static void main(String[] args) 
	{
		new A(10);
	}
}
