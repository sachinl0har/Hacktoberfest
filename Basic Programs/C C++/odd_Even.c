#include <stdio.h>

int main(){
    system("cls");
    int a;
    while(1){
    printf("Enter a Number: ");
    scanf("%d", &a);
    if(a&1 != 0){
        printf("Number is Odd\n");
    }else{
        printf("Number is Even\n");
    }
    }
}