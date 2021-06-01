#include<iostream>
#include<bits/stdc++.h>

int gcd(long int a, long int c, long int small)
{
  int gcd = 0;
    while(small>=1)
    {
       if(a%small==0 && c%small==0)
       {
         gcd = small;
         break;
       }
      small--;
    }
  return gcd;
}

int main()
{
  long int a,c,ans;
  std::cin>>a>>c;
  long int small;
    if (a < c) 
        small = a;
    else{small = c;}
  
    ans = gcd(a,c,small);
      std::cout<<ans;
      
    return 0;
}