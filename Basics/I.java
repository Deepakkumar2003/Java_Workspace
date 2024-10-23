import java.util.Scanner;
class I 
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
	
		System.out.println("Enter Year");
			int Year=scn.nextInt();


	    if  (Year%4==0)
  
        System.out.println(Year+ " Is A Leap Year");

		else
		
		System.out.println(Year+ " Is Not A Leap Year");

		
	}
}
