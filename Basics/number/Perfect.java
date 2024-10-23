class Perfect 
{
	public static void main(String[] args) 
	{
		PerfectRange(11000);
	}
	public static void PerfectRange(int a,int b)
	{
		for(int i=a; i<b; i++)
	{
		if(isPerfect(i)) System.out.println(i);
	
	}
public static boolean isPerfect(int n)
{
	if(n==checkPerfect(n)) return true;
	else return false;
}
public static int checkPerfect(int n)
{
	int sum=0;
	for(int i=1; i<=n/2; i++)
	{
		if(n%i==0) sum+=i;
	}
	return sum;
	}
}
