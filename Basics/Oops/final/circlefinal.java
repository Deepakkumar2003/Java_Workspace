class Circle
{
	int radius;
	Circle(int r)
	{
		radius=r;
	}
}
class circlefinal 
{
	public static void main(String[] args) 
	{
		final Circle c1=new Circle(12);
		System.out.println(c1.radius);    //12
		c1.radius=15;
		System.out.println(c1.radius);  //15
		// c1= new Circle(34);
		//error: can't assign a value to find variable c1
	}
}
