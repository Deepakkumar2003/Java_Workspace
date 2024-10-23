class A 
{
	static int i1=19;
	static void m1()
	{
		System.out.println("java is life");
	}
}
class T1   //1
{
	static int i;
	static void m1()
	{
	System.out.println("java is easy");
	}
	public static void main(String[] args) 
	{
    System.out.println(i); //t1.i
	System.out.println(A.i1); // Class loading
	A.m1();
	T1.m1();

	}
}
