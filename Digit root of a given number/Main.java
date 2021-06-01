#include<iostream>

int digr(int a)
{
  int b,r,sum=0,q=a;
  if (a>=0&&a<=9)
    return a;
  else
  {
  while (q!=0)
  {
    r=q%10;
    b=q/10;
    sum = sum+r;
    q=b;
  }
  return digr(sum);
  }
}

int main()
{
  int a;
  std::cin>>a;
  std::cout<<digr(a);
  return 0;
}