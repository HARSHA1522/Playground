#include<iostream>
using namespace std;
int main()
{
  int m,n;
  std::cin>>m>>n;
  int arr[m][n];
  
  for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
      std::cin>>arr[i][j];
    }
  }
  
  int a,b;
  int row_sum = 0;
  int column_sum = 0;
  std::cin>>a>>b;
  
  for(int j=0; j<n; j++){
   	row_sum += arr[a][j];
  }
  
  for(int i=0; i<m; i++){
    if(i != a)
      column_sum += arr[i][b];
  }
  int ans = row_sum + column_sum;
  std::cout<<ans;
}