package compi1_proyecto1;

public class ElementoArbol {
    private String valor;
    private int id;
    private boolean anulable;
    private String primeros, ultimos;

    public ElementoArbol(String valor) {
        this.valor = valor;
        this.id = 0;
        this.anulable = false;
        this.primeros = "";
        this.ultimos = "";
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAnulable() {
        return anulable;
    }

    public void setAnulable(boolean anulable) {
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
