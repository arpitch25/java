#include <iostream>
using namespace std;
int main(){
    int a, b,r;
    char c;
    cout<<"enter the first variable ";
    cin>>a;
    cout<<"enter the second variable";
    cin>>b;
    cout<<"enter the operation ";
    cin>>c;
    if (c=='+'){
        r=a+b;
       cout<<r;    
    }else if (c=='-'){
        r=a-b;
       cout<<r; 
    }
}