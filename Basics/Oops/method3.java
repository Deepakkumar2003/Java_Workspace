class E
{
	public static void main(String[] args) 
	{ 
		int a=10;
		m1(a);
		System.out.println("in main, a= " +a);
	}
	static void m1(int a)
		{
		a*=4;
		System.out.println("in m1, a= " +a);
}
}




class B
{
	public static void main(String[] args) 
	{
		int i=0;
		m1(1+i++);
		System.out.println("i=" +i);
	}
	static void m1(int a)
	{
		System.out.println(" a= " +a);
}
}





class C
{
	public static void main(String[] args) 
	{
		int i=0, j=0;
		j=m1(++i) + m1(i++);
		System.out.println("i= " +i);
		System.out.println("j= " +j);
	}
	static int m1(int a)
	{
		return a++;
}
}