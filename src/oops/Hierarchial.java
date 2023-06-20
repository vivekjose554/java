package oops;
class Animal1
{
	public void animaldetails()
	{
		System.out.println("Animaldetails");
	}
}
class Dog extends Animal1
{
	public void breed() //method
	{
		System.out.println("breed");
	}
}
class Tiger extends Animal1
{
	public void tigerdetails() //method
	{
		System.out.println("tiger details");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob=new Dog(); //object
		ob.animaldetails();
		ob.breed();
	
		Tiger t=new Tiger(); //object
		t.animaldetails();

	}

}

