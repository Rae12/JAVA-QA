package qa2;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		// 13). Remove Spaces before & after the given string
		
		String s1 = "Interview Questions fo Java";
		String newString = s1.replaceAll("\\s" , "");
		System.out.println("Old String: " + s1);
		System.out.println("New String: " + newString);

	}

}
