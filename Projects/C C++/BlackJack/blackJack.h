
int player, alpha, score, score1;

void play(){
    int x, d = 0;
    system("color 0A");
    printf("Game Begins\n");
    while(d == 0){
        if(score >= 21){
            d = 1;
            printf("\nYou Exceed the Limit by %d\nALPHA Win\n", score);
        }else if(score1 >= 21){
            d = 1;
            printf("\nALPHA Exceed the Limit by %d\nYou Win\n",score1);
        }else{
            printf("1. Hit \n2. Stand \n3. End Game \nEnter 1 for Hit, 2 for Stand and 3 to End the Game: \n");
        scanf("%d", &x);
        if(x == 3 || x == 2 || x == 1){
            switch(x){
            case 1:
                hit();
                break;
            case 2:
                d = 1;
                stand();
                winLose();
                break;
            case 3:
                winLose();
                break;
        }
        }else{
            printf("Invalid Input\n");
        }
        }
    }
}

void hit(){
    srand(time(NULL));
    player = rand() % 12;
    score = score + player;
    alpha = rand() % 12;
    score1 = score1 + alpha;
    printf("ALPHA: \nPlayer: %d\n", score);
}

void stand(){
    srand(time(NULL));
    alpha = rand() % 11 + 1;
    score1 = score1 + alpha;
    printf("ALPHA: \nPlayer: %d\n", score);
}

void winLose(){
    if(score1 < score){
            printf("\nYou Won The Match\nPlayer: %d\nALPHA: %d\n", score, score1);
            printf("\n\nThanks For Playing\n\n");
        }else if(score1 == score){
            printf("\nMatch Tied\nPlayer: %d\nALPHA: %d\n", score, score1);
            printf("\n\nThanks For Playing\n\n");
        }else{
            printf("\nYou Lose Better Luck Next Time\nPlayer: %d\nALPHA: %d\n", score, score1);
            printf("\n\nThanks For Playing\n\n");
        }
}

void how(){
    system("cls");
    system("color 0A");
    int enter;
    printf("\n\nHow To Play\n\nBlackJack game a card game so this program is a very basic code of blackjack game, In blackjack you have a limit of 21 and there are two options Hit and Stand if you choose Hit it will continue the game and choose a randomly number between 1 to 11 as cards has. and if you choose stand it will end the game with your last score and compare it with ALPHA.\nDifference Between stand and end game is if you did stand it will first hit ALPHA Score once then it will end the game, and in end game the Hit of ALPHA will not be execute and it will show you the Result.\nNote: You will not see ALPHA's score while Playing You will see that at the end.");
    printf("\nPress any number to go back: \n");
    scanf("%d", &enter);
    main();
}

void about(){
    system("cls");
    system("color 0A");
    int enter;
    printf("\n\nAbout\n\nSimple BlackJack Game using C Language.\nGame Developed by sachinl0har.\n\n@copyrights All Rights Reserved\n");
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