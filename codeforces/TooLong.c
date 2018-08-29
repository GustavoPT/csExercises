#include <stdio.h>
#include <string.h>

char* wordConverter(char* longString)
{
    char* returnString = "";

    if(strlen(longString) > 10)
    {
        printf("%s","This is long");
        int stringLength = strlen(longString);
    }
    return returnString;
}

int main(int argc,char * argv[])
{
  char longString[50];
  fgets(longString,50,stdin);
  printf("%s",wordConverter(longString));
}