package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Cita;
import models.Doctor;
import models.Paciente;

public class Consultas {
    
    private final String t_paciente = "Paciente";
    
    public boolean registrar(Connection connection, Paciente paciente){
        try{
            
            PreparedStatement consulta;
            
            consulta = connection.prepareStatement("INSERT INTO "+ this.t_paciente 
                    +"(nombre,telefono,direccion,fechanac,email,password) VALUES (?,?,?,?,?,?);");
            
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
    
    public LinkedList<Doctor> getDoctores(Connection conexion) throws SQLException{
        PreparedStatement consulta = conexion.prepareStatement( "SELECT doc.iddoctor, doc.nombre, doc.telefono, esp.nombre\n" +
                                                                "FROM Doctor doc, Especialidad esp\n" +
                                                                "WHERE doc.especialidad = esp.idespecialidad;");
        ResultSet res = consulta.executeQuery();

        LinkedList<Doctor> doctores = new LinkedList<>();
        while(res.next()){
            Doctor doctor = new Doctor();
            doctor.setIddoctor(res.getInt(1));
            doctor.setNombre(res.getNString(2));
            doctor.setTelefono(res.getNString(3));
            doctor.setEspecialidad(res.getNString(4));    
            doctores.add(doctor);
        }        
        return doctores;
    }
    
    
    public boolean crearCita(Connection connection, Cita cita){
        try{
            
            PreparedStatement consulta;
            
            consulta = connection.prepareStatement("INSERT INTO Cita"
                    + "(doctor,paciente,fecha,horainicio,horafin) VALUES (?,?,?,?,?);");
            
            consulta.setInt(1,cita.getDoctor());
            consulta.setInt(2,cita.getPaciente());
            consulta.setDate(3,cita.getFecha());
            consulta.setTime(4,cita.getHorainicio());
            consulta.setTime(5,cita.getHorafin());
            
            
            consulta.executeUpdate();            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
        return true;
        
    }
    
    
    
    public LinkedList<Cita> getCitas(Connection conexion) throws SQLException{
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM Cita");
        ResultSet res = consulta.executeQuery();

        LinkedList<Cita> citas = new LinkedList<>();
        while(res.next()){
            Cita cita = new Cita();
            cita.setIdcita(res.getInt("idcita"));
            cita.setDoctor(res.getInt("doctor"));
            cita.setPaciente(res.getInt("paciente"));
            cita.setFecha(res.getDate("fecha"));
            cita.setHorainicio(res.getTime("horainicio"));
            cita.setHorafin(res.getTime("horafin"));
            citas.add(cita);
        }
        
        return citas;
    }
    
    public Boolean Eliminar_Cita(Connection conexion,String id)throws SQLException
    {
       try {
           System.out.println("se va a elminar: "+id);
            PreparedStatement consulta = conexion.prepareStatement("Delete FROM Cita WHERE idcita =  "+id+";");
            //consulta.setString(1,id);
            consulta.executeUpdate();
            return true;
       } catch (Exception e) {
           System.out.println(""+e);
           return false;
       }
    }

}
