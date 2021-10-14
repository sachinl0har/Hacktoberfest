// Q6. Print this pattern using loops
// For n=5
// 	    *
// 	   * *
// 	  * * *
// 	 * * * *
// 	* * * * *

#include <iostream>
using namespace std;

int main()
{
    int n = 5;
   
    int k = 2 * n - 2;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < k; j++)
            cout << " ";
        k = k - 1;
        for (int j = 0; j <= i; j++) {
            cout << "* ";
        }
        cout << endl;
    }
    return 0;
}