/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

/**
 *
 * @author josue
 */
public class BaseMilitar extends javax.swing.JFrame {

    /**
     * Creates new form pp
     */
    public BaseMilitar() {
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
        jPanel2 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        panelBaseMilitar = new javax.swing.JPanel();
        panelBaseMilitar2 = new javax.swing.JPanel();
        labelBaseMilitarColombia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttonCrearSoldado = new javax.swing.JButton();
        buttonMostrarInformacíon = new javax.swing.JButton();
        buttonModificarInformación = new javax.swing.JButton();
        FrameBaseSoldado = new javax.swing.JInternalFrame();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBaseMilitar.setBackground(new java.awt.Color(11, 6, 34));

        panelBaseMilitar2.setBackground(new java.awt.Color(0, 153, 153));
        panelBaseMilitar2.setAlignmentX(0.0F);
        panelBaseMilitar2.setAlignmentY(0.0F);
        panelBaseMilitar2.setMinimumSize(new java.awt.Dimension(100, 10));

        labelBaseMilitarColombia.setBackground(new java.awt.Color(0, 153, 153));
        labelBaseMilitarColombia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelBaseMilitarColombia.setForeground(new java.awt.Color(255, 255, 255));
        labelBaseMilitarColombia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBaseMilitarColombia.setText("Base Militar De Colombia");
        labelBaseMilitarColombia.setAlignmentY(0.0F);
        labelBaseMilitarColombia.setMinimumSize(new java.awt.Dimension(97, 16));
        labelBaseMilitarColombia.setPreferredSize(new java.awt.Dimension(97, 20));

        javax.swing.GroupLayout panelBaseMilitar2Layout = new javax.swing.GroupLayout(panelBaseMilitar2);
        panelBaseMilitar2.setLayout(panelBaseMilitar2Layout);
        panelBaseMilitar2Layout.setHorizontalGroup(
            panelBaseMilitar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBaseMilitarColombia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBaseMilitar2Layout.setVerticalGroup(
            panelBaseMilitar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseMilitar2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(labelBaseMilitarColombia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(19, 71, 89));

        buttonCrearSoldado.setBackground(new java.awt.Color(0, 186, 167));
        buttonCrearSoldado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonCrearSoldado.setForeground(new java.awt.Color(19, 71, 89));
        buttonCrearSoldado.setText("Crear Soldado");
        buttonCrearSoldado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearSoldadoActionPerformed(evt);
            }
        });

        buttonMostrarInformacíon.setBackground(new java.awt.Color(0, 186, 167));
        buttonMostrarInformacíon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonMostrarInformacíon.setForeground(new java.awt.Color(19, 71, 89));
        buttonMostrarInformacíon.setText("Mostrar Información");
        buttonMostrarInformacíon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarInformacíonActionPerformed(evt);
            }
        });

        buttonModificarInformación.setBackground(new java.awt.Color(0, 186, 167));
        buttonModificarInformación.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonModificarInformación.setForeground(new java.awt.Color(19, 71, 89));
        buttonModificarInformación.setText("Modificar Información");
        buttonModificarInformación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarInformaciónActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonMostrarInformacíon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonModificarInformación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(buttonCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(buttonMostrarInformacíon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(buttonModificarInformación, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        FrameBaseSoldado.setVisible(true);

        javax.swing.GroupLayout FrameBaseSoldadoLayout = new javax.swing.GroupLayout(FrameBaseSoldado.getContentPane());
        FrameBaseSoldado.getContentPane().setLayout(FrameBaseSoldadoLayout);
        FrameBaseSoldadoLayout.setHorizontalGroup(
            FrameBaseSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );
        FrameBaseSoldadoLayout.setVerticalGroup(
            FrameBaseSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBaseMilitarLayout = new javax.swing.GroupLayout(panelBaseMilitar);
        panelBaseMilitar.setLayout(panelBaseMilitarLayout);
        panelBaseMilitarLayout.setHorizontalGroup(
            panelBaseMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBaseMilitar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBaseMilitarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FrameBaseSoldado)
                .addContainerGap())
        );
        panelBaseMilitarLayout.setVerticalGroup(
            panelBaseMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseMilitarLayout.createSequentialGroup()
                .addComponent(panelBaseMilitar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBaseMilitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FrameBaseSoldado))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBaseMilitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBaseMilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void buttonCrearSoldadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearSoldadoActionPerformed
        MenuRangos menu = new MenuRangos();
        menu.setVisible(true);
    }//GEN-LAST:event_buttonCrearSoldadoActionPerformed
    
    private void buttonMostrarInformacíonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarInformacíonActionPerformed
        MenuRangosMostrar menu = new MenuRangosMostrar();
        menu.setVisible(true);
    }//GEN-LAST:event_buttonMostrarInformacíonActionPerformed
    
    private void buttonModificarInformaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarInformaciónActionPerformed
        MenuRangosModificar menu = new MenuRangosModificar();
        menu.setVisible(true);
    }//GEN-LAST:event_buttonModificarInformaciónActionPerformed

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
            java.util.logging.Logger.getLogger(BaseMilitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseMilitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseMilitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseMilitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseMilitar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame FrameBaseSoldado;
    private javax.swing.JButton buttonCrearSoldado;
    private javax.swing.JButton buttonModificarInformación;
    private javax.swing.JButton buttonMostrarInformacíon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelBaseMilitarColombia;
    private javax.swing.JPanel panelBaseMilitar;
    private javax.swing.JPanel panelBaseMilitar2;
    // End of variables declaration//GEN-END:variables
}
