class A 
{
	static int i;
	int j;
	void init()
	{
		i++;
		j++;
	}
	void display()   //method
	{
		System.out.println(i+" "+j);
	}
}
class Test
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new A();
		A a3=new A();
		a1.init();
		a2.init();
		a3.init();
		a1.display();  // 3 1
		a2.display();  // 3 1
		a3.display();  // 3 1

}
}
