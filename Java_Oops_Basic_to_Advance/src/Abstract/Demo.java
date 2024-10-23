package Abstract;
abstract class shape{
	abstract public int getArea();
	public abstract void display();
}
class circle extends shape{
	int radius;
	public circle(int radius) {
		this.radius=radius;
	}
	@Override
	public int getArea() {
		return(int)3.14*radius*radius;
	}
	@Override
	public void display() {
		System.out.println(getArea());
	}
}

class rectangle extends shape{
	int l;
	int b;
	public rectangle(int l,int b ) {
		this.l=l;
		this.b=b;
		
	}
	@Override
	public int getArea() {
		return l*b;
	}
	@Override
	public void display() {
		System.out.println(getArea());
	}
}

public class Demo {

	public static void main(String[] args) {
		circle c=new circle(6);
		c.display();
		rectangle r=new rectangle(4,5);
		r.display();
		

	}

}
