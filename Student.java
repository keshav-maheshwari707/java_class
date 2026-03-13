public class Student {
	int rollNo = 1;
	String name = "Keshav";
	String course = "mca";
	int marks = 89;
	public Student() {
		System.out.println("default constructor is called");
	}
	public Student(int a, String b, String c, int d) {
		rollNo = a;
		name = b;
		course = c;
		marks = d;
	}
	public Student(String c) {
		course = c;
		System.out.println("with one parameter");
	}
	public void print() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(course);
		System.out.println(marks);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(7, "Khushi", "mca", 87);
		Student s3 = new Student("mbbs");
		s1.print();
		s2.print();
		s3.print();
	}
}