import java.util.Scanner;

class jpe_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease enter a number: \n");
        int x = sc.nextInt();

        if ((int) Math.sqrt(x) * (int) Math.sqrt(x) == 0) {
            System.out.println("\nIt is a perfect square number\n");
        }
        
        else if ((int) Math.cbrt(x) * (int) Math.cbrt(x) == 0) {
            System.out.println("\nIt is a perfect cube number\n");
        }

        else {
            System.out.println("\nIt's neither a perfect square number nor a perfect cube number\n");
        }

        sc.close();
        
    }
}