package qa;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// 14). Compare Two Strings
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String first = sc.next(); 
		System.out.println("Enter second string: ");
		String second = sc.next();
		compare(first,second);

	}
	
	public static void compare(String s1, String s2) {
		if(s1.compareTo(s2)==0) {
			System.out.println("String are equal");
		} else {
			System.out.println("String are not equal");
		}
	}

}
