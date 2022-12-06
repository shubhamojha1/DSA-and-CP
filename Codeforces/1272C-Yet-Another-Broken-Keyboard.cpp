#include <iostream>
#include <math.h>
#include <bits/stdc++.h>
typedef long long ll;
typedef unsigned long long ull;
using namespace std;

void solve(){

    int n,k;
    cin>>n>>k;
    string s;
    cin>>s;
    s.push_back('#'); // buffer character
    set<char>c;
    for(int i=1;i<=k;i++){
        char ch;
        cin>>ch;
        c.insert(ch);
    }
    int last=-1;
    ll total=0;
    for(auto& xx: c)
    cout << xx <<endl;
    for(int i=0;i<=n;i++){
        if(!c.count(s[i])) // if pointer is at a character not present on keyboard
        {
            int len=i-last-1;
            total+=((ll)(len)*(len+1))/2;
            last=i;
        }
    }

    cout << total <<endl;

}

// find all individual substrings possible
// exclude all not available characters
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    cout<<fixed;
    cout<<setprecision(10);
    solve();
}
