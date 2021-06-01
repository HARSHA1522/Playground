#include<iostream>
int main()
{
  int r,c;
  std::cin>>r>>c;
  
  int mat1[r][c];
  int mat2[r][c];
  int sum[r][c];
  
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      std::cin>>mat1[i][j];
    }
  }
  
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      std::cin>>mat2[i][j];
    }
  }
  
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
     sum[i][j] = mat1[i][j] + mat2[i][j];
      }
    }
  
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      std::cout<<sum[i][j]<<" ";
    }
    std::cout<<"\n";
  }
    
  return 0;
}