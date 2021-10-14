import java.util.*;

public class palindrome {
    public static void main(String args[]){
        int r, sum = 0, temp, n;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number to be checked: ");
        n = num.nextInt();

        temp = n;
        while(n > 0){
            r = n % 10; //getting remainder
            sum = (sum * 10) + r;
            n = n/10;
        }
        if(temp == sum){
            System.out.println(temp+" is a Palindrome Number.");
        }else{
            System.out.println(temp+" is not Palindrome.");
        }
    }
}
