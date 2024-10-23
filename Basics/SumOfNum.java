class SumOfNum 
{
	public static void main(String[] args) 
	{
		int n=362527;
		int sum=0;
		int sum1=0;
		while(n>0){
			int r=n%10;
			sum+=r;
			n/=10;
		}
		System.out.println(sum);
		if(sum>9){
		while(sum>0)
		{
			int r=sum%10;
			sum1+=r;
			sum/=10;
		}
		System.out.println(sum1);
	}
	}
}

