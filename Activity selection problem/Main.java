#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct activity
{
  int start,finish,pos;
};
bool arr_sort(activity s1, activity s2)
{
  return (s1.finish < s2.finish);
}
int activity_selection(int n, activity arr[], int b[])
{
  sort(arr, arr+n, arr_sort);
  cout<< arr[0].pos <<" ";
  int i = 0;
  
  for(int j=1; j<n; j++)
  {
    if(arr[j].start >= arr[i].finish){
      cout<<arr[j].pos<<" ";
      i = j;
    }
  }
  return 0;
}
int main()
{
  int n;
  std::cin>>n;
  activity arr[n];
  int b[n];
  int pos[n];
  for(int i=0;i<n;i++)
    cin>>arr[i].start;
  for(int i=0;i<n;i++)
    cin>>arr[i].finish;
  for(int i=0; i<n; i++)
    arr[i].pos = i;
  activity_selection(n,arr,b);
  return 0;
}