/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

/**
 *
 * @author josue
 */
public class CrearSoldadoRaso extends javax.swing.JFrame {

    /**
     * Creates new form CrearSoldado
     */
    public CrearSoldadoRaso() {
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

        panelCrearSoldado = new javax.swing.JPanel();
        labelNameCrearSoldado = new javax.swing.JLabel();
        textIDCrearSoldado = new javax.swing.JTextField();
        labelIDCrearSoldado = new javax.swing.JLabel();
        textNombreCrearSoldado1 = new javax.swing.JTextField();
        labelNivelCrearSoldado = new javax.swing.JLabel();
        textNivelCrearSoldado = new javax.swing.JTextField();
        labelReporteCrearSoldado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMisionCrearSoldado = new javax.swing.JTextArea();
        labelMisionCrearSoldado = new javax.swing.JLabel();
        labelAccionCrearSoldado = new javax.swing.JLabel();
        textAccionCrearSoldado = new javax.swing.JTextField();
        panelCrearSoldado2 = new javax.swing.JPanel();
        labelCrearSoldado = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaReporteCrearSoldado1 = new javax.swing.JTextArea();
        botonSoldado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCrearSoldado.setBackground(new java.awt.Color(19, 71, 89));

        labelNameCrearSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelNameCrearSoldado.setText("Nombre");

        labelIDCrearSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelIDCrearSoldado.setText("ID");

        textNombreCrearSoldado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreCrearSoldado1ActionPerformed(evt);
            }
        });

        labelNivelCrearSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelCrearSoldado.setText("Nivel");

        labelReporteCrearSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteCrearSoldado.setText("Reporte");

        areaMisionCrearSoldado.setColumns(20);
        areaMisionCrearSoldado.setRows(5);
        jScrollPane1.setViewportView(areaMisionCrearSoldado);

        labelMisionCrearSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionCrearSoldado.setText("Misión");

        labelAccionCrearSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionCrearSoldado.setText("Acción");

        panelCrearSoldado2.setBackground(new java.awt.Color(0, 153, 153));

        labelCrearSoldado.setBackground(new java.awt.Color(0, 153, 153));
        labelCrearSoldado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCrearSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelCrearSoldado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrearSoldado.setText("Crear Soldado Raso");

        javax.swing.GroupLayout panelCrearSoldado2Layout = new javax.swing.GroupLayout(panelCrearSoldado2);
        panelCrearSoldado2.setLayout(panelCrearSoldado2Layout);
        panelCrearSoldado2Layout.setHorizontalGroup(
            panelCrearSoldado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearSoldado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCrearSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCrearSoldado2Layout.setVerticalGroup(
            panelCrearSoldado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearSoldado2Layout.createSequentialGroup()
                .addComponent(labelCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        areaReporteCrearSoldado1.setColumns(20);
        areaReporteCrearSoldado1.setRows(5);
        jScrollPane3.setViewportView(areaReporteCrearSoldado1);

        botonSoldado.setBackground(new java.awt.Color(0, 153, 153));
        botonSoldado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonSoldado.setText("Next");

        javax.swing.GroupLayout panelCrearSoldadoLayout = new javax.swing.GroupLayout(panelCrearSoldado);
        panelCrearSoldado.setLayout(panelCrearSoldadoLayout);
        panelCrearSoldadoLayout.setHorizontalGroup(
            panelCrearSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearSoldado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCrearSoldadoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelCrearSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearSoldadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCrearSoldadoLayout.createSequentialGroup()
                        .addComponent(labelMisionCrearSoldado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCrearSoldadoLayout.createSequentialGroup()
                        .addGroup(panelCrearSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textIDCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombreCrearSoldado1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIDCrearSoldado)
                            .addComponent(labelNivelCrearSoldado)
                            .addComponent(labelNameCrearSoldado)
                            .addComponent(textNivelCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAccionCrearSoldado)
                            .addComponent(textAccionCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCrearSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReporteCrearSoldado)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearSoldadoLayout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(botonSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        panelCrearSoldadoLayout.setVerticalGroup(
            panelCrearSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearSoldadoLayout.createSequentialGroup()
                .addComponent(panelCrearSoldado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelCrearSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameCrearSoldado)
                    .addComponent(labelReporteCrearSoldado))
                .addGap(12, 12, 12)
                .addGroup(panelCrearSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearSoldadoLayout.createSequentialGroup()
                        .addComponent(textNombreCrearSoldado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDCrearSoldado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIDCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelNivelCrearSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNivelCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAccionCrearSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAccionCrearSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMisionCrearSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSoldado)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreCrearSoldado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreCrearSoldado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreCrearSoldado1ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearSoldadoRaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMisionCrearSoldado;
    private javax.swing.JTextArea areaReporteCrearSoldado1;
    private javax.swing.JButton botonSoldado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionCrearSoldado;
    private javax.swing.JLabel labelCrearSoldado;
    private javax.swing.JLabel labelIDCrearSoldado;
    private javax.swing.JLabel labelMisionCrearSoldado;
    private javax.swing.JLabel labelNameCrearSoldado;
    private javax.swing.JLabel labelNivelCrearSoldado;
    private javax.swing.JLabel labelReporteCrearSoldado;
    private javax.swing.JPanel panelCrearSoldado;
    private javax.swing.JPanel panelCrearSoldado2;
    private javax.swing.JTextField textAccionCrearSoldado;
    private javax.swing.JTextField textIDCrearSoldado;
    private javax.swing.JTextField textNivelCrearSoldado;
    private javax.swing.JTextField textNombreCrearSoldado1;
    // End of variables declaration//GEN-END:variables
}
