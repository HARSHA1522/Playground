#include<iostream>

void swap(int &x,int &y)
{
int temp;
temp =x;
x=y;
y=temp;
}

int main()
{
int a,b;
std::cin>>a>>b;
printf("Before swapping a= %d and b=%d",a,b);
swap(a,b);
printf("\nAfter swapping a= %d and b=%d",a,b);
return 0;
}