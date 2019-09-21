/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.sql.Time;
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
public class CitaTest {
    
    public CitaTest() {
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
     * Test of getIdcita method, of class Cita.
     */
    @Test
    public void testGetIdcita() {
        System.out.println("getIdcita");
        Cita instance = new Cita();
        int expResult = -1;
        int result = instance.getIdcita();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdcita method, of class Cita.
     */
    @Test
    public void testSetIdcita() {
        System.out.println("setIdcita");
        int idcita = -1;
        Cita instance = new Cita();
        instance.setIdcita(idcita);
        assertEquals(idcita, instance.getIdcita());
    }

    /**
     * Test of getDoctor method, of class Cita.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        Cita instance = new Cita();
        int expResult = -1;
        int result = instance.getDoctor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDoctor method, of class Cita.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        int doctor = 0;
        Cita instance = new Cita();
        instance.setDoctor(doctor);
        assertEquals(doctor, instance.getDoctor());
        
    }

    /**
     * Test of getPaciente method, of class Cita.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        Cita instance = new Cita();
        int expResult = -1;
        int result = instance.getPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPaciente method, of class Cita.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        int paciente = 0;
        Cita instance = new Cita();
        instance.setPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Cita.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Cita instance = new Cita();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Cita.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Cita instance = new Cita();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHorainicio method, of class Cita.
     */
    @Test
    public void testGetHorainicio() {
        System.out.println("getHorainicio");
        Cita instance = new Cita();
        Time expResult = null;
        Time result = instance.getHorainicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHorainicio method, of class Cita.
     */
    @Test
    public void testSetHorainicio() {
        System.out.println("setHorainicio");
        Time horainicio = null;
        Cita instance = new Cita();
        instance.setHorainicio(horainicio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHorafin method, of class Cita.
     */
    @Test
    public void testGetHorafin() {
        System.out.println("getHorafin");
        Cita instance = new Cita();
        Time expResult = null;
        Time result = instance.getHorafin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHorafin method, of class Cita.
     */
    @Test
    public void testSetHorafin() {
        System.out.println("setHorafin");
        Time horafin = null;
        Cita instance = new Cita();
        instance.setHorafin(horafin);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cita.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cita instance = new Cita();
        instance.setIdcita(1);
        instance.setFecha(new java.sql.Date(119, 8, 21));
        String expResult = "1 - 2019-09-21";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
