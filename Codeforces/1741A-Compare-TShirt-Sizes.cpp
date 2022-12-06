#include <bits/stdc++.h>
using namespace std;

#define forn(i,n) for (int i=0;i<int(n);i++)
#define size(v) (int)v.size()
#define all(v) v.begin(), v.end()
#define eb emplace_back

void solve(){
    string a,b; cin>>a>>b;
    char ca = a.back();
    char cb = b.back();

    if(ca==cb){
        if(size(a)==size(b)) cout<<"=";
        else if(ca=='S')
        cout << (size(a)<size(b) ? '>' : '<');
        else
        cout<< (size(a) < size(b) ? '<' : '>');
    }
    else cout << (ca < cb ? '>' : '<');
    cout << '\n';
}

int main(){
    int t;
    cin>>t;

    forn(i,t){
        solve();
    }
}
  
