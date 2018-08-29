#include <stdio.h>
#include <iostream>
using namespace std;

// http://codeforces.com/problemset/problem/71/A

string wordConverter(string longString)
{
   string returnString = "";

   if(longString.length() > 10)
   {
        int stringlength = longString.length() - 2;
        char firstChar = longString.at(0);
        cout << "First Char :" << firstChar << endl;
        char lastChar  = longString.at(longString.length() - 1);
        cout << "Last  Char :" << lastChar << endl;
        returnString += firstChar;
        cout << returnString << endl;
        returnString = returnString.append(std::to_string(stringlength));
        cout << "returnString " << returnString << endl;
        returnString += lastChar;
   }
   else
   {
       returnString = longString;
   }
//    cout << returnString;
   return returnString;
}

int main()
{
  string longString;
  cin >> longString;
  cout << "Output" <<  wordConverter(longString) << endl;

  return 0;
}