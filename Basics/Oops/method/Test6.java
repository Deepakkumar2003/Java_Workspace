class F 
{
	public static void main(String[] args) 
	{
		int a=10;
		m1(a);
		System.out.println("in main, a="+a);
	}
	static void m1(int a)
	{
		a*=4;
		System.out.println("in m1, a=" +a);
	}
}
