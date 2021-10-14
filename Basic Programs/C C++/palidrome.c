#include <stdio.h>

int main(){
    system("cls");
    int n, remainder, reversedN, originalN;
    printf("Enter an Integer: ");
    scanf("%d", &n);
    originalN = n;
    while(n != 0){
        remainder = n % 10;
        reversedN = reversedN * 10 + remainder;
        n/=10; //n/=10 = n = n / 10
    }if(originalN == reversedN){
        printf("%d is a Palidrome Number\n", originalN);
    }else{
        printf("%d is not a Palidrome Number\n", originalN);
    }
}