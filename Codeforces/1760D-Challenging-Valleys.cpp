#include <bits/stdc++.h>
using namespace std;
    
#define forn(i,n) for (int i=0;i<int(n);i++)
#define size(v) (int)v.size()
#define all(v) v.begin(), v.end()
#define eb emplace_back
#define do(t) while(t--)
#define lld long double
#define ll long long
#define endl "\n"
#define ispresent(a, x) binary_search(a.begin(), a.end(), x)
#define ssort(a) sort(a.begin(), a.end())
#define sortarray(a,n) sort(a, a+n)

bool isperfectsquare(double n){
    return (ceil((double)sqrt(n)) == floor((double)sqrt(n)));
} 

int max(ll a, ll b){
    return a>b?a:b;
}

ll sum_to_n(ll n){
    return n*(n+1)/2;
}

int gcd(int a , int b)
{
   if(b==0) return a;
   a%=b;
   return gcd(b,a);
}


int min(int a, int b){
    return a<b?a:b;
}
bool isprime(ll n){
    int c=0;
    for(int i=1;i<=n;i++){
        if(n%i==0)
        c++;
    }
    return c==2;
}

// look for valleys in the input array
// 
string solve(){
    int n; cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    bool flag=1;

    for(int i=0;i<n-1;i++){
        if(a[i]<a[i+1])
            {
                flag=0;   // flag=0, bc a[i]<a[i+1] means "/" (upward slope) found
                    // check if valley present 
                    // ie a[i]<=a[i+1]
                    while(i<n-1 && a[i]<=a[i+1]) // check if more upward slopes present
                        i++; // move right
           
                if(i==n-1){ // if upward slopes end at the end of array, the entire array was a valley, so flag=1
                    {flag=1; break;}
                }
                else{ // if while loops breaks for condition a[i] <= a[i+1], that means a downward slope "\" found, and since an upward slope was already found (line 59)
                        // valley not present
                    flag=0; break;
                }
            }
    }
    // for(int i=0;i<n-1;i++){     <---- not needed as already checked in while loop above
    //     if(a[i]==a[i+1]) 
    //         flag=1;
    // }

    return flag?"YES":"NO";
}
   
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int t;
    cin>>t;
    do(t){
        // solve();
        cout<<solve()<<endl;
    }
}
    
