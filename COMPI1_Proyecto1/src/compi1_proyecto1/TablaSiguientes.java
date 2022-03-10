package compi1_proyecto1;

import java.util.ArrayList;

public class TablaSiguientes {
    public ArrayList<ElementoSiguiente> listaSiguientes = new ArrayList<ElementoSiguiente>();
    public ArrayList<Expresion> listaHojas = new ArrayList<Expresion>();
    public ArrayList<Expresion> listaSimbolos = new ArrayList<Expresion>();
    public TablaSiguientes(){ }
    
    public void llenarTabla(){
        for (int i = 0; i < listaHojas.size(); i++) {
            ElementoSiguiente novo = new ElementoSiguiente(listaHojas.get(i).simbolo, listaHojas.get(i).numeroHoja+"");
            listaSiguientes.add(novo);
        }
    }
    
    public void getExp(Simbolo s){
        this.listaHojas = s.obtenerHojas();
        this.listaSimbolos = s.obtenerSimbolos();
    }
    
    public void tablaToString(){
        for (int i = 0; i < listaSiguientes.size(); i++) {
            System.out.println(listaSiguientes.get(i).hoja + " " + listaSiguientes.get(i).getValor());
        }
    }
    
    
    
}
