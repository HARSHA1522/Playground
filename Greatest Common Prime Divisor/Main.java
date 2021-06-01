#include<iostream>
using namespace std;

int gcd(long int n1, long int n2, long int small)
{
  long int gcd = 0;
  
    while(small>=1)
    {
      	int count = 0;
        for(int i=2; i<=small/2; i++)
        {
          if(small%i == 0)
            count++;
        }
 
         if(n1%small==0 && n2%small==0 && count==0)
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
  long int n1,n2;
  std::cin>>n1>>n2;
  
  long int small;
  if(n1<n2)
    small = n1;
  else
    small = n2;
  
  long int ans = gcd(n1,n2,small);
  if(ans > 1)
    std::cout<<ans;
  else
    std::cout<<"-1";
  
}