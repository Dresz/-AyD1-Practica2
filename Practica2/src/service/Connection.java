package service;

import java.sql.*;

public class Connection {
    private static Connection conn = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/java_mysql", "root", "1234");

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