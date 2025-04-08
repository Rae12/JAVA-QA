package qa;

public class FindHighestMarks {

	public static void main(String[] args) {
		// 22). Demo a For Each Loop
		
		int[] marks = { 125, 132, 95, 116, 110};
		int highest_marks = maximum(marks); 
		System.out.println("The highest score is: " + highest_marks);

	}
	public static int maximum(int[] numbers) {
		int max = numbers[0];
		//for each loop
		for(int num : numbers) {
			if(num > max) {
				
			}
		}
		return max;
	}
}
