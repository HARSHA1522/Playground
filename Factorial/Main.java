#include<iostream>
long fact(int a)
{
  if(a==0)
    return 1;
  else 
    return a*fact(a-1);
}
int main()
{
  int a;
  std::cin>>a;
  printf("The factorial of %d is %ld",a,fact(a));
  return 0;
}
