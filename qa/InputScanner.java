package qa;

import java.util.Scanner;

public class InputScanner {
	public static void main(String[] args) {
		
		// 4).Write a program to print input from scanner.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input:");
		String name = sc.nextLine();
		System.out.println("Name: " + name);

	}

}
