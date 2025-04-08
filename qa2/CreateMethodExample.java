package qa2;

import java.util.Scanner;

public class CreateMethodExample {

	public static void main(String[] args) {
		// 15). Demo Creating a Method
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		reverseNumber(num);

	}
	public static void reverseNumber(int number) {
		int reverse = 0;
		while(number !=0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number /10;
		}
		System.out.println("Reversed number: " + reverse);
	}
}
