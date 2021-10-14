import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Addition - 1");
        System.out.println("Subtraction - 2");
        System.out.println("Multiplication - 3");
        System.out.println("Division - 4");
        System.out.println("Cube of a number - 5");
        System.out.println("Cube root of a number - 6");
        System.out.println("Perfect cube number or not - 7");
        System.out.println("Square of a number - 8");
        System.out.println("Square root of a number - 9");
        System.out.println("Perfect square number or not - 10\n\n");

        System.out.println("Your input : \n");
        int x = scan.nextInt();

        if (x > 10) {
            System.out.println("Error!! Please try again!");
        }



        while (x == 1) {

            System.out.println("\nYou selected: Addition - 1");

            System.out.println("\nInput first number : \n");
            int n1 = scan.nextInt();

            System.out.println("\nInput second number : \n");
            int n2 = scan.nextInt();

            int ans = n1 + n2;

            System.out.println("\nAnswer : " + ans);

            break;
        }



        while (x == 2) {

            System.out.println("\nYou selected: Subtraction - 2");

            System.out.println("\nInput first number : \n");
            int n1 = scan.nextInt();

            System.out.println("\nInput second number : \n");
            int n2 = scan.nextInt();

            int ans = n1 - n2;

            System.out.println("\nAnswer : " + ans);

            break;
        }



        while (x == 3) {

            System.out.println("\nYou selected: Multiplication - 3");

            System.out.println("\nInput first number : \n");
            int n1 = scan.nextInt();

            System.out.println("\nInput second number : \n");
            int n2 = scan.nextInt();

            int ans = n1 * n2;

            System.out.println("\nAnswer : " + ans);

            break;
        }



        while (x == 4) {

            System.out.println("\nYou selected: Division - 4");

            System.out.println("\nInput the number to be divided : \n");
            int n1 = scan.nextInt();

            System.out.println("\nInput the number which should be dividing " + n1 + " : \n");
            int n2 = scan.nextInt();

            int ans = n1 / n2;

            System.out.println("\nAnswer : " + ans);

            break;
        }




        while (x == 5) {

            System.out.println("\nYou selected: Cube of a number - 5");

            System.out.println("\nInput the number : \n");
            int n1 = scan.nextInt();

            int cube = n1 * n1 * n1;

            System.out.println("\nAnswer : " + cube);

            break;
        }




        while (x == 6) {

            System.out.println("\nYou selected: Cube root of a number - 6");

            System.out.println("\nInput the number : \n");
            double n1 = scan.nextInt();

            double ans = Math.cbrt(n1);
            System.out.println("\nAnswer : " + ans);
            break;
        }

        


        while (x == 7) {

            System.out.println("\nYou selecetd: Perfect cube number or not - 7");

            System.out.println("\nInput a number : \n");
            int n1 = scan.nextInt();

            if (Math.cbrt(n1) * Math.cbrt(n1) * Math.cbrt(n1) == n1) {
                System.out.println("Answer : " + n1 + " is a perfect cube number ");
            }

            else {
                System.out.println("Not a perect cube number!");
            }

            break;
        }




        while (x == 8) {

            System.out.println("\nYou selected: Square of a number - 8");

            System.out.println("\nInput a number : \n");
            int n1 = scan.nextInt();

            int ans = n1 * n1;

            System.out.println("\nAnswer : " + ans);

            break;
        }




        while (x == 9) {

            System.out.println("\nYou selected: Square root of a number - 9");

            System.out.println("\nInput first number : \n");
            double n1 = scan.nextInt();

            double ans = Math.sqrt(n1);

            System.out.println("\nAnswer : " + ans);

            break;
        }




        while (x == 10) {

            System.out.println("\nYou selected: Perfect square number or not - 10.");

            System.out.println("\nPlease enter a number : \n");
            int n1 = scan.nextInt();

            if (Math.sqrt(n1) * Math.sqrt(n1) == n1) {
                System.out.println("Answer : " + n1 + " is a perfect square number");
            }

            else {
                System.out.println("Answer : "+n1+"is not a perfect square number!");
            }

            break;
        }

        scan.close();
    }
}