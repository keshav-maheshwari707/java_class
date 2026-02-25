import java.lang.*;
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age;
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible for voting");
        } else {
            System.out.println("you are not eligible for voting");
        }
        System.out.print("enter two numbers : ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("enter any operation : ");
        char ch;
        ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("invalid");
        }
        int arr[] = {4, 5, 2, 6, 7, 8};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}