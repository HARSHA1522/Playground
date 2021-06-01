#include <bits/stdc++.h> 
using namespace std; 
  
//  Utility method to get sum of digits of K 
int sumOfDigit(int K)  
{ 
    //  loop until K is not zero 
    int sod = 0; 
    while (K) 
    { 
        sod += K % 10; 
        K /= 10; 
    } 
    return sod; 
} 
  
// method returns count of numbers smaller than N,  
// satisfying difference condition 
int totalNumbersWithSpecificDifference(int N, int diff) 
{ 
    int low = 1, high = N; 
  
    //  binary search while loop     
    while (low <= high)  
    { 
        int mid = (low + high) / 2; 
  
        /* if difference between number and its sum  
           of digit is smaller than given difference  
           then  smallest number will be on left side */
        if (mid - sumOfDigit(mid) < diff)         
            low = mid + 1; 
          
        /* if difference between number and its sum  
           of digit is greater than or equal to given  
           difference then  smallest number will be on  
           right side */
        else        
            high = mid - 1;         
    } 
  
    // return the difference between 'smallest number  
    // found' and 'N' as result 
    return (N - high); 
} 
int main()
{
  long int n,d;
  std::cin>>n>>d;
  cout<<totalNumbersWithSpecificDifference(n,d);
  return 0;
}