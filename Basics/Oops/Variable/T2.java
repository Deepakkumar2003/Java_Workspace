class T2

{
	public static void main(String[] args) 
	{
		int i=10;
		int j=11;
		System.out.println(i);  //10
		System.out.println(j);  //11
		System.out.println(i==j); //compares based on value   //false
		Person P1=new Person();
		Person P2=new Person();
		System.out.println(P1);    //201
		System.out.println(P2);    //101
		System.out.println(P1==P2); //compares based o adress  //false

	}
}
