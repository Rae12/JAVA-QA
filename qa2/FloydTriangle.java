package qa2;

import java.util.Scanner;

//JAVA QA Pt. 2

public class FloydTriangle {

	public static void main(String[] args) {
		// 1). Print Floyd's Triangle
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		printFloydTriangle(rows);

	}
	public static void printFloydTriangle(int n) {
		int number = 1; 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.println(number + " ");
			}
			System.out.println();
		}
	}
}
