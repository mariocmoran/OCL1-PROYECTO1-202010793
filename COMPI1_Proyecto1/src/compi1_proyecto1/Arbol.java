package compi1_proyecto1;

public class Arbol {
    public Nodo raiz;
    public int contadorNodos;
    
    public Arbol(){
        this.raiz = null;
        this.contadorNodos = 0;
    }
    
    public void add(Expresion exp) {
        if (raiz != null){
            add(exp, raiz);
        }else{
            ElementoArbol nuevo = new ElementoArbol(exp.simbolo);
            System.out.print(exp.simbolo);
            raiz = new Nodo(nuevo, contadorNodos);
            contadorNodos++;
        }
    }
	
    public void add(Expresion exp, Nodo tmp) {
        if (tmp.right != null){
            add(exp.expresion2, tmp.right);
        }else{
            System.out.print(exp.simbolo);
            ElementoArbol nuevo = new ElementoArbol(exp.simbolo);
            tmp.right = new Nodo(nuevo, contadorNodos);
            contadorNodos++;
        }

        if (tmp.left != null){
            add(exp.expresion1, tmp.left);
        }else{
            ElementoArbol nuevo = new ElementoArbol(exp.simbolo);
            System.out.print(exp.simbolo);
            tmp.left = new Nodo(nuevo, contadorNodos);
            contadorNodos++;
        }
    }
    
    public boolean isEr(String simbolo){
        if (simbolo == "." || simbolo == "|" || simbolo == "?" || simbolo == "*" || simbolo == "+"){
            return true;
        }
        return false;
    }
    
    public void preorder(Nodo tmp) {
        if (tmp != null) {
            System.out.print(tmp.valor.getValor() +" ");
            preorder(tmp.left);
            preorder(tmp.right);
        }
    }
    
    public String recorrerNodos(Nodo tmp) {
        String txt = "";
        if (tmp != null) {
            txt+="n" + tmp.id + " [label=\"A\"]\n";
            txt+=recorrerNodos(tmp.left);
            txt+=recorrerNodos(tmp.right);
        }
        return txt;
    }
    
    public String obtenerInfoEnlaces(Nodo actual, String labelactual){
        String txt = "";
        if (actual != null) {
            if (actual.left != null){
                String labelleft = "n" +  actual.left.id;
                txt += labelactual + " -> " + labelleft + "\n";
                txt += obtenerInfoEnlaces(actual.left, labelleft);
            }
            if (actual.right != null){
                String labelright= "n" +  actual.right.id;
                txt += labelactual + " -> " + labelright + "\n";
                txt += obtenerInfoEnlaces(actual.right, labelright);
            }
        }
        return txt;
    }
    
    public String obtenerEnlaces(){
        String txt = "";
        Nodo actual = raiz;
        String labelactual = "n" + actual.id;
        txt+=obtenerInfoEnlaces(actual, labelactual);
        return txt;
    }
}
