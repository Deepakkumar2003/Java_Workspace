class A
{
	int i=10;
}
class B extends A
{
	int i=100;
	void m1()
	{
		int i=50;
		System.out.println(super.i); //10
		System.out.println(i);//50
		System.out.println(this.i);//100
}
}
class Test3 
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.m1();
		
	}
}
