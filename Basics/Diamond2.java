class Diamond2 
{
	public static void main(String[] args) 
	{
		int n=9;
		int st=1;
		int sp=n/2;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++) System.out.print(" ");
			for(int j=1;j<=st;j++) System.out.print("*");
			System.out.println();
			if(i<=n/2){
				st+=2;
				sp--;
			}else{
				sp++;
				st-=2;
			}
		}
	}
}
