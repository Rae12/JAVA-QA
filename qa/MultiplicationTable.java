package qa;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 23). Print Multiplication Table
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		System.out.println("Enter multiplication range");
		int range = sc.nextInt();
		for(int i = 1; i <= range; i++) {
			System.out.printf("%d * %d = %d \n", number, i, number * i);
		}
		}

}
