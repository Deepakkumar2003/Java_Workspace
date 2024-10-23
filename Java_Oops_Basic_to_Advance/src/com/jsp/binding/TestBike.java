package com.jsp.binding;
class Bike{
	
}
class Pulsar extends Bike
{
	
}
class Mechanics{
	void service(Bike bike) {
		// if this is static method then it will execute
	}
	void service(Pulsar pulsar)
	{
}
}
	class mechanics2 extends Mechanics{
		void service(Bike bike)  //   o/p      because of override it is chgecking the mech2
		{
	}
		void service(Pulsar pulsar)
		{}
	}
public class TestBike {

	public static void main(String[] args) {
		Bike bike=new Bike();
		Mechanics mech=new Mechanics();
		mech.service(bike);
	}
		

	}

