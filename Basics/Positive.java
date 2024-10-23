import java.util.Scanner;
class Positive
{
  public static void main(String[] args) 
	{
	  Scanner scn = new Scanner(System.in);
		System.out.println("Enter A Number");
		int n = scn.nextInt();
        
		if (n%2==0)
			System.out.println(n+ " Is A Even Number");
		else
			System.out.println(n+ " Is A Odd Number");
	}
}
