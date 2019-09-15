package practica2;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
<<<<<<< HEAD
=======
import service.DB;
>>>>>>> develop

public class Practica2 {

    public static void main(String[] args) throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
<<<<<<< HEAD
        UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        Login login=new Login();
        login.show();
=======
        //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        //Login login=new Login();
        //login.show();
        DB.obtener();
>>>>>>> develop
    }
    
}
