/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

/**
 *
 * @author josue
 */
public class MostrarCoronel extends javax.swing.JFrame implements ActionListener, ItemListener, OperacionesMilitares{

    /**
     * Creates new form MostrarSoldadoRaso
     */
    public MostrarCoronel() {
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

        panelMostrarCoronel = new javax.swing.JPanel();
        labelNameMostrarCoronel = new javax.swing.JLabel();
        textIDMostrarCoronel = new javax.swing.JTextField();
        labelIDMostrarCoronel = new javax.swing.JLabel();
        textNombreMostrarCoronel = new javax.swing.JTextField();
        labelNivelMostrarCoronel = new javax.swing.JLabel();
        textNivelMostrarCoronel = new javax.swing.JTextField();
        labelReporteMostrarCoronel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMisionMostrarCoronel = new javax.swing.JTextArea();
        labelMisionMostrarCoronel = new javax.swing.JLabel();
        labelAccionMostrarCoronel = new javax.swing.JLabel();
        textAccionMostrarCoronel = new javax.swing.JTextField();
        panelMostrarCoronel2 = new javax.swing.JPanel();
        labelMostrarCoronel = new javax.swing.JLabel();
        labelMostrarMando = new javax.swing.JLabel();
        textMostrarMando = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaReporteMostrarCoronel = new javax.swing.JTextArea();
        botonResetMostrarCoronel = new javax.swing.JButton();
        botonMostrarCoronel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelMostrarCoronel.setBackground(new java.awt.Color(19, 71, 89));

        labelNameMostrarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelNameMostrarCoronel.setText("Nombre");

        textIDMostrarCoronel.setEditable(true);

        labelIDMostrarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelIDMostrarCoronel.setText("ID");

        textNombreMostrarCoronel.setEditable(false);
        textNombreMostrarCoronel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreMostrarCoronelActionPerformed(evt);
            }
        });

        labelNivelMostrarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelMostrarCoronel.setText("Nivel");

        textNivelMostrarCoronel.setEditable(false);

        labelReporteMostrarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteMostrarCoronel.setText("Reporte");

        areaMisionMostrarCoronel.setEditable(false);
        areaMisionMostrarCoronel.setColumns(20);
        areaMisionMostrarCoronel.setRows(5);
        jScrollPane1.setViewportView(areaMisionMostrarCoronel);

        labelMisionMostrarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionMostrarCoronel.setText("Misión");

        labelAccionMostrarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionMostrarCoronel.setText("Acción");

        textAccionMostrarCoronel.setEditable(false);

        panelMostrarCoronel2.setBackground(new java.awt.Color(0, 153, 153));

        labelMostrarCoronel.setBackground(new java.awt.Color(0, 153, 153));
        labelMostrarCoronel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMostrarCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelMostrarCoronel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMostrarCoronel.setText("Mostrar Coronel");

        javax.swing.GroupLayout panelMostrarCoronel2Layout = new javax.swing.GroupLayout(panelMostrarCoronel2);
        panelMostrarCoronel2.setLayout(panelMostrarCoronel2Layout);
        panelMostrarCoronel2Layout.setHorizontalGroup(
            panelMostrarCoronel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarCoronel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMostrarCoronel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMostrarCoronel2Layout.setVerticalGroup(
            panelMostrarCoronel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarCoronel2Layout.createSequentialGroup()
                .addComponent(labelMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        labelMostrarMando.setForeground(new java.awt.Color(255, 255, 255));
        labelMostrarMando.setText("Cantidad soldados bajo su mando");

        textMostrarMando.setEditable(false);

        areaReporteMostrarCoronel.setEditable(false);
        areaReporteMostrarCoronel.setColumns(20);
        areaReporteMostrarCoronel.setRows(5);
        jScrollPane3.setViewportView(areaReporteMostrarCoronel);

        botonResetMostrarCoronel.setBackground(new java.awt.Color(0, 153, 153));
        botonResetMostrarCoronel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonResetMostrarCoronel.setText("Reset");

        botonMostrarCoronel1.setBackground(new java.awt.Color(0, 153, 153));
        botonMostrarCoronel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonMostrarCoronel1.setText("Next");

        javax.swing.GroupLayout panelMostrarCoronelLayout = new javax.swing.GroupLayout(panelMostrarCoronel);
        panelMostrarCoronel.setLayout(panelMostrarCoronelLayout);
        panelMostrarCoronelLayout.setHorizontalGroup(
            panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMostrarCoronel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMostrarCoronelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarCoronelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMostrarCoronelLayout.createSequentialGroup()
                        .addComponent(labelMisionMostrarCoronel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMostrarCoronelLayout.createSequentialGroup()
                        .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMostrarCoronelLayout.createSequentialGroup()
                                .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIDMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombreMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelIDMostrarCoronel)
                                    .addComponent(labelNivelMostrarCoronel)
                                    .addComponent(labelNameMostrarCoronel)
                                    .addComponent(textNivelMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAccionMostrarCoronel)
                                    .addComponent(textAccionMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelReporteMostrarCoronel)
                                    .addComponent(labelMostrarMando)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMostrarMando, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelMostrarCoronelLayout.createSequentialGroup()
                                .addComponent(botonResetMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonMostrarCoronel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))))
        );
        panelMostrarCoronelLayout.setVerticalGroup(
            panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarCoronelLayout.createSequentialGroup()
                .addComponent(panelMostrarCoronel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameMostrarCoronel)
                    .addComponent(labelReporteMostrarCoronel))
                .addGap(12, 12, 12)
                .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarCoronelLayout.createSequentialGroup()
                        .addComponent(textNombreMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDMostrarCoronel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIDMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivelMostrarCoronel)
                    .addComponent(labelMostrarMando))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNivelMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMostrarMando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelAccionMostrarCoronel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAccionMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMisionMostrarCoronel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panelMostrarCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonResetMostrarCoronel)
                    .addComponent(botonMostrarCoronel1))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMostrarCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreMostrarCoronelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreMostrarCoronelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreMostrarCoronelActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarCoronel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMisionMostrarCoronel;
    private javax.swing.JTextArea areaReporteMostrarCoronel;
    private javax.swing.JButton botonMostrarCoronel1;
    private javax.swing.JButton botonResetMostrarCoronel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionMostrarCoronel;
    private javax.swing.JLabel labelIDMostrarCoronel;
    private javax.swing.JLabel labelMisionMostrarCoronel;
    private javax.swing.JLabel labelMostrarCoronel;
    private javax.swing.JLabel labelMostrarMando;
    private javax.swing.JLabel labelNameMostrarCoronel;
    private javax.swing.JLabel labelNivelMostrarCoronel;
    private javax.swing.JLabel labelReporteMostrarCoronel;
    private javax.swing.JPanel panelMostrarCoronel;
    private javax.swing.JPanel panelMostrarCoronel2;
    private javax.swing.JTextField textAccionMostrarCoronel;
    private javax.swing.JTextField textIDMostrarCoronel;
    private javax.swing.JTextField textMostrarMando;
    private javax.swing.JTextField textNivelMostrarCoronel;
    private javax.swing.JTextField textNombreMostrarCoronel;
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
