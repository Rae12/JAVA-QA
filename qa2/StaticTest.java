package qa2;

// 19). Demo Static Block

class StaticTest {
	static int i;
	int j;

	//Start of static block
	static
	{
		i = 10;
		System.out.println("Static Block called");

	}
	//End of static block
class Main{
	public static void main(String args[]) {
		System.out.println(StaticTest.i);
	}
}
}
