package qa;

public class LargestNumberArray {

	// 9). Write program to find the largest number?
	static int array[]= { 21, 98,13,9,34 };
	
	public static void main(String[] args) {
		int maxNumber = findLargestNumber();
		System.out.println("Maximum number in the array:" + maxNumber);;
	}
	
	private static int findLargestNumber() {
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				
			}
		}
		return max;
	}
}
