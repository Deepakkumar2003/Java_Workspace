class B 
{
	int j=100;
	void m2()
	{
		System.out.println("m2() of class B non static");
}
}
class T2
{
	int i=34;
	void m1()
	{
	System.out.println("m1() non static T2");
	}

	    public static void main(String[] args) 
	{
			T2 t =new T2();
		System.out.println(t.i);
		t.m1();
		B b = new B();
		System.out.println(b.j);
	}
}
