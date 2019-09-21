/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import models.Cita;
import models.Doctor;
import models.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author david
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
        
    }

    /**
     * Test of crearCita method, of class Principal.
     */
    @Test
    public void testCrearCita() {
        System.out.println("crearCita");
        Principal instance = new Principal();
        Doctor d = new Doctor();
        d.setIddoctor(1);
        Cita result = instance.crearCita(d,1,null,"10:00:00","11:00:00");
        assertNull(result);
        
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
       
    }

    /**
     * Test of setDatosCita method, of class Principal.
     */
    @Test
    public void testSetDatosCita() throws Exception {
        System.out.println("setDatosCita");
        Cita cita = new Cita();
        cita.setIdcita(1);
        cita.setDoctor(1);
        cita.setPaciente(1);
        cita.setFecha(new Date(119,8,22));
        cita.setHorainicio(new Time(1,10,10));
        cita.setHorafin(new Time(1,10,10));
        Principal instance = new Principal();
        instance.actualizarModAction();
        boolean result = instance.setDatosCita(cita);
        assertTrue(result);
       
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
      
    }

    /**
     * Test of getCitaMod method, of class Principal.
     */
    @Test
    public void testGetCitaMod() {
        System.out.println("getCitaMod");
        Principal instance = new Principal();
        instance.actualizarModAction();
        Cita result = instance.getCitaMod();
        assertNull(result);
        
        instance.tp_horaIniMod.setText("00:00");
        instance.tp_horaFinMod.setText("00:00");
        instance.fechaCitaMod.setDateFormatString("2019-09-22");
        result = instance.getCitaMod();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of actualizarCita method, of class Principal.
     */
    @Test
    public void testActualizarCita() {
        System.out.println("actualizarCita");
        Principal instance = new Principal();
        instance.actualizarModAction();
        boolean result = instance.actualizarCita();
        assertFalse(result);
        
        instance.tp_horaIniMod.setText("00:00");
        instance.tp_horaFinMod.setText("00:00");
        instance.fechaCitaMod.setDateFormatString("2019-09-22");
        result = instance.actualizarCita();
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        
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
        
    }
    
}
