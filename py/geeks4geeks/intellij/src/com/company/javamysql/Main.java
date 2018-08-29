package com.company.javamysql;

import java.sql.*;

//https://www.youtube.com/watch?v=CBKWoHGWTQE

public class Main{
    private static String username = "root";
    private static String password = "";
    private static String connectionString = "jdbc:mysql://localhost:3306/javadbtest";
    private static Connection connection;
    private static Statement command;
    private static ResultSet data;

    public static void main(String[] args) throws SQLException
    {
        try
        {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.execute("INSERT INTO student VALUES (NULL,'gust','pat')");
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
        }

        command.execute("SELECT * from student");
        ResultSet rs = command.executeQuery("SELECT * from student");

        while (rs.next())
        {
            int id = rs.getInt("idNo");
            String firstName = rs.getString("fname");
            String lastName = rs.getString("lname");
            System.out.format(" First Name %s, Last Name %s,idNo %d", firstName, lastName, id);
            System.out.println("\n");
        }
        command.close();
        
        Student st1 = new Student("ojama");
    }

//    public static Connection getConnection() throws Exception{
//        try {
//
//        }
//        catch (Exception e)
//        {
//
//        }
//    }


}