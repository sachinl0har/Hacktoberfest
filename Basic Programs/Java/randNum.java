import java.util.*;

public class randNum {
    public static void main(String args[]) {
        int min, max;
        Scanner randNum = new Scanner(System.in);
        System.out.print("Enter the min number: ");
        min = randNum.nextInt();
        System.out.print("Enter the max number: ");
        max = randNum.nextInt();
        System.out.println("Random value of type double between " + min + " to " + max + ": ");
        double a = Math.random() * (max - min + 1) + min;
        System.out.println(a);
        System.out.println("Random value of type int between " + min + " to " + max + ": ");
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(b);
    }
}
