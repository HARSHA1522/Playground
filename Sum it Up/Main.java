#include<iostream>
using namespace std;

int main() 
{ 
    int num,ans,base; 
  	cin>>num;
  	base = 9;
    if (num == 0){cout<<0;}
  	
  	else if(num%base == 0){cout<<9;}
  
    else
    {
  	ans = num%base;
  	cout<<ans;
    }
    return 0; 
}