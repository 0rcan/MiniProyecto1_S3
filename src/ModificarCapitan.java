/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class ModificarCapitan extends javax.swing.JFrame implements ActionListener, ItemListener, OperacionesMilitares{

    /**
     * Creates new form crearCapitan
     */
    public ModificarCapitan() {
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
        JOptionPane.showMessageDialog(null,"Use enter en el buscador para realizar su busqueda");
        jSeparator1 = new javax.swing.JSeparator();
        panelModificarCapitan = new javax.swing.JPanel();
        labelNameModificarCapitan = new javax.swing.JLabel();
        textNombreModificarCapitan = new javax.swing.JTextField();
        labelNivelModificarCapitan = new javax.swing.JLabel();
        textNivelModificarCapitan = new javax.swing.JTextField();
        labelReporteModificarCapitan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaReporteModificarCoronel = new javax.swing.JTextArea();
        labelMisionModificarCapitan = new javax.swing.JLabel();
        labelAccionModificarCapitan = new javax.swing.JLabel();
        textAccionModificarCoronel = new javax.swing.JTextField();
        panelModificarCapitan2 = new javax.swing.JPanel();
        labelModificarCapitan2 = new javax.swing.JLabel();
        labelModificarEstrategia = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaMisionModificarCoronel = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaEstrategiaModificarCoronel = new javax.swing.JTextArea();
        botonModificarCapitan = new javax.swing.JButton();
        botonResetModificarCapitan1 = new javax.swing.JButton();
        botonEliminarCapitan = new javax.swing.JButton();
        panelBuscadorModificarCapitan = new javax.swing.JPanel();
        textBuscarModificarCapitan = new javax.swing.JLabel();
        textBuscadorModificarCapitan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelModificarCapitan.setBackground(new java.awt.Color(19, 71, 89));

        labelNameModificarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelNameModificarCapitan.setText("Nombre");

        textNombreModificarCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreModificarCapitanActionPerformed(evt);
            }
        });

        labelNivelModificarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelModificarCapitan.setText("Nivel");

        labelReporteModificarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteModificarCapitan.setText("Reporte");

        areaReporteModificarCoronel.setColumns(20);
        areaReporteModificarCoronel.setRows(5);
        jScrollPane1.setViewportView(areaReporteModificarCoronel);

        labelMisionModificarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionModificarCapitan.setText("Misión");

        labelAccionModificarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionModificarCapitan.setText("Acción");

        panelModificarCapitan2.setBackground(new java.awt.Color(0, 153, 153));

        labelModificarCapitan2.setBackground(new java.awt.Color(0, 153, 153));
        labelModificarCapitan2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelModificarCapitan2.setForeground(new java.awt.Color(255, 255, 255));
        labelModificarCapitan2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModificarCapitan2.setText("Modificar Capitan");

        javax.swing.GroupLayout panelModificarCapitan2Layout = new javax.swing.GroupLayout(panelModificarCapitan2);
        panelModificarCapitan2.setLayout(panelModificarCapitan2Layout);
        panelModificarCapitan2Layout.setHorizontalGroup(
            panelModificarCapitan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarCapitan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelModificarCapitan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelModificarCapitan2Layout.setVerticalGroup(
            panelModificarCapitan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarCapitan2Layout.createSequentialGroup()
                .addComponent(labelModificarCapitan2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        labelModificarEstrategia.setForeground(new java.awt.Color(255, 255, 255));
        labelModificarEstrategia.setText("Estrategia");

        areaMisionModificarCoronel.setColumns(20);
        areaMisionModificarCoronel.setRows(5);
        jScrollPane3.setViewportView(areaMisionModificarCoronel);

        areaEstrategiaModificarCoronel.setColumns(20);
        areaEstrategiaModificarCoronel.setRows(5);
        jScrollPane2.setViewportView(areaEstrategiaModificarCoronel);

        botonModificarCapitan.setBackground(new java.awt.Color(0, 153, 153));
        botonModificarCapitan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonModificarCapitan.setText("Next");

        botonResetModificarCapitan1.setBackground(new java.awt.Color(0, 153, 153));
        botonResetModificarCapitan1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonResetModificarCapitan1.setText("Reset");

        botonEliminarCapitan.setBackground(new java.awt.Color(0, 153, 153));
        botonEliminarCapitan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEliminarCapitan.setText("Eliminar");
        botonEliminarCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCapitanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModificarCapitanLayout = new javax.swing.GroupLayout(panelModificarCapitan);
        panelModificarCapitan.setLayout(panelModificarCapitanLayout);
        panelModificarCapitanLayout.setHorizontalGroup(
            panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificarCapitan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                        .addComponent(botonResetModificarCapitan1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(botonEliminarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(botonModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                        .addGroup(panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombreModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNivelModificarCapitan)
                            .addComponent(labelNameModificarCapitan)
                            .addComponent(textNivelModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAccionModificarCapitan)
                            .addComponent(textAccionModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMisionModificarCapitan)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReporteModificarCapitan)
                            .addComponent(labelModificarEstrategia)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        panelModificarCapitanLayout.setVerticalGroup(
            panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                .addComponent(panelModificarCapitan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameModificarCapitan)
                    .addComponent(labelReporteModificarCapitan))
                .addGroup(panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(textNombreModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNivelModificarCapitan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNivelModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelModificarEstrategia))
                    .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelAccionModificarCapitan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelModificarCapitanLayout.createSequentialGroup()
                        .addComponent(textAccionModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelMisionModificarCapitan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(panelModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarCapitan)
                    .addComponent(botonResetModificarCapitan1)
                    .addComponent(botonEliminarCapitan))
                .addGap(64, 64, 64))
        );

        panelBuscadorModificarCapitan.setBackground(new java.awt.Color(0, 153, 153));
        panelBuscadorModificarCapitan.setPreferredSize(new java.awt.Dimension(222, 0));

        textBuscarModificarCapitan.setForeground(new java.awt.Color(255, 255, 255));
        textBuscarModificarCapitan.setText("Buscar ID");

        textBuscadorModificarCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscadorModificarCapitanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscadorModificarCapitanLayout = new javax.swing.GroupLayout(panelBuscadorModificarCapitan);
        panelBuscadorModificarCapitan.setLayout(panelBuscadorModificarCapitanLayout);
        panelBuscadorModificarCapitanLayout.setHorizontalGroup(
            panelBuscadorModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorModificarCapitanLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelBuscadorModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBuscadorModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBuscarModificarCapitan))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelBuscadorModificarCapitanLayout.setVerticalGroup(
            panelBuscadorModificarCapitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorModificarCapitanLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(textBuscarModificarCapitan)
                .addGap(18, 18, 18)
                .addComponent(textBuscadorModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelBuscadorModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelModificarCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificarCapitan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBuscadorModificarCapitan, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreModificarCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreModificarCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreModificarCapitanActionPerformed

    private void botonEliminarCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarCapitanActionPerformed

    private void textBuscadorModificarCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscadorModificarCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscadorModificarCapitanActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarCapitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCapitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCapitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCapitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCapitan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaEstrategiaModificarCoronel;
    private javax.swing.JTextArea areaMisionModificarCoronel;
    private javax.swing.JTextArea areaReporteModificarCoronel;
    private javax.swing.JButton botonEliminarCapitan;
    private javax.swing.JButton botonModificarCapitan;
    private javax.swing.JButton botonResetModificarCapitan1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAccionModificarCapitan;
    private javax.swing.JLabel labelMisionModificarCapitan;
    private javax.swing.JLabel labelModificarCapitan2;
    private javax.swing.JLabel labelModificarEstrategia;
    private javax.swing.JLabel labelNameModificarCapitan;
    private javax.swing.JLabel labelNivelModificarCapitan;
    private javax.swing.JLabel labelReporteModificarCapitan;
    private javax.swing.JPanel panelBuscadorModificarCapitan;
    private javax.swing.JPanel panelModificarCapitan;
    private javax.swing.JPanel panelModificarCapitan2;
    private javax.swing.JTextField textAccionModificarCoronel;
    private javax.swing.JTextField textBuscadorModificarCapitan;
    private javax.swing.JLabel textBuscarModificarCapitan;
    private javax.swing.JTextField textNivelModificarCapitan;
    private javax.swing.JTextField textNombreModificarCapitan;
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
