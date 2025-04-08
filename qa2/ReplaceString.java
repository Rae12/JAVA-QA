package qa2;

public class ReplaceString {

	public static void main(String[] args) {
		// 11). Replace String with another Sting
		
		String orginalString = "Java for dummies";
		String newString = orginalString.replace("dummies", "experts");
		System.out.println("Original String is: " + orginalString);
		System.out.println("New String is: " + newString);

	}

}
