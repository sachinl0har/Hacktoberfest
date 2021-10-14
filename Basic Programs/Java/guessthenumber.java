import java.util.Random;

import java.util.Scanner;

class guessthenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        Random obj = new Random();

        n = obj.nextInt(20);

        System.out.println("The Number is between 0 and 20");

        System.out.println("Your Input :\n");
        int ans = sc.nextInt();

        if (ans > 20) {
            System.out.println("\nYour answer should be between 0 and 20\n");
        }

        else if (ans == n) {
            System.out.println("Your answer is correct!");
        }

        while(ans != n) {
            System.out.println("\nYour Answer is wrong, So would you like to get a hint ? (1 - yes/ 2 - no)\n");
            int hint = sc.nextInt();

            if (hint > 2) {
                System.out.println(
                        "\n* To get a hint when your answer is wrong - 1\n\n* To end the game when your answer wrong - 2\n\nPlease try again and from now on use the numbers on the right of their functions when your answer is wrong!!\n");
            }

            if (hint == 1) {
                if (n % 2 == 0) {
                    System.out.println("\nThe Number is an even number and is divisible by 2\n");
                    System.out.println("Your last input : \n");
                    ans = sc.nextInt();

                    if (ans == n)
                        System.out.println("\nYour Answer is correct!!");

                    else
                        System.out.println("\nYour answer is wrong again!\n\nThe Answer was : " + n);
                }

                if (n % 2 != 0 && n % 3 == 0) {
                    System.out.println("\nThe Number is an odd number and can be divided by 3");
                    System.out.println("\nYour last input : \n");
                    ans = sc.nextInt();

                    if (ans == n)
                        System.out.println("\nYour Answer is correct!!");

                    else
                        System.out.println("\nYour answer is wrong again!\n\nThe Answer was : " + n + "\n");
                }

                if (n % 2 != 0 && n % 3 != 0) {
                    System.out.println("\nThe Number is an odd number and can't be divided by 3");
                    System.out.println("\nYour last input : \n");
                    ans = sc.nextInt();

                    if (ans == n)
                        System.out.println("\nYour Answer is correct!!");

                    else
                        System.out.println("\nYour answer is wrong again!\n\nThe Answer was : " + n);
                }
            }

            if (hint == 2) {
                System.out.println("\nOk, The game has been ended");
            }

            break;

        }

        sc.close();
    }
}