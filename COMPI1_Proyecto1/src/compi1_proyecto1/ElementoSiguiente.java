package compi1_proyecto1;

import java.util.ArrayList;


public class ElementoSiguiente {
    public String valor;
    public String hoja;
    public ArrayList<String> nodosSiguientes;

    public ElementoSiguiente(String valor, String hoja) {
        this.valor = valor;
        this.hoja = hoja;
        this.nodosSiguientes = null;
    }
    
    public void addNodoSiguiente(String nodo){
        this.nodosSiguientes.add(nodo);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getHoja() {
        return hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    public ArrayList<String> getNodosSiguientes() {
        return nodosSiguientes;
    }

    public void setNodosSiguientes(ArrayList<String> nodosSiguientes) {
        this.nodosSiguientes = nodosSiguientes;
    }
    
    public String siguienteString(){
        String txt = "";
        for(int i=0;i<this.nodosSiguientes.size();i++){
            txt+=this.nodosSiguientes.get(i)+",";
        }
        return txt;
    }
}
