// #include <bits/stdc++.h>
#include <cmath>
#include <iostream>
#define ll long long
#define endl "\n"
using namespace std;
 
 
// void solve(int n){
void solve(){
    int n; cin>>n;
 
    if(n==3 || n==2) {
        cout<<"NO SOLUTION"<<endl;
        return;
    }
    if(n==4){
        cout<<2<<" "<<4<<" "<<1<<" "<<3;
        return;
    }
 
    for(int i=1;i<=n;i+=2)
    cout<<i<<" ";
 
    for(int i=2;i<=n;i+=2)
    cout<<i<<" ";
 
    cout<<endl;
 
}
  
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    solve();
    // cout<<solve()<<endl;
 
    /*
            ******FOR TESTING*****
    */
    // int n;
    // while(cin>>n){
    //     // cout<<solve(n)<<endl;
    //     solve(n);
    // }
}