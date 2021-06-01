#include <iostream>
using namespace std;

struct complex
{
  int real1;
  int imaginary1;
  int real2;
  int imaginary2;
};

int addition(complex);
int subtraction(complex);
int multiplication(complex);

int main()
{
  int operation;
  complex s1;
  std::cin>>operation;
  std::cin>>s1.real1;
  std::cin>>s1.imaginary1;
  std::cin>>s1.real2;
  std::cin>>s1.imaginary2;
  if(operation>3 || operation<1)
  {
    std::cout<<"Invalid choice";
  }
  if(operation == 1)
  {
    addition(s1);
  }
  if(operation == 2)
  {
    subtraction(s1);
  }
  if(operation == 3)
  {
    multiplication(s1);
  }
  return 0;
}

int addition(complex s1){
  int real = s1.real1 + s1.real2;
  int imaginary = s1.imaginary1 + s1.imaginary2;
  std::cout<<real;
  if(imaginary>0)
   std::cout<<"+"<<imaginary<<"i";
  else if(imaginary < 0)
    std::cout<<imaginary<<"i";
  else
    return 0;
}

int subtraction(complex s1){
  int real = s1.real1 - s1.real2;
  int imaginary = s1.imaginary1 - s1.imaginary2;
  std::cout<<real;
  if(imaginary>0)
   std::cout<<"+"<<imaginary<<"i";
  else if(imaginary < 0)
    std::cout<<imaginary<<"i";
  else
    return 0;
}

int multiplication(complex s1){
  int real = (s1.real1 * s1.real2)-(s1.imaginary1 * s1.imaginary2);
  int imaginary = (s1.imaginary1 * s1.real2)+(s1.real1 * s1.imaginary2);
  std::cout<<real;
  if(imaginary>0)
   std::cout<<"+"<<imaginary<<"i";
  else if(imaginary < 0)
    std::cout<<imaginary<<"i";
  else
    return 0;
}
