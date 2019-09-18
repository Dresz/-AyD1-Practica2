/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

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

/**
 *
 * @author Luis
 */
public class PrincipalTest {
    
    public PrincipalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Principal.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Principal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Principal.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String email = "";
        Principal instance = new Principal();
        instance.setUser(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctors method, of class Principal.
     */
    @Test
    public void testSetDoctors() {
        System.out.println("setDoctors");
        LinkedList<Doctor> doctores = null;
        Principal instance = new Principal();
        boolean expResult = false;
        boolean result = instance.setDoctors(doctores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearCita method, of class Principal.
     */
    @Test
    public void testCrearCita() {
        System.out.println("crearCita");
        Principal instance = new Principal();
        Cita expResult = null;
        Cita result = instance.crearCita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCitasMod method, of class Principal.
     */
    @Test
    public void testSetCitasMod() {
        System.out.println("setCitasMod");
        LinkedList<Cita> citas = null;
        Principal instance = new Principal();
        boolean expResult = false;
        boolean result = instance.setCitasMod(citas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatosCita method, of class Principal.
     */
    @Test
    public void testSetDatosCita() throws Exception {
        System.out.println("setDatosCita");
        Cita cita = null;
        Principal instance = new Principal();
        boolean expResult = false;
        boolean result = instance.setDatosCita(cita);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctoresMod method, of class Principal.
     */
    @Test
    public void testSetDoctoresMod() {
        System.out.println("setDoctoresMod");
        LinkedList<Doctor> doctores = null;
        Principal instance = new Principal();
        boolean expResult = false;
        boolean result = instance.setDoctoresMod(doctores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPacientesMod method, of class Principal.
     */
    @Test
    public void testSetPacientesMod() {
        System.out.println("setPacientesMod");
        LinkedList<Paciente> pacientes = null;
        Principal instance = new Principal();
        boolean expResult = false;
        boolean result = instance.setPacientesMod(pacientes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCitaMod method, of class Principal.
     */
    @Test
    public void testGetCitaMod() {
        System.out.println("getCitaMod");
        Principal instance = new Principal();
        Cita expResult = null;
        Cita result = instance.getCitaMod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarCita method, of class Principal.
     */
    @Test
    public void testActualizarCita() {
        System.out.println("actualizarCita");
        Principal instance = new Principal();
        boolean expResult = false;
        boolean result = instance.actualizarCita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llenarDoctores method, of class Principal.
     */
    @Test
    public void testLlenarDoctores() {
        System.out.println("llenarDoctores");
        Principal instance = new Principal();
        instance.llenarDoctores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
