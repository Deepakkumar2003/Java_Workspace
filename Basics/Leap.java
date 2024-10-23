import java.util.Scanner;
class  Leap
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter year");
		int year= scn.nextInt();

		if (year%400==0)
			System.out.println(year+ " Is A LeapYear" );
		else if(year%4==0 && year%100!=0)
			System.out.println(year+ " Is A LeapYear");
		else
			System.out.println(year+ " Is  Not A LeapYear");


	}
}
