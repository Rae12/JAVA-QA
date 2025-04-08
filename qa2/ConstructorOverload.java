package qa2;

// 23). Constructor Overloading

class ConstructorOverload {
	double width, height, depth;
	int load1;
	ConstructorOverload(double w, double h, double d, int num){
		width = w;
		height = h;
		depth =d;
		load1 = num;
	}
	ConstructorOverload(){
		width = height = depth = 0;
	}
	ConstructorOverload(int num)
	{
		this();
		load1 = num;
	}
	public static void main(String[] args) {
		ConstructorOverload x = new ConstructorOverload(1);
		System.out.println(x.width);
	}
}
