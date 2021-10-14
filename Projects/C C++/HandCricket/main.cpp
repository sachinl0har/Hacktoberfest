#include <iostream>

using namespace std;

// Functions
void toss();
void choice();
void bat();
void bowl();
void winLose();
void how();
void about();
void self_exit();
int main();

int player, player1, alpha, alpha1, score, score1;

void toss()
{
    system("cls");
    system("color 0A");
    int toss = rand() % 2, a;
    cout << "Heads or Tails Choose 0 for Heads and 1 for Tails: \n";
    cin >> a;
    if (a == 0 || a == 1)
    {
        if (toss == a)
        {
            if (toss == 1)
            {
                cout << "You Won Its a Tail \n";
                choice();
            }
            else
            {
                cout << "You Won Its a Head";
                choice();
            }
        }
        else
        {
            if (toss == 1)
            {
                cout << "You lose Its a Head\nALPHA Choose To Bat First\n";
                bowl();
        bat();
        winLose();
            }
            else
            {
                cout << "You lose Its a Tail\nALPHA Choose To Bat First\n";
                bowl();
        bat();
        winLose();
            }
        }
    }
    else
    {
        cout << "Invalid Input\n";
    }
}

void choice()
{
    system("color 0A");
    int d;
    cout << "You Won The Toss: \n";
    cout << "1. Batting \n2. Bowling \nEnter Your Choice: \n";
    cin >> d;
    switch (d)
    {
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

void bat()
{
    system("color 0A");
    int k = 0;
    cout << "Game Begins Your Batting\n";
    while (k == 0)
    {
            cout << "Enter Your Choice: \n";
        cin >> player;
        if (player == 0 || player == 1 || player == 2 || player == 3 || player == 4 || player == 5 || player == 6)
        {
            alpha = rand() % 7;
            cout << "Computer: " << alpha << "\nPlayer: " << player << "\n";
            if (alpha != player)
            {
                score = score + player;
                cout << "Score: " << score << "\n";
            }
            else
            {
                cout << "OUT\n";
                cout << "Score: " << score << "\n";
                k = 1;
            }
        }else {
            cout << "Invalid Input\n";
        }
    }
}

void bowl()
{
    system("color 0A");
    int l = 0;
    cout << "Game Begins Your Bowling\n";
    while(l == 0){
        cout << "Enter Your Choice: \n";
        cin >> player1;
        if (player1 == 0 || player1 == 1 || player1 == 2 || player1 == 3 || player1 == 4 || player1 == 5 || player1 == 6)
        {
            alpha1 = rand() % 7;
            cout << "Computer: " << alpha1 << "\nPlayer: " << player1 << "\n";
            if (alpha != player)
            {
                score1 = score1 + player1;
                cout << "Score: " << score1 << "\n";
            }
            else
            {
                cout << "OUT\n";
                cout << "Score: " << score1 << "\n";
                l = 1;
            }
        }else {
            cout << "Invalid Input\n";
        }
    }
}

void winLose(){
    if(score1 < score){
            cout << "You Won The Match\n";
            cout << "\n\nThanks For Playing\n\n";
        }else if(score1 == score){
            cout << "Match Tied\n";
            cout << "\n\nThanks For Playing\n\n";
        }else{
            cout << "You Lose Better Luck Next Time\n";
            cout << "\n\nThanks For Playing\n\n";
        }
}

void how(){
    system("cls");
    system("color 0A");
    int enter;
    cout << "\n\nHow to Play\n\nFirst You need to do toss, if you won the toss you will get the chance to choose bat or bowl, or if you lose the tose then Alpha will choose bat and you will get bowl,if your number and ALpha number is same then batsman is Out, if number is not equal then that will be added as your score, and at the end it will compare your score and ALpha's Score and tell you the winner.\n";
    cout << "\nPress any number to go back: \n";
    cin >> enter;
    main();
}

void about(){
    system("cls");
    system("color 0A");
    int enter;
    cout << "\n\nAbout\n\nHand Cricket Game using C Language.\nGame Developed by sachinl0har.\n\n@copyrights All Rights Reserved\n";
    cout << "\nPress any number to go back: \n";
    cin >> enter;
    main();
}

void self_exit()
{
    system("cls");
    cout << "\n\nThanks For Playing\n\n";
    exit(1);
}

int main()
{
    int x;
    system("cls");
    system("color 0A");
    cout << "1. Play Game \n2. How To PLay? \n3. About \n4. Exit \nEnter Your Choice: \n";
    cin >> x;
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