/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author david
 */
public class RegistroTest {
    
    public RegistroTest() {
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
     * Test of main method, of class Registro.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registro.main(args);
        Registro reg = new Registro();
        Assert.assertNotNull(reg);
    }
    
    /**
     * Test of signUpAction method, of class Registro.
     */
    @Test
    public void testSignUpAction(){
        Registro reg = new Registro();
        boolean result = reg.signUpAction();
        assertFalse(result);
        
        reg.jnombre.setText("nombre prueba");
        reg.jemail.setText("email-"+UUID.randomUUID().toString() + "@prueba.com");
        reg.jcontra1.setText("pass_prueba");
        reg.jcontra2.setText("pass_prueba");
        reg.jdireccion.setText("dir test");
        reg.jtelefono.setText("tel test");
        reg.jfecha.setText("2019-09-21");
        result = reg.signUpAction();
        assertTrue(result);
    }
    
}
