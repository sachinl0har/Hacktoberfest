#include <stdio.h>

int count(int n, int m){
    if(n == 1 || m == 1){
        printf("1\n");
    }else{
        return count(n - 1, m) + count(n, m - 1);
    }
}

int main(){
    system("cls");
    int n, m;
    printf("Enter Number of Rows: \n");
    scanf("%d", &n);
    printf("Enter Number of Columns: \n");
    scanf("%d", &m);
    count(n, m);
}