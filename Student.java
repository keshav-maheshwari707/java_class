import java.util.Scanner;
class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		float marks;
		char grade;
		boolean isPass;
		long phone;
		double db;
		short st;
		System.out.println("enter name : ");
		name = sc.nextLine();
		System.out.println("enter age : ");
		age = sc.nextInt();
		System.out.println("enter marks: ");
		marks = sc.nextFloat();
		System.out.println("enter grade : ");
		grade = sc.next().charAt(0);
		System.out.println("enter passing status : ");
		isPass = sc.nextBoolean();
		System.out.println("enter phone number : ");
		phone = sc.nextLong();
		System.out.println("enter double value : ");
		db = sc.nextDouble();
		System.out.println("enter short value : ");
		st = sc.nextShort();
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
		System.out.println(grade);
		System.out.println(isPass);
		System.out.println(phone);
		System.out.println(db);
		System.out.println(st);
		// System.out.println("your name is " + name + " and your age is " + age);
	}
}