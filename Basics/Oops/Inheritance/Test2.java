class A
{
	int i =10;
}
		class B extends A
		{
		
		}
class Test2 
{
	public static void main(String[] args) 
	{
		B b=new B();
		System.out.println(b.i);//10

		b.i=45;
		System.out.println(b.i);//45

		A a =new A();
		System.out.println(a.i);//10

	}
}
