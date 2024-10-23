class A
{
	int i;
}
class T1 
{
	public static void main(String[] args) 
	{
		A a1;
		a1=new A();
		a1.i=45;
		System.out.println(a1); // 101
		System.out.println(a1.i); //45

		a1=new A();
		System.out.println(a1); // 201
		System.out.println(a1.i); // 0

}
}