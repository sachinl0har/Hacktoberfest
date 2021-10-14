import java.util.Scanner;

public class jpe_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first angle ");
        int a = scan.nextInt();

        System.out.println("Please enter the second angle ");
        int b = scan.nextInt();

        System.out.println("Please enter the third angle ");
        int c = scan.nextInt();

        System.out.println("Please enter the fourth angle ");
        int d = scan.nextInt();

        int sum = a + b + c + d;

        if (sum == 360) {
            System.out.println("Its a valid angle");
        }

        else {
            System.out.println("It's not a valid angle");
        }

        scan.close();
    }
}
