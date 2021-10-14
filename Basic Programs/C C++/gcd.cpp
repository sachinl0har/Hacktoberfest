#include<iostream>

using namespace std;

int main(){
	
	int x, y, a, b, temp1, temp2, temp3, temp4;
	int v1, v2;
	
	cout << " Input 2 integers to find their gcd :" << endl;
	
	// Inputs
	cin >> a;
	cin >>b;
	cout << endl;
	
	v1 = a;
	v2 = b;
	
	 label :
	  			// x is the divisor and y is the modulus of a and b respectively for step 1
	 		x = a / b;
			y = a % b;
			
			temp4 = x;
			temp3 = y;
			temp2 = b;
			temp1 = a;
		
			cout << "	" << temp1 << " = " << temp2 << " ( " << temp3 << " ) + " << temp4 << endl;
				
		if ( y == 0){
				cout << endl;			
				cout << "	gcd( " << v1 << ", " << v2 << " ) is " << temp4;
				return 0;
		}
		else{
				b = temp3;	
				a = temp2;
			goto label;
		}
		
	return 0;
}
