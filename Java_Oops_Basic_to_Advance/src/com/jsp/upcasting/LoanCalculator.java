package com.jsp.upcasting;
import java.util.Scanner;
class Bank{
	public double rateofintrest()
	{
		return 0.0;
	}
}

class HDFC extends Bank{
	@Override
	public double rateofintrest()
	{
		return 0.15;
	}
}
class ICIC extends Bank{
	@Override
	public double rateofintrest()
	{
		return 0.10;
	}
}
class State extends Bank{
	@Override
	public double rateofintrest()
	{
		return 0.05;
	}
}
class Salesman{
	public void provideHomeLoans(Bank bank, double amount)
	{
		double roi=bank.rateofintrest();//0.15
		double roiDouble=roi*100;//15.0
		int roiInt=(int)roiDouble;//15
		System.out.println(roiInt+"% is the interest charged by" +bank.getClass().getSimpleName()+"bank");
		double interestamount=amount+roi;
		System.out.println(interestamount+"is the amount of interset"+"charged by"+ bank.getClass().getSimpleName()+"bank");
		double totalamount=amount+interestamount;
		System.out.println(totalamount+"is the amount of charged with interest"+" by"+ bank.getClass().getSimpleName()+"bank");
	}
	}

public final class LoanCalculator {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Amount");
	double amount=scn.nextDouble();
	Salesman salesman=new Salesman();
	System.out.println("1. HDFC\n2.ICICI\n3.State");
	System.out.println("choice");
	int choice=scn.nextInt();
	switch(choice) {
	case 1: salesman.provideHomeLoans(new HDFC(), amount);
	break;
	case 2: salesman.provideHomeLoans(new ICIC(), amount);
	break;
	case 3: salesman.provideHomeLoans(new State(), amount);
	break;
	default: System.out.println("Invalid choice.......");
	}

}
}
