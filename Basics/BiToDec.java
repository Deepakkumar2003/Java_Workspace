class  BiToDec
{
	public static void main(String[] args) 
	{
		int n=1100;
		int Dec=0;
		int i=1;
			while(n>0)
		{
			int r= n%10;
			Dec+=r*i;
			i*=2;
			n/=10;
		}
		System.out.println(Dec);
	}
}
 