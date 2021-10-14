#include <bits/stdc++.h>

using namespace std;

int camelcase(string s) {
    int count = 1;
    for(int i = 0; i < s.length(); i++) {
        if(isupper(s[i])) {
            count++;
        }
    }
    return count;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    int result = camelcase(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
