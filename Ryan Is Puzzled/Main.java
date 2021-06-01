#include<iostream>
int main()
{
  int r,c;
  std::cin>>r>>c;
  
  int matrix[r][c];
  int transpose[c][r];
  
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      std::cin>>matrix[i][j];
    }
  }
  
  int i, j; 
      for (i = 0; i < c; i++) 
          for (j = 0; j < r; j++) 
              transpose[i][j] = matrix[j][i];
  
  for(int i=0; i<c; i++){
    for(int j=0; j<r; j++){
      std::cout<<transpose[i][j]<<" ";
    }
    std::cout<<"\n";
  }

  return 0;
}