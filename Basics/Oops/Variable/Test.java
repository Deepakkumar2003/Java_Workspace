class A  //static variable only have one copy
{  
	static int i;

}
class Test 
{
	public static void main(String[] args) 
	{ 
		A a1 =new A();
		A a2 =new A();
		A a3 =new A();
		System.out.println(A.i); //0
		System.out.println(a1.i+ " "+a2.i+" "+a3.i); //0,0,0
		A.i =100;
		System.out.println(A.i); //100
		System.out.println(a1.i+ " "+a2.i+" "+a3.i); //100,100,100
		a2.i=45;
		System.out.println(A.i); //45
	    System.out.println(a1.i+ " "+a2.i+" "+a3.i); //45,45,45
		
	}
}
