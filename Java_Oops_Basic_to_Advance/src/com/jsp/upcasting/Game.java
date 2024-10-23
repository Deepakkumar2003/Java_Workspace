package com.jsp.upcasting;
class Animal
{
	void drinkwater() {
	System.out.println(this.getClass().getSimpleName()+" drinks water");
}
void Sound()
{}
void movement()
{}
}

class Lion extends Animal{
	@Override
	void Sound()
	{
		System.out.println(this.getClass().getSimpleName()+" Roars");
	}
	@Override
	void movement() {
	System.out.println(this.getClass().getSimpleName()+" Runs/Walk");
}
}

class Snake extends Animal{
	@Override
	void Sound()
	{
		System.out.println(this.getClass().getSimpleName()+" hahahhaha");
	}
	@Override
	void movement() {
	System.out.println(this.getClass().getSimpleName()+" Ngin dance");
}
}

public class Game { //child toy

	public static void main(String[] args) {
	Animal animal;
	animal=new Lion();
	animal.drinkwater();
	animal.Sound();
	animal.movement();
	
System.out.println("************************************");
animal=new Snake();
animal.drinkwater();
animal.Sound();
animal.movement();
	

	}

}
