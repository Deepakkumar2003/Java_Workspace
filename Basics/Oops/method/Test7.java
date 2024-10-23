class G
{
	public static void main(String[] args) 
	{
		int i=0;
		m1(1+i++);
		System.out.println("i=" +i);  //1
	}
	static void m1(int a)
	{
		System.out.println("a="+a);   //1
}
}
