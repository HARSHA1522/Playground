#include<iostream>
using namespace std;

int main()
{
  long int n;
  std::cin>>n;
  long int sum;
  sum = n*(n+1);
  sum = sum/2;
  
  std::cout<<sum;
  return 0;
}