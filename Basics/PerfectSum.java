class PerfectSum 
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=10000;i++)
		{
			int n=i;
			int sum=0;
			for(int j=1;j<=n/2;j++)
			{
				if(n%j==0)sum+=j;
			}
			if(sum==n)
			{
				count++;
				if(count%2!=0)
					System.out.println(i);
			}
		}
		
	}
}

