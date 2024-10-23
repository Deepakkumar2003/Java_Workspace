class A
{
	static
	{
	
		System.out.println("1. A static");//3
	}
	{
	
		System.out.println("3. A non static");//2
    }
	A()
	{
		System.out.println("4. A Constructor");//1
	}
}
class B extends A
{
	static
	{
	
		System.out.println("2. B static");//3
	}
	{
	
		System.out.println("5. B non static");//2
    }
	B()
	{
		System.out.println("6. B Constructor");//1
	}
}

class Test13
{
	public static void main(String[] args) 
	{
		new B();
	}
}
