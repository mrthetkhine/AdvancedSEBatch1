#include <iostream>
using namespace std;

void passByValue(int a)
{
    a++;
}
void change(int& a)
{
    a ++;
}
int main()
{
    int data = 20;
    change(data);
    cout<<"Hello "<<data<<endl;

    passByValue(data);
    cout<<"Hello "<<data<<endl;

    cout<< "Address "<< &data;
    return 0;
}