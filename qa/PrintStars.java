package qa;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		
		// 16). Print Stars using For Loop, sum should = to the row number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		printStars(rows);
	}
	public static void printStars(int n) {
		for(int i = 0; i < n; i++) {
			for (int j = 0; j<= i; j ++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
