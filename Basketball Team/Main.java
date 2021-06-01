#include <iostream>
using namespace std;

int main() 
{
  long int n;
  std::cin>>n;
  
  long int arr[n];
  for(int i=0; i<n; i++){
    std::cin>>arr[i];
  }
  
  int temp =arr[0];
  for(int i=0; i<n; i++) {
      if(temp>arr[i]) {
         temp=arr[i];
      }
   }
  
  int position = 0;
  for(int i=0; i<n; i++){
    if(temp == arr[i])
      position = i;
  }
  
  swap(arr[0],arr[position]);
  
  for(int i=0; i<n; i++){
    std::cout<<arr[i]<<" ";
  }
}