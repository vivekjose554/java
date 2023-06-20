package basicprgms;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	

				
			    int[] a=new int[10];
				int sum=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the numbers");
				
				for(int i=0;i<10;i++)
				{
				
				a[i]=sc.nextInt();
				sum=sum+a[i];
				
				}
				int average=sum/3;
				System.out.println("average of numbers are : "+average);
			}
		

	}


