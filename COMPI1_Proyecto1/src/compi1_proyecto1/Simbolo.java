package compi1_proyecto1;

import java.util.ArrayList;

public class Simbolo {
    private String identificador; // IDENTIFICADOR DE LA VARIBLE
    private String valor; // VALOR DE LA VARIBLE
    private String tipoDeclaracion; // TIPO: CONJUNTO, EXPRESION REGULAR, SENTENCIA
    public String[] listaString;
    public Expresion arbolExpresiones;
    public ArrayList<Expresion> hojas = new ArrayList<>();
    
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
    
    public int contador = 0;
    public String obtenerNodos(Expresion tmp) {
        String txt = "";
        if (tmp != null) {
            String st = tmp.simbolo.replace("\"","\\\"");
            if (tmp.simbolo == "#"){
                txt+="a [label=\"" + st + "\", xlabel=\"" + tmp.anulable +"&#92;n P: " + tmp.primeros +"&#92;n U: " + tmp.ultimos + "\"] \n";
            }else{
                txt+="n" + contador + " [label=\"" + st + "\", xlabel=\"" + tmp.anulable +"&#92;n P: " + tmp.primeros +"&#92;n U: " + tmp.ultimos + "\"] \n";
            }
            
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
                if (tmp.expresion2.simbolo == "#"){
                    txt+="n" + tmp.getId() + " -> a [arrowhead=none]\n";
                }else{
                    txt+="n" + tmp.getId() + " -> n" + tmp.expresion2.getId() + " [arrowhead=none]\n";
                }
                
            txt+=obtenerEnlaces(tmp.expresion1);
            txt+=obtenerEnlaces(tmp.expresion2);
        }
        return txt;
    }
    
    public ArrayList<Expresion> obtenerHojas(){
        ArrayList<Expresion> nueval = obtener_hojas(arbolExpresiones);
        return nueval;
    }
    
    public ArrayList<Expresion> obtener_hojas(Expresion tmp){
        ArrayList<Expresion> nueva = new ArrayList<Expresion>();
        
        if (tmp != null) {
            if (tmp.isHoja){
                nueva.add(tmp);
            }
            obtener_hojas(tmp.expresion1);
            obtener_hojas(tmp.expresion2);
        }
        return nueva;
    }
    
    public ArrayList<Expresion> obtenerSimbolos(){
        ArrayList<Expresion> nueva = obtener_simbolos(arbolExpresiones);
        return nueva;
    }
    
    public ArrayList<Expresion> obtener_simbolos(Expresion tmp){
        ArrayList<Expresion> nueva = new ArrayList<Expresion>();
        
        if (tmp != null) {
            if (isSim(tmp.simbolo)){
                nueva.add(tmp);
            }
            obtener_simbolos(tmp.expresion1);
            obtener_simbolos(tmp.expresion2);
        }
        return nueva;
    }
    
    public boolean isSim(String simbolo){
        if (simbolo == "*" || simbolo == "." || simbolo == "+"){
            return true;
        }
        return false;
    }
    
    public void guardarArbol(Expresion abb, int contadorHojas){
        String primeros = "";
        int num = contadorHojas+1;
        if (abb.anulable == "A") {
            primeros = abb.primeros + "," +num;
        }else{
            primeros = abb.primeros;
        }
        Expresion aceptacion = new Expresion("#", "N", num, num+"", num+"");
        Expresion raiz = new Expresion(".", abb, aceptacion, "N", primeros, num+"");
        this.arbolExpresiones = raiz;
    }
    
    
  
    
}
