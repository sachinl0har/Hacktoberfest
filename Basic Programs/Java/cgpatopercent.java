import java.util.Scanner;

class cgpatopercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your CGPA : \n");
        double x = scanner.nextDouble();

        double ans = x * 9.5;

        System.out.println("\nAnswer: " + ans+"\n");

        scanner.close();

    }
}