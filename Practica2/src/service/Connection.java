package service;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {
    
    private static Connection conn = null;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://remotemysql.com/HDwczIp52O";
    private static final String admin = "HDwczIp52O";
    private static final String pass = "UaQzGsMrSL";

    public static Connection obtener() throws SQLException {
        conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url,admin,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }

    public static void cerrar() throws SQLException, Throwable {
        if (conn != null) {
            conn.finalize();
        }
    }
    
}