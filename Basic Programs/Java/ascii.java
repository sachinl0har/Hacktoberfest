import java.util.*;

public class ascii {
    public static void main(String[] args){
        char ch;
        Scanner ascii = new Scanner(System.in);
        System.out.print("Enter a Char to convert in ASCII: ");
        ch = ascii.next().charAt(0);
        int asciiVal = ch;
        System.out.println("The ASCII value of "
        +ch+" is:"+asciiVal);
    }
}
