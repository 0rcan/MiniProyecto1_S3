/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

/**
 *
 * @author josue
 */
public class ModificarSoldadoRaso extends javax.swing.JFrame implements ActionListener, ItemListener, OperacionesMilitares{

    /**
     * Creates new form CrearSoldado
     */
    public ModificarSoldadoRaso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelModificarSoldado = new javax.swing.JPanel();
        labelNameModificarSoldado = new javax.swing.JLabel();
        textNombreModificarSoldado1 = new javax.swing.JTextField();
        labelNivelModificarSoldado = new javax.swing.JLabel();
        textNivelModificarSoldado = new javax.swing.JTextField();
        labelReporteModificarSoldado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMisionModificarSoldado = new javax.swing.JTextArea();
        labelMisionModificarSoldado = new javax.swing.JLabel();
        labelAccionModificarSoldado = new javax.swing.JLabel();
        textAccionModificarSoldado = new javax.swing.JTextField();
        panelModificarSoldado2 = new javax.swing.JPanel();
        labelModificarSoldado = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaReporteModificarSoldado1 = new javax.swing.JTextArea();
        botonModificarSoldado = new javax.swing.JButton();
        botonResetrSoldado = new javax.swing.JButton();
        botonEliminarSoldadoRaso = new javax.swing.JButton();
        panelBuscadorModificarSoldadoRaso = new javax.swing.JPanel();
        textBuscarModificarSoldadoRaso = new javax.swing.JLabel();
        textBuscadorModificarSoldadoRaso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelModificarSoldado.setBackground(new java.awt.Color(19, 71, 89));

        labelNameModificarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelNameModificarSoldado.setText("Nombre");

