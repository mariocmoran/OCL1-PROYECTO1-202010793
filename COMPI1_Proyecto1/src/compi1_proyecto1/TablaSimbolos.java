
package compi1_proyecto1;
import java.util.ArrayList;

public class TablaSimbolos {
    public static ArrayList<Simbolo> tablaSimbolos = new ArrayList<Simbolo>(); 
    public static ArrayList<Simbolo> listaTemporal = new ArrayList<>();
    
    public static boolean error;
    public static String errores = "";
    public static boolean inicioTransaccion;
    
    public static String obtenerValorVariable(String identificador, String tipoDeclaracion){
        for (int i = 0; i < tablaSimbolos.size(); i++) {
            if(tablaSimbolos.get(i).getNombre().equals(identificador) && tablaSimbolos.get(i).getTipoDeclaracion().equals(tipoDeclaracion))
                return tablaSimbolos.get(i).getValor();
        }

        return "";
    }
    
    public static void ERROR(String descripcion){
        setError(true);
        errores += descripcion + "\n";
    }
    
    public static String getErrores(){
        return errores;
    }
    
    public static boolean getError(){        
        return error;
    }
    
    public static void setError(boolean error2){
        error = error2;
    }
    
    public static ArrayList<Simbolo> getTablaSimbolos(){
        return tablaSimbolos;
    }
    
    public static void add(Simbolo sim){
        tablaSimbolos.add(sim);
    }
    
    public static Boolean buscarIdentificador(String identificador, String tipoDeclaracion){
        for (int i = 0; i < tablaSimbolos.size(); i++) {
            if(tablaSimbolos.get(i).getNombre().equals(identificador) && tablaSimbolos.get(i).getTipoDeclaracion().equals(tipoDeclaracion))
                return true;
        }
        
        return false;
    }
    
    public static Boolean buscarIdentificadorGeneral(String identificador, String tipoDeclaracion){
        for (int i = 0; i < tablaSimbolos.size(); i++) {
            if(tablaSimbolos.get(i).getNombre().equals(identificador) && tablaSimbolos.get(i).getTipoDeclaracion().equals(tipoDeclaracion))
                return true;
        }
        
        return false;
    }
    
    public static String EscribirArchivo(){
        String texto="";
        for(int i=0;i<tablaSimbolos.size();i++){
            texto+=tablaSimbolos.get(i).getNombre()+", "+tablaSimbolos.get(i).getTipoDeclaracion() + "\n";
        }
        return texto;   
    }
    
    public static String EscribirValores(){
        String texto="";
        for(int i=0;i<tablaSimbolos.size();i++){
            if ("Expresion_Regular".equals(tablaSimbolos.get(i).getTipoDeclaracion())){
                texto+=tablaSimbolos.get(i).listaString.toString() + "\n";
            }
        }
        return texto;   
    }

    public static void limpiar() {
        TablaSimbolos.tablaSimbolos = new ArrayList<Simbolo>(); 
        TablaSimbolos.listaTemporal = new ArrayList<>();

        TablaSimbolos.error = false;
        TablaSimbolos.errores = "";
        TablaSimbolos.inicioTransaccion = false;
    }
    
    
}
