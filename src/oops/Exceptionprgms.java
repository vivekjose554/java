package oops;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

public class Exceptionprgms {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream f=new FileInputStream("C://Book2.xlsx");
		try {
			int a=20,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	
	try {
		int []a=new int [2];
		a[0]=23;
		a[1]=15;
		System.out.println(a[3]);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	try {
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

}
}
