import java.util.Scanner;


public class jpe_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a character");
        char x = sc.next().charAt(0);

        if (x >= '0' && x <= '9') {
            System.out.println("It's a number");
        }
        
        else {
            System.out.println("It's not a number");
        }

        sc.close();

    }
}
