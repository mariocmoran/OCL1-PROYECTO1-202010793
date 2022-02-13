package compi1_proyecto1;

import javax.swing.UIManager;

public class COMPI1_Proyecto1 {

    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            App aplicacion = new App();
        } catch(Exception e){
            System.out.println("e = " + e);
        }
    }
    
}
