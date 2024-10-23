class B// for non static variable examplesss...
{ 
	int j=100;
	void m2()
	{
		System.out.println("m2() of class B non static");
	}
}

class T9
{
	int i=34;
	void m1()
	{
		System.out.println(" m1() non static of T9 class");
	}
	public static void main(String[] args) 
	{
		T9 t= new T9();
		System.out.println(t.i);
		t.m1();
		B b=new B();
		System.out.println(b.j);
	}
}
