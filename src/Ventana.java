import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.iniciando;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Ventana extends javax.swing.JFrame implements ActionListener, ItemListener{

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSoldadoRaso = new javax.swing.JRadioButton();
        botonTeniente = new javax.swing.JRadioButton();
        botonCoronel = new javax.swing.JRadioButton();
        botonCapitan = new javax.swing.JRadioButton();
        botonSiguienteRangoSoldado = new javax.swing.JButton();
        textSelecionarRango = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 71, 89));

        botonSoldadoRaso.setBackground(new java.awt.Color(50, 144, 143));
        botonSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        botonSoldadoRaso.setText("Soldado Raso");
        botonSoldadoRaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSoldadoRasoActionPerformed(evt);
            //      if (evt.getSource() == botonSoldadoRaso) {
                   
            //             SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso();
            //    nuevoSoldadoRaso.crearSoldado();
                 //}
            }
        });

        botonTeniente.setBackground(new java.awt.Color(50, 144, 143));
        botonTeniente.setForeground(new java.awt.Color(255, 255, 255));
        botonTeniente.setText("Teniente");
        botonTeniente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTenienteActionPerformed(evt);
            }
        });

        botonCoronel.setBackground(new java.awt.Color(50, 144, 143));
        botonCoronel.setForeground(new java.awt.Color(255, 255, 255));
        botonCoronel.setText("Coronel");
        botonCoronel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCoronelActionPerformed(evt);
                
                
            }
        });

        botonCapitan.setBackground(new java.awt.Color(50, 144, 143));
        botonCapitan.setForeground(new java.awt.Color(255, 255, 255));
        botonCapitan.setText("Capitan");

        botonSiguienteRangoSoldado.setBackground(new java.awt.Color(199, 97, 97));
        botonSiguienteRangoSoldado.setText("Next");
        botonSiguienteRangoSoldado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteRangoSoldadoActionPerformed(evt);
            }
        });
        ButtonGroup group = new ButtonGroup();
        group.add(botonSoldadoRaso);
        group.add(botonTeniente);
        group.add(botonCoronel);
        group.add(botonCapitan);
        // if (botonSoldadoRaso.isSelected()) {
        //      int var=1;
        //     JOptionPane.showMessageDialog(null, "Soldado Raso");
        // }
        if (botonTeniente.isSelected()) {
            JOptionPane.showMessageDialog(null, "Teniente");
        }
        if (botonCoronel.isSelected()) {
            JOptionPane.showMessageDialog(null, "Coronel");
        }
        if (botonCapitan.isSelected()) {
            JOptionPane.showMessageDialog(null, "Capitan");
        }


        

        textSelecionarRango.setBackground(new java.awt.Color(104, 221, 150));
        textSelecionarRango.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        textSelecionarRango.setForeground(new java.awt.Color(255, 255, 255));
        textSelecionarRango.setText("Selecione el rango del soldado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonSiguienteRangoSoldado)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSelecionarRango, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCapitan)
                    .addComponent(botonTeniente)
                    .addComponent(botonSoldadoRaso)
                    .addComponent(botonCoronel))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textSelecionarRango, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(botonSoldadoRaso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonTeniente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCoronel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCapitan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botonSiguienteRangoSoldado)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSoldadoRasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSoldadoRasoActionPerformed
       
    }//GEN-LAST:event_botonSoldadoRasoActionPerformed

    private void botonTenienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTenienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTenienteActionPerformed

    private void botonCoronelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCoronelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCoronelActionPerformed

    private void botonSiguienteRangoSoldadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteRangoSoldadoActionPerformed
        if (botonSoldadoRaso.isSelected()) {
            SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso();
             nuevoSoldadoRaso.crearSoldado();
        }
    }//GEN-LAST:event_botonSiguienteRangoSoldadoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonCapitan;
    private javax.swing.JRadioButton botonCoronel;
    private javax.swing.JButton botonSiguienteRangoSoldado;
    private javax.swing.JRadioButton botonSoldadoRaso;
    private javax.swing.JRadioButton botonTeniente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textSelecionarRango;
    // End of variables declaration//GEN-END:variables
    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }

    //@Override
    // public void ActionListener(ActionEvent e) {
    //     botonSoldadoRaso.addActionListener(this);
    //     botonTeniente.addActionListener(this);
    //     botonCoronel.addActionListener(this); 
    //     botonCapitan.addActionListener(this);

       
   // }

    @Override
    public void actionPerformed(ActionEvent e) {
        botonSoldadoRaso.setSelected(true); // Opción 1 seleccionada por defecto

        if(e.getSource() == botonSoldadoRaso){
            JOptionPane.showMessageDialog(null, "Soldado Raso");
        }
        else if(e.getSource() == botonTeniente){
            //JOptionPane.showMessageDialog(null, "Teniente");
        }
        else if(e.getSource() == botonCoronel){
           // JOptionPane.showMessageDialog(null, "Coronel");
        }
        else if(e.getSource() == botonCapitan){
            //JOptionPane.showMessageDialog(null, "Capitan");
        }
    }
}
