class Person   //factorail in one line question
{
	int num;
	void giveinput(int n)
	{
		num=n;
	}
	int Factorial()
	{
		int fact=1;
		for(int i=1; i<=num; i++) fact=fact*i;
		return fact;
	}
	boolean isPerfect()
	{
		int count=0;
		for(int i=1; i<=num/2; i++) if(num%i==0) count= count +i;
		return count==num;
}
boolean isPrime()
	{
	if(num<=1) return false;
	for(int i=2; i<=num/2; i++) if (num%1==0) return false;
	return true;
	}
}
class Factorial 
{
	public static void main(String[] args) 
	{
		int num=6;
		Person P1=new Person();
		P1.giveinput(num);
		int res1=P1.Factorial();
		System.out.println(num+ "!=" +res1);
		if(P1.isPrime()) System.out.println("it's prime");
		else
			System.out.println("it's not prime");  //
	}
}
