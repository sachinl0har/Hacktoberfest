#include <iostream>
#include <time.h>

using namespace std;

void play();
void how();
void about();
void self_exit();
int main();

void play(){
    system("cls");
    system("coloa 0A");
    int alpha, player, d = 0;
    while(d == 0){
        cout << "\n1. ROCK \n2. PAPER \n3. SCISSORS \n4. End Game \nEnter Your Choice: \n";
        cin >> player;
        if(player == 1 || player == 2 || player == 3 || player == 4){
            srand(time(NULL));
            alpha = rand() % 3 + 1;
            if(alpha == 1 && player == 1){
            cout <<"\nALPHA: Rock\nYou: Rock\nTIE\n";
        }else if(player == 2 && alpha == 2){
            cout <<"\nALPHA: Paper\nYou: Paper\nTIE\n";
        }else if(player == 3 && alpha == 3){
            cout <<"\nALPHA: Scissors\nYou: Scissors\nTIE\n";
        }else if(player == 1 && alpha == 2){
            cout <<"\nALPHA: Paper\nYou: Rock\nALPHA WON!!\n";
        }else if(player == 2 && alpha == 3){
            cout <<"\nALPHA: Scissors\nYou: Paper\nALPHA WON!!\n";
        }else if(player == 3 && alpha == 1){
            cout <<"\nALPHA: Rock\nYou: Scissors\nALPHA WON!!\n";
        }else if(alpha == 2 && player == 3){
            cout <<"\nALPHA: Paper\nYou: Scissors\nYOU WON!!\n";
        }else if(alpha == 3 && player == 1){
            cout <<"\nALPHA: Scissors\nYou: Rock\nYOU WON!!\n";
        }else if(player == 2 && alpha == 1){
            cout <<"\nALPHA: Rock\nYou: Paper\nYOU WON!!\n";
        }else if(player == 4){
            d = 1;
            self_exit();
        }
        }else{
            cout << "\nInvalid Input!!\n";
        }
    }
}

void how(){
    system("cls");
    system("color 0A");
    int enter;
    cout << "\n\nHow to Play\n\nWhen its time to play, you and ALPHA will each form one of the three objects either rock, paper or scissors. You will then name a winner based on which object you both played.\nFor instance, rock crushes scissors but is covered by paper, paper covers rock but is cut by scissors, and scissors is crushed by rock but cuts paper. The player who picks the stronger of the two objects is the winner.\n";
    cout << "\nPress any number to go back: \n";
    cin >> enter;
    main();
}

void about(){
    system("cls");
    system("color 0A");
    int enter;
    cout <<"\n\nAbout\n\nRock, Paper, Scissors (aka \"Ro-Sham-Bo\"; janken; \"Bato, Bato, Pick\"; and \"Scissors, Paper, Stone\") is a simple hand game with many names and variations. It is played around the world and is commonly used as a way of coming to decisions. In some cases is even played for sport.\nThis is a Basic Rock, Paper and Scissors Game Program in C++ Language.\nGame Developed by sachinl0har.\n\n@copyrights All Rights Reserved\n";
    cout <<"\nPress any number to go back: \n";
    cin >> enter;
    main();
}

void self_exit()
{
    system("cls");
    cout <<"\n\nThanks For Playing\n\n";
    exit(1);
}

int main(){
    int x;
    system("cls");
    system("color 0A");
    cout << "\n1. Play Game \n2. How To PLay? \n3. About \n4. Exit \nEnter Your Choice: \n";
    cin >> x;
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
            self_exit();
            break;
    }
}