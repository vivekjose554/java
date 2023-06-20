package array;

import java.util.Scanner;

public class Singledim {

	public static void main(String[] args) {

		int[] a=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		
		for(int i=0;i<3;i++)
		{
		
		a[i]=sc.nextInt();
		
		}
		System.out.println("eneterd numbers are");
		for(int i=0;i<3;i++)
		{
		
		
		System.out.println(a[i]);

	}
	}
}

