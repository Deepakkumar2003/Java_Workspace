class A  //non-static variable 
{
	static int j;

}
class Test2
{
	public static void main(String[] args) 
	{ 
		A a1 =new A();
		A a2 =new A();
		A a3 =new A();
	
		System.out.println(a1.j+ " "+a2.j+" "+a3.j); //0,0,0
		a1.j =100;
		System.out.println(a1.j+ " "+a2.j+" "+a3.j); //100,100,100
		a2.j=25;
	    System.out.println(a1.j+ " "+a2.j+" "+a3.j); //25,25,25
		
	}
}


