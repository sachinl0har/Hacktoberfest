import java.util.Scanner;

public class kgstopounds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\nPlease enter your weight: \n");
        double kgs = s.nextDouble();

        double pounds = kgs * 2.205;

        System.out.println("\n" + kgs + " kgs is equal to " + pounds + "\n");

        s.close();
    }
}
