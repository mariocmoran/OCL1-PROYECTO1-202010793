
package compi1_proyecto1;

import errores.ListaErrores;
import analizadores.Parser;
import analizadores.Scanner;
import java.io.BufferedReader;
import java.io.StringReader;

public class Instruccion {
    public static ListaErrores lista;
    public static Instruccion instruccion;

    private Instruccion() { }

    public void analize(String text){
        try {
            lista = new ListaErrores();
            Scanner scanner = new Scanner(new BufferedReader(new StringReader(text)));
            Parser parser = new Parser(scanner);
            parser.parse();
            System.out.println("Finalizando analisis...");
        } catch (Exception e) {
        }
    }

    public static Instruccion getInstancia() {
        if (instruccion == null) {
            instruccion = new Instruccion();
            lista = new ListaErrores();
        }
        return instruccion;
    }

    public static ListaErrores getLista() {
        return lista;
    }

    public static void setLista(ListaErrores lista) {
        Instruccion.lista = lista;
    }
}
