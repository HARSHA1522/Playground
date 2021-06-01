
#include<iostream>
using namespace std;
int main(){
  string s;
  cin>>s;
  int n=s.length();

  int p;
  string k="Floating part is : ";
  for(int i=0;i<n;i++){
    if(s[i]=='.'){
      for(int j=i+1;j<n;j++){

       k=k+s[j];
      }



    }
  }

    cout<<k;



}

