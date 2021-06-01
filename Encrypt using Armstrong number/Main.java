#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int q,i=1,d=0,a,sum=0;
  while(1)
  {
    q=n/i;
    if(q==0)
      break;
    i=i*10;
    d++;
  }
i=1;
  while(1)
  {
    q=n/i;
    if(q==0)
      break;
    a=q%10;
    sum = sum + power(a,d);
    i=i*10;
  }
  int isarm=0;
  if (sum==n)
    isarm=1;
  return isarm;
  
   
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}