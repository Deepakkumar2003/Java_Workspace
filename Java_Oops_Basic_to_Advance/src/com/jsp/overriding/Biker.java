package com.jsp.overriding;
class Bike
{
}
class pulsar extends Bike
{
	
}
class hayabusa extends Bike
{
	
}
class mechanics
{
	void service(Bike bike)
	{
		System.out.println("service started");
	}
}


public class Biker {

	public static void main(String[] args) {
		mechanics mech=new mechanics();
		mech.service(new hayabusa());
		mech.service(new pulsar());
	}

}
