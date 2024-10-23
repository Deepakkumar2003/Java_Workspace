class Account  //Account number generating
{
	int accNo;
	static int accId;
	static String ifsc_code;
	static String branchName;
	static
	{
		accId=1000;
		ifsc_code= "SBI00034";
		branchName= "Marathahalli";
	}
	{
		accId ++;
		accNo=accId;
	}
	void displayAc()
	{
		System.out.println("AccNO:"+ accNo);
		System.out.println("Acifsc code:"+ ifsc_code);
		System.out.println("Acc Branch:"+ branchName);
		System.out.println("***********************");
	}
}
class BankApp
{
	
	public static void main(String[] args) 
	{
		Account acc1=new Account();
		acc1.displayAc();
		Account acc2=new Account();
		acc2.displayAc();
		Account acc3=new Account();
		acc3.displayAc();
	
	}
}




// this source code is for auto generator and it could be used for the  car number auto gennerator.