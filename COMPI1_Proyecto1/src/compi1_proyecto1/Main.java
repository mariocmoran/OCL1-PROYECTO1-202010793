package compi1_proyecto1;

import java.io.File;
import javax.swing.UIManager;

public class Main {

    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            App aplicacion = new App();
        } catch(Exception e){
            System.out.println("e = " + e);
        }
    }
    
}
