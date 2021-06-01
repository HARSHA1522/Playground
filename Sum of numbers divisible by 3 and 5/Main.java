#include<iostream>
using namespace std;
int main(){
int m,n,s;
cin>>m>>n;
s=0;
for(int i=m;i<n;i++){
    if(i%15==0){
        s=s+i;
    }
}
cout<<s;

}
