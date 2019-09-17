/*
 * clase test para la conexion con la bd de mysql
 */
package service;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DBTest {
    
    public DBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicia el test de la clase DB");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finaliza el test de la clase DB");
    }
    
    @Before
    public void setUp() {
        System.out.print("Inicia el test del metodo ...");
    }
    
    @After
    public void tearDown() {
        System.out.print("Finaliza el test del metodo ...");
    }

    /**
     * Test of obtener method, of class DB.
     */
    @Test
    public void testObtener() {
        System.out.println("obtener");
        Connection expResult = null;
        Connection result = DB.obtener();
        //assertEquals(expResult, result); no tiene sentido que la conexion devuelta sea null
        
        if(expResult == result){
            fail("La conexion no se logro establecer");
        }
    }

    /**
     * Test of cerrar method, of class DB.
     */
    @Test
    public void testCerrar() throws Exception {
        System.out.println("cerrar");
        try {
            DB.cerrar();
        } catch (Throwable ex) {
            fail("Impocible cerrar la conexion actual");
        }
    }
    
}
