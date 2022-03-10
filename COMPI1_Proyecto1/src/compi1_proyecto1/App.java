
package compi1_proyecto1;

import static analizadores.Generador.generarLexer;
import analizadores.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;  
import javax.swing.filechooser.FileNameExtensionFilter;

public class App
extends JFrame 
implements ActionListener, MouseListener {
    
    JMenuItem menuNuevo, menuAbrir, menuGuardar, menuGuardarComo;
    JButton btnAnalizar, btnGenerarAutomatas;
    JTextArea entrada, consola;
    
    String pathFile;
    
    static int contadorArboles = 1;
    
    public App(){
        this.setTitle("ExpAnalyzer");
        this.setLayout(null);
        this.getContentPane().setBackground(new java.awt.Color(148, 219, 224));
        
        // BARRA DE MENÚ -------------------------------------------------------
        JMenuBar menuBar =new JMenuBar(); 
        JMenu menu =new JMenu("Archivos");
        
        menuNuevo =new JMenuItem("Nuevo"); 
        menuNuevo.addActionListener(this);
        
        menuAbrir=new JMenuItem("Abrir");
        menuAbrir.addActionListener(this);
        
        menuGuardar=new JMenuItem("Guardar"); 
        menuGuardar.addActionListener(this);
        
        menuGuardarComo=new JMenuItem("Guardar como");
        menuGuardarComo.addActionListener(this);
        
        menu.add(menuNuevo); menu.add(menuAbrir); menu.add(menuGuardar); menu.add(menuGuardarComo);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);  
        
        Font  f1  = new Font(Font.DIALOG, Font.BOLD,  13);
        
        JLabel labelEntrada = new JLabel("Entrada");  
        labelEntrada.setBounds(5,5, 100,30);
        labelEntrada.setFont(f1);
        this.add(labelEntrada);
        
        //PANEL DE ENTRADA  ----------------------------------------------------
        
        //CONTAINER TEXTO ENTRADA
        JPanel panelEntrada = new JPanel();
        panelEntrada.setBounds(6,30, 500,425); 
        entrada =new JTextArea(25, 37);
        Font font = new Font("Verdana", Font.BOLD, 12);
        entrada.setFont(font);
        JScrollPane scrollEntrada = new JScrollPane(entrada, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);        
        panelEntrada.add(scrollEntrada);
        this.add(panelEntrada);
       
        JLabel labelConsola = new JLabel("Consola");  
        labelConsola.setBounds(5,450, 100,30);
        labelConsola.setFont(f1);
        this.add(labelConsola);
        
        //PANEL DE CONSOLA  ----------------------------------------------------
        //CONTAINER TEXTO CONSOLA
        JPanel panelConsola = new JPanel();
        panelConsola.setBounds(5,475,1175,200); 
        consola =new JTextArea(11, 115);  
        JScrollPane scrollConsola = new JScrollPane(consola, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);        
        panelConsola.add(scrollConsola);
        this.add(panelConsola);
        
        //BOTONES Y FUNCIONES  -------------------------------------------------
        //AREA DE FUNCIONES Y REPORTES
        btnAnalizar = new JButton("Analizar Entrada");  
        btnAnalizar.setBounds(525,30,160,30);
        btnAnalizar.setFont(f1);
        btnAnalizar.addActionListener(this);
        this.add(btnAnalizar);
        
        btnGenerarAutomatas = new JButton("Generar Autómatas");  
        btnGenerarAutomatas.setBounds(525,65,160,30);
        btnGenerarAutomatas.setFont(f1);
        btnGenerarAutomatas.addActionListener(this);
        this.add(btnGenerarAutomatas);
        
        //FUNCIONES FINALES ----------------------------------------------------
        this.setBounds(200, 40, 1200, 750);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //OPERACION DE CERRAR VENTANA
        WindowListener exitListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(null, "Seguro desea Cerrar la aplicación?", "Cerrar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    dispose();
                }
            }
        };
        this.addWindowListener(exitListener);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == menuNuevo) {
            entrada.setText("");
        } else if (ae.getSource() == menuGuardar) {
            guardar();
        } else if (ae.getSource() == menuAbrir) {
            abrir();
        } else if (ae.getSource() == menuGuardarComo) {
            guardar();
        } else if (ae.getSource() == btnAnalizar) {
            analizar();
        } else if (ae.getSource() == btnGenerarAutomatas) {
            metodoArbol();
        }
    }
    
    public void guardar(){
        // Ventana FileChooser
        JFileChooser j = new JFileChooser("f:");
        j.setFileFilter(new FileNameExtensionFilter("*.exp", "EXP"));
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {

            // Guarda la r0uta seleccionada
            File fi = new File(j.getSelectedFile().getAbsolutePath()+".exp");
            try {
                FileWriter wr = new FileWriter(fi, false);
                BufferedWriter w = new BufferedWriter(wr);
                //Se escribe la informacion en el archivo
                w.write(entrada.getText());
                w.flush();
                w.close();
            }
            catch (Exception evt) {
                JOptionPane.showMessageDialog(this, evt.getMessage());
            }
        }
    }
    
    public void abrir(){
        // Se crear el file chooser
        JFileChooser j = new JFileChooser("f:");
        j.setFileFilter(new FileNameExtensionFilter("*.exp", "EXP"));
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            entrada.setText("");
            File fi = new File(j.getSelectedFile().getAbsolutePath());
            try {
                String s1 = "", sl = "";
                FileReader fr = new FileReader(fi);
                BufferedReader br = new BufferedReader(fr);
                sl = br.readLine();
                while ((s1 = br.readLine()) != null) {
                    sl = sl + "\n" + s1;
                }

                entrada.setText(sl);
            }
            catch (Exception evt) {
                JOptionPane.showMessageDialog(this, evt.getMessage());
            }
        }
    }
    
    public void analizar(){
        try{
            TablaSimbolos.limpiar();
            String txt = entrada.getText();
            Instruccion ins = Instruccion.getInstancia();
            ins.analize(txt);
            for (int i = 0; i < ins.lista.size(); i++) {
                consola.append(ins.lista.get(i).getMessage() + "\n");
            }
            consola.append("Se analizó correctamente.\n");
        }catch(Exception e){
            consola.append("Error: " + e + "\n");
            e.printStackTrace();
        }
        
        /*
        {
            <! Comentario Multilinea !>
            //Comentario 2 Prueba
            CONJ: nums1 -> 0~4;
            //Comentario Prueba
            CONJ: ltrs1 -> b~d;
            CONJ: lista1 -> 3,1,4,5;
            CONJ: lista2 -> a,b,c,d,g;
            CONJ: simbs1 -> !~$;
            ExpReg1 -> .{digito}."."+{digito};
            ExpReg3 -> . {digito} + | "_" | {letra} {digito};
            ExpReg4 -> *{ltrs1};
            ExpReg5 -> ?{lista2};
            er2 -> .{letra}*|"_"|{letra}{digito};
            //Comentario Prueba
            %%
            ExpReg5:"CADENA PRUEBA 2";
            ExpReg4: "CADENA PRUEBA";
            ExpReg4:"CADENA PRUEBA 3";
            //Comentario Prueba
        }
        */
    }
    
    public void metodoArbol() {
        try {
            Parser.contadorHojas = 0;
            consola.append("Generando Método del arbol...\n");
            TablaSimbolos.getTablaSimbolos().forEach((s) -> {
                if (s.arbolExpresiones != null){
                    //s.preorderSiguientes(s.arbolExpresiones);
                    tablaSiguientes(s);
                    generarArbol(s);
                    s.contador = 0;
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
    public void tablaSiguientes(Simbolo s) {
        try {
            TablaSiguientes tablaSig = new TablaSiguientes();
            tablaSig.listaHojas = s.hojas;
            tablaSig.llenarTabla();
            tablaSig.tablaToString();
            gererarTablaSiguientes(s, tablaSig);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
    public void gererarTablaSiguientes(Simbolo s, TablaSiguientes tablaSig){
        int contador = 0;
        try{
            File fichero = new File ("C:\\Users\\oncec\\OneDrive\\Desktop\\" + s.getNombre() + "_tablasig.txt");
            FileWriter wr = new FileWriter(fichero, false);
            BufferedWriter w = new BufferedWriter(wr);

            String entrada;
            entrada="digraph {\n" +
                    "  \n" +
                    " tabla [shape=none, fontname=Helvetica,label=<\n" +
                    "  <TABLE CELLSPACING=\"0\" CELLPADDING=\"3\" CELLBORDER =\"1\" BORDER=\"0\">\n" +
                    "  <TR>\n" +
                    "    <TD BGCOLOR=\"SKYBLUE\" FONT-FAMILY=\"\"> Valor </TD>\n" +
                    "    <TD BGCOLOR=\"SKYBLUE\"> Hoja </TD>\n" +
                    "    <TD BGCOLOR=\"SKYBLUE\"> Siguientes </TD>\n" +
                    "  </TR>\n";
            
            for (int i = 0; i < tablaSig.listaSiguientes.size(); i++) {
                entrada+="  <TR>\n" +
                        "    <TD> "+ tablaSig.listaSiguientes.get(i).valor +" </TD>\n" +
                        "    <TD> "+ tablaSig.listaSiguientes.get(i).hoja +" </TD>\n" +
                        "    <TD> "+" </TD>\n" +
                        "  </TR>\n";
            }
            
            entrada+="  </TABLE>\n" +
                    "  >]\n" +
                    "  \n" +
                    "}";
            //Se escribe la informacion en el archivo
            w.write(entrada);
            w.flush();
            w.close();
            
            generateGraphTablaSig(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void generateGraphTablaSig(Simbolo s){
        try{
            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String fileInputPath = "C:\\Users\\oncec\\OneDrive\\Desktop\\" + s.getNombre() + "_tablasig.txt";
            String fileOutputPath = "C:\\Users\\oncec\\OneDrive\\Desktop\\" + s.getNombre() +"_tablasig.jpg";
            
            contadorArboles++;

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);
            consola.append("La tabla de siguientes se generó correctamente.\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void generarArbol(Simbolo s){
        int contador = 0;
        try{
            File fichero = new File ("C:\\Users\\oncec\\OneDrive\\Desktop\\" + s.getNombre() + ".txt");
            FileWriter wr = new FileWriter(fichero, false);
            BufferedWriter w = new BufferedWriter(wr);

            String entrada;
            entrada="digraph G {\n" +
                    "  { \n" +
                    "    node [margin=0 fontcolor=black fontsize=12 width=0.5 shape=circle rotate=45]\n";
            String p = "";
            String u = "";
            if ("A".equals(s.arbolExpresiones.anulable)) {
                p = s.arbolExpresiones.primeros;
            }else{
                p = s.arbolExpresiones.primeros;
            }
            entrada+= s.obtenerNodos(s.arbolExpresiones);
            entrada+= "}";
            entrada+= s.obtenerEnlaces(s.arbolExpresiones);
            entrada+= "}";
            //Se escribe la informacion en el archivo
            w.write(entrada);
            w.flush();
            w.close();
            
            generateGraph(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void generateGraph(Simbolo s){
        try{
            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String fileInputPath = "C:\\Users\\oncec\\OneDrive\\Desktop\\" + s.getNombre() + ".txt";
            String fileOutputPath = "C:\\Users\\oncec\\OneDrive\\Desktop\\" + s.getNombre() +"_image.jpg";
            
            contadorArboles++;

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);
            consola.append("El árbol se generó correctamente.\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
