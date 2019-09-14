package practica2;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Practica2 {

    public static void main(String[] args) throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        Login login=new Login();
        login.show();
    }
    
}
