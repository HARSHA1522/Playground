#include<iostream>
#include<stdio.h>
#include<math.h>

int arm(int n)
{
  int count=0;
  int p = n;
  while(p!=0)
  {
    p = p/10;
    count = count+1;
  }
  int final=0;
  int num=0;
  int m=n;
  
  for(int i=count; i>0; i--)
  {
    m = m-(num*pow(10,i));
    num = (m/pow(10,i-1));
    final = final + (pow(num,count));
  }
  return (final-n);
}
           
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==0)
        std::cout<<"Yes";
    else
        std::cout<<"No";
  return 0;
}