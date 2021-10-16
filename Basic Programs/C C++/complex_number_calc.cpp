#include<iostream>
#define _USE_MATH_DEFINES
#include<cmath>

using namespace std;

class ComplexNumber{				
	public:
		double real;
		double imag;
		ComplexNumber(double,double);
		ComplexNumber operator+(const ComplexNumber &);
		ComplexNumber operator-(const ComplexNumber &);
		ComplexNumber operator*(const ComplexNumber &);
		ComplexNumber operator/(const ComplexNumber &);
		bool operator==(const ComplexNumber &);
		double abs();
		double angle();
};

ComplexNumber::ComplexNumber(double x = 0,double y = 0){
	real = x; imag = y;
}

ComplexNumber ComplexNumber::operator+(const ComplexNumber &c){
	return ComplexNumber(real+c.real,imag+c.imag);
}

ComplexNumber ComplexNumber::operator-(const ComplexNumber &c){
	return ComplexNumber(real-c.real,imag-c.imag);
}


bool ComplexNumber::operator==(const ComplexNumber &c){
	if(real == c.real && imag == c.imag){
		return true;
	}
	else{
		return false;
	}
}

bool operator==(double s,const ComplexNumber &c){
	if(s == c.real){
		return true;
	}
	else{
		return false;
	}
}

ComplexNumber ComplexNumber::operator*(const ComplexNumber &c){
	ComplexNumber tmp;
	tmp.real = ((real)*(c.real)) - ((imag)*(c.imag));
	tmp.imag = ((real)*(c.imag)) + ((c.real)*(imag));
	return tmp;
}
ComplexNumber ComplexNumber::operator/(const ComplexNumber &c){
	ComplexNumber tmp;
	tmp.real = (((real)*(c.real))+((imag)*(c.imag)))/(pow(c.real,2)+pow(c.imag,2));
	tmp.imag = (((c.real)*(imag))-((real)*(c.imag)))/(pow(c.real,2)+pow(c.imag,2));
	return tmp;
}


ComplexNumber operator+(double s,const ComplexNumber &c){
	return ComplexNumber((s+c.real),c.imag);
}
ComplexNumber operator-(double s,const ComplexNumber &c){
	return ComplexNumber((s-c.real),0-c.imag);
}
ComplexNumber operator*(double s,const ComplexNumber &c){
	ComplexNumber tmp;
	tmp.real = ((s)*(c.real)) - ((0)*(c.imag));
	tmp.imag = ((s)*(c.imag)) + ((c.real)*(0));
	return tmp;
}
ComplexNumber operator/(double s,const ComplexNumber &c){
		ComplexNumber tmp;
		tmp.real = (((s)*(c.real))+((0)*(c.imag)))/(pow(c.real,2)+pow(c.imag,2));
		tmp.imag = (((c.real)*(0))-((s)*(c.imag)))/(pow(c.real,2)+pow(c.imag,2));
		return tmp;
}

ostream & operator<<(ostream &os, const ComplexNumber &c){
	if(c.real >= 0){
		if( (c.imag > 0) && (c.real!= 0) ){
			return os << c.real << "+" << c.imag <<"i";
		}
		if( (c.imag < 0) && (c.real!= 0) ){
			return os << c.real << c.imag << "i";
		}
		if(c.real == 0 && c.imag > 0){
			return os << c.imag <<"i";
		}
		if(c.real == 0 && c.imag < 0){
			return os << c.imag << "i";
		}
		else{
			return os << c.real;
		}
	}

	if(c.real < 0){
		if( (c.imag > 0) && (c.real!= 0) ){
			return os << c.real << "+" << c.imag <<"i";
		}
		if( (c.imag < 0) && (c.real!= 0) ){
			return os << c.real << c.imag << "i";
		}
		else{
			return os << c.real;
		}
	}

	if(c.real == 0 && c.imag == 0){
		return os << c.real;
	}
}

double ComplexNumber::abs(){
	double power = pow(real,2) + pow(imag,2);
	double ans = sqrt(power);
	return ans;
}

double ComplexNumber::angle(){
	double setQuardant = 0;
	if(real >= 0){
		if(imag >= 0){
			setQuardant = 1;
		}
		if(imag < 0){
			setQuardant = 4;
		}
	}
	if(real < 0){
		if(imag >= 0){
			setQuardant = 2;
		}
		if(imag < 0){
			setQuardant = 3;
		}
	}
	
	double polar = atan(imag/real) * (180 / M_PI);
	
	if(setQuardant == 3){
		polar = -180 + (polar);
	}
	if(setQuardant == 2){
		polar = 90.0 + (-1*polar);
	}
	else{
		polar = polar + 0;
	}
	return polar;
	
}


int main(){
	ComplexNumber a(1.5,2),b(3.2,-2.5),c(-1,1.2);	
	cout << a << "\n";
	cout << b << "\n";
	cout << c << "\n";
	cout << a+2.5 << "\n";
	cout << 2.5+a << "\n";
	cout << a-1.5 << "\n";
	cout << 1.5-a << "\n";
	cout << b+ComplexNumber(0,2.5) << "\n";
	cout << c-c << "\n";
	cout << "-----------------------------------\n";
	
	ComplexNumber d = (a+b)/c;
	ComplexNumber e = b/(a-c);
	cout << d << "\n";
	cout << e << "\n";
	cout << c*2 << "\n";
	cout << 0.5*c << "\n";
	cout << 1/c << "\n";
	cout << "-----------------------------------\n";

	cout << ComplexNumber(1.5,2.4).abs() << "\n";
	cout << ComplexNumber(3,4).abs() << "\n";
	cout << ComplexNumber(69,-9).abs() << "\n";		
	cout << "-----------------------------------\n";	
	
	cout << ComplexNumber(1,1).angle() << "\n";
	cout << ComplexNumber(-1,1).angle() << "\n";
	cout << ComplexNumber(5,2).angle() << "\n";
	cout << "-----------------------------------\n";
}