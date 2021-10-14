import java.util.Scanner;

class InputProg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String firstname = input.next();

        System.out.print("Enter your Last Name: ");
        String lastname = input.next();

        System.out.println("Your Full Name is "+firstname+" "+lastname);
    }
}
