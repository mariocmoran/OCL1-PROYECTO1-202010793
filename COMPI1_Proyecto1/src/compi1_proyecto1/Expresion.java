package compi1_proyecto1;

import java.util.ArrayList;
import java.util.Arrays;


public class Expresion {
    public String simbolo;
    public String anulable;
    public String primeros;
    public String ultimos;
    public ArrayList<String> primerosLista;
    public ArrayList<String> ultimosLista;
    public Expresion expresion1;
    public Expresion expresion2;
    public int id;
    public int numeroHoja=0;
    public boolean isHoja;
    public ArrayList<String> siguientes;
    
    // CONSTRUCTOR | .
    public Expresion(String simbolo, Expresion expresion1, Expresion expresion2, String anulable, String primeros, String ultimos, ArrayList<String> siguientes) {
        this.simbolo = simbolo;
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
        this.anulable = anulable;
        this.primeros = primeros;
        this.ultimos = ultimos;
        this.primerosLista = new ArrayList<String>(Arrays.asList(primeros.split(",")));
        this.ultimosLista = new ArrayList<String>(Arrays.asList(ultimos.split(",")));
        this.isHoja = false;
        this.siguientes = siguientes;
    }
    
    public Expresion(String simbolo, Expresion expresion1, Expresion expresion2, String anulable, String primeros, String ultimos) {
        this.simbolo = simbolo;
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
        this.anulable = anulable;
        this.primeros = primeros;
        this.ultimos = ultimos;
        this.primerosLista = new ArrayList<String>(Arrays.asList(primeros.split(",")));
        this.ultimosLista = new ArrayList<String>(Arrays.asList(ultimos.split(",")));
        this.isHoja = false;
    }
    
    //CONSTRUCTOR +, *, ?
    public Expresion(String simbolo, Expresion expresion1, String anulable, String primeros, String ultimos) {
        this.simbolo = simbolo;
        this.expresion1 = expresion1;
        this.expresion2 = null;
        this.anulable = anulable;
        this.primeros = primeros;
        this.ultimos = ultimos;
        this.primerosLista = new ArrayList<String>(Arrays.asList(primeros.split(",")));
        this.ultimosLista = new ArrayList<String>(Arrays.asList(ultimos.split(",")));
        this.isHoja = false;
    }
    public Expresion(String simbolo, Expresion expresion1, String anulable, String primeros, String ultimos, ArrayList<String> siguientes) {
        this.simbolo = simbolo;
        this.expresion1 = expresion1;
        this.expresion2 = null;
        this.anulable = anulable;
        this.primeros = primeros;
        this.ultimos = ultimos;
        this.primerosLista = new ArrayList<String>(Arrays.asList(primeros.split(",")));
        this.ultimosLista = new ArrayList<String>(Arrays.asList(ultimos.split(",")));
        this.siguientes = siguientes;
        this.isHoja = false;
    }
    
    //CONSTRUCTOR HOJAS
    public Expresion(String simbolo, String anulable, int num, String primeros, String ultimos) {
        this.simbolo = simbolo;
        this.expresion1 = null;
        this.expresion2 = null;
        this.anulable = anulable;
        this.numeroHoja = num;
        this.primeros = primeros;
        this.ultimos = ultimos;
        this.primerosLista = new ArrayList<String>(Arrays.asList(primeros.split(",")));
        this.ultimosLista = new ArrayList<String>(Arrays.asList(ultimos.split(",")));
        this.isHoja = true;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Expresion getExpresion1() {
        return expresion1;
    }

    public void setExpresion1(Expresion expresion1) {
        this.expresion1 = expresion1;
    }

    public Expresion getExpresion2() {
        return expresion2;
    }

    public void setExpresion2(Expresion expresion2) {
        this.expresion2 = expresion2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnulable() {
        return anulable;
    }

    public void setAnulable(String anulable) {
        this.anulable = anulable;
    }

    public String getPrimeros() {
        return primeros;
    }

    public void setPrimeros(String primeros) {
        this.primeros = primeros;
    }

    public String getUltimos() {
        return ultimos;
    }

    public void setUltimos(String ultimos) {
        this.ultimos = ultimos;
    }
    
    
}
