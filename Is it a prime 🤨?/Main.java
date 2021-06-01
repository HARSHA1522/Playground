#include<iostream>
using namespace std;
int main()
{
  long int n;
  int count = 0;
  std::cin>>n;
  
  for(int i=2; i<n; i++)
  {
   if(n%i == 0)
     count++;
  }
  
  if(count == 0)
    cout<<"Prime";
  else
    cout<<"Not Prime";
  
}