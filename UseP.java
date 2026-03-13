class Employee {
	public void calSalary(int mySalary) {
		System.out.println("my annual salary is " + mySalary*12);
	}
}

class PEmployee extends Employee {
	int hra = 5000;
	public void calSalary(int mySalary) {  // method overriding.
		System.out.println(mySalary + hra);
	}
}

public class UseP {
	public static void main(String[] args) {
		PEmployee p = new PEmployee();
		p.calSalary(100000);
	}
}