        textNombreModificarSoldado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreModificarSoldado1ActionPerformed(evt);
            }
        });

        labelNivelModificarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelModificarSoldado.setText("Nivel");

        labelReporteModificarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteModificarSoldado.setText("Reporte");

        areaMisionModificarSoldado.setColumns(20);
        areaMisionModificarSoldado.setRows(5);
        jScrollPane1.setViewportView(areaMisionModificarSoldado);

        labelMisionModificarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionModificarSoldado.setText("Misión");

        labelAccionModificarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionModificarSoldado.setText("Acción");

        panelModificarSoldado2.setBackground(new java.awt.Color(0, 153, 153));

        labelModificarSoldado.setBackground(new java.awt.Color(0, 153, 153));
        labelModificarSoldado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelModificarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelModificarSoldado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModificarSoldado.setText("Modificar Soldado Raso");

        javax.swing.GroupLayout panelModificarSoldado2Layout = new javax.swing.GroupLayout(panelModificarSoldado2);
        panelModificarSoldado2.setLayout(panelModificarSoldado2Layout);
        panelModificarSoldado2Layout.setHorizontalGroup(
            panelModificarSoldado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarSoldado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelModificarSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelModificarSoldado2Layout.setVerticalGroup(
            panelModificarSoldado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarSoldado2Layout.createSequentialGroup()
                .addComponent(labelModificarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        areaReporteModificarSoldado1.setColumns(20);
        areaReporteModificarSoldado1.setRows(5);
        jScrollPane3.setViewportView(areaReporteModificarSoldado1);

        botonModificarSoldado.setBackground(new java.awt.Color(0, 153, 153));
        botonModificarSoldado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonModificarSoldado.setText("Next");

        botonResetrSoldado.setBackground(new java.awt.Color(0, 153, 153));
        botonResetrSoldado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonResetrSoldado.setText("Reset");

        botonEliminarSoldadoRaso.setBackground(new java.awt.Color(0, 153, 153));
        botonEliminarSoldadoRaso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEliminarSoldadoRaso.setText("Eliminar");
        botonEliminarSoldadoRaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarSoldadoRasoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModificarSoldadoLayout = new javax.swing.GroupLayout(panelModificarSoldado);
        panelModificarSoldado.setLayout(panelModificarSoldadoLayout);
        panelModificarSoldadoLayout.setHorizontalGroup(
            panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificarSoldado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelModificarSoldadoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarSoldadoLayout.createSequentialGroup()
                        .addComponent(labelMisionModificarSoldado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarSoldadoLayout.createSequentialGroup()
                        .addGroup(panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelModificarSoldadoLayout.createSequentialGroup()
                                .addGroup(panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNombreModificarSoldado1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNivelModificarSoldado)
                                    .addComponent(labelNameModificarSoldado)
                                    .addComponent(textNivelModificarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAccionModificarSoldado)
                                    .addComponent(textAccionModificarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelReporteModificarSoldado)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelModificarSoldadoLayout.createSequentialGroup()
                                .addComponent(botonResetrSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(botonEliminarSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(botonModificarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))
                    .addGroup(panelModificarSoldadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelModificarSoldadoLayout.setVerticalGroup(
            panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarSoldadoLayout.createSequentialGroup()
                .addComponent(panelModificarSoldado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameModificarSoldado)
                    .addComponent(labelReporteModificarSoldado))
                .addGap(12, 12, 12)
                .addGroup(panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelModificarSoldadoLayout.createSequentialGroup()
                        .addComponent(textNombreModificarSoldado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNivelModificarSoldado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNivelModificarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(labelAccionModificarSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAccionModificarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMisionModificarSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(panelModificarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonResetrSoldado)
                    .addComponent(botonModificarSoldado)
                    .addComponent(botonEliminarSoldadoRaso))
                .addGap(70, 70, 70))
        );

        panelBuscadorModificarSoldadoRaso.setBackground(new java.awt.Color(0, 153, 153));

        textBuscarModificarSoldadoRaso.setForeground(new java.awt.Color(255, 255, 255));
        textBuscarModificarSoldadoRaso.setText("Buscar ID");

        textBuscadorModificarSoldadoRaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscadorModificarSoldadoRasoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscadorModificarSoldadoRasoLayout = new javax.swing.GroupLayout(panelBuscadorModificarSoldadoRaso);
        panelBuscadorModificarSoldadoRaso.setLayout(panelBuscadorModificarSoldadoRasoLayout);
        panelBuscadorModificarSoldadoRasoLayout.setHorizontalGroup(
            panelBuscadorModificarSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorModificarSoldadoRasoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelBuscadorModificarSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBuscadorModificarSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBuscarModificarSoldadoRaso))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelBuscadorModificarSoldadoRasoLayout.setVerticalGroup(
            panelBuscadorModificarSoldadoRasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorModificarSoldadoRasoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(textBuscarModificarSoldadoRaso)
                .addGap(18, 18, 18)
                .addComponent(textBuscadorModificarSoldadoRaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelBuscadorModificarSoldadoRaso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelModificarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificarSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBuscadorModificarSoldadoRaso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreModificarSoldado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreModificarSoldado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreModificarSoldado1ActionPerformed

    private void textBuscadorModificarSoldadoRasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscadorModificarSoldadoRasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscadorModificarSoldadoRasoActionPerformed

    private void botonEliminarSoldadoRasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarSoldadoRasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarSoldadoRasoActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarSoldadoRaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMisionModificarSoldado;
    private javax.swing.JTextArea areaReporteModificarSoldado1;
    private javax.swing.JButton botonEliminarSoldadoRaso;
    private javax.swing.JButton botonModificarSoldado;
    private javax.swing.JButton botonResetrSoldado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionModificarSoldado;
    private javax.swing.JLabel labelMisionModificarSoldado;
    private javax.swing.JLabel labelModificarSoldado;
    private javax.swing.JLabel labelNameModificarSoldado;
    private javax.swing.JLabel labelNivelModificarSoldado;
    private javax.swing.JLabel labelReporteModificarSoldado;
    private javax.swing.JPanel panelBuscadorModificarSoldadoRaso;

    private javax.swing.JPanel panelModificarSoldado;
    private javax.swing.JPanel panelModificarSoldado2;
    private javax.swing.JTextField textAccionModificarSoldado;
    private javax.swing.JTextField textBuscadorModificarSoldadoRaso;

    private javax.swing.JLabel textBuscarModificarSoldadoRaso;

    private javax.swing.JTextField textNivelModificarSoldado;
    private javax.swing.JTextField textNombreModificarSoldado1;
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
