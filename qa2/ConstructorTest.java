package qa2;

// 22). Demo Creating Constructor

class ConstructorTest { ConstructorTest() {
	System.out.println("Constructor Called");
}

}
class Main{
	public static void main(String[] args) {
		ConstructorTest test = new ConstructorTest();
	}
}