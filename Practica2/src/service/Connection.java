package service;

import java.sql.*;

public class Connection {
    private static Connection conn = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                
                conn = (Connection) DriverManager.getConnection (
                        "jdbc:mysql://remotemysql.com/HDwczIp52O", //database
                        "HDwczIp52O", //user
                        "UaQzGsMrSL" //password
                );

            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return conn;
    }

    public static void cerrar() throws SQLException, Throwable {
        if (conn != null) {
            conn.finalize();
        }
    }
    
}