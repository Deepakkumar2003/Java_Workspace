class A
{
	void m1()
	{
		System.out.println(this);  //101
	}
}
class T6
{
	public static void main(String[] args) 
	{
		A a1=new A();

		System.out.println(a1);  //101
		a1.m1();
		A a2= new A();
		System.out.println(a2); //201
	}
}
