package pkg;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic operators
		int a=20,b=30;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//Assignment operators
		int c=30,d=20;
		System.out.println("c+=d="+(c+=d));
		System.out.println("c-=d="+(c-=d));
		System.out.println("c*=d="+(c*=d));
		System.out.println("c/=d="+(c/=d));
		
		//Relational operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		//Logical operators
		String username="abc";
		String paswrd="123";
		System.out.println("logical opperators");
		System.out.println(username=="abc"&&paswrd=="123"); //true
		System.out.println(username=="abc"||paswrd=="1234"); //true
		System.out.println(!(username=="abc")); //false
		
		//Unary operators
		int d1=2;
		System.out.println(d1++);
		System.out.println(d1);
		System.out.println(d1--);
		System.out.println(d1);
		
		
		

	}

}
