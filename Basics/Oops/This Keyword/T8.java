class A // local variable helps assigning static and non static variable
{
	int i;
	void m(int i)// formal
	{
		this.i=i;
}
}
class T8 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.m(10); // Actual Argument
		System.out.println(a1.i);  //10
	}
}
