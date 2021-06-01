#include<iostream>
using namespace std;

int binarysearch(long int low, long int high, int arr[], long int k)
{
  int mid = (low+high)/2;
  if(high >= low)
  {
     if(arr[mid] == k)
       return mid;
     else if(arr[mid]>k)
       return binarysearch(low, mid-1, arr, k );
     else if(arr[mid]<k)
       return binarysearch(mid+1, high, arr, k);
  }
  return -1;
}
int main()
{
  long int n;
  long int k;
  std::cin>>n;
  int arr[n];
  for(int i=0; i<n; i++){
    std::cin>>arr[i];
  }
  std::cin>>k;
  int result = binarysearch(0,n-1,arr,k);
  if(result == -1)
    cout<<"Not found";
  else
    cout<<result;
  return 0;
}