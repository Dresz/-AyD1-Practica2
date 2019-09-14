package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Usuario;

public class Consultas {
    
    private final String tusuario = "Usuarios";
    
    public boolean registrar(Connection connection, Usuario user){
        try{
            PreparedStatement consulta;
            consulta = connection.prepareStatement("INSERT INTO "+ this.tusuario 
                    +"(carnet,nombre,contrasenia) VALUES (?,?,?);");
            
            consulta.setInt(1,user.getCarnet());
            consulta.setString(2,user.getName());
            consulta.setString(3,user.getPassword());
            consulta.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public boolean login(Connection conexion, int carnet, String contrasenia) throws SQLException {
        int cont = 0;

        try{
           PreparedStatement consulta = conexion.prepareStatement("SELECT carnet FROM " + 
                   this.tusuario + " WHERE carnet = ? AND contrasenia = ?;");
           
           consulta.setInt(1,carnet);
           consulta.setString(2,contrasenia);
           
           ResultSet resultado = consulta.executeQuery();
           
           
           while(resultado.next()){
               cont++;
              /*resultado.getInt("carnet")*/
           }
           
        }catch(SQLException ex){
           throw new SQLException(ex);
        }
        
        if(cont == 1)
            return true;
        
        return false;
    }

}
