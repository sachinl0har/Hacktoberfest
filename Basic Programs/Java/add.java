import java.util.*;

public class add {
    public static void main(String[] args){
        int a, b, c;
        Scanner add = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = add.nextInt();
        System.out.print("Enter second number: ");
        b = add.nextInt();
        c = a + b;
        System.out.println("Total= "+c);
    }
}
