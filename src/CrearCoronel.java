/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.project;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class CrearCoronel extends javax.swing.JFrame implements ActionListener, ItemListener, OperacionesMilitares{

    /**
     * Creates new form crearCoronel
     */
    public CrearCoronel() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        panelCrearCoronel = new javax.swing.JPanel();
        labelNameCrearCoronel = new javax.swing.JLabel();
        textIDCrearCoronel = new javax.swing.JTextField();
        labelIDCrearCoronel = new javax.swing.JLabel();
        textNombreCrearCoronel = new javax.swing.JTextField();
        labelNivelCrearCoronel = new javax.swing.JLabel();
        textNivelCrearCoronel = new javax.swing.JTextField();
        labelReporteCrearCoronel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMisionCrearCoronel = new javax.swing.JTextArea();
        labelMisionCrearCoronel = new javax.swing.JLabel();
        labelAccionCrearCoronel = new javax.swing.JLabel();
        textAccionCrearCoronel = new javax.swing.JTextField();
        panelCrearCoronel2 = new javax.swing.JPanel();
        labelCrearCoronel = new javax.swing.JLabel();
        labelMando = new javax.swing.JLabel();
        textMando = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaReporteCrearCoronel1 = new javax.swing.JTextArea();
        botonCoronel = new javax.swing.JButton();
        botonResetCoronel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCrearCoronel.setBackground(new java.awt.Color(19, 71, 89));

        labelNameCrearCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelNameCrearCoronel.setText("Nombre");

        labelIDCrearCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelIDCrearCoronel.setText("ID");

        textNombreCrearCoronel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreCrearCoronelActionPerformed(evt);
            }
        });

        labelNivelCrearCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelCrearCoronel.setText("Nivel");

        labelReporteCrearCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteCrearCoronel.setText("Reporte");

        areaMisionCrearCoronel.setColumns(20);
        areaMisionCrearCoronel.setRows(5);
        jScrollPane1.setViewportView(areaMisionCrearCoronel);

        labelMisionCrearCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionCrearCoronel.setText("Misión");

        labelAccionCrearCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionCrearCoronel.setText("Acción");

        panelCrearCoronel2.setBackground(new java.awt.Color(0, 153, 153));

        labelCrearCoronel.setBackground(new java.awt.Color(0, 153, 153));
        labelCrearCoronel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCrearCoronel.setForeground(new java.awt.Color(255, 255, 255));
        labelCrearCoronel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrearCoronel.setText("Crear Coronel");

        javax.swing.GroupLayout panelCrearCoronel2Layout = new javax.swing.GroupLayout(panelCrearCoronel2);
        panelCrearCoronel2.setLayout(panelCrearCoronel2Layout);
        panelCrearCoronel2Layout.setHorizontalGroup(
            panelCrearCoronel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearCoronel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCrearCoronel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCrearCoronel2Layout.setVerticalGroup(
            panelCrearCoronel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearCoronel2Layout.createSequentialGroup()
                .addComponent(labelCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        labelMando.setForeground(new java.awt.Color(255, 255, 255));
        labelMando.setText("Cantidad soldados bajo su mando");

        areaReporteCrearCoronel1.setColumns(20);
        areaReporteCrearCoronel1.setRows(5);
        jScrollPane3.setViewportView(areaReporteCrearCoronel1);

        botonCoronel.setBackground(new java.awt.Color(0, 153, 153));
        botonCoronel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonCoronel.setText("Next");
        botonCoronel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCoronelActionPerformed(evt);
                            }
        });

        botonResetCoronel.setBackground(new java.awt.Color(0, 153, 153));
        botonResetCoronel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonResetCoronel.setText("Reset");

        botonResetCoronel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetCoronelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearCoronelLayout = new javax.swing.GroupLayout(panelCrearCoronel);
        panelCrearCoronel.setLayout(panelCrearCoronelLayout);
        panelCrearCoronelLayout.setHorizontalGroup(
            panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearCoronel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCrearCoronelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearCoronelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCrearCoronelLayout.createSequentialGroup()
                        .addComponent(labelMisionCrearCoronel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearCoronelLayout.createSequentialGroup()
                        .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCrearCoronelLayout.createSequentialGroup()
                                .addComponent(botonResetCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCrearCoronelLayout.createSequentialGroup()
                                .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIDCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombreCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelIDCrearCoronel)
                                    .addComponent(labelNivelCrearCoronel)
                                    .addComponent(labelNameCrearCoronel)
                                    .addComponent(textNivelCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAccionCrearCoronel)
                                    .addComponent(textAccionCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelReporteCrearCoronel)
                                    .addComponent(labelMando)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMando, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))))
        );
        panelCrearCoronelLayout.setVerticalGroup(
            panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearCoronelLayout.createSequentialGroup()
                .addComponent(panelCrearCoronel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameCrearCoronel)
                    .addComponent(labelReporteCrearCoronel))
                .addGap(12, 12, 12)
                .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearCoronelLayout.createSequentialGroup()
                        .addComponent(textNombreCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDCrearCoronel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIDCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivelCrearCoronel)
                    .addComponent(labelMando))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNivelCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelAccionCrearCoronel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAccionCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMisionCrearCoronel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panelCrearCoronelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCoronel)
                    .addComponent(botonResetCoronel))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearCoronel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrearCoronel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreCrearCoronelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreCrearCoronelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreCrearCoronelActionPerformed

    public static boolean idExisteEnLista(ArrayList<Coronel> lista, String id) {
        
        //Recorre la lista<Coronel> verificando si el id ya existe
        for (Coronel soldado : lista) {
            if (soldado.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    private void botonCoronelActionPerformed(ActionEvent evt) {
        String rango = "4";
        String nombre= textNombreCrearCoronel.getText();
        String id =textIDCrearCoronel.getText();
        String nivel =  textNivelCrearCoronel.getText();
        String mision = areaMisionCrearCoronel.getText();
        String reporte = areaReporteCrearCoronel1.getText();

        String accion= textAccionCrearCoronel.getText();
        String cantidadSoldadosBajoSuMnado = textMando.getText();

        Coronel nuevoCoronel = new Coronel(cantidadSoldadosBajoSuMnado, nivel, nombre, id, rango,mision,reporte);

        if(!idExisteEnLista(listaCoronel, id)){
                    
            if (nombre.equals("") || id.equals("")||nivel.equals("") || accion.equals("") || mision.equals("") || reporte.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
            } else {
                
                listaCoronel.add(nuevoCoronel);
                accionCoronel.add(accion); //Se cumple la condicion se agrega el soldado
                JOptionPane.showMessageDialog(null, "Soldado Raso creado exitosamente");
                // Limpiar campos
                textNombreCrearCoronel.setText("");
                textIDCrearCoronel.setText("");
                textNivelCrearCoronel.setText("");
                textAccionCrearCoronel.setText("");
                areaMisionCrearCoronel.setText("");
                areaReporteCrearCoronel1.setText("");
                textMando.setText("");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Soldado", JOptionPane.ERROR_MESSAGE);
        }
        
    }


    private void botonResetCoronelActionPerformed(java.awt.event.ActionEvent evt) {
        textNombreCrearCoronel.setText("");
        textIDCrearCoronel.setText("");
        textNivelCrearCoronel.setText("");
        textAccionCrearCoronel.setText("");
        areaMisionCrearCoronel.setText("");
        areaReporteCrearCoronel1.setText("");
        textMando.setText("");
        
    }

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
            java.util.logging.Logger.getLogger(CrearCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCoronel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCoronel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMisionCrearCoronel;
    private javax.swing.JTextArea areaReporteCrearCoronel1;
    private javax.swing.JButton botonCoronel;
    private javax.swing.JButton botonResetCoronel;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionCrearCoronel;
    private javax.swing.JLabel labelCrearCoronel;
    private javax.swing.JLabel labelIDCrearCoronel;
    private javax.swing.JLabel labelMando;
    private javax.swing.JLabel labelMisionCrearCoronel;
    private javax.swing.JLabel labelNameCrearCoronel;
    private javax.swing.JLabel labelNivelCrearCoronel;
    private javax.swing.JLabel labelReporteCrearCoronel;
    private javax.swing.JPanel panelCrearCoronel;
    private javax.swing.JPanel panelCrearCoronel2;
    private javax.swing.JTextField textAccionCrearCoronel;
    private javax.swing.JTextField textIDCrearCoronel;
    private javax.swing.JTextField textMando;
    private javax.swing.JTextField textNivelCrearCoronel;
    private javax.swing.JTextField textNombreCrearCoronel;
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
