package com.company;

import java.sql.*;

public class DB {
    private static String username = "root";
    private static String password = "";
    private static String dbname = "COMPANY";
    private static String connectionString = "jdbc:mysql://localhost:3306/" + dbname;
    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    public DB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionString, username, password);
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT * from employee");

            while (rs.next())
            {
//                int id = rs.getInt("idNo");
                String firstName = rs.getString("fname");
                String lastName = rs.getString("lname");
                System.out.format(" First Name %s, Last Name %s", firstName, lastName);
                System.out.println("\n");
            }
            statement.close();
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}