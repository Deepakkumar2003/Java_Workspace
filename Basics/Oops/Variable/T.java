class A1    //one object can have more than one refrence variable..
{
	int i;
}
class T 
{
	public static void main(String[] args) 
	{
		A1 a1=new A1();
		a1.i=45;
		System.out.println(a1);     //101
		System.out.println(a1.i);  //45
		A1 a2=a1;
		System.out.println(a2.i); //45
		A1 a3=a2;
		a3.i=55;
		System.out.println(a1.i +"  " +a2.i+" " +a3.i);  //55,55,55

	}
}
