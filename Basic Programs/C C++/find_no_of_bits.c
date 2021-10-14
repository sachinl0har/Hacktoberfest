// FIND NUMBER OF BITS TO CHANGE TO CONVERT A TO B
#include <stdio.h>

int BitsCount(int n){
    int count = 0;
    while(n > 0){
        count++;
        n &= (n - 1);
    }
    return count;
}

int flipCount(int a, int b){
    return BitsCount(a ^ b);
}

int main(){
    int a, b;
    printf("Enter Number A: ");
    scanf("%d", &a);
    printf("Enter Number B: ");
    scanf("%d", &b);
    printf(flipCount(a, b));
}