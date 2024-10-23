package com.jsp.overriding;
class vegitable{}
class potato extends vegitable{}
class carrot extends vegitable{}
class shopkeper{
	vegitable sell()
	{
		if(true) return new potato();
		return new carrot();
	}
}
public class veg {

	public static void main(String[] args) {
		shopkeper shopk=new shopkeper();
		vegitable veg=shopk.sell();


	}

}
