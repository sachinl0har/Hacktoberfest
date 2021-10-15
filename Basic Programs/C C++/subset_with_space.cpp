#include<bits/stdc++.h>
using namespace std;

void solve(string ip, string op){
	if(ip.size() == 0){
		cout<<op<<" ";
		return;
	}
	string op1 = op, op2=op;
	op1.push_back('_');
	
	op1.push_back(ip[0]);
	op2.push_back(ip[0]);

	ip.erase(ip.begin()+0);

	solve(ip, op2);
	solve(ip, op1);
	return;
}

int main(){
	string s;
	cin>>s;
	string ip, op;
	ip = s;
	op = " ";

	op.push_back(ip[0]);
	ip.erase(ip.begin()+0);

	solve(ip, op);
}