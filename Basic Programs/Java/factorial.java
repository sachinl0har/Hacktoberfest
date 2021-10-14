import java.util.*;

public class factorial {
    public static void main(String args[]){
        int i, fact = 1, n;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        n = num.nextInt();
        for(i = 1; i <= n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
