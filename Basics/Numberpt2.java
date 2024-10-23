class  Numberpt2
{
	public static void main(String[] args) 
	{
	int n=5;
    int count=0;
    int count1=1;

   for(int i=1;i<=n;i++) {
	
	if(i%2!=0) {
		int k=i*count+1;
		for(int j=1;j<=i;j++) {
			System.out.print( k++ +"\t"  );
			
		}
		count++;
	}
	else {
		int k=count1*i+count1;
		for(int j=1;j<=i;j++) {
			System.out.print( k-- + "\t" );
		}
		count1++;
	}
	System.out.println();
   }
	}
}