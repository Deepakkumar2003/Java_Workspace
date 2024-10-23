class BankCustomer
{
	final int accNo;
	static int acn;
	String name;
	static
	{
		acn=110;
	}
	{
		acn++;
		accNo=acn;
	}
	BankCustomer(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Acc no. :" +accNo);
		System.out.println("Name :"+name);
		System.out.println("_________________________");
	}
	}
class  T2
{
	public static void main(String[] args) 
	{
		BankCustomer b1=new BankCustomer("Raja");  //b1 is current object   and    Raja is the given object      all the function called object creation.
		b1.display();
		
		BankCustomer b2=new BankCustomer("Rani");
		b2.display();
	}
}
