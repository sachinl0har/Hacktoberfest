import java.util.*;

public class armstrong {
    public static void main(String[] args){
        int c = 0, a, temp, n;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number to be checked: ");
        n = num.nextInt();
        temp = n;
        while(n > 0){
            a = n % 10;
            n = n/10;
            c = c+(a*a*a);
        }
        if(temp == c){
            System.out.println(temp+" is an Armstrong Number.");
        }else{
            System.out.println(temp+" is not an Armstrong Number.");
        }
    }
}
