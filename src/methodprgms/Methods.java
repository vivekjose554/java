package methodprgms;

public class Methods {

	public static void main(String[] args) {
	Methods ob=new Methods();
	ob.add();
	int subt=ob.sub();
	System.out.println("Subtraction is : "+subt);
	

	}
	public void add()
	{
		int a=30,b=20;
		int c=a+b;
		System.out.println(c);
	}
	public int sub()
	{
		int a=30,b=20;
		int c=a-b;
		return c;
	}

}
