package analizadores;

public class Generador {
    public static void main(String[] args) {
        try{
            String ruta = "src/analizadores/";
            String opJflex[] = {ruta + "lex.jflex", "-d", ruta};
            jflex.Main.generate(opJflex);
            
            String opCup[] = {"-destdir", ruta, "-parser", "Parse", ruta + "parser.cup"};
            java_cup.Main.main(opCup);
        }catch(Exception e){
        
        }
    }
}
