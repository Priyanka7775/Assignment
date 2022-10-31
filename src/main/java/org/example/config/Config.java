package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/employeedb";
            String user="root";
            String pass="admin";
            Connection connection= DriverManager.getConnection(url,user,pass);
            return connection;
        }
    }


