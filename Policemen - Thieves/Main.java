#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;

int max_thieves(char arr[], int n, int k)
{
  vector<int> thi;
  vector<int> pol;
  int count =0;
  
  for(int i=0;i<n;i++)
  {
    if(arr[i] == 'P')
      pol.push_back(i);
    if(arr[i] == 'T')
      thi.push_back(i);
  }
  int l=0, r=0;
  while(l<thi.size() && r<pol.size())
  {
    if(abs(thi[l]-pol[r])<=k)
    {
      count++;
      l++;
      r++;
    }
    else if(thi[l]<pol[r])
      l++;
    else
      r++;
  }
  return count;
}
int main()
{
  int n;
  std::cin>>n;
  char arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  int k;
  std::cin>>k;
  
  cout<<"Maximum thieves caught: "<<max_thieves(arr, n, k);
  
  return 0;
}