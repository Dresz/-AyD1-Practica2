/*
 * clase test para las consultas a base de datos
 */
package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import models.Cita;
import models.Doctor;
import models.Paciente;
import models.ReporteModel;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ConsultasTest {
    
    public ConsultasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicia el test de la clase Consultas");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finaliza el test de la clase Consultas");
    }
    
    @Before
    public void setUp() {
        System.out.println("Inicia el test del metodo ...");
    }
    
    @After
    public void tearDown() {
        System.out.println("Finaliza el test del metodo ...");
    }

    /**
     * Test of registrar method, of class Consultas.
     */
    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        Connection connection = DB.obtener();//iniciamos conexion
        
        Paciente paciente = new Paciente();
        paciente.setDireccion("direccion inventada");
        paciente.setEmail("inventado@protonmail.com");
        paciente.setFechanac("2000-05-04");
        paciente.setNombre("paciente enfermo");
        paciente.setPassword("hola");
        paciente.setTelefono("12345678");
        
        Consultas instance = new Consultas();
        boolean expResult = true;
        boolean result = instance.registrar(connection, paciente);
        assertEquals(expResult, result);
    }

    /**
     * Test of login method, of class Consultas.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        Connection conexion = DB.obtener();//obtenemos la conexion
        
        String email = "inventado@protonmail.com";
        String password = "adios";
        Consultas instance = new Consultas();
        boolean expResult = false;
        boolean result = instance.login(conexion, email, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDoctores method, of class Consultas.
     */
    @Test
    public void testGetDoctores() throws Exception {
        System.out.println("getDoctores");
        Connection conexion = DB.obtener();
        Consultas instance = new Consultas();
        boolean expResult = true;
        LinkedList<Doctor> result = instance.getDoctores(conexion);
        boolean obtenidos = result.size()>0;
        assertEquals(expResult, obtenidos);
                
    }

    /**
     * Test of crearCita method, of class Consultas.
     */
    @Test
    public void testCrearCita() {
        System.out.println("crearCita");
        Connection connection = DB.obtener();
        Cita cita = new Cita();
        cita.setDoctor(1);
        cita.setPaciente(1);
        cita.setFecha(new java.sql.Date(2011, 11, 27));
        cita.setHorainicio(new Time(10, 30, 0));
        cita.setHorafin(new Time(11,30,0));
        Consultas instance = new Consultas();
        boolean expResult = true;
        boolean result = instance.crearCita(connection, cita);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDoctorPorId method, of class Consultas.
     */
    @Test
    public void testGetDoctorPorId() throws Exception {
        System.out.println("getDoctorPorId");
        Connection conexion = DB.obtener();
        Consultas instance = new Consultas();
        int iddoctor = 1;
        Doctor result = instance.getDoctorPorId(conexion, iddoctor);
        assertNotNull(result);
    }
    
    /**
     * Test of getPacientePorId method, of class Consultas.
     */
    @Test
    public void testGetPacientePorId() throws Exception {
        System.out.println("getPacientePorId");
        Connection conexion = DB.obtener();
        Consultas instance = new Consultas();
        int idpaciente = 1;
        Paciente result = instance.getPacientePorId(conexion, idpaciente);
        assertNotNull(result);
    }
    
    /**
     * Test of getPacientes method, of class Consultas.
     */
    @Test
    public void testGetPacientes() throws Exception {
        System.out.println("getPacientes");
        Connection conexion = DB.obtener();
        Consultas instance = new Consultas();
        LinkedList<Paciente> result = instance.getPacientes(conexion);
        assertNotNull(result);
    }
    
    /**
     * Test of getCitas method, of class Consultas.
     */
    @Test
    public void testGetCitas() throws Exception {
        System.out.println("getCitas");
        Connection conexion = DB.obtener();
        Consultas instance = new Consultas();
        LinkedList<Cita> result = instance.getCitas(conexion);
        assertNotNull(result);
    }
    
    /**
     * Test of getCitasid method, of class Consultas.
     */
    @Test
    public void testGetCitasid() throws Exception {
        System.out.println("getCitasid");
        Connection conexion = DB.obtener();
        Consultas instance = new Consultas();
        LinkedList<Cita> result = instance.getCitasid(conexion, "paciente1@gmail.com");
        assertNotNull(result);
    }
    
    /**
     * Test of modificarCita method, of class Consultas.
     */
    @Test
    public void testModificarCita() throws Exception {
        System.out.println("modificarCita");
        Connection conexion = DB.obtener();
        Consultas instance = new Consultas();
        Cita cita = new Cita();
        cita.setIdcita(1);
        cita.setDoctor(1);
        cita.setPaciente(1);
        cita.setFecha(Date.valueOf("2019-09-17"));
        cita.setHorainicio(Time.valueOf("00:00:00"));
        cita.setHorafin(Time.valueOf("01:00:10"));
        Boolean result = instance.modificarCita(conexion, cita);
        assertTrue(result);
    }

    /**
     * Test of Eliminar_Cita method, of class Consultas.
     */
    @Test
    public void testEliminar_Cita() throws Exception {
        System.out.println("Eliminar_Cita");
        String id = "13";
        Consultas instance = new Consultas();
        Boolean expResult = true;
        Boolean result = instance.Eliminar_Cita((java.sql.Connection) DB.obtener(), id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getReporte1 method, of class Consultas.
     */
    @Test
    public void testGetReporte1() throws Exception {
        System.out.println("getReporte1");
        Connection conexion = DB.obtener();
        String fecha = "2019-09-12";
        Consultas instance = new Consultas();
        LinkedList<ReporteModel> expResult = new LinkedList<>();
        LinkedList<ReporteModel> result = instance.getReporte1(conexion, fecha);
        assertEquals(fecha, result.get(0).getFecha().toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getReporte2 method, of class Consultas.
     */
    @Test
    public void testGetReporte2() throws Exception {
        System.out.println("getReporte2");
        Connection conexion = DB.obtener();
        int buscar = 1;
        int tipo = 0;
        Consultas instance = new Consultas();
        LinkedList<ReporteModel> expResult = new LinkedList<>();
        LinkedList<ReporteModel> result = instance.getReporte2(conexion, buscar, tipo);
        assertEquals(expResult, result);
        
        tipo = 1;
        result = instance.getReporte2(conexion, buscar, tipo);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
