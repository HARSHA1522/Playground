#include<iostream>
int main()
{
    int a,b,c,gcd1,res,ans;
  int small,gcd;
    std::cin>>a>>b>>c>>ans;
   if(a<b)
   {
     if(a<c)
       small =a;
     else 
     small=c;
   }
  else
  {
       if(b<c)
       small =b;
     else 
     small=c;
  }
  while(small!=0)
  {
    if(a%small==0&&b%small==0&&c%small==0)
    { gcd=small;
    break;}
    small--;
  }
  if(gcd==ans)
    printf("Answer is correct.");
  else
    printf("Answer is wrong.");
  return 0;
    
    
}