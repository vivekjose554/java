package array;

import java.util.Scanner;

public class Stringarr {

	public static void main(String[] args) {
		String[] a=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the names");
		
		for(int i=0;i<5;i++)
		{
		
		a[i]=sc.next();
		
		}
		System.out.println("eneterd names are");
		//for(int i=0;i<5;i++)
		//{
		
		
		//System.out.println(a[i]);

	//}
		for(String v:a)// for each loop
		{
			
			System.out.println(v);
		}
	}


	}


