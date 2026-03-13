   b import pack.*;
import pack.subpack.*;
public class Use extends C {
	public static void main(String[] args) {
		A a1 = new A();
		a1.hello();
		B b1 = new B();
		b1.greet();
		Use c1 = new Use();
		c1.hi();
	}
}