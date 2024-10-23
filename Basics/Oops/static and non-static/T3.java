class A
{
	static int i=45;
}

class T3
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);       //45     static member can be acceseed using class name
		System.out.println(new A().i); //45     using object
		A a=new A();
		System.out.println(a.i);      //45      using object reference
	}
}
