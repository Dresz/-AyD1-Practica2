/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author david
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        Login log = new Login();
    }
    
    /**
     * Test of logAction method, of class Login.
     */
    @Test
    public void testLogAction() {
        System.out.println("logAction");
        Login log = new Login();
        boolean result = log.logAction();
        assertFalse(result);
        
        log.jemail.setText("admin@admin.com");
        log.jcontra.setText("123");
        result = log.logAction();
        assertTrue(result);
    }
}
