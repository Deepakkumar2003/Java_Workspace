class A
{
	int i=30;
	public void m1()
	{
		int i=40;
		System.out.println(i);
	}
}
class B extends A
{
}
class Test1 
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.m1();
		System.out.println(b.i);
	}
}
