#include <cstring>
#include <iostream>

int main()
{
  char caption[100];
  std::cin.getline(caption, 100);
  
  int count = strlen(caption);
  int word_count=1;
  
  for(int i=0; i<count; i++)
  {
    if(caption[i]==' ')
      word_count++;
  }
  
  if(word_count<=10)
  {
    std::cout<<"Caption eligible for the contest";
  }
  else
  {
    std::cout<<"Caption not eligible for the contest";
  }
  
   return 0;
}