/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Doctor;
import models.Paciente;
import models.ReporteModel;
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
public class ReportesTest {
    
    public ReportesTest() {
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
     * Test of main method, of class Reportes.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Reportes.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReporte method, of class Reportes.
     */
    @Test
    public void testSetReporte() {
        System.out.println("setReporte");
        LinkedList<ReporteModel> reportes = null;
        DefaultTableModel tabla = null;
        Reportes instance = new Reportes();
        boolean expResult = true;
        boolean result = instance.setReporte(reportes, tabla);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaciente method, of class Reportes.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        LinkedList<Paciente> pacientes = null;
        Reportes instance = new Reportes();
        boolean expResult = true;
        boolean result = instance.setPaciente(pacientes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctores method, of class Reportes.
     */
    @Test
    public void testSetDoctores() {
        System.out.println("setDoctores");
        LinkedList<Doctor> doctores = null;
        Reportes instance = new Reportes();
        boolean expResult = true;
        boolean result = instance.setDoctores(doctores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarPDF method, of class Reportes.
     */
    @Test
    public void testGenerarPDF() throws Exception {
        System.out.println("generarPDF");
        String nombre = "";
        String ubicacion = "";
        JTable tabla = new JTable();
        String titulo = "";
        Reportes instance = new Reportes();
        boolean expResult = true;
        boolean result = instance.generarPDF(nombre, ubicacion, tabla, titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
