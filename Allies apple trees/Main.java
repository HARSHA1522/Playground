#include<bits/stdc++.h>
#include<iostream>

int main(){

  int x;
  std::cin>>x;
  int i = 1;
  int j = 12;
  int len = 1;
  while( true){
    if(x == 0){
      len = 0;
    }
    
    else{
      
      if( x >= i && x<=j){
		break;
      }
      
      else{
        len++;
        i = i +  12;
        j = j + 12;
      }
  }}
   int perimeter = 8 * len;
   std::cout<<perimeter;
  return 0;
}