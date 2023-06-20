package oops;
class Car1
{
	public void acclerator()
	{
		System.out.println("accelator");
	}
}
class BMW extends Car1
{

	@Override
	public void acclerator() {
	 System.out.println("bmw accelator");
		super.acclerator();
	}

	}

public class Methodoveriding {

	public static void main(String[] args) {
		BMW ob=new BMW();
		ob.acclerator();
		
				
    

	}

}
