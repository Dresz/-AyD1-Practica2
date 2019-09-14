package service;

import java.sql.*;

public class Connection {
    
    private static Connection conn = null;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://db4free.net:3307/practica2";
    private static final String admin = "practica2user";
    private static final String pass = "12345678";

    public static Connection obtener() {
        conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url,admin,pass);
        } catch (ClassNotFoundException ex) {
            System.out.println("error clase no encontrada");
        } catch (SQLException sql) {
             System.out.println("error fallo la conexion");
        }

        return conn;
    }

    public static void cerrar() throws SQLException, Throwable {
        if (conn != null) {
            conn.finalize();
        }
    }
    
}