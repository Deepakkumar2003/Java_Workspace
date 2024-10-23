package Abstract;
abstract class AA
{
	abstract void m1();
	abstract void m2();
}
abstract class BB extends AA
{
	@Override
	void m1()
	{
		System.out.println("m1() defined");
	}
}
class C extends BB
{
	@Override
	void m2()
	{
		System.out.println("m2() defined");
	}
}
public class Test1abstract {

	public static void main(String[] args) {
	AA a=new C();
	a.m1();
	a.m2();

	}

}
