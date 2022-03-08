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
        String txt ="{\n" +
                    "<! Comentario Multilinea !>\n" +
                    "//Comentario 2 Prueba\n" +
                    "CONJ: nums1 -> 0~4;\n" +
                    "//Comentario Prueba\n" +
                    "CONJ: ltrs1 -> b~d;\n" +
                    "CONJ: lista1 -> 3,1,4,5;\n" +
                    "CONJ: lista2 -> a,b,c,d,g;\n" +
                    "CONJ: simbs1 -> !~$;\n" +
                    "ExpReg1 -> .{digito}.\".\"+{digito};\n" +
                    "ExpReg3 -> . {digito} + | \"_\" | {letra} {digito};\n" + 
                    "ExpReg4 -> *{ltrs1};\n" +
                    "ExpReg5 -> ?{lista2};\n" + 
                    "er2 -> .{letra}*|\"_\"|{letra}{digito};\n" +
                    "//Comentario Prueba\n" +
                    "%%" +
                    "%%" +
                    "ExpReg5:\"CADENA PRUEBA 2\";\n" +
                    "ExpReg4:\"CADENA PRUEBA\";\n" + 
                    "ExpReg4:\"CADENA PRUEBA 3\";\n" + 
                    "//Comentario Prueba\n" +
                    "}\n";
        
        Instruccion ins = Instruccion.getInstancia();
        ins.analize(txt);
        for (int i = 0; i < ins.lista.size(); i++) {
                System.out.print(ins.lista.get(i).getMessage());
        }
        //PRUEBAS **********************************************************
    }
}
