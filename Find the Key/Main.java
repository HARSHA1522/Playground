#include<iostream>
using namespace std;
int main(){

  int i1,i2,i3;
  cin>>i1>>i2>>i3;
  int a[4],b[4],c[4];
a[0]=i1,b[0]=i2,c[0]=i3;
for(int i=0;i<3;i++){
    a[0]=a[0]/10;
    b[0]=b[0]/10;
    c[0]=c[0]/10;
}

int max1=a[0];
if(b[0]<max1){
    max1=b[0];
}
 if(c[0]<max1) {

    max1=c[0];
}
  cout<<max1;

  a[1]=i1,b[1]=i2,c[1]=i3;
for(int i=0;i<2;i++){
    a[1]=a[1]/10;
    b[1]=b[1]/10;
    c[1]=c[1]/10;
}
a[1]=a[1]%10;
b[1]=b[1]%10;
c[1]=c[1]%10;

int max2=a[1];
if(b[1]>max2){
    max2=b[1];
}
if(c[1]>max2) {

    max2=c[1];
}
  cout<<max2;


   a[2]=i1,b[2]=i2,c[2]=i3;
for(int i=0;i<1;i++){
    a[2]=a[2]/10;
    b[2]=b[2]/10;
    c[2]=c[2]/10;
}
a[2]=a[2]%10;
b[2]=b[2]%10;
c[2]=c[2]%10;



int max3=a[2];
if(b[2]<max3){
    max3=b[2];
}
 if(c[2]<max3) {

    max3=c[2];
}
  cout<<max3;

a[3]=i1,b[3]=i2,c[3]=i3;

a[3]=a[3]%10;
b[3]=b[3]%10;
c[3]=c[3]%10;

  int max4=a[3];
if(b[3]>max4){
    max4=b[3];
}
 if(c[3]>max4) {

    max4=c[3];
}
  cout<<max4;


}