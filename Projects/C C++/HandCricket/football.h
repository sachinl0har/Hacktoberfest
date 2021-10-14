int player, player1, alpha, alpha1, score, score1;

void toss(){
    system("cls");
    system("color 0A");\
    srand(time(NULL));
    int toss = rand() % 2, a;
    printf("Heads or Tails Choose 0 for Heads and 1 for Tails: \n");
    scanf("%d", &a);
    if(a == 0 || a == 1){
        if(toss == a){
            if(toss == 1){
                printf("You Won Its Tails \n");
                choice();
            }else{
                printf("You Won Its Heads \n");
                choice();
            }
        }else{
            if(toss == 1){
                printf("You Lose Its Heads\nALPHA Choose Even Side\n");
                even();
                winLose();
            }else{
                printf("You Lose Its Tails\nALPHA Choose Even Side\n");
                even();
                winLose();
            }
        }
    }else{
        printf("Invalid Input\n");
    }
}

void choice(){
    system("color 0A");
    int d;
    printf("You Won the Toss: \n");
    printf("1. Odd \n2. Even \nChoose Your Side: \n");
    scanf("%d", &d);
    switch(d){
        case 1:
            odd();
            winLose();
            break;
        case 2:
            even();
            winLose();
            break;
    }
}

void odd(){
    system("color 0A");
    int k = 1;
    printf("Game Begins You Choose Odd\n");
    while(k < 30){
        printf("Enter Your Choice: \n");
        scanf("%d", &player);
        if(player == 0 || player == 1 || player == 2 || player == 3 || player == 4 || player == 5 || player == 6){
            srand(time(NULL));
            alpha = rand() % 7;
            printf("ALPHA: %d\nPlayer: %d\n", alpha, player);
            if(player % 2 != 0 && player == alpha){
                score++;
                printf("You Got The Goal\nScore: %d\n", score);
                k++;
            }else if(player % 2 == 0 && player == alpha){
                score1++;
                printf("ALPHA Got The Goal\nScore: %d\n", score1);
                k++;
            }else{
                printf("Continue Playing No One Got The Goal\n");
                k++;
            }
        }else{
            printf("Invalid Input\n");
        }
    }
}

void even(){
    system("color 0A");
    int k = 1;
    printf("Game Begins You Choose Even\n");
    while(k < 30){
        printf("Enter Your Choice: \n");
        scanf("%d", &player1);
        if(player1 == 0 || player1 == 1 || player1 == 2 || player1 == 3 || player1 == 4 || player1 == 5 || player1 == 6){
            srand(time(NULL));
            alpha1 = rand() % 7;
            printf("ALPHA: %d\nPlayer: %d\n", alpha1, player1);
            if(player1 % 2 != 0 && player1 == alpha1){
                score1++;
                printf("ALPHA Got The Goal\nScore: %d\n", score1);
                k++;
            }else if(player1 % 2 == 0 && player1 == alpha1){
                score++;
                printf("You Got The Goal\nScore: %d\n", score);
                k++;
            }else{
                printf("Continue Playing No One Got The Goal\n");
                k++;
            }
        }else{
            printf("Invalid Input\n");
        }
    }
}

void winLose(){
    if(score1 < score){
            printf("You Won The Match\nPlayer: %d\nALPHA: %d\n", score, score1);
            printf("\n\nThanks For Playing\n\n");
        }else if(score1 == score){
            printf("Match Tied\nPlayer: %d\nALPHA: %d\n", score, score1);
            printf("\n\nThanks For Playing\n\n");
        }else{
            printf("You Lose Better Luck Next Time\nPlayer: %d\nALPHA: %d\n", score, score1);
            printf("\n\nThanks For Playing\n\n");
        }
}

void how(){
    system("cls");
    system("color 0A");
    int enter;
    printf("\n\nHow to Play\n\nFirst You need to do toss, if you won the toss you will get the chance to choose Odd or Even, or if you lose the tose then Alpha will choose Even and you will get Odd, there will be a countdown of 30 if your side is odd and you put an odd number and ALPHA's number is also same then you got the Goal, and if you have even side and if your number is even and same as ALPHA's number then ALPHA will get the Goal, and at the end it will compare your score and ALpha's Score and tell you the winner.\n");
    printf("\nPress any number to go back: \n");
    scanf("%d", &enter);
    main();
}

void about(){
    system("cls");
    system("color 0A");
    int enter;
    printf("\n\nAbout\n\nHand Football Game using C Language.\nGame Developed by vickySurv3 and sachinl0har.\n\n@copyrights All Rights Reserved\n");
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