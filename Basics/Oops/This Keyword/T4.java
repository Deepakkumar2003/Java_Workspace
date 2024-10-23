class A // message passing....creating object using arguments....object as arguments and return ytype arguments passed can be non primitive also
{
	static void m1(A a)
	{
		System.out.println("adress"+a);  //101
	}
	static A m2()
	{
		return new A();
	}
}
	class T4
	{
	public static void main(String[] args) 
	{
		A.m1(new A());
		A a1= A.m2();
		System.out.println("adress:" +a1); //201
	}
}
