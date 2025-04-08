package qa2;

import java.util.Scanner;

public class PalindromeNunmber {

	public static void main(String[] args) {
		
		// 4). Check whether given number is palindrome
		int r , sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		temp = n;
		while(n > 0) {
			r = n % 10;
			sum = (sum*10) + r;
			n = n / 10;
		}
		if (temp ==sum) {
			System.out.println("Number is palindrome");
	} 
		else 
		System.out.println("Number is not palindrome");
	}
}
	
	