import java.util.Scanner;

public class jpe_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Please print the first number : \n");
        a = sc.nextInt();

        System.out.println("Please print the second number : \n");
        b = sc.nextInt();

        System.out.println("Please print the third number : \n");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Answer : " + a + " is the greatest number");
        }

        else if (b > a && b > c) {
            System.out.println("Answer : " + b + " is the greatest number");
        }

        else if (c > a && c > b) {
            System.out.println("Answer : " + c + " is the greatest number");
        }

        else {
            System.out.println("All the numbers are equal");
        }

        sc.close();
    }
}
