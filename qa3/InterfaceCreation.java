package qa3;

interface A {
	final int a = 10;
	void display();
}

// A class that implements the interface

class TestClass implements A
{
	public void display()
	{
		System.out.println("this is an interface");
	}
	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
	}
}