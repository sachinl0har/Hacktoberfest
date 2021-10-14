#include <stdio.h>

int findTrailingZeros(int n){
    int count = 0;
    for(int i = 5; n / i >= 1; i *= 5){
        count += n / i;
    }
    return count;
}

int main(){
    int n, i;
    int long long fact = 1;
    printf("Enter an integer: ");
    scanf("%d", &n);
    if(n < 0){
        printf("Error! factorial of a Negative Number Does'nt Exist.\n");
    }else{
        for(i = 1; i <= n; i++){
            fact *= i;
        }
        printf("Factorial of %d = %lld\n", n, fact);
        printf("Count of Trailing Zeros in %d! is %d\n", n, findTrailingZeros(n));
    }
}