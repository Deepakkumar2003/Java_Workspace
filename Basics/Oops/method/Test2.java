class C // method in class
{
	public static void main(String[] args) 
	{
		int i=m1();
		System.out.println("i=" +i); //2
		int j=m1()*3;
		System.out.println("j=" +j); //4
		System.out.println(m1());    //6
		m1();
		if(m1()==10)
		{
			System.out.println("if executed"); //9
		}
	}
	static int m1(){
		System.out.println("m1 executed"); //1,3,5,7,8
		return 10;
	}
}
