class DecToOct 
{
	public static void main(String[] args) 
	{
		int n=56;
		int i=1;
		int Oct=0;
		while(n>0)
		{
			int r=n%8;
			Oct+=r*i;
			i*=10;
			n/=8;
		}
		System.out.println(Oct);
	}
}
