class Car  //static block, non static block and constructor examples...
{
int carNo;         
static int carId;   //static data member
String carName;
String color;
static
	{
	carId=1000;   //static block
}
	{
		carId ++;    //non static lock
		carNo=carId;
	}
	Car(String carName)   ////constructor
	{
		color ="white";           
		this.carName=carName;
	}
	Car(String color, String carName)     //constructor
	{
		this.color=color;
		this.carName=carName;
	}
	void ShowcarDetails(){   //method
		System.out.println("car Reg Number: IND99"+carNo);
		System.out.println("car Namer:" +carName);
		System.out.println("car color:" +color);
		System.out.println("________________________");
	}
}
class CarDev 
{
	public static void main(String[] args) 

	{
		Car car1= new Car("Baleno");
		car1.ShowcarDetails();
		Car car2= new Car("pink", "Swift");
		car2.ShowcarDetails();
	}
}