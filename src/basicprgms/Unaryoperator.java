package basicprgms;
import java.util.Scanner;

public class Unaryoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 12;
		 
        int result = +num;
        System.out.println(
            "The value of result after unary plus is: "
            + result);
 
        result = -num;
        System.out.println(
            "The value of result after unary minus is: "
            + result);
 
        result = ++num;
        System.out.println(
            "The value of result after pre-increment is: "
            + result);
 
        result = num++;
        System.out.println(
            "The value of result after post-increment is: "
            + result);
 
        result = --num;
        System.out.println(
            "The value of result after pre-decrement is: "
            + result);
 
        result = num--;
        System.out.println(
            "The value of result after post-decrement is: "
            + result);
    }
}

	

	


