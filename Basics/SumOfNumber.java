class SumOfNumber 
{
	public static void main(String[] args) 
	{
		int n=509;
		
	do{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			n/=10;
		}
		n=sum;
	}while(n>9);
	System.out.println(n);
	
}
}
