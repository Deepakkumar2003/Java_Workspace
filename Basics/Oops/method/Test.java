class A
{
	static int i;
	int j;
	void setj(int j1)
	{
		j=j1;
	}
	int getj()
	{
		return j;
	}
	static void seti(int i1)
	{
		i=i1;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		System.out.println(a1.getj());     //0
		a1.setj(45);
		System.out.println(a1.getj());   //45
		A a2 =new A();
		a2.setj(100);
		System.out.println(a2.getj()); //100
		A.seti(370);
		System.out.println(A.i);    // 370
		System.out.println(a1.i);  //370
		System.out.println(a2.i); //370

	}
}
