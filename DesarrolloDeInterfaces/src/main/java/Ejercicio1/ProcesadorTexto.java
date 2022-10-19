/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio1;


import static java.awt.Color.*;
import java.awt.Font;
import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author AlejandroMarínBermúd
 */
public class ProcesadorTexto extends javax.swing.JFrame {

   private EmergenteGuardado dialogo = new EmergenteGuardado(this,true);
   private EmergenteCargado dialogo2 = new EmergenteCargado(this,true);
   private EmergenteAcerca dialogo3 = new EmergenteAcerca(this,true);

   
    public ProcesadorTexto() {
        initComponents();
 
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Panel = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        ContPalabras = new javax.swing.JPanel();
        Palabras = new javax.swing.JLabel();
        Contador = new javax.swing.JLabel();
        Link = new javax.swing.JPanel();
        Ubicacion = new javax.swing.JLabel();
        lugar = new javax.swing.JLabel();
        Hora = new javax.swing.JPanel();
        tiempo = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        PesoPalabras = new javax.swing.JPanel();
        Peso = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Salir = new javax.swing.JMenu();
        Guardar = new javax.swing.JMenuItem();
        Cargar = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Tamaño = new javax.swing.JMenu();
        Calibre12 = new javax.swing.JMenuItem();
        Calibre18 = new javax.swing.JMenuItem();
        Calibre24 = new javax.swing.JMenuItem();
        Fuente = new javax.swing.JMenu();
        Arial = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Color = new javax.swing.JMenu();
        Azul = new javax.swing.JMenuItem();
        Rojo = new javax.swing.JMenuItem();
        Negro = new javax.swing.JMenuItem();
        Acerca = new javax.swing.JMenu();
        Acercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Procesador de texto");
        setMinimumSize(new java.awt.Dimension(1080, 720));

        Panel.setColumns(20);
        Panel.setRows(5);
        Panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PanelKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Panel);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        ContPalabras.setLayout(new java.awt.GridLayout(1, 0));

        Palabras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Palabras.setText("Palabras: ");
        Palabras.setMaximumSize(new java.awt.Dimension(20, 16));
        Palabras.setMinimumSize(new java.awt.Dimension(20, 16));
        ContPalabras.add(Palabras);
        ContPalabras.add(Contador);

        Ubicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Ubicacion.setText("Ubicacion:");

