import java.util.*;
public class Reverse {
	public static void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number;
		number = sc.nextInt();
		int reverse = 0;
		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		System.out.println("reversed number = " + reverse);
	}
	public static void main(String[] args) {
		reverse();	
	}
}