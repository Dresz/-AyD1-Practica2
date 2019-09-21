package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Cita;
import models.Doctor;
import models.Paciente;
import models.ReporteModel;

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
            
            consulta = connection.prepareStatement("INSERT INTO Cita(doctor,paciente,fecha,horainicio,horafin) VALUES (?,?,?,?,?)");
            
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
    
    /*MOD*/
    public Doctor getDoctorPorId(Connection conexion, int iddoctor) throws SQLException{
        PreparedStatement consulta = conexion.prepareStatement("SELECT doc.iddoctor, doc.nombre, doc.telefono, esp.nombre\n" +
                                                                "FROM Doctor doc, Especialidad esp\n" +
                                                                "WHERE doc.especialidad = esp.idespecialidad AND doc.iddoctor=?;");
        consulta.setInt(1, iddoctor);
        ResultSet res = consulta.executeQuery();

        Doctor doctor = new Doctor();
        while(res.next()){
            doctor.setIddoctor(res.getInt(1));
            doctor.setNombre(res.getNString(2));
            doctor.setTelefono(res.getNString(3));
            doctor.setEspecialidad(res.getNString(4));
        }
        
        return doctor;
    }
    public Paciente getPacientePorId(Connection conexion, int idpaciente) throws SQLException{
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM Paciente WHERE idpaciente=?;");
        consulta.setInt(1, idpaciente);
        ResultSet res = consulta.executeQuery();

        Paciente paciente = new Paciente();
        while(res.next()){
            paciente.setIdpaciente(res.getInt("idpaciente"));
            paciente.setNombre(res.getNString("nombre"));
            paciente.setTelefono(res.getNString("telefono"));
            paciente.setDireccion(res.getNString("direccion"));
            paciente.setFechanac(res.getDate("fechanac").toString());
            paciente.setEmail(res.getNString("email"));
            paciente.setPassword(res.getNString("password"));
        }
        
        return paciente;
    }
    
    public LinkedList<Paciente> getPacientes(Connection conexion) throws SQLException{
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM Paciente;");
        ResultSet res = consulta.executeQuery();

        LinkedList<Paciente> pacientes = new LinkedList<>();
        while(res.next()){
            Paciente paciente = new Paciente();
            paciente.setIdpaciente(res.getInt("idpaciente"));
            paciente.setNombre(res.getNString("nombre"));
            paciente.setTelefono(res.getNString("telefono"));
            paciente.setDireccion(res.getNString("direccion"));
            paciente.setFechanac(res.getDate("fechanac").toString());
            paciente.setEmail(res.getNString("email"));
            paciente.setPassword(res.getNString("password"));
            pacientes.add(paciente);
        }
        
        return pacientes;
    }
    
    public LinkedList<Cita> getCitas(Connection conexion) throws SQLException{
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM Cita;");
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
    public LinkedList<Cita> getCitasid(Connection conexion,String id) throws SQLException{
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM Cita ci,Paciente pa WHERE pa.email='"+id+"' AND ci.paciente = pa.idpaciente;");
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
    
    public boolean modificarCita(Connection connection, Cita cita){
        try{
            PreparedStatement consulta;
            consulta = connection.prepareStatement("UPDATE Cita SET "
                    + "doctor=?,paciente=?,fecha=?,horainicio=?,horafin=? WHERE idcita=?;");
            
            consulta.setInt(1,cita.getDoctor());
            consulta.setInt(2,cita.getPaciente());
            consulta.setDate(3,cita.getFecha());
            consulta.setTime(4,cita.getHorainicio());
            consulta.setTime(5,cita.getHorafin());
            consulta.setInt(6, cita.getIdcita());
            consulta.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public Cita Get_Cita(Connection conexion,String id)throws SQLException
    {
       try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM Cita where idcita =  "+id+";");
            ResultSet res = consulta.executeQuery();

        
        
            Cita cita = new Cita();
            cita.setIdcita(res.getInt("idcita"));
            cita.setDoctor(res.getInt("doctor"));
            cita.setPaciente(res.getInt("paciente"));
            cita.setFecha(res.getDate("fecha"));
            cita.setHorainicio(res.getTime("horainicio"));
            cita.setHorafin(res.getTime("horafin"));
            return cita;
        
       } catch (Exception e) {
           return null;
       }
    }
    
    public Boolean Eliminar_Cita(Connection conexion,String id)throws SQLException
    {
       try {
<<<<<<< HEAD
           System.out.println("la cita: "+id);
            PreparedStatement consulta = conexion.prepareStatement("Delete FROM Cita WHERE  idcita = "+id+";");
=======
            PreparedStatement consulta = conexion.prepareStatement("Delete * FROM Cita where idcita =  "+id+";");
            consulta.setString(1,id);
>>>>>>> test
            consulta.executeUpdate();
            return true;
       } catch (Exception e) {
           return false;
       }
    }
    public LinkedList<ReporteModel> getReporte1(Connection conexion, String fecha) throws SQLException{
        String sql="";
        PreparedStatement consulta;
        ResultSet res=null;
        
        if((fecha.equals("ok"))){
            sql="SELECT c.idcita as idcita, p.nombre as paciente, p.email as correo, d.nombre as doctor, c.fecha as fecha, c.horainicio as horainicio, c.horafin as horafin, e.nombre as esp \n" +
                                                                "FROM Doctor d, Especialidad e,Paciente p, Cita c \n" +
                                                                "WHERE d.especialidad = e.idespecialidad AND d.iddoctor=c.doctor AND c.paciente=p.idpaciente "+
                                                                ";";
            
            consulta= conexion.prepareStatement(sql);
            res = consulta.executeQuery();
        }
        else {
            Date fechabuscar=Date.valueOf(fecha);
            sql="SELECT c.idcita as idcita, p.nombre as paciente, p.email as correo, d.nombre as doctor, c.fecha as fecha, c.horainicio as horainicio, c.horafin as horafin, e.nombre as esp\n" +
                                                                "FROM Doctor d, Especialidad e,Paciente p, Cita c \n" +
                                                                "WHERE d.especialidad = e.idespecialidad AND d.iddoctor=c.doctor AND c.paciente=p.idpaciente "+
                                                                "AND c.fecha=? ;";
            
            consulta= conexion.prepareStatement(sql);
            consulta.setDate(1,fechabuscar);
            res = consulta.executeQuery();
            
        }
        LinkedList<ReporteModel> citas = new LinkedList<>();
        while(res.next()){
            ReporteModel cita = new ReporteModel();
            cita.setIdcita(res.getInt("idcita"));
            cita.setDoctor(res.getString("doctor"));
            cita.setPaciente(res.getString("paciente"));
            cita.setCorreo(res.getString("correo"));
            cita.setEspecialidad(res.getString("esp"));
            cita.setFecha(res.getDate("fecha"));
            cita.setHorainicio(res.getTime("horainicio"));
            cita.setHorafin(res.getTime("horafin"));
            citas.add(cita);
        }
        
        return citas;
    }
    
    public LinkedList<ReporteModel> getReporte2(Connection conexion, int buscar, int tipo) throws SQLException{
        PreparedStatement consulta;
        ResultSet res=null;
        String sql="";
        if(tipo==1){
            sql="SELECT c.idcita as idcita, p.nombre as paciente, p.email as correo, d.nombre as doctor, c.fecha as fecha, c.horainicio as horainicio, c.horafin as horafin, e.nombre as esp \n" +
                                                                "FROM Doctor d, Especialidad e,Paciente p, Cita c \n" +
                                                                "WHERE d.especialidad = e.idespecialidad AND d.iddoctor=c.doctor AND c.paciente=p.idpaciente "+
                                                                "AND c.paciente=? ;";
            
            consulta= conexion.prepareStatement(sql);
            consulta.setInt(1,buscar);
            res = consulta.executeQuery();
        }
        else {
            sql="SELECT c.idcita as idcita, p.nombre as paciente, p.email as correo, d.nombre as doctor, c.fecha as fecha, c.horainicio as horainicio, c.horafin as horafin, e.nombre as esp\n" +
                                                                "FROM Doctor d, Especialidad e,Paciente p, Cita c \n" +
                                                                "WHERE d.especialidad = e.idespecialidad AND d.iddoctor=c.doctor AND c.paciente=p.idpaciente "+
                                                                "AND c.doctor=? ;";
            
            consulta= conexion.prepareStatement(sql);
            consulta.setInt(1,buscar);
            res = consulta.executeQuery();
            
        }
        

        LinkedList<ReporteModel> citas = new LinkedList<>();
        while(res.next()){
            ReporteModel cita = new ReporteModel();
            cita.setIdcita(res.getInt("idcita"));
            cita.setDoctor(res.getString("doctor"));
            cita.setPaciente(res.getString("paciente"));
            cita.setCorreo(res.getString("correo"));
            cita.setEspecialidad(res.getString("esp"));
            cita.setFecha(res.getDate("fecha"));
            cita.setHorainicio(res.getTime("horainicio"));
            cita.setHorafin(res.getTime("horafin"));
            citas.add(cita);
        }
        
        return citas;
    }
}
