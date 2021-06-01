#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  int num;
  int check=0;
  std::cin>>num;
  for(int i=0;i<n;i++)
    if(num==a[i])
    {
      check =1;
      break;
    }
  if(check==1)
    printf("She passed her exam");
  else
    printf("She failed");
  return 0;
   
}