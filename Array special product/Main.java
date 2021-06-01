#include<iostream>
using namespace std;

void product(int arr[], int n){
  if(n == 1)
    cout<<"0";
  int temp = 1;
  int p[n];
  
  for(int i=0; i<n; i++){
    p[i] = temp;
    temp = temp * arr[i];
  }
  
  temp = 1;
  
  for(int i=n-1; i>=0; i--){
    p[i] = p[i]*temp;
    temp = temp*arr[i];
  }
  
  for(int i=0; i<n; i++){
    std::cout<<p[i]<<"\n";
  } 
}
int main()
{
  int n;
  std::cin>>n;
  int arr[n];
  for(int i=0; i<n; i++){
    std::cin>>arr[i];
  }
  product(arr, n);
  return 0;
}