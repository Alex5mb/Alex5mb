/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ejercicio1;


import java.awt.SystemColor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlejandroMarínBermúd
 */
public class EmergenteCargado extends javax.swing.JDialog {

     private ProcesadorTexto ventanaPadre;
    /**
     * Creates new form EmergenteCargado
     */
    public EmergenteCargado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ventanaPadre = (ProcesadorTexto) parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Seleccionador = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(2, 2, 0, 5));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Selecciona un archivo: ");
        getContentPane().add(jLabel1);
        getContentPane().add(Seleccionador);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar);

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
          String archivo = Seleccionador.getText();
          String carpeta = System.getProperty("user.dir");
          String direccionCompleta = carpeta + "/" + archivo;
           
          System.out.println(direccionCompleta);
         
        ventanaPadre.Carga(direccionCompleta, archivo);
        ventanaPadre.Peso(direccionCompleta);
          
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
           
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Seleccionador;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    void setup(SystemColor text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
