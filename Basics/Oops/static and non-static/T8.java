class A
{
static int j; 
static void m1()
	{
	System.out.println(j);   // int deafoult value is 0 , it's output is 0
}
}
class T8 
{
	public static void main(String[] args) 
	{
		A.m1();      //for static variable calling yhrough class name
	
		//A a=new A();  object creation it's requared for non static variable
		//a.m1();
	}
}