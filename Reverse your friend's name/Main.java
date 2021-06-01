#include<iostream>
#include<string>
int main() 
{ 
std::string s;
std::getline(std::cin,s);
int l=s.size();
for(int i=l-1;i>=0;i--)
  std::cout<<s[i];
return 0;
}