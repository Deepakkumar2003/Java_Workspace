package com.jsp.overriding;
//overriding instead of overloading with upcasting

class Car{
	void start() {}
	void accelerate() {}
	void stop() {}
}
class Alto extends Car{
	@Override
	void start()
	{
		System.out.println(this.getClass().getSimpleName()+" start ");
	}
	void accelerate()
	{
		System.out.println(this.getClass().getSimpleName()+" runs");
	}
	void stop()
	{
		System.out.println(this.getClass().getSimpleName()+" stop");
		System.out.println("**************************");
	}
	
}

class Bmw extends Car{
	@Override
	void start()
	{
		System.out.println(this.getClass().getSimpleName()+" start ");
	}
	void accelerate()
	{
		System.out.println(this.getClass().getSimpleName()+" runs");
	}
	void stop()
	{
		System.out.println(this.getClass().getSimpleName()+" stop");
		
	}
	
}

class Audi extends Car{
	@Override
	void start()
	{
		System.out.println(this.getClass().getSimpleName()+" start ");
	}
	void accelerate()
	{
		System.out.println(this.getClass().getSimpleName()+" runs");
	}
	void stop()
	{
		System.out.println(this.getClass().getSimpleName()+" stop");
		System.out.println("**************************");
	}
	
}
class Driver
{
	public void drive(Car car)
	{
		car.start();
		car.accelerate();
		car.stop();
	}
}
public class GameTest { 
	public static void main(String[] args) {
		Driver driver=new Driver();
		driver.drive(new Audi());
		driver.drive(new Alto());
		driver.drive(new Bmw());
		
		

	}

}
