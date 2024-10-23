class A
{
	static int i;
	int j;
	void m1()
	{
		System.out.println(i);  //0
		System.out.println(j);  //0
}
}
class T6
{
	public static void main(String[] args) 
	{
		A a= new A();
		a.m1();
		
	}
}
