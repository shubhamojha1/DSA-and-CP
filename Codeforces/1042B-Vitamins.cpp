#include <iostream>
#include <math.h>
#include <bits/stdc++.h>
typedef long long ll;
typedef unsigned long long ull;
using namespace std;


void solve(){
    // bitmask dp
    //f(mask) -> lowest cost to satisfy the mask
    //f(n,mask) -> lowest cost to satisfy mask, when only first n strings used
    ll n;
    cin>>n;
    ll f[n+1][8];
    const ll inf = 1e10;

    for(ll i=0;i<=n;i++){
        for(ll j=0;j<8;j++){
            f[i][j] = inf;
        }
    }
    f[0][0]=0;
    for(ll i=0;i<n;i++){
        // cout << i << endl;
        ll cost;
        string s;
        cin >> cost >> s;
        // cout << cost << s;
        int string_mask=0;
        for(int pos=0;pos<3;pos++){
            char c = 'C'-pos;
            bool have=0;
            for(char d:s){
                if(c==d)
                    have=1;
            }
            if(have)
                string_mask+=(1<<pos);
        }
        // cout << string_mask ;

        for(ll mask =0;mask<8;mask++){
            f[i+1][mask] = min(f[i+1][mask], f[i][mask]);
            f[i+1][mask | string_mask] = min(f[i+1][mask | string_mask], f[i][mask]+cost);
        }
    }   
    ll ans = f[n][7];
    if(ans==inf)ans = -1;
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
