package qa2;

public class StringReplace {

	public static void main(String[] args) {
		// 18). Replace a String
		String s1 = "Interview Questions In Java";
		String s2 = "Answers";
		String s3 = s1.replace("Questions", "Answers");
		System.out.println("Orginal String: " + s1);
		System.out.println("New String: " + s3);
	}

}
