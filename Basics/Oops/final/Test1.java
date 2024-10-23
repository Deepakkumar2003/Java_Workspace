class A
{
	final static int i;  //blank final field
	final int j;
	static       //static block
	{
		i=50;
	}
	{              //N.S block
		j=75;
	}
}
class Test1 
{
	public static void main(String[] args) 
	{
		final int i;
		i=45;
		System.out.println(i);           //45
		System.out.println(A.i);         //50
		System.out.println(new A().j);   //75
	}
}
