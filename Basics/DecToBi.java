class  DecToBi
{
	public static void main(String[] args) 
	{
		int n=12;
		int Bi=0;
		int i=1;
			while(n>0)
		{
			int r= n%2;
			Bi+=r*i;
			i*=10;
			n/=2;
		}
		System.out.println(Bi);
	}
}
