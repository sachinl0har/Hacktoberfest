#include <stdio.h>

int main(){
    system("cls");
    int n, mask, i;
    while(1){
        printf("Enter Any Number: ");
        scanf("%d", &n);
        printf("Enter the position where you want to search: ");
        scanf("%d", &i);
        mask = (n >> i) & 1;
        printf("The %d Position Bit is %d\n\n", i, mask);
    }
}