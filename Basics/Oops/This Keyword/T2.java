class A 
{
	int i=10;
	void m1(B b)
	{
		int i=100;
		System.out.println(i);       //100
        System.out.println(this.i); //10
		System.out.println(b.i);   //19
		System.out.println(B.j);  //56
	}
}
class B
{
	int i=19;
	static int j=56;
}
	class T2
	{
	public static void main(String[] args) 
	{
		A a= new A();
		a.m1(new B());

	}
}