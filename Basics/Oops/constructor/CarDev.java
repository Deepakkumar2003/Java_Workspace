class Car
{
	void start()
	{ 
		System.out.println("Car Starts");
	}
       void accelerate()
		{
			System.out.println("Car Driven");
		}
		void stop()
		{
			
		System.out.println("Car Stopped");
		}
	}
class Driver
{
	public void drive(Car car)  //Car --non primitive data type/ car non primitive variables
	{
		car.start();       //
		car.accelerate();  //  METHODS
		car.stop();        //
	}
}
class  CarDev
{
	public static void main(String[] args) 
	{
		Driver driver= new Driver();
		driver.drive(new Car());
	}
}
