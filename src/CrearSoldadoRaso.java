/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

/**
 *
 * @author josue
 */
public class CrearSoldadoRaso extends javax.swing.JFrame implements ActionListener, ItemListener, OperacionesMilitares{

    /**
     * Creates new form CrearSoldadoRaso
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

        panelCrearSoldadoRaso = new javax.swing.JPanel();
        labelNameCrearSoldadoRaso = new javax.swing.JLabel();
        textIDCrearSoldadoRaso = new javax.swing.JTextField();
        labelIDCrearSoldadoRaso = new javax.swing.JLabel();
        textNombreCrearSoldadoRaso = new javax.swing.JTextField();
        labelNivelCrearSoldadoRaso = new javax.swing.JLabel();
        textNivelCrearSoldadoRaso = new javax.swing.JTextField();
        labelReporteCrearSoldadoRaso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMisionCrearSoldadoRaso = new javax.swing.JTextArea();
        labelMisionCrearSoldadoRaso = new javax.swing.JLabel();
        labelAccionCrearSoldadoRaso = new javax.swing.JLabel();
        textAccionCrearSoldadoRaso = new javax.swing.JTextField();
        panelCrearSoldadoRaso2 = new javax.swing.JPanel();
        labelCrearSoldadoRaso = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaReporteCrearSoldadoRaso = new javax.swing.JTextArea();
        botonSoldadoRaso = new javax.swing.JButton();
        BototnResetSoldadoRaso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCrearSoldadoRaso.setBackground(new java.awt.Color(19, 71, 89));

        labelNameCrearSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        labelNameCrearSoldadoRaso.setText("Nombre");

        labelIDCrearSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        labelIDCrearSoldadoRaso.setText("ID");

        textNombreCrearSoldadoRaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreCrearSoldadoRasoActionPerformed(evt);
            }
        });

        labelNivelCrearSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelCrearSoldadoRaso.setText("Nivel");

        labelReporteCrearSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteCrearSoldadoRaso.setText("Reporte");

        areaMisionCrearSoldadoRaso.setColumns(20);
        areaMisionCrearSoldadoRaso.setRows(5);
        jScrollPane1.setViewportView(areaMisionCrearSoldadoRaso);

        labelMisionCrearSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionCrearSoldadoRaso.setText("Misión");

        labelAccionCrearSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionCrearSoldadoRaso.setText("Acción");

        panelCrearSoldadoRaso2.setBackground(new java.awt.Color(0, 153, 153));

        labelCrearSoldadoRaso.setBackground(new java.awt.Color(0, 153, 153));
        labelCrearSoldadoRaso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCrearSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        labelCrearSoldadoRaso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrearSoldadoRaso.setText("Crear Soldado Raso");

        javax.swing.GroupLayout panelCrearSoldadoRaso2Layout = new javax.swing.GroupLayout(panelCrearSoldadoRaso2);
        panelCrearSoldadoRaso2.setLayout(panelCrearSoldadoRaso2Layout);
        panelCrearSoldadoRaso2Layout.setHorizontalGroup(
            panelCrearSoldadoRaso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearSoldadoRaso2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCrearSoldadoRaso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCrearSoldadoRaso2Layout.setVerticalGroup(
            panelCrearSoldadoRaso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearSoldadoRaso2Layout.createSequentialGroup()
                .addComponent(labelCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        areaReporteCrearSoldadoRaso.setColumns(20);
        areaReporteCrearSoldadoRaso.setRows(5);
        jScrollPane3.setViewportView(areaReporteCrearSoldadoRaso);

        botonSoldadoRaso.setBackground(new java.awt.Color(0, 153, 153));
        botonSoldadoRaso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonSoldadoRaso.setText("Next");

        BototnResetSoldadoRaso.setBackground(new java.awt.Color(0, 153, 153));
        BototnResetSoldadoRaso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BototnResetSoldadoRaso.setText("Reset");
        BototnResetSoldadoRaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BototnResetSoldadoRasoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearSoldadoRasoLayout = new javax.swing.GroupLayout(panelCrearSoldadoRaso);
        panelCrearSoldadoRaso.setLayout(panelCrearSoldadoRasoLayout);
        panelCrearSoldadoRasoLayout.setHorizontalGroup(
            panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearSoldadoRaso2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCrearSoldadoRasoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearSoldadoRasoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCrearSoldadoRasoLayout.createSequentialGroup()
                        .addComponent(labelMisionCrearSoldadoRaso)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearSoldadoRasoLayout.createSequentialGroup()
                        .addGroup(panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCrearSoldadoRasoLayout.createSequentialGroup()
                                .addComponent(BototnResetSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCrearSoldadoRasoLayout.createSequentialGroup()
                                .addGroup(panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIDCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombreCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelIDCrearSoldadoRaso)
                                    .addComponent(labelNivelCrearSoldadoRaso)
                                    .addComponent(labelNameCrearSoldadoRaso)
                                    .addComponent(textNivelCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAccionCrearSoldadoRaso)
                                    .addComponent(textAccionCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addGroup(panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelReporteCrearSoldadoRaso)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))))
        );
        panelCrearSoldadoRasoLayout.setVerticalGroup(
            panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearSoldadoRasoLayout.createSequentialGroup()
                .addComponent(panelCrearSoldadoRaso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameCrearSoldadoRaso)
                    .addComponent(labelReporteCrearSoldadoRaso))
                .addGap(12, 12, 12)
                .addGroup(panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearSoldadoRasoLayout.createSequentialGroup()
                        .addComponent(textNombreCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDCrearSoldadoRaso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIDCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelNivelCrearSoldadoRaso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNivelCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAccionCrearSoldadoRaso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAccionCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMisionCrearSoldadoRaso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panelCrearSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSoldadoRaso)
                    .addComponent(BototnResetSoldadoRaso))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrearSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreCrearSoldadoRasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreCrearSoldadoRasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreCrearSoldadoRasoActionPerformed

    private void BototnResetSoldadoRasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BototnResetSoldadoRasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BototnResetSoldadoRasoActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearSoldadoRaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BototnResetSoldadoRaso;
    private javax.swing.JTextArea areaMisionCrearSoldadoRaso;
    private javax.swing.JTextArea areaReporteCrearSoldadoRaso;
    private javax.swing.JButton botonSoldadoRaso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionCrearSoldadoRaso;
    private javax.swing.JLabel labelCrearSoldadoRaso;
    private javax.swing.JLabel labelIDCrearSoldadoRaso;
    private javax.swing.JLabel labelMisionCrearSoldadoRaso;
    private javax.swing.JLabel labelNameCrearSoldadoRaso;
    private javax.swing.JLabel labelNivelCrearSoldadoRaso;
    private javax.swing.JLabel labelReporteCrearSoldadoRaso;
    private javax.swing.JPanel panelCrearSoldadoRaso;
    private javax.swing.JPanel panelCrearSoldadoRaso2;
    private javax.swing.JTextField textAccionCrearSoldadoRaso;
    private javax.swing.JTextField textIDCrearSoldadoRaso;
    private javax.swing.JTextField textNivelCrearSoldadoRaso;
    private javax.swing.JTextField textNombreCrearSoldadoRaso;
    // End of variables declaration//GEN-END:variables
    @Override
    public void crearSoldado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearSoldado'");
    }

    @Override
    public void mostrarInformacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacion'");
    }

    @Override
    public void modificarSoldado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarSoldado'");
    }

    @Override
    public void asignarMision(String mision) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asignarMision'");
    }

    @Override
    public void reportarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reportarEstado'");
    }
}
