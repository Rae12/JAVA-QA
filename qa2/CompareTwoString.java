package qa2;

import java.util.Scanner;

public class CompareTwoString {

	public static void main(String[] args) {
		// 8). Compare Two Strings
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String first = sc.next();
		System.out.println("Enter second String: ");
		String second = sc.next();
		second = sc.next();
		compare(first,second);
	}
	public static void compare(String s1, String s2) {
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}
}
