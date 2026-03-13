class Aa {
	Aa() {
		System.out.println("constructor of class Aa is called");
	}
}

class Bb extends Aa {
	Bb() {
		System.out.println("constructor of class Bb is called");
	}
}

public class Main {
	public static void main(String[] args) {
		Bb b1 = new Bb();
	}
}