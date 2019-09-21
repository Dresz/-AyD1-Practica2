/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Luis
 */
public class PacienteTest {
    
    public PacienteTest() {
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
     * Test of getIdpaciente method, of class Paciente.
     */
    @Test
    public void testGetIdpaciente() {
        System.out.println("getIdpaciente");
        Paciente instance = new Paciente();
        int expResult = 0;
        int result = instance.getIdpaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdpaciente method, of class Paciente.
     */
    @Test
    public void testSetIdpaciente() {
        System.out.println("setIdpaciente");
        int idpaciente = 0;
        Paciente instance = new Paciente();
        instance.setIdpaciente(idpaciente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Paciente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Paciente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Paciente instance = new Paciente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Paciente.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Paciente.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Paciente instance = new Paciente();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Paciente.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Paciente.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Paciente instance = new Paciente();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechanac method, of class Paciente.
     */
    @Test
    public void testGetFechanac() {
        System.out.println("getFechanac");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getFechanac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechanac method, of class Paciente.
     */
    @Test
    public void testSetFechanac() {
        System.out.println("setFechanac");
        String fechanac = "";
        Paciente instance = new Paciente();
        instance.setFechanac(fechanac);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Paciente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Paciente.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Paciente instance = new Paciente();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Paciente.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Paciente.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Paciente instance = new Paciente();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Paciente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
