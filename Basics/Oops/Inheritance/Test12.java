class A
{
	A()
	{
		this(5);
		System.out.println("A()");//3
	}
	A(int i)
	{
		this(7,5);
		System.out.println("A(int i)");//2
    }
	A(int i, int j)
	{
		System.out.println("A((int i, int j)");//1
	}
}
class B extends A
{
	B()
	{
		this(10,1);
		System.out.println("B()");//6
	}
	B(int i)
	{
		System.out.println("B(int i)");//4
    }
	B(int i, int j)
	{    this(5);
		System.out.println("B(int i, int j)");//5
	}
}

class Test12 
{
	public static void main(String[] args) 
	{
		new B();
	}
}
