package qa2;

public class SplitString {

	public static void main(String[] args) {
		// 12). Split the given String
		
		String strMain = "Java,C,Python,Perl";
		String[] arrSplit = strMain.split(",");
		for(int i = 0; i < arrSplit.length; i++)
			System.out.println(arrSplit[i]);

	}

}
