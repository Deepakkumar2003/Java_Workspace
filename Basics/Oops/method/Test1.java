class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main method executed");
		B.m1();
	}
	static int m1(){
		System.out.println("m1 executed");
		return 10;
}
}
