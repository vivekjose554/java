package array;

import java.util.Scanner;

public class Sumandavg {

	public static void main(String[] args) {
		
		int[] a=new int[3];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		
		for(int i=0;i<3;i++)
		{
		
		a[i]=sc.nextInt();
		sum=sum+a[i];
		
		}
		System.out.println("sum of numbers are : "+sum);
		int average=sum/3;
		System.out.println("average of numbers are : "+average);
	}
}
	
