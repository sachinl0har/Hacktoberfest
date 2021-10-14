// Q2. Write a program to find the largest number among three numbers entered by the user.

#include <iostream>
using namespace std;

int main() {    
    int n1, n2, n3;

    cout << "Enter first numbers: ";
    cin >> n1;
    cout << "Enter second numbers: ";
    cin >> n2;
    cout << "Enter third numbers: ";
    cin >> n3;

    if(n1 >= n2 && n1 >= n3)
        cout << "First Number is the Largest number: " << n1;

    if(n2 >= n1 && n2 >= n3)
        cout << "Second number is the Largest number: " << n2;
    
    if(n3 >= n1 && n3 >= n2)
        cout << "Third number is the Largest number: " << n3;
  
    return 0;
}