package qa;

public class LoopDemo {

	public static void main(String[] args) {
		// 15). For Loop Demo
		String sentence = "Java Interview Questions";
		String reversedSentence = reversedSentence(sentence);
		System.out.println(reversedSentence);
	}
	
	public static String reversedSentence(String sentence) {
		String reverse = "";
		String[] words = sentence.split("\\s");
		for(int i = words.length-1; i >= 0; i--) {
			reverse = reverse + words[i] + " ";
		}
		return reverse;
	}
}
