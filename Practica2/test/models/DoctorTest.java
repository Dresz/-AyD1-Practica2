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
public class DoctorTest {
    
    public DoctorTest() {
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
     * Test of getIddoctor method, of class Doctor.
     */
    @Test
    public void testGetIddoctor() {
        System.out.println("getIddoctor");
        Doctor instance = new Doctor();
        int expResult = -1;
        int result = instance.getIddoctor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIddoctor method, of class Doctor.
     */
    @Test
    public void testSetIddoctor() {
        System.out.println("setIddoctor");
        int iddoctor = 0;
        Doctor instance = new Doctor();
        instance.setIddoctor(iddoctor);
    }

    /**
     * Test of getNombre method, of class Doctor.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Doctor.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Doctor instance = new Doctor();
        instance.setNombre(nombre);
    }

    /**
     * Test of getEspecialidad method, of class Doctor.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getEspecialidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEspecialidad method, of class Doctor.
     */
    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "";
        Doctor instance = new Doctor();
        instance.setEspecialidad(especialidad);
    }

    /**
     * Test of getTelefono method, of class Doctor.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefono method, of class Doctor.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Doctor instance = new Doctor();
        instance.setTelefono(telefono);
    }

    /**
     * Test of toString method, of class Doctor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Doctor instance = new Doctor();
        String expResult = " - ";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
