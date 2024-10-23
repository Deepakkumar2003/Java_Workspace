class H 
{
	public static void main(String[] args) 
	{
		int i=0,j=0;
		j=m1(++i)+m1(i++);
		System.out.println("i="+i); //2
		System.out.println("j="+j); //2
	}
	static int m1(int a)
	{
		return a++;
}
}
