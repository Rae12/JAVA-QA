package qa;

public class ContinueExample {

	public static void main(String[] args) {
		
		// 20). Continue Loop Statement
		
		int [] numbers = { 10, 20, 30, 40, 5};
		for(int x : numbers) {
			if(x ==30) {
				continue;
			}
			System.out.println(x);
			System.out.println("\n");
		}

}
}