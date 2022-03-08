package compi1_proyecto1;


public class Expresion {
    public String simbolo;
    public String anulable;
    public String primeros;
    public String ultimos;
    public Expresion expresion1;
    public Expresion expresion2;
    public int id;

    public Expresion(String simbolo, Expresion expresion1, Expresion expresion2, String anulable) {
        this.simbolo = simbolo;
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
        this.anulable = anulable;
    }
    
    public Expresion(String simbolo, Expresion expresion1, String anulable) {
        this.simbolo = simbolo;
        this.expresion1 = expresion1;
        this.expresion2 = null;
        this.anulable = anulable;
    }
    
    public Expresion(String simbolo, String anulable) {
        this.simbolo = simbolo;
        this.expresion1 = null;
        this.expresion2 = null;
        this.anulable = anulable;
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
