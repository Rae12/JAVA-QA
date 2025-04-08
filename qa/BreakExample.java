package qa;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		
		// 19). Break Loop Statement
		
		Double number, sum = 0.0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a number: ");
			number = input.nextDouble();
			if(number < 0.0) {
				break;
			}
			sum += number;
		}
		System.out.println("Sum = " + sum);
	}

}
