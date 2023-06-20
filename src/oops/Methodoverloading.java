package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(30,50);
		ob.add(40,50.1);
	}
		public void add()
		{
			int a=20,b=30;
		    int c=a+b;
			System.out.println(c);
		}
		public void add(int a, int b)
		{
			int c=a+b;
			System.out.println(c);
		}
		public void add(int a, double b)
		{
			double c=a+b;
			System.out.println(c);
		}

}
