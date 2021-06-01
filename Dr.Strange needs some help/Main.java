#include<iostream>
#include<bits/stdc++.h>

int main()
{
  int m,n,req;
  std::cin>>m>>n>>req;
  long bac;
  bac = pow(m,n);
  if (bac < req)
    printf("Sorry Doctor! You need more bacteria.");
  else 
    printf("Doctor, you can proceed with your experiment.");
  return 0;
}

    