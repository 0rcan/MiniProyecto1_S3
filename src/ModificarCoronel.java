/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

/**
 *
 * @author josue
 */
public class ModificarCoronel extends javax.swing.JFrame implements ActionListener, ItemListener, OperacionesMilitares{

    /**
     * Creates new form crearCoronel
     */
    public ModificarCoronel() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        panelModificarCoronel = new javax.swing.JPanel();
        labelNameModificarCoronel = new javax.swing.JLabel();
        textIDModificarCoronel = new javax.swing.JTextField();
        labelIDModificarCoronel = new javax.swing.JLabel();
        textNombreModificarCoronel = new javax.swing.JTextField();
        labelNivelModificarCoronel = new javax.swing.JLabel();
        textNivelModificarCoronel = new javax.swing.JTextField();
        labelReporteModificarCoronel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMisionModificarCoronel = new javax.swing.JTextArea();
        labelMisionModificarCoronel = new javax.swing.JLabel();
        labelAccionModificarCoronel = new javax.swing.JLabel();
        textAccionModificarCoronel = new javax.swing.JTextField();
        panelModificarCoronel2 = new javax.swing.JPanel();
        labelModificarCoronel = new javax.swing.JLabel();
        labelModificarMando = new javax.swing.JLabel();
        textMando = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaReporteModificarCoronel1 = new javax.swing.JTextArea();
        botonModificarCoronel = new javax.swing.JButton();
        botonResetModificarCoronel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelModificarCoronel.setBackground(new java.awt.Color(19, 71, 89));

        labelNameModificarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelNameModificarCoronel.setText("Nombre");

        labelIDModificarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelIDModificarCoronel.setText("ID");

        textNombreModificarCoronel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreModificarCoronelActionPerformed(evt);
            }
        });

        labelNivelModificarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelModificarCoronel.setText("Nivel");

        labelReporteModificarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteModificarCoronel.setText("Reporte");

        areaMisionModificarCoronel.setColumns(20);
        areaMisionModificarCoronel.setRows(5);
        jScrollPane1.setViewportView(areaMisionModificarCoronel);

        labelMisionModificarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionModificarCoronel.setText("Misión");

        labelAccionModificarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionModificarCoronel.setText("Acción");

        panelModificarCoronel2.setBackground(new java.awt.Color(0, 153, 153));

        labelModificarCoronel.setBackground(new java.awt.Color(0, 153, 153));
        labelModificarCoronel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelModificarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelModificarCoronel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModificarCoronel.setText("Modificar Coronel");

        javax.swing.GroupLayout panelModificarCoronel2Layout = new javax.swing.GroupLayout(panelModificarCoronel2);
        panelModificarCoronel2.setLayout(panelModificarCoronel2Layout);
        panelModificarCoronel2Layout.setHorizontalGroup(
            panelModificarCoronel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarCoronel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelModificarCoronel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelModificarCoronel2Layout.setVerticalGroup(
            panelModificarCoronel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarCoronel2Layout.createSequentialGroup()
                .addComponent(labelModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        labelModificarMando.setForeground(new java.awt.Color(255, 255, 255));
        labelModificarMando.setText("Cantidad soldados bajo su mando");

        areaReporteModificarCoronel1.setColumns(20);
        areaReporteModificarCoronel1.setRows(5);
        jScrollPane3.setViewportView(areaReporteModificarCoronel1);

        botonModificarCoronel.setBackground(new java.awt.Color(0, 153, 153));
        botonModificarCoronel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonModificarCoronel.setText("Next");

        botonResetModificarCoronel1.setBackground(new java.awt.Color(0, 153, 153));
        botonResetModificarCoronel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonResetModificarCoronel1.setText("Reset");

        javax.swing.GroupLayout panelModificarCoronelLayout = new javax.swing.GroupLayout(panelModificarCoronel);
        panelModificarCoronel.setLayout(panelModificarCoronelLayout);
        panelModificarCoronelLayout.setHorizontalGroup(
            panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificarCoronel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelModificarCoronelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarCoronelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelModificarCoronelLayout.createSequentialGroup()
                        .addComponent(labelMisionModificarCoronel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarCoronelLayout.createSequentialGroup()
                        .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelModificarCoronelLayout.createSequentialGroup()
                                .addComponent(botonResetModificarCoronel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelModificarCoronelLayout.createSequentialGroup()
                                .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIDModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombreModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelIDModificarCoronel)
                                    .addComponent(labelNivelModificarCoronel)
                                    .addComponent(labelNameModificarCoronel)
                                    .addComponent(textNivelModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAccionModificarCoronel)
                                    .addComponent(textAccionModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelReporteModificarCoronel)
                                    .addComponent(labelModificarMando)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMando, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))))
        );
        panelModificarCoronelLayout.setVerticalGroup(
            panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarCoronelLayout.createSequentialGroup()
                .addComponent(panelModificarCoronel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameModificarCoronel)
                    .addComponent(labelReporteModificarCoronel))
                .addGap(12, 12, 12)
                .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarCoronelLayout.createSequentialGroup()
                        .addComponent(textNombreModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDModificarCoronel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIDModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivelModificarCoronel)
                    .addComponent(labelModificarMando))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNivelModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelAccionModificarCoronel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAccionModificarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMisionModificarCoronel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panelModificarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarCoronel)
                    .addComponent(botonResetModificarCoronel1))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificarCoronel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificarCoronel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreModificarCoronelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreModificarCoronelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreModificarCoronelActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCoronel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMisionModificarCoronel;
    private javax.swing.JTextArea areaReporteModificarCoronel1;
    private javax.swing.JButton botonModificarCoronel;
    private javax.swing.JButton botonResetModificarCoronel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionModificarCoronel;
    private javax.swing.JLabel labelIDModificarCoronel;
    private javax.swing.JLabel labelMisionModificarCoronel;
    private javax.swing.JLabel labelModificarCoronel;
    private javax.swing.JLabel labelModificarMando;
    private javax.swing.JLabel labelNameModificarCoronel;
    private javax.swing.JLabel labelNivelModificarCoronel;
    private javax.swing.JLabel labelReporteModificarCoronel;
    private javax.swing.JPanel panelModificarCoronel;
    private javax.swing.JPanel panelModificarCoronel2;
    private javax.swing.JTextField textAccionModificarCoronel;
    private javax.swing.JTextField textIDModificarCoronel;
    private javax.swing.JTextField textMando;
    private javax.swing.JTextField textNivelModificarCoronel;
    private javax.swing.JTextField textNombreModificarCoronel;
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
