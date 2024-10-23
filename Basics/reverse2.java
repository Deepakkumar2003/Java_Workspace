import java.util.Scanner;
class reverse2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		while (n>0)
		{
			int r=n%10;
			System.out.print(r);
			n=n/10;
		}
	}
}
