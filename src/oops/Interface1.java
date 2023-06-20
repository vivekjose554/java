package oops;
interface Basicanimal
{
	public void eat();
	public void sleep();
	
}
class Monkey
{
	public void jump()
	{
		System.out.println("jump");
	}
	public void bite()
	{
		System.out.println("bite");
	}
}
class Human extends Monkey implements Basicanimal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep");
	}
	

public void speak()
{
	System.out.println("speak");
}
}
public class Interface1 {

	public static void main(String[] args) {
		Human ob=new Human();
		ob.bite();
		ob.eat();
		ob.jump();
		ob.sleep();
		ob.speak();
	}
}


	


