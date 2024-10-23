class A
{
	int j;
	void m1()
	{
		System.out.println(j);  //0
}
}
class T7 
{
	public static void main(String[] args) 
	{
		A a= new A();
		a.m1();   //calling the method
	}
}
