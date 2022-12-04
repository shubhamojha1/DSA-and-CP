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

string reverse(string str)
{   string s;
   for(int i = str.length() - 1; i >= 0; i--)
    s+=str[i];

    return s;
}

bool islucky(ll x){
    while(x!=0){
        ll rem = x%10;
        if(!(rem==4 || rem==7))
            return false;
        x/=10;
    }
    return true;
}
string solve(){
    ll n; cin>>n;
    for(int i=1;i<=n;i++){
        if(islucky(i))
            if(n%i==0) return "YES";
    }
    return "NO";
    
}
 // iterate from 1 to n
// check if i is lucky
// if i is lucky, check if n is divisible by i
// if yes, print yes
// else no
   
    
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    // solve();
    cout<<solve()<<endl;
    // int t;
    // cin>>t;
    // do(t){
    //     // solve();
    //     cout<<solve()<<endl;
    // }
}
    
