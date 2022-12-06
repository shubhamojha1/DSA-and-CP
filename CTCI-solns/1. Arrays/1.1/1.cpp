/* if changing the original string is allowed
    if O(1) space
    --> sort string O(nlogn), check for duplicates in O(n)
*/

bool solve(){
    string s;
    cin>>s;
    sort(s.begin(), s.end());
    for(int i=1;i<s.length();i++) 
        if(s[i]==s[i-1])
            return false;
    return true;      
}
