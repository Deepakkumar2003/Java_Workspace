class  conditional
{
	public static void main(String[] args) 
	{
		int a=5;
		if(a%2==0)
		a++;
		a++;
		a++;
		System.out.println("A valve is "+a);//7  after if only one line not consider
	}
}
class A
{
public static void main(String[] args) 
	{
		int a=5;
		if(a%2==0)
		{
		a++;
		a++;
		a++;
		}
		System.out.println("A valve is "+a);//5 

}
}
