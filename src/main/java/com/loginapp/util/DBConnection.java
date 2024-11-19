package com.loginapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/my_construccion";
    private static final String USER = "root"; // Cambia si tienes un usuario diferente
    private static final String PASSWORD = ""; // Agrega tu contraseña si tienes configurada una

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}