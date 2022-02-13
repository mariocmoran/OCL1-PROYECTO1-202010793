
package compi1_proyecto1;

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
    
    public App(){
        this.setTitle("ExpAnalyzer");
        this.setLayout(null);
        this.getContentPane().setBackground(new java.awt.Color(148, 219, 224));
        
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
        
        //CONTAINER TEXTO ENTRADA
        JPanel panelEntrada = new JPanel();
        panelEntrada.setBounds(5,30, 500,425); 
        entrada =new JTextArea(25, 48);
        JScrollPane scrollEntrada = new JScrollPane(entrada, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);        
        panelEntrada.add(scrollEntrada);
        this.add(panelEntrada);
       
        JLabel labelConsola = new JLabel("Consola");  
        labelConsola.setBounds(5,450, 100,30);
        labelConsola.setFont(f1);
        this.add(labelConsola);
        
        //CONTAINER TEXTO CONSOLA
        JPanel panelConsola = new JPanel();
        panelConsola.setBounds(5,475,1175,200); 
        consola =new JTextArea(11, 115);  
        JScrollPane scrollConsola = new JScrollPane(consola, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);        
        panelConsola.add(scrollConsola);
        this.add(panelConsola);
        
        //AREA DE FUNCIONES Y REPORTES
        btnAnalizar = new JButton("Analizar Entrada");  
        btnAnalizar.setBounds(525,30,160,30);
        btnAnalizar.setFont(f1);
        this.add(btnAnalizar);
        
        btnGenerarAutomatas = new JButton("Generar Autómatas");  
        btnGenerarAutomatas.setBounds(525,65,160,30);
        btnGenerarAutomatas.setFont(f1);
        this.add(btnGenerarAutomatas);
        
        
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
            //generarLexer();
        } else if (ae.getSource() == btnGenerarAutomatas) {
            guardar();
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
    
    public static void generarLexer(String ruta){
        
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
