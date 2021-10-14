int player, player1, alpha, alpha1, score, score1;

void toss()
{
    system("cls");
    system("color 0A");
    srand(time(NULL));
    int toss = rand() % 2, a;
    printf("Heads or Tails Choose 0 for Heads and 1 for Tails: \n");
    scanf("%d", &a);
    if (a == 0 || a == 1)
    {
        if (toss == a)
        {
            if (toss == 1)
            {
                printf("You Won Its a Tail \n");
                choice();
            }
            else
            {
                printf("You Won Its a Head");
                choice();
            }
        }
        else
        {
            if (toss == 1)
            {
                printf("You lose Its a Head\nALPHA Choose To Bat First\n");
                bowl();
        bat();
        winLose();
            }
            else
            {
                printf("You lose Its a Tail\nALPHA Choose To Bat First\n");
                bowl();
        bat();
        winLose();
            }
        }
    }
    else
    {
        printf("Invalid Input\n");
    }
}

void choice()
{
    system("color 0A");
    int d;
    printf("You Won The Toss: \n");
    printf("1. Batting \n2. Bowling \nEnter Your Choice: \n");
    scanf("%d", &d);
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
    int k = 0, overs = 0;
    printf("Game Begins Your Batting\n");
    while (k == 0)
    {
            printf("Enter Your Choice: \n");
        scanf("%d", &player);
        if (player == 0 || player == 1 || player == 2 || player == 3 || player == 4 || player == 5 || player == 6)
        {
            srand(time(NULL));
            alpha = rand() % 7;
            printf("Computer: %d\nPlayer: %d\n", alpha, player);
            if (alpha != player)
            {
                score = score + player;
                printf("Score: %d\n", score);
            }
            else
            {
                printf("OUT\n");
                printf("Score: %d\n", score);
                k = 1;
            }
        }else {
            printf("Invalid Input\n");
        }
    }
}

void bowl()
{
    system("color 0A");
    int l = 0;
    printf("Game Begins Your Bowling\n");
    while(l == 0){
        printf("Enter Your Choice: \n");
        scanf("%d", &player1);
        if (player1 == 0 || player1 == 1 || player1 == 2 || player1 == 3 || player1 == 4 || player1 == 5 || player1 == 6)
        {
            srand(time(NULL));
            alpha1 = rand() % 7;
            printf("Computer: %d\nPlayer: %d\n", alpha1, player1);
            if (alpha1 != player1)
            {
                score1 = score1 + player1;
                printf("Score: %d\n", score1);
            }
            else
            {
                printf("OUT\n");
                printf("Score: %d\n", score1);
                l = 1;
            }
        }else {
            printf("Invalid Input\n");
        }
    }
}

void winLose(){
    if(score1 < score){
            printf("You Won The Match\n");
            printf("\n\nThanks For Playing\n\n");
        }else if(score1 == score){
            printf("Match Tied\n");
            printf("\n\nThanks For Playing\n\n");
        }else{
            printf("You Lose Better Luck Next Time\n");
            printf("\n\nThanks For Playing\n\n");
        }
}

void how(){
    system("cls");
    system("color 0A");
    int enter;
    printf("\n\nHow to Play\n\nFirst You need to do toss, if you won the toss you will get the chance to choose bat or bowl, or if you lose the tose then Alpha will choose bat and you will get bowl,if your number and ALpha number is same then batsman is Out, if number is not equal then that will be added as your score, and at the end it will compare your score and ALpha's Score and tell you the winner.\n");
    printf("\nPress any number to go back: \n");
    scanf("%d", &enter);
    main();
}

void about(){
    system("cls");
    system("color 0A");
    int enter;
    printf("\n\nAbout\n\nHand Cricket Game using C Language.\nGame Developed by sachinl0har.\n\n@copyrights All Rights Reserved\n");
    printf("\nPress any number to go back: \n");
    scanf("%d", &enter);
    main();
}

void self_exit()
{
    system("cls");
    printf("\n\nThanks For Playing\n\n");
    exit(1);
}