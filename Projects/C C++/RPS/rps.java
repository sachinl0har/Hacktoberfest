package RPS;

import java.util.*;
import java.lang.Math;

class rpsGame {
    static void play(){
        Scanner play = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        int alpha, player, d = 0;
        while(d == 0){
            System.out.println("\n1. ROCK \n2. PAPER \n3. SCISSORS \n4. End Game \nEnter Your Choice: \n");
            player = play.nextInt();
            if(player == 1 || player == 2 || player == 3 || player == 4){
                alpha = (int)(Math.random() * (4 - 1 + 1) + 1);
                if(alpha == 1 && player == 1){
                    System.out.println("\nALPHA: Rock\nYou: Rock\nTIE\n");
                }else if(alpha == 2 && player == 2){
                    System.out.println("\nALPHA: Paper\nYou: Paper\nTIE\n");
                }else if(alpha == 3 && player == 3){
                    System.out.println("\nALPHA: Scissors\nYou: Scissors\nTIE\n");
                }else if(alpha == 2 && player == 1){
                    System.out.println("\nALPHA: Paper\nYou: Rock\nALPHA WON!!\n");
                }else if(alpha == 3 && player == 2){
                    System.out.println("\nALPHA: Scissors\nYou: Paper\nALPHA WON!!\n");
                }else if(alpha == 1 && player == 3){
                    System.out.println("\nALPHA: Rock\nYou: Scissors\nALPHA WON!!\n");
                }else if(alpha == 2 && player == 3){
                    System.out.println("\nALPHA: Paper\nYou: Scissors\nYOU WON!!\n");
                }else if(alpha == 3 && player == 1){
                    System.out.println("\nALPHA: Scissors\nYou: Rock\nYOU WON!!\n");
                }else if(alpha == 1 && player == 2){
                    System.out.println("\nALPHA: Rock\nYou: Paper\nYOU WON!!\n");
                }else if(player == 4){
                    d = 1;
                    exit();
                }
            }else{
                System.out.println("\nInvalid Input!!\n");
            }
        }
    }

    static void how(){
        System.out.print("\033[H\033[2J");
        Scanner how = new Scanner(System.in);
        int enter;
        System.out.println("\n\nHow to Play\n\nWhen its time to play, you and ALPHA will each form one of the three objects either rock, paper or scissors. You will then name a winner based on which object you both played.\nFor instance, rock crushes scissors but is covered by paper, paper covers rock but is cut by scissors, and scissors is crushed by rock but cuts paper. The player who picks the stronger of the two objects is the winner.\n");
        System.out.print("\nPress any number to go back: \n");
        enter = how.nextInt();
        main1();
    }

    static void about(){
        System.out.print("\033[H\033[2J");
        Scanner how = new Scanner(System.in);
        int enter;
        System.out.println("\n\nAbout\n\nRock, Paper, Scissors (aka \"Ro-Sham-Bo\"; janken; \"Bato, Bato, Pick\"; and \"Scissors, Paper, Stone\") is a simple hand game with many names and variations. It is played around the world and is commonly used as a way of coming to decisions. In some cases is even played for sport.\nThis is a Basic Rock, Paper and Scissors Game Program in Java.\nGame Developed by sachinl0har.\n\n@copyrights All Rights Reserved\n");
        System.out.print("\nPress any number to go back: \n");
        enter = how.nextInt();
        main1();
    }

    static void exit(){
        System.out.print("\033[H\033[2J");
        System.out.println("\n\nThanks For Playing\n\n");
        System.exit(0);
    }

    static void main1(){
        Scanner main = new Scanner(System.in);
        int x;
        System.out.print("\033[H\033[2J");
        System.out.println("\n1. Play Game \n2. How To Play? \n3. About \n4. Exit \nEnter Your Choice: \n");
        x = main.nextInt();
        switch(x){
            case 1:
            play();
            break;
            case 2:
            how();
            break;
            case 3:
            about();
            break;
            case 4:
            exit();
            break;
        }
    }
    public static void main(String[] args){
        main1();
    }
}
