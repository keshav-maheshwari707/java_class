import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter 1 for rectangle, 2 for square & 3 circle : ");
        int a;
        a = sc.nextInt();

        do {
            switch (a) {
                case 1:
                    System.out.println("enter length : ");
                    int length;
                    length = sc.nextInt();
                    System.out.println("enter breadth : ");
                    int breadth;
                    breadth = sc.nextInt();
                    System.out.println("area = " + length * breadth);
                    break;
                case 2:
                    System.out.println("enter side : ");
                    int side;
                    side = sc.nextInt();
                    System.out.println("area = " + side * side);
                    break;
                case 3:
                    System.out.println("enter radius : ");
                    int radius;
                    radius = sc.nextInt();
                    System.out.println("area = " + 3.14 * radius * radius);
                    break;
            }
        } while (condition);
    }
}