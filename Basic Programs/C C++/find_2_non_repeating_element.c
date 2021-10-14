// FIND THE TWO NON REPEATING ELEMENTS IN AN ARRAY OF REPEATING ELEMENTS.
#include <stdio.h>
#include <stdlib.h>

void find(int arr[], int n, int *x, int *y){
    int Xor = arr[0];
    int set_bit;
    int i;
    *x = 0;
    *y = 0;
    for(i = 1; i < n; i++){
        Xor ^= arr[i];
    }
    set_bit = Xor & ~(Xor-1);

    for(i = 0; i < n; i++){
        if(arr[i] & set_bit){
            *x = *x ^ arr[i];
        }else{
            *y = *y ^ arr[i];
        }
    }
}

int main(){
    int arr[] = {2, 3, 7, 9, 11, 2, 3, 11};
    int *x = (int *)malloc(sizeof(int));
    int *y = (int *)malloc(sizeof(int));
    find(arr, 8, x, y);
    printf("The Non Repeating elements are %d and %d\n", *x, *y);
    getchar();
}