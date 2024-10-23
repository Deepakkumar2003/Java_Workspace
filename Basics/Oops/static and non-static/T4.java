class A
{ 
	int i=50;
}
class T4 
{
	public static void main(String[] args) 
	{

		//System.out.println(A.i);   non statoc variable cant accesss using class name
		A a=new A();
		System.out.println(a.i);  // object creation for non static variable
	}
}
