package controlstmts;

public class Count {

	public static void main(String[] args) {
		int num=5456;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count=count+1;
		}
		System.out.println("count of the number is = " +count);

	}

}
