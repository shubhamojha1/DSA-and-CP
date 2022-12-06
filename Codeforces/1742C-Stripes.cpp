#include <bits/stdc++.h>
using namespace std;

#define forn(i,n) for (int i=0;i<int(n);i++)
#define size(v) (int)v.size()
#define all(v) v.begin(), v.end()
#define eb emplace_back
#define endl '\n'

#define MAXN 2022

int arr[MAXN];
int n;

/*Since rows are only painted red and 
columns are only painted blue, we can 
just check if any row contains 8 Rs. 
If there is such a row, then red was painted last; 
otherwise, blue was painted last.*/
void solve(){
    char g[8][8];
    vector<int> a;
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            cin>>g[i][j];
            if(g[i][j]=='R')
                a.push_back(i);
        }
    }

    for(int i: a){
        bool ok = true;
        for(int j=0;j<8;j++){
            if(g[i][j]!='R'){
                ok=false;
                break;
            }
        }
            if(ok){
                cout<<"R"<<endl;
                return;
            }
    }
    cout<<"B"<<endl;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int t;
    cin>>t;

    while(t--){
        // cout<<solve()<<endl;
        solve();
    }
}
  
