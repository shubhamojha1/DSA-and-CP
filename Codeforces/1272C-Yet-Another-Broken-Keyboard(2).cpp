#include <iostream>
#include <math.h>
#include <bits/stdc++.h>
typedef long long ll;
typedef unsigned long long ull;
using namespace std;


void solve(){
    ll n, k;
    string s;
    cin>>n>>k;
    cin>> s;

    bool typeable[26] = {0}; // [a-z] -> [0-25]
    for(ll i=-0;i<k;i++){
        char c;
        cin>>c;
        typeable[c-'a']=1;
    } // all possible characters available
    ll a[n]; 
    // marking all available characters as 1, rest 0

    for(ll i=0;i<n;i++){
        if(typeable[s[i]-'a'])
            a[i]=1;
        else   
            a[i]=0;
    }

    ll f[n-1], ans=0; // creating recurrence relation for dp
    f[0]=0;
    /*
      f[0]=0
      f[i+1]=f[i]+1
      ans is sum of all f[i], as we need all possible substrings
    */
    for(ll i=0;i<n;i++){
        if(!a[i])
            f[i+1]=0;
        else    
            f[i+1]=f[i]+1;

        ans+=f[i+1];
    }

    cout << ans << "\n";
}

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    cout<<fixed;
    cout<<setprecision(10);
    solve();
}
