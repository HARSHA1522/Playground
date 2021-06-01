#include<iostream>
#include <bits/stdc++.h>

using namespace std;
int main()
{
  long int num;
  long int power;
  long int ans;
  
  std::cin>>num>>power;
  ans = pow(num,power);
  std::cout<<ans;
  return 0;
}