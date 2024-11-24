
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

import javax.swing.ButtonGroup;

/**
 *
 * @author josue
 */
public class MenuRangos extends javax.swing.JFrame implements ItemListener, ActionListener {

    /**
     * Creates new form MenuRangos
     */
    public MenuRangos() {
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

        PanelRangos = new javax.swing.JPanel();
        panelRangos2 = new javax.swing.JPanel();
        labelRangos = new javax.swing.JLabel();
        radioSoldadoRaso = new javax.swing.JRadioButton();
        radioTeniente = new javax.swing.JRadioButton();
        radioCoronel = new javax.swing.JRadioButton();
        radioCapitan = new javax.swing.JRadioButton();
        botonRangos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRangos.setBackground(new java.awt.Color(19, 71, 89));

        panelRangos2.setBackground(new java.awt.Color(0, 153, 153));

        labelRangos.setBackground(new java.awt.Color(0, 153, 153));
        labelRangos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelRangos.setForeground(new java.awt.Color(255, 255, 255));
        labelRangos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRangos.setText("Seleccionar Rango");

        javax.swing.GroupLayout panelRangos2Layout = new javax.swing.GroupLayout(panelRangos2);
        panelRangos2.setLayout(panelRangos2Layout);
        panelRangos2Layout.setHorizontalGroup(
            panelRangos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRangos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRangos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRangos2Layout.setVerticalGroup(
            panelRangos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRangos, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        radioSoldadoRaso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        radioSoldadoRaso.setText("\tSoldadoRaso");
        radioSoldadoRaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSoldadoRasoActionPerformed(evt);
            }
        });

        radioTeniente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioTeniente.setForeground(new java.awt.Color(255, 255, 255));
        radioTeniente.setText("Teniente");

        radioCoronel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioCoronel.setForeground(new java.awt.Color(255, 255, 255));
        radioCoronel.setText("Coronel");

        radioCapitan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioCapitan.setForeground(new java.awt.Color(255, 255, 255));
        radioCapitan.setText("Capitan");

        botonRangos.setBackground(new java.awt.Color(0, 153, 153));
        botonRangos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonRangos.setText("Next");
        botonRangos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRangosActionPerformed(evt);
            }
        });
        ButtonGroup group = new ButtonGroup();
        group.add(radioSoldadoRaso);
        group.add(radioTeniente);
        group.add(radioCoronel);
        group.add(radioCapitan);

        javax.swing.GroupLayout PanelRangosLayout = new javax.swing.GroupLayout(PanelRangos);
        PanelRangos.setLayout(PanelRangosLayout);
        PanelRangosLayout.setHorizontalGroup(
            PanelRangosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRangos2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelRangosLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(PanelRangosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioCapitan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioCoronel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioTeniente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSoldadoRaso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonRangos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        PanelRangosLayout.setVerticalGroup(
            PanelRangosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRangosLayout.createSequentialGroup()
                .addComponent(panelRangos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(radioSoldadoRaso)
                .addGap(18, 18, 18)
                .addComponent(radioTeniente)
                .addGap(30, 30, 30)
                .addComponent(radioCoronel)
                .addGap(30, 30, 30)
                .addComponent(radioCapitan)
                .addGap(30, 30, 30)
                .addComponent(botonRangos)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRangos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRangos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioSoldadoRasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSoldadoRasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSoldadoRasoActionPerformed

    private void botonRangosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRangosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRangosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuRangos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRangos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRangos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRangos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRangos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRangos;
    private javax.swing.JButton botonRangos;
    private javax.swing.JLabel labelRangos;
    private javax.swing.JPanel panelRangos2;
    private javax.swing.JRadioButton radioCapitan;
    private javax.swing.JRadioButton radioCoronel;
    private javax.swing.JRadioButton radioSoldadoRaso;
    private javax.swing.JRadioButton radioTeniente;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
}
