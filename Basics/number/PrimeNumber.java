import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a; i<=b; i++)
		{
			if(isPrime(i)) System.out.println(i);
		}
	}
	static boolean isPrime(int n)
	{
		if(n<=1) return false;
		for(int i=2; i<=n/2; i++)
		{
			if(n%1==0) return false;
		}
		return true;
	}
}
