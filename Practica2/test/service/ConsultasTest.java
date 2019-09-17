/*
 * clase test para las consultas a base de datos
 */
package service;

import java.sql.Connection;
import java.util.LinkedList;
import models.Cita;
import models.Doctor;
import models.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class Consultas.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        Connection conexion = DB.obtener();
        String email = "inventado@protonmail.com";
        String password = "adios";
        Consultas instance = new Consultas();
        boolean expResult = false;
        boolean result = instance.login(conexion, email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDoctores method, of class Consultas.
     */
    @Test
    public void testGetDoctores() throws Exception {
        System.out.println("getDoctores");
        Connection conexion = null;
        Consultas instance = new Consultas();
        LinkedList<Doctor> expResult = null;
        LinkedList<Doctor> result = instance.getDoctores(conexion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearCita method, of class Consultas.
     */
    @Test
    public void testCrearCita() {
        System.out.println("crearCita");
        Connection connection = null;
        Cita cita = null;
        Consultas instance = new Consultas();
        boolean expResult = false;
        boolean result = instance.crearCita(connection, cita);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCitas method, of class Consultas.
     */
    @Test
    public void testGetCitas() throws Exception {
        System.out.println("getCitas");
        Connection conexion = null;
        Consultas instance = new Consultas();
        LinkedList<Cita> expResult = null;
        LinkedList<Cita> result = instance.getCitas(conexion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Cita method, of class Consultas.
     */
    @Test
    public void testEliminar_Cita() throws Exception {
        System.out.println("Eliminar_Cita");
        Connection conexion = null;
        String id = "";
        Consultas instance = new Consultas();
        Boolean expResult = null;
        Boolean result = instance.Eliminar_Cita(conexion, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
