#include <stdio.h>

void hello(int n){
    if(n == 0){
        return;
    }else{
        printf("\nHello\n");
        hello(n - 1);
    }
}

int main(){
    system("cls");
    int n;
    printf("Enter How many times you want to print Hello: \n");
    scanf("%d", &n);
    hello(n);
}