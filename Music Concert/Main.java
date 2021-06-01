#include<iostream>
#include<cstdlib>

int main(){
  int n;
  std::cin>>n;
  int *ptr;
  ptr = (int*)malloc(n*sizeof(int));
  
  for(int i=0;i<n;i++)
    std::cin>>*(ptr+i);
  
 int male=0, fem=0;
 
  for(int i=0;i<n;i++)
    if((*(ptr+i))%2==0)
      fem++;
  else 
    male++;
  
  std::cout<<male<<"\n"<<fem;
  return 0;
}