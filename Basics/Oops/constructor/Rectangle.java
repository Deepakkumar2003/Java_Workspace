class Rectangle
{
	int length;
	int breadth;
	Rectangle(int length, int breadth)
	{
		this.length= length;
		this.breadth= breadth;
}
Rectangle(int length, Rectangle r)
	{
	
		this.length= length;
		this.breadth= r.breadth;
	}
	void calArea()
	{
		int area= length*breadth;
		System.out.println("Area is: " + area);
        System.out.println("*********************" );
	}
}


class RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle r1 =new Rectangle (15,9);
		r1.calArea();
		Rectangle r2 =new Rectangle (8,r1);
		r2.calArea();
	}
}
