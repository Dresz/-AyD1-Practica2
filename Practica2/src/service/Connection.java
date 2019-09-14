package service;

import java.sql.*;

public class Connection {
    
    private static Connection conn = null;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/practica2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    
    public static Connection obtener() {
        conn = null;
        try {
            Class.forName(DRIVER);
            conn = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
            
            System.out.println("Conexion Establecida");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error ClassNotFoundException");
        } catch (SQLException sql) {
             System.out.println("Error SQLException");
        }
        return conn;
    }

    public static void cerrar() throws SQLException, Throwable {
        if (conn != null) {
            conn.finalize();
        }
    }
    
}