#include <stdio.h>
#include <iostream>
using namespace std;

// http://codeforces.com/problemset/problem/1/A
int main()
{
  int n;
  int m;
  int a;

  cin >> n;
  cin >> m;
  cin >> a;

  int shape = m * n;
  int flagStone = a * a;
  double result = (double)shape / flagStone;

  cout << result;

  return 0;
}