package basicprgms;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		        int a,b,c=0;
	            Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        a=num;
		        
		        while (a != 0) 
		        {
		            b = a % 10;
		            c += Math.pow(b, 3);
		            a /= 10;
		        }

		        if (c == num)
		            System.out.println(num + " is an Armstrong number.");
		        else
		            System.out.println(num + " is not an Armstrong number.");
		    }
		
	}

