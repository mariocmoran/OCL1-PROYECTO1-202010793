package proyecto1.compi1;

import java.io.*;
import javax.swing.UIManager;

public class App {
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            Principal ventanaPrincipal = new Principal();
        } catch(Exception e){
            System.out.println("e = " + e);
        }
    }
    
}
