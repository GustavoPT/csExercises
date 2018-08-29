import java.util.Scanner;

public class TooLong {
    // http://codeforces.com/problemset/problem/71/A
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String longString;
        longString = in.next();
        System.out.println(wordConverter(longString));
    }
    public static String wordConverter(String longString)
    {
        String substring = "";
        StringBuilder st;

        if(longString.length() > 10)
        {
            int stringLength = longString.length() - 2;
            char firstChar = longString.charAt(0);
            char lastChar = longString.charAt(longString.length() - 1);
            // substring = longString.substring(0,longString.length() - 1);
            st = new StringBuilder(firstChar + stringLength + lastChar);
        }
        else
        {
            // substring = longString;
            st = new StringBuilder(substring);
        }
        return st.toString();
    }
}