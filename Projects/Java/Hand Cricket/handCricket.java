package HandCricket;

import java.util.*;

class cricket{

    static int player, player1, comp, comp1, score, score1;

    static void toss(){
        Random tosss = new Random();
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in); 
        int toss = tosss.nextInt(2);
        int a;
        System.out.print("Heads or Tails Choose 0 for Heads and 1 for Tails: \n");
        a = sc.nextInt();
        if(a == 0 || a == 1){
            if(toss == a){
                if(toss == 1){
                    System.out.println("You Won Its a Tail \n");
                    choice();
                }else{
                    System.out.println("You Won Its a Head\n");
                    choice();
                }
            }else{
                if(toss == 1){
                    System.out.println("You Lose Its a Head\nALPHA Choose to bat First\n");
                    bowl();
                    bat();
                    winLose();
                }else{
                    System.out.println("You Lose Its a Tail\nALPHA Choose to bat First\n");
                    bowl();
                    bat();
                    winLose();
                }
            }
        }
    }

    static void choice(){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\n1. Bat\n2. Bowl\nchoose Your Side: \n");
        choice = sc.nextInt();
        switch(choice){
            case 1:
            bat();
            bowl();
            winLose();
            break;
            case 2:
            bowl();
            bat();
            winLose();
            break;
        }
    }

    static void bat(){
        int b = 0;
        Scanner sc = new Scanner(System.in);
        Random bat = new Random();
        System.out.println("\n\t...Game Begins You Batting...\t\n");
        while(b == 0){
            System.out.println("\nEnter Your Choice: \n");
        player = sc.nextInt();
        if(player <= 6){
            comp = bat.nextInt(6);
            System.out.println("\nPlayer: " + player + "\nComp: " + comp);
            if(comp != player){
                score = score + player;
                System.out.println("\nTotal: " + score);
            }else{
                b = 1;
                System.out.println("\nTotal: " + score);
                System.out.println("\n\nOUT!!\n\n");
            }
        }else{
            System.out.println("\nInvalid Input\n");
        }
        }
    }

    static void bowl(){
        int b = 0;
        Scanner sc = new Scanner(System.in);
        Random bowl = new Random();
        System.out.println("\n\t...Game Begins You Batting...\t\n");
        while(b == 0){
            System.out.println("\nEnter Your Choice: \n");
        player1 = sc.nextInt();
        if(player1 <= 6){
            comp1 = bowl.nextInt(6);
            System.out.println("\nPlayer: " + player1 + "\nComp: " + comp1);
            if(comp1 != player1){
                score1 = score1 + player1;
                System.out.println("\nTotal: " + score1);
            }else{
                b = 1;
                System.out.println("\nTotal: " + score1);
                System.out.println("\n\nOUT!!\n\n");
            }
        }else{
            System.out.println("\nInvalid Input\n");
        }
        }
    }

    static void winLose(){
        if(score > score1){
            System.out.println("\nYOU WON!!\n");
        }else if(score < score1){
            System.out.println("\nYOU LOSE!!\n");
        }else{
            System.out.println("\nMatch Tie\n");
        }
    }

    static void how(){
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        int enter;
        System.out.println("\n\nHow to Play\n\nFirst You need to do toss, if you won the toss you will get the chance to choose bat or bowl, or if you lose the tose then Alpha will choose bat and you will get bowl,if your number and ALpha number is same then batsman is Out, if number is not equal then that will be added as your score, and at the end it will compare your score and ALpha's Score and tell you the winner.\n");
        System.out.println("\nPress any number to go back: \n");
        enter = sc.nextInt();
        main();
    }

    static void about(){
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        int enter;
        System.out.println("\n\nAbout\n\nHand Cricket Game using Java Language.\nGame Developed by viplovsurv3 and sachinl0har.\n\n@copyrights All Rights Reserved\n");
        System.out.println("\nPress any number to go back: \n");
        enter = sc.nextInt();
        main();
    }

    static void self_exit(){
        System.out.print("\033[H\033[2J");
        System.out.println("\n\nThanks For Playing\n\n");
        System.exit(0);
    }

    static void main(){
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("1. Play Game \n2. How To Play? \n3. About \n4. Exit \nEnter Your Choice: \n");
        x = sc.nextInt();
        switch(x){
            case 1:
            toss();
            break;
            case 2:
            how();
            break;
            case 3:
            about();
            break;
            case 4:
            self_exit();
            break;
        }
    }

    public static void main(String[] args){
        main();
    }
}
