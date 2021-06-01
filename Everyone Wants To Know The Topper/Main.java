#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  int max=a[0];
  for(int i=0;i<n;i++)
    if(max<a[i])
      max = a[i];
  std::cout<<max;
  return 0;
    
}