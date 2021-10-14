import java.util.Scanner;

class multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 12; i++) {

            System.out.println(n + " x " + i + " = " + n * i);

            sc.close();

        }
    }
}