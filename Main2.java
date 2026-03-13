class Aa1 {
	Aa1(int a, int b) {
		System.out.println(a+b);
		// System.out.println("constructor of class Aa is called");
	}
}

class Bb1 extends Aa1 {
	Bb1(int a1, int b1) {
		super(a1, b1);
		//System.out.println("constructor of class Bb is called");
	}
}

public class Main2 {
	public static void main(String[] args) {
		Bb1 b2 = new Bb1(100, 20);
	}
}