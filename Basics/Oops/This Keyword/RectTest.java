class Rect  //copy constructor example22-09-2023
{
	int l,b;
	Rect(int l, int b)    //constructor
	{
		this.l=l;
		this.b=b;
		}
		Rect(int x)      //constructor
	{
			this(x,x);
}
void CalcArea()        //method
	{
	int area=l*b;
	System.out.println("Area:"+ area);
    System.out.println("\n\n\n\n");
	}
}
class RectTest 
{
	public static void main(String[] args) 
	{
		Rect r1= new Rect(7,2);
		r1.CalcArea();
		Rect r2 = new Rect(5);
		r2.CalcArea();
	}
}
