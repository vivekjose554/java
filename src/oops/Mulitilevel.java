package oops;
class Animal
{
	public void animalfood()
	{
		System.out.println("Animalfood");
	}
}
class Dog extends Animal
{
	public void breed() //method
	{
		System.out.println("breed");
	}
}
class Babydog extends Dog
{
	public void babydogfeature() //method
	{
		System.out.println("babydog");
	}
}
public class Mulitilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob=new Dog(); //object
		ob.animalfood();
		ob.breed();
		Babydog baby=new Babydog(); //object
		baby.babydogfeature();
		baby.animalfood();
		baby.breed();

	}

}
