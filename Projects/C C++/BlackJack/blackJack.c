#include <stdio.h>
#include "blackJack.h"

int main(){
    int y;
    system("cls");
    system("color 0A");
    printf("1. Play Game \n2. How To Play? \n3. About \n4. Exit \nEnter Your Choice: \n");
    scanf("%d", &y);
    switch(y){
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