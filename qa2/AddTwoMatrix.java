package qa2;

public class AddTwoMatrix {

	public static void main(String[] args) {
		
		// 5). Add two Matrix
		
		//Create two matrices
		int a[][] = {{1, 3, 4} , {2, 4, 3} , {3, 4, 5}};
		int b[][] = {{1, 3, 4} , {2, 4, 3} , {1, 2, 4}};
		
		//Creating another matrix to store the num of two matrices
		int c[][] = new int [3][3];
		
		//adding & printing addition of 2 matrices
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j]; System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
