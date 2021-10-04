#include<iostream>
using lld=long long int;
using namespace std;
int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin>>t;
    while(t--){
        int n,even=0,odd=0,even_spots=0,odd_spots=0;
        cin>>n;
        lld arr[n],s=0;
        for(int i=0;i<n;i++){
            cin>>arr[i];
            if((arr[i])%2==0)
                even++;
            else
                odd++;
        }
        if(n%2==0){
            even_spots=n/2;
            odd_spots=n/2;
        }
        else{
            even_spots=n/2;
            odd_spots=n-even_spots;
        }
        if(even-odd_spots>0)
            s+=even-odd_spots;
        if(odd-even_spots>0)
            s+=odd-even_spots;
        cout<<n-s<<"\n";

    }
    return 0;
}
