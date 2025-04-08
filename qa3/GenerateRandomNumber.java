package qa3;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		int rl = rand.nextInt(1000);
		System.out.println("Random numbers: " + rl);

	}

}
