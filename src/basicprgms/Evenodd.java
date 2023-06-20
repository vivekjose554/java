package basicprgms;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		int []a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int even=0,odd=0;
		for (int i=0;i<10;i++) {
			a[i]=sc.nextInt();
            if (i % 2 == 0)
                even += a[i];
            else
                odd += a[i];
        }
 
        System.out.println("Sum of even numbers : " + even);
        System.out.println("Sum of odd numbers : " + odd);

	}

}
