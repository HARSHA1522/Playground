#include<iostream>
#include<iostream>
using namespace std;
long int max(long int arr[],long int a,long int b);
int main()
{
  long long int s=0;
  long int n,x=1;
  cin>>n;
  long int arr[n+2];
  arr[0]=100;
  arr[n+1]=100;
  for(long int i=1;i<=n;i++)
  {
    cin>>arr[i];
  }
  while(x>0)
  {
    x=max(arr,1,n);
    //cout<<x<<"\n";
    //cout<<arr[0]<<arr[1]<<arr[2]<<arr[3]<<arr[4]<<arr[5]<<"\n";
    s=s+x;
  }
  cout<<s;
}
long int max(long int arr[],long int a,long int b)
{
  int max=0;
  for(int i=a;i<b+1;i++)
  {
     if((max<arr[i] && arr[i-1]!=-1 &&arr[i+1]!=-1))
       max=arr[i];
  }
  for(int i=a;i<b+1;i++)
  {
    if(arr[i]==max)
    {
      arr[i]=-1;
      break;
    }
  }
  return max;
}