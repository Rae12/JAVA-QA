package qa;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		// 6). Write a program to swap two numbers.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before swapping: x = " + x + ", y = " + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping: x = " + x + ", y = " + y);
	}

}
