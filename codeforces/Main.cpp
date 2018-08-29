#include <stdio.h>
#include <iostream>
using namespace std;

bool isDivisible(int n)
{
  if(n % 2 != 0)
  {
    return false;    
  }
  return true;
}

string wordConverter(string longString)
{
    

}

int main()
{
  // One hot summer day Pete and his 
  // friend Billy decided to buy a watermellon
  // They chose the biggest and the ripest one 
  // in their opinion. after that the watermellon 
  // was weighted and the scales showed w kilos

  int n;
  cin >> n;

  if(isDivisible(n))
  {
      cout << "YES" << endl;
  }
  else{
      cout << "NO" << endl;
  }

  return 0;
}