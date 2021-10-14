// Q1. Write a program to Swap to two numbers.

#include <iostream>  
using namespace std;  
int main()  
{
    int a, b;
    cout << "Enter value of a: ";
    cin >> a;   
    cout << "Enter value of b: ";
    cin >> b;       
    a=a*b;
    b=a/b;    
    a=a/b;   
    cout<<"Number Swapped a= "<<a<<" b= "<<b<<endl;      
    return 0;  
}  