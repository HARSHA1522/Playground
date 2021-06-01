#include<iostream>
using namespace std;

void missing_number(long int low, int high, float arr[], float diff)
{
  int mid = (low+high)/2;
  if(low<high){
    if((arr[mid]-arr[low])/(mid-low) != diff)
      missing_number(low,mid,arr,diff);
    else if((arr[high]-arr[mid])/(high-mid) != diff)
      missing_number(mid,high,arr,diff);
  }
  else
    cout<<arr[low]+diff;
}   	

int main()
{
  long int n;
  std::cin>>n;
  float arr[n];
  for(int i=0; i<n; i++){
    std::cin>>arr[i];
  }
  float diff = (arr[n-1]-arr[0])/n;    
  missing_number(0, n-1, arr, diff);
  return 0;
}