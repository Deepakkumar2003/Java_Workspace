class A  //for static 
{
	static int i1=19;
	static void m1()
	{
		System.out.println("java is life");  //3
	}
}
class T10 //1
{
	static int i;
	static void m1()
	{
		System.out.println("java is easy"); //4
	}
	public static void main(String[] args) 
	{
		System.out.println(i); //T10.i   default  '0' //1
		System.out.println(A.i1);  //class load  //2
		{
		}
		A.m1();
		T10.m1();
	}
}


// if you have static then can't use non static properties;
