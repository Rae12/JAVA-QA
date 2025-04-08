package qa2;

public class MultiplyTwoMatrix {

	public static void main(String[] args) {
		// 6). Multiply Two Matrices
		
		//Creating two Matrices
		int a[][] = {{1,1,1}, {2,2,2},{3,3,3}};
		int b[][] = {{1,1,1}, {2,2,2},{3,3,3}};
		
		//Creating another matrix to store the num of two matrices
		int c[][] = new int[3][3];
		
		//multiply & printing multiplication of 2 matrices
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] =0;
				for(int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
