package service;

import java.sql.*;

public class DB {
    
    private static Connection conn = null;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://db4free.net:3306/practica2?useSSL=false";
    private static final String USERNAME = "practica2user";
    private static final String PASSWORD = "12345678";
    
    public static Connection obtener() {
        conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Conexion Establecida");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public static void cerrar() throws SQLException, Throwable {
        if (!conn.isClosed()) {
            conn.close();
        }
    }
}