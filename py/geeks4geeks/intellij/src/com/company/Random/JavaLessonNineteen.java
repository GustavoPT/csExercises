package com.company.Random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaLessonNineteen {

    public static void main(String[] args) {

        String longString = "Derek Banas 12345";
        String strangeString = " 1Z aaa *** {{{";

        regexChecker("\\s\\d{5}\\s",longString);

    }

    public static void regexChecker(String theRegex,String str2Check)
    {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(str2Check);

        while (regexMatcher.find())
        {
            if(regexMatcher.group().length() != 0)
            {
                System.out.println(regexMatcher.group().trim());
            }
            
            System.out.println("Start index" + regexMatcher.start());
            System.out.println("End index" + regexMatcher.end());
        }
    }

    public static void regexReplace(String str2Replace)
    {
        Pattern replace = Pattern.compile("[A-Z]+",Pattern.CASE_INSENSITIVE);
    }
}
