/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class MostrarSoldadoRaso extends javax.swing.JFrame implements ActionListener, ItemListener, OperacionesMilitares{
    private int index;
    static ArrayList<SoldadoRaso> listaSoldadoRaso = new ArrayList<>();

    public MostrarSoldadoRaso(SoldadoRaso soldado, int index) {
        initComponents();
        this.index = index;
        llenarDatos(soldado);
    }

    private void llenarDatos(SoldadoRaso soldado) {
        textNombreMostrarSoldado.setText(soldado.getNombre());
        textIDMostrarSoldado.setText(soldado.getId());
        textNivelMostrarSoldado.setText(String.valueOf(soldado.getNivel()));
        textAccionMostrarSoldado.setText(soldado.getAccion());
        areaMisionCrearSoldado.setText(soldado.getMision());
        areaReporteMostrarSoldado.setText(soldado.getReporte());
    }
    
    /**
     * Creates new form MostrarSoldadoRaso
     */
    public MostrarSoldadoRaso() {
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

        panelMostrarSoldado = new javax.swing.JPanel();
        labelNameMostrarSoldado = new javax.swing.JLabel();
        textIDMostrarSoldado = new javax.swing.JTextField();
        labelIDMostrarSoldado = new javax.swing.JLabel();
        textNombreMostrarSoldado = new javax.swing.JTextField();
        labelNivelMostrarSoldado = new javax.swing.JLabel();
        textNivelMostrarSoldado = new javax.swing.JTextField();
        labelReporteMostrarSoldado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMisionCrearSoldado = new javax.swing.JTextArea();
        labelMisionMostrarSoldado = new javax.swing.JLabel();
        labelAccionMostrarSoldado = new javax.swing.JLabel();
        textAccionMostrarSoldado = new javax.swing.JTextField();
        panelMostrarSoldado2 = new javax.swing.JPanel();
        labelMostrarSoldado = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaReporteMostrarSoldado = new javax.swing.JTextArea();
        botonMostrarSoldado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelMostrarSoldado.setBackground(new java.awt.Color(19, 71, 89));

        labelNameMostrarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelNameMostrarSoldado.setText("Nombre");

        textIDMostrarSoldado.setEditable(true);

        labelIDMostrarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelIDMostrarSoldado.setText("ID");

        textNombreMostrarSoldado.setEditable(false);
        textNombreMostrarSoldado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreMostrarSoldadoActionPerformed(evt);
            }
        });

        labelNivelMostrarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelMostrarSoldado.setText("Nivel");

        textNivelMostrarSoldado.setEditable(false);

        labelReporteMostrarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteMostrarSoldado.setText("Reporte");

        areaMisionCrearSoldado.setEditable(false);
        areaMisionCrearSoldado.setColumns(20);
        areaMisionCrearSoldado.setRows(5);
        jScrollPane1.setViewportView(areaMisionCrearSoldado);

        labelMisionMostrarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionMostrarSoldado.setText("Misión");

        labelAccionMostrarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionMostrarSoldado.setText("Acción");

        textAccionMostrarSoldado.setEditable(false);

        panelMostrarSoldado2.setBackground(new java.awt.Color(0, 153, 153));

        labelMostrarSoldado.setBackground(new java.awt.Color(0, 153, 153));
        labelMostrarSoldado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMostrarSoldado.setForeground(new java.awt.Color(255, 255, 255));
        labelMostrarSoldado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMostrarSoldado.setText("Mostrar Soldado Raso");

        javax.swing.GroupLayout panelMostrarSoldado2Layout = new javax.swing.GroupLayout(panelMostrarSoldado2);
        panelMostrarSoldado2.setLayout(panelMostrarSoldado2Layout);
        panelMostrarSoldado2Layout.setHorizontalGroup(
            panelMostrarSoldado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarSoldado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMostrarSoldado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMostrarSoldado2Layout.setVerticalGroup(
            panelMostrarSoldado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarSoldado2Layout.createSequentialGroup()
                .addComponent(labelMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        areaReporteMostrarSoldado.setEditable(false);
        areaReporteMostrarSoldado.setColumns(20);
        areaReporteMostrarSoldado.setRows(5);
        jScrollPane3.setViewportView(areaReporteMostrarSoldado);

    botonMostrarSoldado.setText("Siguiente");
    botonMostrarSoldado.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            index = (index + 1) % OperacionesMilitares.listaSoldadoRaso.size();
            SoldadoRaso nextSoldado = OperacionesMilitares.listaSoldadoRaso.get(index);
            llenarDatos(nextSoldado);
        }
    });

    if (OperacionesMilitares.listaSoldadoRaso.size() == 1) {
        botonMostrarSoldado.setEnabled(false);
    } else {
        botonMostrarSoldado.setEnabled(true);
    }

        javax.swing.GroupLayout panelMostrarSoldadoLayout = new javax.swing.GroupLayout(panelMostrarSoldado);
        panelMostrarSoldado.setLayout(panelMostrarSoldadoLayout);
        panelMostrarSoldadoLayout.setHorizontalGroup(
            panelMostrarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMostrarSoldado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMostrarSoldadoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelMostrarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarSoldadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMostrarSoldadoLayout.createSequentialGroup()
                        .addComponent(labelMisionMostrarSoldado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMostrarSoldadoLayout.createSequentialGroup()
                        .addGroup(panelMostrarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textIDMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombreMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIDMostrarSoldado)
                            .addComponent(labelNivelMostrarSoldado)
                            .addComponent(labelNameMostrarSoldado)
                            .addComponent(textNivelMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAccionMostrarSoldado)
                            .addComponent(textAccionMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(panelMostrarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReporteMostrarSoldado)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarSoldadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        panelMostrarSoldadoLayout.setVerticalGroup(
            panelMostrarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarSoldadoLayout.createSequentialGroup()
                .addComponent(panelMostrarSoldado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelMostrarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameMostrarSoldado)
                    .addComponent(labelReporteMostrarSoldado))
                .addGap(12, 12, 12)
                .addGroup(panelMostrarSoldadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarSoldadoLayout.createSequentialGroup()
                        .addComponent(textNombreMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDMostrarSoldado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIDMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelNivelMostrarSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNivelMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAccionMostrarSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAccionMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMisionMostrarSoldado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonMostrarSoldado)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMostrarSoldado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  

    

    private void textNombreMostrarSoldadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreMostrarSoldadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreMostrarSoldadoActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarSoldadoRaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarSoldadoRaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMisionCrearSoldado;
    private javax.swing.JTextArea areaReporteMostrarSoldado;
    private javax.swing.JButton botonMostrarSoldado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionMostrarSoldado;
    private javax.swing.JLabel labelIDMostrarSoldado;
    private javax.swing.JLabel labelMisionMostrarSoldado;
    private javax.swing.JLabel labelMostrarSoldado;
    private javax.swing.JLabel labelNameMostrarSoldado;
    private javax.swing.JLabel labelNivelMostrarSoldado;
    private javax.swing.JLabel labelReporteMostrarSoldado;
    private javax.swing.JPanel panelMostrarSoldado;
    private javax.swing.JPanel panelMostrarSoldado2;
    private javax.swing.JTextField textAccionMostrarSoldado;
    private javax.swing.JTextField textIDMostrarSoldado;
    private javax.swing.JTextField textNivelMostrarSoldado;
    private javax.swing.JTextField textNombreMostrarSoldado;
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

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
