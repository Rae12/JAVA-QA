package qa;

import java.util.Scanner;

public class ConvertToCelsius {

	public static void main(String[] args) {
		
		// 5). Write program to convert Fahrenheit to Celsius
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input temperature in Fahrenheit:");
	
		double fahrenheit = sc.nextDouble();
		double celsius = ((5 *(fahrenheit - 32.0)) / 9.0);
		
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius);
	
	
	
	}

}
