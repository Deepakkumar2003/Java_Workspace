class A
{
	static A create() //fctory method
	{
		return new A();
	}
}
class B
{
	 A createObject() //factory method
	{
		 return new A();
	}
}
class Factory1
{
	public static void main(String[] args) 
	{
		A.create();
		B b =new B();
		b.createObject();
	}
}
