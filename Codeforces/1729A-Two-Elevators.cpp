#include <iostream>
#include <math.h>
#include <bits/stdc++.h>
typedef long long ll;
typedef unsigned long long ull;
using namespace std;

void solve(){
        int t;
        cin >> t;
        while(t--){
            ll a, b, c;
            cin>>a>>b>>c;

            ll answer;
            ll a_answer = llabs(a-1);
            ll b_answer = llabs(b-c) + llabs(c-1);
            // cout<<a_answer<<b_answer;
            if(a_answer<b_answer)
                answer=1;
            else if(a_answer>b_answer)
                answer=2;
            else if(a_answer==b_answer)
                answer=3;
            
            cout<<answer<<endl;
        }
}

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    cout<<fixed;
    cout<<setprecision(10);
    solve();
}
