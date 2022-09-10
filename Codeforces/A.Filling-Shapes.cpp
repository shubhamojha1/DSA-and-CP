/*
      https://codeforces.com/contest/1182/problem/A
*/
#include <iostream>
#include <math.h>
#define ll long long
using namespace std;

 // thinking + dp
void solve(){
    ll n;
    cin >> n;

    ll f[n+1];
    f[0]=1;
    f[1]=0;
    for(ll i=2;i<=n;i++){
        f[i]=2*f[i-2];
    }

    cout << f[n] << endl;
}

int main(){
    solve();
}
