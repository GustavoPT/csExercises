def wordConverter(longString):
    returnString = ""
    if(len(longString) > 10):
        firstChar = longString[0]
        lastChar = longString[len(longString) - 1]
        stringLength = len(longString)
        returnString += firstChar
        returnString += str(stringLength)
        returnString += lastChar
        return returnString

string = raw_input("")

print(wordConverter(string))