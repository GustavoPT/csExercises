package com.company;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.println("This is the company Database");
        System.out.println("What do you wish to do?");
        System.out.println("A) Add a customer");
        System.out.println("B) Update a customer");
        System.out.println("c) remove a customer");
        
//        String input = in.next();
//        input = input.toUpperCase();
//        checker(input);

        DB db = new DB();
//        db.addEmployee("tom");
//        db.getAllNames();
    }

    public static void checker(String input)
    {
        if(input.equals("A"))
        {
            System.out.println("Your input was A");
        }
        else if(input.equals("B"))
        {
            System.out.println("Your input was B");
        }
        else if(input.equals("C"))
        {
            System.out.println("Your input was C");
        }
    }

//    public static class DB
//    {
//        Hashtable h = new Hashtable();
//        ArrayList<String> employeeNames = new ArrayList<String>();
//
//        public DB()
//        {
//            System.out.println("DB initilaized");
//        }
//
//        public void getAllNames()
//        {
//            for (int i = 0; i < employeeNames.size();i++)
//            {
//                System.out.println(employeeNames.get(i));
//                System.out.println("\n");
//            }
//        }
//
//        public void addEmployee(String name)
//        {
//            employeeNames.add(name);
//        }
//    }

    public static class Department
    {
        String name;
        Manager mgr;
        ArrayList<Employee> employees;
        String location;

        public Department()
        {

        }
    }

    public static class Employee
    {
        String fname;
        String lname;
        String minit;

        public Employee()
        {

        }
    }

    public static class Manager
    {
        String name;

        public Manager()
        {
            System.out.println("Manager Initialized");
        }
    }


    public static class Project
    {


    }



//    public static String executePost(String targetURL,String urlParameters)
//    {
//        HttpURLConnection connection = null;
//
//        try
//        {
//            URL url = new URL(targetURL);
//            connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("POST");
//            connection.setRequestProperty("Content-type","application/x-www-form-urlencoded");
//            connection.setRequestProperty("Content-Length",Integer.toString(urlParameters.getBytes().length));
//            connection.setRequestProperty("Content-Language","en-US");
//
//            connection.setUseCaches(false);
//            connection.setDoOutput(true);
//
//            // Send request
//            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
//            wr.writeBytes(urlParameters);
//            wr.close();
//
//            // Get Response
//            InputStream is = connection.getInputStream();
//            BufferedReader rd = new BufferedReader()
//
//        }
//        catch(Exception e)
//        {
//
//        }
//        finally
//        {
//
//        }
//    }

}