        lugar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout LinkLayout = new javax.swing.GroupLayout(Link);
        Link.setLayout(LinkLayout);
        LinkLayout.setHorizontalGroup(
            LinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LinkLayout.createSequentialGroup()
                .addComponent(Ubicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lugar, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );
        LinkLayout.setVerticalGroup(
            LinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Hora.setLayout(new java.awt.GridLayout(1, 0));

        tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiempo.setText("Hora: ");
        tiempo.setMaximumSize(new java.awt.Dimension(16, 16));
        tiempo.setMinimumSize(new java.awt.Dimension(16, 16));
        Hora.add(tiempo);

        rSLabelHora1.setFont(new java.awt.Font("Arial Black", 0, 8)); // NOI18N
        rSLabelHora1.setPreferredSize(new java.awt.Dimension(100, 40));
        Hora.add(rSLabelHora1);

        PesoPalabras.setLayout(new java.awt.GridLayout(1, 0));

        Peso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Peso.setText("Peso: ");
        PesoPalabras.add(Peso);

        Cantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cantidad.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                CantidadComponentAdded(evt);
            }
        });
        PesoPalabras.add(Cantidad);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ContPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesoPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesoPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        Salir.setText("File");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Salir.add(Guardar);

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        Salir.add(Cargar);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Salir.add(jMenuItem4);

        jMenuBar1.add(Salir);

        Edit.setText("Edit");

        Tamaño.setText("Tamaño");

        Calibre12.setText("12");
        Calibre12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calibre12ActionPerformed(evt);
            }
        });
        Tamaño.add(Calibre12);

        Calibre18.setText("18");
        Calibre18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calibre18ActionPerformed(evt);
            }
        });
        Tamaño.add(Calibre18);

        Calibre24.setText("24");
        Calibre24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calibre24ActionPerformed(evt);
            }
        });
        Tamaño.add(Calibre24);

        Edit.add(Tamaño);

        Fuente.setText("Fuente");

        Arial.setText("Arial");
        Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArialActionPerformed(evt);
            }
        });
        Fuente.add(Arial);

        jMenuItem3.setText("Serif");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Fuente.add(jMenuItem3);

        Edit.add(Fuente);

        Color.setText("Color");

        Azul.setText("Azul");
        Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulActionPerformed(evt);
            }
        });
        Color.add(Azul);

        Rojo.setText("Rojo");
        Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RojoActionPerformed(evt);
            }
        });
        Color.add(Rojo);

        Negro.setText("Negro");
        Negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegroActionPerformed(evt);
            }
        });
        Color.add(Negro);

        Edit.add(Color);

        jMenuBar1.add(Edit);

        Acerca.setText("Acerca de...");

        Acercade.setText("Show");
        Acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercadeActionPerformed(evt);
            }
        });
        Acerca.add(Acercade);

        jMenuBar1.add(Acerca);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelKeyTyped
       int d = Panel.getText().length();
        Contador.setText(String.valueOf(d));
    }//GEN-LAST:event_PanelKeyTyped

    private void Calibre12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calibre12ActionPerformed
        // TODO add your handling code here:
          tamaño_letra= 12;
      Panel.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }//GEN-LAST:event_Calibre12ActionPerformed

    private void Calibre18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calibre18ActionPerformed
        // TODO add your handling code here:
         tamaño_letra= 18;
        Panel.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }//GEN-LAST:event_Calibre18ActionPerformed

    private void AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulActionPerformed
        // TODO add your handling code here:
        Panel.setForeground(blue);
        
    }//GEN-LAST:event_AzulActionPerformed

    private void NegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegroActionPerformed
        // TODO add your handling code here:
         Panel.setForeground(black);
    }//GEN-LAST:event_NegroActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
           tipo_letra= "Serif";
        Panel.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArialActionPerformed
        // TODO add your handling code here:
        tipo_letra= "Arial";
        Panel.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }//GEN-LAST:event_ArialActionPerformed

    private void Calibre24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calibre24ActionPerformed
        // TODO add your handling code here:
        tamaño_letra= 24;
        Panel.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }//GEN-LAST:event_Calibre24ActionPerformed

    private void RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RojoActionPerformed
        // TODO add your handling code here:
         Panel.setForeground(red);
    }//GEN-LAST:event_RojoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        dialogo.setVisible(true);
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        // TODO add your handling code here:
         dialogo2.setVisible(true);
    }//GEN-LAST:event_CargarActionPerformed

    private void AcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercadeActionPerformed
        // TODO add your handling code here:
         dialogo3.setVisible(true);
    }//GEN-LAST:event_AcercadeActionPerformed

    private void CantidadComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_CantidadComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CantidadComponentAdded

    public void Guardado(String direccionCompleta,  FileWriter ubicacion){
           try{  
             ubicacion = new FileWriter(direccionCompleta);
             }
            catch(IOException ex){
            Logger.getLogger(ProcesadorTexto.class.getName()).log(Level.SEVERE,null,ex);
             }
        
            try{
            BufferedWriter escritor = new BufferedWriter(ubicacion);
            escritor.write(Panel.getText());
            escritor.close();
            }
            catch(Exception ex){
        }
    }
    
    
    public void Carga(String direccionCompleta, String archivo){
        
        Panel.setText("");
         File seleccion = new File(direccionCompleta);
          
         try {
             BufferedReader leer = new BufferedReader(new FileReader(archivo));
             String linea = leer.readLine();
             while(linea!= null){
                 Panel.append(linea + "\n");
                 linea = leer.readLine();
                 
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(EmergenteCargado.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(EmergenteCargado.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         lugar.setText(direccionCompleta);
    }
    
    public void Peso(String direccionCompleta){
        
        File seleccion = new File(direccionCompleta);

       long numero = seleccion.length();
        System.out.println(numero);
       String tamaño = String.valueOf(numero);
        System.out.println(tamaño);
      
        Cantidad.setText(tamaño);
        
    }
 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProcesadorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcesadorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcesadorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesadorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcesadorTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acerca;
    private javax.swing.JMenuItem Acercade;
    private javax.swing.JMenuItem Arial;
    private javax.swing.JMenuItem Azul;
    private javax.swing.JMenuItem Calibre12;
    private javax.swing.JMenuItem Calibre18;
    private javax.swing.JMenuItem Calibre24;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JMenuItem Cargar;
    private javax.swing.JMenu Color;
    private javax.swing.JPanel ContPalabras;
    private javax.swing.JLabel Contador;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu Fuente;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JPanel Hora;
    private javax.swing.JPanel Link;
    private javax.swing.JMenuItem Negro;
    private javax.swing.JLabel Palabras;
    private javax.swing.JTextArea Panel;
    private javax.swing.JLabel Peso;
    private javax.swing.JPanel PesoPalabras;
    private javax.swing.JMenuItem Rojo;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenu Tamaño;
    private javax.swing.JLabel Ubicacion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lugar;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
    
    public String tipo_letra ="Arial";
     public int formato_letra =Font.PLAIN;
    public int tamaño_letra=12;

    
}
