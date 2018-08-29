package com.company.Random;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StudentTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input;
        String pattern = "(.*)(\\d+)(.*)";
        System.out.println("Please input the date");
        input = in.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Pattern r = Pattern.compile(pattern);

        try {
            Date nd = sdf.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            Student st = new Student(2,"one");
        }
        catch (Exception e)
        {
            System.out.println("exception");
        }

        try{
            Student nst = new Student(3,"two");
        }
        catch (Exception e)
        {
            System.out.println("exception 2");
        }
    }
}
