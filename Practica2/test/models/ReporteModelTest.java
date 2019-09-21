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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar
 */
public class ReporteModelTest {
    
    public ReporteModelTest() {
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
     * Test of getIdcita method, of class ReporteModel.
     */
    @Test
    public void testGetIdcita() {
        System.out.println("getIdcita");
        ReporteModel instance = new ReporteModel();
        int expResult = 0;
        int result = instance.getIdcita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdcita method, of class ReporteModel.
     */
    @Test
    public void testSetIdcita() {
        System.out.println("setIdcita");
        int idcita = 0;
        ReporteModel instance = new ReporteModel();
        instance.setIdcita(idcita);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoctor method, of class ReporteModel.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        ReporteModel instance = new ReporteModel();
        String expResult = "";
        String result = instance.getDoctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctor method, of class ReporteModel.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        String doctor = "";
        ReporteModel instance = new ReporteModel();
        instance.setDoctor(doctor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaciente method, of class ReporteModel.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        ReporteModel instance = new ReporteModel();
        String expResult = "";
        String result = instance.getPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaciente method, of class ReporteModel.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        String paciente = "";
        ReporteModel instance = new ReporteModel();
        instance.setPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class ReporteModel.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        ReporteModel instance = new ReporteModel();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class ReporteModel.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        ReporteModel instance = new ReporteModel();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEspecialidad method, of class ReporteModel.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        ReporteModel instance = new ReporteModel();
        String expResult = "";
        String result = instance.getEspecialidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEspecialidad method, of class ReporteModel.
     */
    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "";
        ReporteModel instance = new ReporteModel();
        instance.setEspecialidad(especialidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class ReporteModel.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        ReporteModel instance = new ReporteModel();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class ReporteModel.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        ReporteModel instance = new ReporteModel();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorainicio method, of class ReporteModel.
     */
    @Test
    public void testGetHorainicio() {
        System.out.println("getHorainicio");
        ReporteModel instance = new ReporteModel();
        Time expResult = null;
        Time result = instance.getHorainicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorainicio method, of class ReporteModel.
     */
    @Test
    public void testSetHorainicio() {
        System.out.println("setHorainicio");
        Time horainicio = null;
        ReporteModel instance = new ReporteModel();
        instance.setHorainicio(horainicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorafin method, of class ReporteModel.
     */
    @Test
    public void testGetHorafin() {
        System.out.println("getHorafin");
        ReporteModel instance = new ReporteModel();
        Time expResult = null;
        Time result = instance.getHorafin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorafin method, of class ReporteModel.
     */
    @Test
    public void testSetHorafin() {
        System.out.println("setHorafin");
        Time horafin = null;
        ReporteModel instance = new ReporteModel();
        instance.setHorafin(horafin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ReporteModel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ReporteModel instance = new ReporteModel();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
