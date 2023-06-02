// #include <bits/stdc++.h>
#include <cmath>
#include <iostream>
#define ll long long
using namespace std;
 
 
ll solve(){
    int n; cin>>n;
    ll a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    ll sum=0, ans=0;
    for(int i=1;i<n;i++){
        sum=0;
        if(a[i]<a[i-1])
        {
            sum+=a[i-1]-a[i];
            a[i]+=sum;
            ans+=sum;
        }
    }
    return ans;
}
  
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cout<<solve()<<endl;
}