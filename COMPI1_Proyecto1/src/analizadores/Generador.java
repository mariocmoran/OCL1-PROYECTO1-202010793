package analizadores;

import compi1_proyecto1.Instruccion;

public class Generador {
    public static void main(String[] args) {
        generarLexer();
    }
    
    public static void generarLexer(){
        try {
            String ruta = "src/analizadores/";
            String opJflex[] = {ruta + "Lexer.jflex", "-d", ruta};
            jflex.Main.generate(opJflex);
            
            String opCup[] = {"-destdir", ruta, "-parser", "Parser", ruta + "parser.cup"};
            java_cup.Main.main(opCup);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //PRUEBAS **********************************************************
        String txt = "<! Comentario Multilinea !>\n" +
                     "//Comentario 2 Prueba\n" +
                     "CONJ: ER1 -> 0~4;\n" +
                     "//Comentario Prueba\n" +
                     "CONJ: er2 -> b~d;\n" +
                     "CONJ: Expresion_Regular3 -> 3,1,4,5;\n";
        Instruccion ins = Instruccion.getInstancia();
        ins.analize(txt);
        for (int i = 0; i < ins.lista.size(); i++) {
                System.out.print(ins.lista.get(i).getMessage());
        }
        //PRUEBAS **********************************************************
    }
}
