class Animal
{
	void eat()
	{
		System.out.println("Animal Eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Bow Boww");
}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Meow");
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.eat();
		Dog d= new Dog();
		d.eat();
		d.bark();
		BabyDog b=new BabyDog();
		b.eat();
		b.bark();
		b.weep();
	}
}
