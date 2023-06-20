package oops;
abstract class Cars{
abstract public void speedlimit();
public void carengine()
{
	System.out.println("carengine");
}
class Maruthi extends Cars
{

	@Override
	public void speedlimit() {
		
		System.out.println("speedlimit");
	}
	
}



public class Abstractprgms {

	public static void main(String[] args) {
		
	    Maruthi n=new Maruthi();
		n.carengine();
		n.speedlimit();
	}
}
}

	


 