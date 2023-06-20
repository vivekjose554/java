package oops;
interface Bank
{
	public void deposit();
	public void withdrawl();
	public void balance();
}
class SBI implements Bank
{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit");
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}
	
}
class Fedral implements Bank
{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interfaceprgms {

	public static void main(String[] args) {
		Bank ob=new SBI();
		ob.balance();
		ob.deposit();
		ob.withdrawl();
		 ob=new Fedral();
		ob.balance();
		ob.deposit();
		ob.withdrawl();

	}

}
