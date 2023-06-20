package Stringoperators;

public class Operators {

	public static void main(String[] args) {
		String s="hello";
		String s1="          welcome";
		String s2="Hello welcome";
		// 1.concatination
		System.out.println(s.concat(s1));
		System.out.println(1+2+s+4+5);
		// 2.Equals
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		// 3.Contains
		System.out.println(s.contains("hello"));
		// 4.touppercase and tolowercase
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		// 5.trim
		System.out.println(s1.trim());
		// 6.length
		System.out.println(s.length());
		// 7.startswith
		System.out.println(s2.startsWith("Hello"));
		// 8.endswidth
		System.out.println(s2.endsWith("welcome"));
		// 9.substring
		System.out.println(s2.substring(2,4));
		// 10.charat
		System.out.println(s.charAt(2));
		// 11.split
		String[] sr=s2.split(" ");
		for(String v:sr)
		{ 
			System.out.println(v);
		}

	}

}
