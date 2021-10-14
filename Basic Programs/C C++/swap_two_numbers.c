#include <stdio.h>

int main(){
    system("cls");
    int a, b;
    while(1){
    printf("Enter Number A: ");
    scanf("%d", &a);
    printf("Enter Number B: ");
    scanf("%d", &b);
    printf("\n\nBefore Swaping\nA -> %d\nB -> %d\n", a, b);
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    printf("\n\nAfter Swaping\nA -> %d\nB -> %d\n", a, b);
    }
}