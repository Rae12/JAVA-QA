package qa2;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		// 7). Transpose Matrix
		
		//Creating Matrix
		int orginal[][] = {{1,3,4,},{2,3,4},{3,4,5}};
		
		//Creating another matrix to store transpose of a matrix
		int transpose[][] = new int[3][3]; //3 rows & 3 columns
		
		//Code to transpose a matrix
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				transpose[i][j] = orginal[j][i];
			}
		}
		System.out.println("Printing Matrix without transpose: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(orginal[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Printing Matrix After Transpose: ");
		for(int i = 0; i<3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(transpose[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
