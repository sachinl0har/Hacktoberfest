import java.util.Scanner;

public class jpe_1 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int i = sc.nextInt();

        if (i >= 0) {
            System.out.println("It's a positive number!");
        }

        else {
            System.out.println("It's a negative number!");
        }

        sc.close();
}    
}
