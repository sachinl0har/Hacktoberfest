import java.util.Scanner;

public class jpe_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int x = s.nextInt();

        System.out.println("Please enter the second number: ");
        int y = s.nextInt();

        System.out.println("Please enter the third number: ");
        int z = s.nextInt();

        if (x == y && y == z) {
            System.out.println("It's an equilateral triangle");
        }
        
        else if (x == y && y != z || x != y && y == z) {
            System.out.println("It's an isosceles triangle");
        }

        else {
            System.out.println("It's a scalene triangle");
        }

        s.close();
    }
}