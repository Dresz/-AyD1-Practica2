package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Paciente;

public class Consultas {
    
    private final String t_paciente = "Paciente";
    
    public boolean registrar(Connection connection, Paciente paciente){
        try{
            
            PreparedStatement consulta;
            
            consulta = connection.prepareStatement("INSERT INTO "+ this.t_paciente 
                    +"('nombre','telefono','direccion','fechanac','email','password') VALUES (?,?,?,?,?,?);");
            
            consulta.setString(1,paciente.getNombre());
            consulta.setString(2,paciente.getTelefono());
            consulta.setString(3,paciente.getDireccion());
            consulta.setString(4,paciente.getFechanac());
            consulta.setString(5,paciente.getEmail());
            consulta.setString(6,paciente.getPassword());
            
            consulta.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    
    public boolean login(Connection conexion, String email, String password) throws SQLException {
        int cont = 0;

        try{
            
            PreparedStatement consulta = conexion.prepareStatement("SELECT email FROM " + 
                    this.t_paciente + " WHERE email = ? AND password = ?;");

            consulta.setString(1,email);
            consulta.setString(2,password);

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
