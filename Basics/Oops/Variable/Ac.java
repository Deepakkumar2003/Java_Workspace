class Ac 
{
	int temp;
	void changeTemp()
	{
		temp=22;
	}
	void changeTemp(int t)
	{
		temp=t;
	}
	void displayTemp()
	{
		System.out.println("Temprature:" +temp);
}
}
class T6
{
	public static void main(String[] args) 
	{   
		Ac ac1=new Ac();
		ac1.displayTemp();  //0
		ac1.changeTemp();
		ac1.displayTemp();  //22
		ac1.changeTemp(19);
		ac1.displayTemp();  //19
	}
}
