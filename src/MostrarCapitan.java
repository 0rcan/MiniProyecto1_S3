/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

/**
 *
 * @author digital
 */
public class MostrarCapitan extends javax.swing.JFrame {

    /**
     * Creates new form MostrarCapitan
     */
    public MostrarCapitan() {
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

        panelMostrarCapitan = new javax.swing.JPanel();
        labelNameMostrarCapitan = new javax.swing.JLabel();
        textIDMostrarCapitan = new javax.swing.JTextField();
        labelIDMostrarCapitan = new javax.swing.JLabel();
        textNombreMostrarCapitan = new javax.swing.JTextField();
        labelNivelMostrarCapitan = new javax.swing.JLabel();
        textNivelMostrarCapitan = new javax.swing.JTextField();
        labelReporteMostrarCapitan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaReporteCrearCoronel = new javax.swing.JTextArea();
        labelMisionMostrarCapitan = new javax.swing.JLabel();
        labelAccionMostrarCapitan = new javax.swing.JLabel();
        textAccionMostrarCoronel = new javax.swing.JTextField();
        panelMostrarCapitan2 = new javax.swing.JPanel();
        labelMostrarCapitan2 = new javax.swing.JLabel();
        labelMostrarEstrategia = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaMisionMostrarCoronel = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaEstrategiaMostrarCoronel = new javax.swing.JTextArea();
        botonMostrarCapitan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelMostrarCapitan.setBackground(new java.awt.Color(19, 71, 89));

        labelNameMostrarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelNameMostrarCapitan.setText("Nombre");

        textIDMostrarCapitan.setEditable(false);

        labelIDMostrarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelIDMostrarCapitan.setText("ID");

        textNombreMostrarCapitan.setEditable(false);
        textNombreMostrarCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreMostrarCapitanActionPerformed(evt);
            }
        });

        labelNivelMostrarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelMostrarCapitan.setText("Nivel");

        textNivelMostrarCapitan.setEditable(false);

        labelReporteMostrarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteMostrarCapitan.setText("Reporte");

        areaReporteCrearCoronel.setEditable(false);
        areaReporteCrearCoronel.setColumns(20);
        areaReporteCrearCoronel.setRows(5);
        jScrollPane1.setViewportView(areaReporteCrearCoronel);

        labelMisionMostrarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionMostrarCapitan.setText("Misión");

        labelAccionMostrarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionMostrarCapitan.setText("Acción");

        textAccionMostrarCoronel.setEditable(false);

        panelMostrarCapitan2.setBackground(new java.awt.Color(0, 153, 153));

        labelMostrarCapitan2.setBackground(new java.awt.Color(0, 153, 153));
        labelMostrarCapitan2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMostrarCapitan2.setForeground(new java.awt.Color(255, 255, 255));
        labelMostrarCapitan2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMostrarCapitan2.setText("Mostrar Capitan");

        javax.swing.GroupLayout panelMostrarCapitan2Layout = new javax.swing.GroupLayout(panelMostrarCapitan2);
        panelMostrarCapitan2.setLayout(panelMostrarCapitan2Layout);
        panelMostrarCapitan2Layout.setHorizontalGroup(
            panelMostrarCapitan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarCapitan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMostrarCapitan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMostrarCapitan2Layout.setVerticalGroup(
            panelMostrarCapitan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarCapitan2Layout.createSequentialGroup()
                .addComponent(labelMostrarCapitan2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        labelMostrarEstrategia.setForeground(new java.awt.Color(255, 255, 255));
        labelMostrarEstrategia.setText("Estrategia");

        areaMisionMostrarCoronel.setEditable(false);
        areaMisionMostrarCoronel.setColumns(20);
        areaMisionMostrarCoronel.setRows(5);
        jScrollPane3.setViewportView(areaMisionMostrarCoronel);

        areaEstrategiaMostrarCoronel.setEditable(false);
        areaEstrategiaMostrarCoronel.setColumns(20);
        areaEstrategiaMostrarCoronel.setRows(5);
        jScrollPane2.setViewportView(areaEstrategiaMostrarCoronel);

        botonMostrarCapitan.setBackground(new java.awt.Color(0, 153, 153));
        botonMostrarCapitan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonMostrarCapitan.setText("Next");

        javax.swing.GroupLayout panelMostrarCapitanLayout = new javax.swing.GroupLayout(panelMostrarCapitan);
        panelMostrarCapitan.setLayout(panelMostrarCapitanLayout);
        panelMostrarCapitanLayout.setHorizontalGroup(
            panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMostrarCapitan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                        .addComponent(labelMisionMostrarCapitan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                        .addGroup(panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textIDMostrarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombreMostrarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIDMostrarCapitan)
                            .addComponent(labelNivelMostrarCapitan)
                            .addComponent(labelNameMostrarCapitan)
                            .addComponent(textNivelMostrarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAccionMostrarCapitan)
                            .addComponent(textAccionMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReporteMostrarCapitan)
                            .addComponent(labelMostrarEstrategia)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
            .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(botonMostrarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMostrarCapitanLayout.setVerticalGroup(
            panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                .addComponent(panelMostrarCapitan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameMostrarCapitan)
                    .addComponent(labelReporteMostrarCapitan))
                .addGroup(panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(textNombreMostrarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDMostrarCapitan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIDMostrarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivelMostrarCapitan)
                    .addComponent(labelMostrarEstrategia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMostrarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarCapitanLayout.createSequentialGroup()
                        .addComponent(textNivelMostrarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelAccionMostrarCapitan)
                        .addGap(12, 12, 12)
                        .addComponent(textAccionMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelMisionMostrarCapitan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonMostrarCapitan)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMostrarCapitan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMostrarCapitan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreMostrarCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreMostrarCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreMostrarCapitanActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarCapitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarCapitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarCapitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarCapitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarCapitan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaEstrategiaMostrarCoronel;
    private javax.swing.JTextArea areaMisionMostrarCoronel;
    private javax.swing.JTextArea areaReporteCrearCoronel;
    private javax.swing.JButton botonMostrarCapitan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionMostrarCapitan;
    private javax.swing.JLabel labelIDMostrarCapitan;
    private javax.swing.JLabel labelMisionMostrarCapitan;
    private javax.swing.JLabel labelMostrarCapitan2;
    private javax.swing.JLabel labelMostrarEstrategia;
    private javax.swing.JLabel labelNameMostrarCapitan;
    private javax.swing.JLabel labelNivelMostrarCapitan;
    private javax.swing.JLabel labelReporteMostrarCapitan;
    private javax.swing.JPanel panelMostrarCapitan;
    private javax.swing.JPanel panelMostrarCapitan2;
    private javax.swing.JTextField textAccionMostrarCoronel;
    private javax.swing.JTextField textIDMostrarCapitan;
    private javax.swing.JTextField textNivelMostrarCapitan;
    private javax.swing.JTextField textNombreMostrarCapitan;
    // End of variables declaration//GEN-END:variables
}
