package qa;

public class SwapNumbers2 {

	public static void main(String[] args) {
		
	// 7). Write program to swap two numbers without using a third variable.
		
		int x = 10 , y = 5;
		x = x + y;
		y = x - y;
		x = x -y;
		System.out.println("After swapping: x = " + x + ", y = " + y);
	}

}
