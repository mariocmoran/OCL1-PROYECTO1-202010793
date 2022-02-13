package analizadores;

public class Generador {
    public static void main(String[] args) {
        try{
            String ruta = "src/analizadores";
            String opJFlex[] = {ruta + "lex.jflex", "-d", ruta};
            jflex.Main.generate(opJFlex);
        }catch(Exception e){
        
        }
    }
}
