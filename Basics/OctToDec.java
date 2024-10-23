class OctToDec
{
	public static void main(String[] args)
	{
		int n=70;
		int i=1;
		int Dec=0;
		while(n>0)
		{
			int r=n%10;
			Dec+=r*i;
			i*=8;
			n/=10;
}
			System.out.print(Dec);
	}
}