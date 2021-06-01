#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int min_sum(int n, int arr[], int b[], int k)
{
  int temp = 0,diff = 0;
  int result = 0;
  for(int i=0; i<n;i++)
  {
    int product = arr[i]*b[i];
    result = result + product;
    
    if(product<0 && arr[i]<0)
      temp = (arr[i]-(2*k))*b[i];
    
    else if(product<=0 && b[i]<0)
      temp = (arr[i]+(2*k))*b[i];
    
    else if(product>0 && arr[i]>0)
      temp = (arr[i]-(2*k))*b[i];
    
    else if(product>=0 && arr[i]<0)
      temp = (arr[i]+(2*k))*b[i];
    
    int d = abs(product-temp);
    if(d>diff)
      diff = d;   
  }
  return result-diff;
}

int main()
{
  int n;
  std::cin>>n;
  int arr[n];
  for(int i=0; i<n; i++){
    cin>>arr[i];
  }
  int b[n];
  for(int i=0; i<n; i++){
    cin>>b[i];
  }
  int k;
  std::cin>>k;
  
  cout<<min_sum(n,arr,b,k);
  return 0;
}