package compi1_proyecto1;

import java.util.ArrayList;

public class Simbolo {
    private String identificador; // IDENTIFICADOR DE LA VARIBLE
    private String valor; // VALOR DE LA VARIBLE
    private String tipoDeclaracion; // TIPO: CONJUNTO, EXPRESION REGULAR, SENTENCIA
    public String[] listaString;
    public Expresion arbolExpresiones;
    
    public boolean yaExiste;

    public Simbolo() {
        this.identificador = "";
        this.valor = "";
        this.tipoDeclaracion = "";
    }
    
    public Simbolo getSimbolo(){
        return this;
    }
    
    public String getNombre(){
        return identificador;
    }
    
    public void setNombre(String nombre){
        this.identificador = nombre;
    }
    
    public String getValor(){
        return valor;
    }
    
    public void setValor(String valor){
        this.valor = valor;
    }
    
    public String getTipoDeclaracion(){
        return tipoDeclaracion;
    }
    
    public void setTipoDeclaracion(String tipoDeclaracion){
        this.tipoDeclaracion = tipoDeclaracion;
    }
    
    public void preorder(Expresion tmp) {
        try {
            if (tmp != null) {
                System.out.print(tmp.simbolo + " ");
                preorder(tmp.expresion1);
                preorder(tmp.expresion2);
            }
        } catch (NullPointerException n) {
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
    
    int contador = 0;
    public String obtenerNodos(Expresion tmp) {
        String txt = "";
        if (tmp != null) {
            String st = tmp.simbolo.replace("\"","\\\"");
            txt+="n" + contador + " [label=\"" + st + "\", xlabel=\"" + tmp.anulable + "\"] \n";
            tmp.setId(contador);
            contador++;
            
            txt+=obtenerNodos(tmp.expresion1);
            txt+=obtenerNodos(tmp.expresion2);
        }
        return txt;
    }
    
    int contador2 = 0;
    public String obtenerEnlaces(Expresion tmp) {
        String txt = "";
        if (tmp != null) {
            if (tmp.expresion1 != null)
                txt+="n" + tmp.getId() + " -> n" + tmp.expresion1.getId() + " [arrowhead=none]\n";
            if (tmp.expresion2 != null)
                txt+="n" + tmp.getId() + " -> n" + tmp.expresion2.getId() + " [arrowhead=none]\n";
            txt+=obtenerEnlaces(tmp.expresion1);
            txt+=obtenerEnlaces(tmp.expresion2);
        }
        return txt;
    }
    
}
