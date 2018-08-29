package com.company;

import java.sql.*;
public class DBConnect
{
    private static String username = "root";
    private static String password = "";
    private static String connectionString = "jdbc:mysql://localhost:3306/javadbtest";
    private static Connection connection;
    private static Statement command;
    private static ResultSet data;
    public DBConnect() {

        try
        {
            
            command.execute("SELECT * from student");
            ResultSet rs = command.executeQuery("SELECT * from student");

            while (rs.next()) {
                int id = rs.getInt("idNo");
                String firstName = rs.getString("fname");
                String lastName = rs.getString("lname");
                System.out.format(" First Name %s, Last Name %s,idNo %d", firstName, lastName, id);
                System.out.println("\n");
            }
            command.close();

        } catch (Exception e)
        {
            System.out.println("Exception " + e.getMessage());
            e.printStackTrace();
        }

    }
}
