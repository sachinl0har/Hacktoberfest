import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("\nPlease enter your height in metres : \n");
        double h = s.nextDouble();

        System.out.println("\nPlease enter your weight in pounds : \n");
        double w = s.nextDouble();

        double bmi = w / h*h;

        if (bmi < 18.5) {
            System.out.println("\nYou're under weight\n\nYour BMI : " + bmi);
        }
        
        else if (bmi == 18.5 || bmi < 24 / 9) {
            System.out.println("\nYou have a normal weight\n\nYour BMI : " + bmi);
        }
        
        else if (bmi == 25 || bmi < 29.9) {
            System.out.println("\nYou're overweight\n\nYour BMI : " + bmi);
        }

        else {
            System.out.println("\nYou're obese :/");
        }

        System.out.println(bmi);

        s.close();
    }
}