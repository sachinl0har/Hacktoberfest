import java.util.Scanner;

public class percenttocgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease enter your percentage : \n");
        double x = sc.nextDouble();

        double ans = x / 9.5;

        System.out.println("\nAnswer : " + ans + "\n");

        sc.close();
    }
}