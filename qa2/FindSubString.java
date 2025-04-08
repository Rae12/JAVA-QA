package qa2;

public class FindSubString {

	public static void main(String[] args) {
		
		// 2). Find all the sub-string of given string
		
		String name = "Selenium And Java Interview Question";
		System.out.println(name.contains("Java")); //true
		System.out.println(name.contains("java")); //false
		System.out.println(name.contains("Interview"));	//true
		System.out.println(name.contains("questions"));	//false
	}

}
