package qa;

import java.util.Scanner;

public class AddTwoNumbers {

	// 8). Write program to add two numbers.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum of two numbers is:" + (a + b));
	}

}
