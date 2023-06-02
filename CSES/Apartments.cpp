#include <bits/stdc++.h>
#include <stdlib.h>

using namespace std;

int main(){
    int n,m,k;
    cin>>n>>m>>k;

    vector<int> a(n), b(m);

    for(int i=0;i<n;i++){
        cin>>a[i];
    }

    for(int i=0;i<m;i++){
        cin>>b[i];
    }

    sort(a.begin(),a.end());
    sort(b.begin(),b.end());

    int ans=0;

    // allowed prices are { a[i]-k,a[i]+k }
    int x=0;
    for(int i=0;i<n;i++){

        while(x<m && b[x]<a[i]-k){
            x++;
        }
        if(x<m && b[x]<=a[i]+k){
            ans++;
            x++;
        }

    }

    cout<<ans<<endl;

}