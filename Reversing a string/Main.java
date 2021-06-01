#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
std::cin.getline(str,100);

for(i=0;i<100;i++)
{
  count++;
  if(str[i]=='\0')
  break;
}
  
for(i=0;i<count-1;i++)
  rev[i]=str[count-i-2];
  
std::cout<<rev;
}