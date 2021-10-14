import java.util.Scanner;

public class jpe_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please print a number");
        int i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println("Answer : " + i + " is an even number!");
        }

        else {
            System.out.println("Answer : " + i + " is an odd number!");
        }

        sc.close();

    }
}
