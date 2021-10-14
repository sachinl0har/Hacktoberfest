// Write a Java Program which reads the user’s input in integer value and detects whether that 
// number is between 0 – 25 or 25 – 50 or 50 – 75 or 75 – 100.

import java.util.Scanner;

public class jpe_7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPlease enter a number \n");
        int x = scan.nextInt();

        if (x == 0) {
            System.out.println("Number is equal to 0");            
        }

        else if (x > 0 && x < 25) {
            System.out.println("Number is between 1 and 25\n");
        }

        else if (x == 25) {
            System.out.println("Number is equal to 25"); 
        }
        
        else if (x > 25 && x < 50) {
            System.out.println("Number is between 25 and 50\n");
        }

        else if (x == 51) {
            System.out.println("Number is equal to 51"); 
        }

        else if (x > 51 && x < 75) {
            System.out.println("Number is between 51 and 75\n");
        }

        else if (x == 76) {
            System.out.println("Number is equal to 76");
        }

        else if (x > 76 && x < 100) {
            System.out.println("Number is between 76 and 100\n");
        }

        else if (x == 100) {
            System.out.println("Number is equal to 100");
        }

        else {
            System.out.println("Number is greater than 100");
        }

        scan.close();

    }
}
