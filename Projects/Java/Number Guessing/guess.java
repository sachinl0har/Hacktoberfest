import java.util.*;
import java.lang.Math;

class numGuess {
    public static void main(String[] args){
        Scanner numGuess = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        int num, guess, myNum, tries;
        int MAXTRY = 5;
        num = (int)(Math.random() * (10 - 1 + 1) + 1);
        System.out.println("Guess My Number Game\n\n");
        guess = 0;
        tries = 0;
        do{
            if(tries == 5){
                System.out.println("Last Chance! Think Hard.\n");
            }
            System.out.println("Enter Your Guess: \n");
            myNum = numGuess.nextInt();
            tries++;
            if(myNum > num){
                System.out.println("Too High\n\n");
            }else if(myNum < num){
                System.out.println("Too Low!\n\n");
            }else{
                System.out.println("\nCorrect! You Got it in " + tries + " Guesses!\n");
            }
        }while((guess == 0) && (tries <= MAXTRY));
    }
}
