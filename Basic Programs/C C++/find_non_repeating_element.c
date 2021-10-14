// FIND THE ELEMENT THAT APPEARS ONCE IN AN ARRAY WHERE EVERY OTHER ELEMENT APPEARS TWICE.
#include <stdio.h>

int find(int arr[], int arr_size){
    int result = arr[0];
    for(int i = 1; i < arr_size; i++){
        result = result ^ arr[i];
    }
    return result;
}

int main(){
    int arr[] = {2, 3, 5, 4, 5, 3, 4};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Element occuring once is : %d\n", find(arr, n));
}