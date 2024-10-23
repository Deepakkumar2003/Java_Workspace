class A //static and non static blocks 
{
	static int i=10;
	int j=45;
	{
		i=1000;
		j=100; // inside non static blocks static menber caqn be accecced
	}
}
class Test
{
	public static void main(String[] args) 
	{
		System.out.println(A.i); // 10
		System.out.println( new A().j); // 100
		System.out.println(A.i); // 1000
	}
}
