// Q3. Write a program to check whether a year entered by a user is Leap year or not.

#include<iostream>
using namespace std;
int main() {
   int year;
   cout<<"Enter the year: ";
   cin >> year;
   if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
   cout<<year<<" is a leap year";
   else
   cout<<year<<" is not a leap year";
   return 0;
}