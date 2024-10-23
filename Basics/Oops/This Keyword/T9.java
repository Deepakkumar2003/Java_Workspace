class A //if local variable and static variable are used in static method, to point to static variable use ""class"" Names..
{
	static int i;
	static void m1(int i)
	{
		A.i=i;
	}
}
class T9
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A.m1(10);
		System.out.println(A.i); //10
	}
}
