package compi1_proyecto1;

public class Nodo {
    public ElementoArbol valor;
    public Nodo left;
    public Nodo right;
    public int id;
    
    Nodo(ElementoArbol valor, int id){
        this.valor = valor;
        this.left = null;
        this.right = null;
        this.id = id;
    }
    
}
