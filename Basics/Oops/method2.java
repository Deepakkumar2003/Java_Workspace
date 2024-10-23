class c 
{
	public static void main(String[] args) 
	{ int i=m1();
		System.out.println("i=" +1);
		int j=m1()*3;
		System.out.println("j=" +j);
		System.out.println(m1());
		m1();
		if(m1()==10)
		{
        System.out.println("if executed");
	}
}
      static int m1()
{
	  System.out.println("m1 executed" );
	  return 10;
	}
}





class D
{
	 public static void main(String[] args) 

 {
     System.out.println(m2());
 }
     static int m1(){
	 return 10*20;
 }
     static int m2()
 {
	 return m1();
 }
 }





 class E
 {
	 public static void main(String[] args) 
	 {
		 m1(3);
		 m1(4);
		 int n=5;
		 m1(n);
		 m1(n+6+3);
		 System.out.println("n=" +n );
		 //m1(); error                   //*  a..print from m1    and    n...print from main
		 // m1(1,2) error
	 }
	 static void m1(int a)
		
	 { 
	 System.out.println("a="+a);
	 }
 }





class F
{
 public static void main(String[] args) 
	{
	 int n=5;
	 n=m1(n);                         // output is 15 but without n=  output is 5
	 System.out.println("n="+n);
	}
	static int m1(int a)
	{
		return a*3;
	}
}