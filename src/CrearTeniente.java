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
public class CrearTeniente extends javax.swing.JFrame implements ActionListener, ItemListener, OperacionesMilitares{

    /**
     * Creates new form CrearTeniente
     */
    public CrearTeniente() {
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

        panelCrearTeniente = new javax.swing.JPanel();
        labelNameCrearTeniente = new javax.swing.JLabel();
        textIDCrearTeniente = new javax.swing.JTextField();
        labelIDCrearTeniente = new javax.swing.JLabel();
        textNombreCrearTeniente = new javax.swing.JTextField();
        labelNivelCrearTeniente = new javax.swing.JLabel();
        textNivelCrearTeniente = new javax.swing.JTextField();
        labelReporteCrearTeniente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMisionCrearTeniente = new javax.swing.JTextArea();
        labelMisionCrearTeniente = new javax.swing.JLabel();
        labelAccionCrearTeniente = new javax.swing.JLabel();
        textAccionCrearTeniente = new javax.swing.JTextField();
        panelCrearTeniente2 = new javax.swing.JPanel();
        labelCrearTeniente = new javax.swing.JLabel();
        labelUnidades = new javax.swing.JLabel();
        textUnidades = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaReporteCrearTeniente = new javax.swing.JTextArea();
        botonNextTeniente = new javax.swing.JButton();
        botonResetTeniente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCrearTeniente.setBackground(new java.awt.Color(19, 71, 89));

        labelNameCrearTeniente.setForeground(new java.awt.Color(255, 255, 255));
        labelNameCrearTeniente.setText("Nombre");

        labelIDCrearTeniente.setForeground(new java.awt.Color(255, 255, 255));
        labelIDCrearTeniente.setText("ID");

        textNombreCrearTeniente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreCrearTenienteActionPerformed(evt);
            }
        });

        labelNivelCrearTeniente.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelCrearTeniente.setText("Nivel");

        labelReporteCrearTeniente.setForeground(new java.awt.Color(255, 255, 255));
        labelReporteCrearTeniente.setText("Reporte");

        areaMisionCrearTeniente.setColumns(20);
        areaMisionCrearTeniente.setRows(5);
        jScrollPane1.setViewportView(areaMisionCrearTeniente);

        labelMisionCrearTeniente.setForeground(new java.awt.Color(255, 255, 255));
        labelMisionCrearTeniente.setText("Misión");

        labelAccionCrearTeniente.setForeground(new java.awt.Color(255, 255, 255));
        labelAccionCrearTeniente.setText("Acción");

        panelCrearTeniente2.setBackground(new java.awt.Color(0, 153, 153));

        labelCrearTeniente.setBackground(new java.awt.Color(0, 153, 153));
        labelCrearTeniente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCrearTeniente.setForeground(new java.awt.Color(255, 255, 255));
        labelCrearTeniente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrearTeniente.setText("Crear Teniente");

        javax.swing.GroupLayout panelCrearTeniente2Layout = new javax.swing.GroupLayout(panelCrearTeniente2);
        panelCrearTeniente2.setLayout(panelCrearTeniente2Layout);
        panelCrearTeniente2Layout.setHorizontalGroup(
            panelCrearTeniente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearTeniente2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCrearTeniente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCrearTeniente2Layout.setVerticalGroup(
            panelCrearTeniente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearTeniente2Layout.createSequentialGroup()
                .addComponent(labelCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        labelUnidades.setForeground(new java.awt.Color(255, 255, 255));
        labelUnidades.setText("Unidades de las que se hace cargo");

        areaReporteCrearTeniente.setColumns(20);
        areaReporteCrearTeniente.setRows(5);
        jScrollPane3.setViewportView(areaReporteCrearTeniente);

        botonNextTeniente.setBackground(new java.awt.Color(0, 153, 153));
        botonNextTeniente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonNextTeniente.setText("Next");
        botonNextTeniente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNextTenienteActionPerformed(evt);
            }
        });

        

        botonResetTeniente.setBackground(new java.awt.Color(0, 153, 153));
        botonResetTeniente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonResetTeniente.setText("Reset");

        botonResetTeniente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetTenienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearTenienteLayout = new javax.swing.GroupLayout(panelCrearTeniente);
        panelCrearTeniente.setLayout(panelCrearTenienteLayout);
        panelCrearTenienteLayout.setHorizontalGroup(
            panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearTeniente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCrearTenienteLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearTenienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCrearTenienteLayout.createSequentialGroup()
                        .addComponent(labelMisionCrearTeniente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearTenienteLayout.createSequentialGroup()
                        .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCrearTenienteLayout.createSequentialGroup()
                                .addComponent(botonResetTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonNextTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCrearTenienteLayout.createSequentialGroup()
                                .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIDCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombreCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelIDCrearTeniente)
                                    .addComponent(labelNivelCrearTeniente)
                                    .addComponent(labelNameCrearTeniente)
                                    .addComponent(textNivelCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAccionCrearTeniente)
                                    .addComponent(textAccionCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelReporteCrearTeniente)
                                    .addComponent(labelUnidades)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))))
        );
        panelCrearTenienteLayout.setVerticalGroup(
            panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearTenienteLayout.createSequentialGroup()
                .addComponent(panelCrearTeniente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameCrearTeniente)
                    .addComponent(labelReporteCrearTeniente))
                .addGap(12, 12, 12)
                .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearTenienteLayout.createSequentialGroup()
                        .addComponent(textNombreCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDCrearTeniente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIDCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivelCrearTeniente)
                    .addComponent(labelUnidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNivelCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelAccionCrearTeniente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAccionCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMisionCrearTeniente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panelCrearTenienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNextTeniente)
                    .addComponent(botonResetTeniente))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrearTeniente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreCrearTenienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreCrearTenienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreCrearTenienteActionPerformed

     public static boolean idExisteEnLista(ArrayList<Teniente> lista, String id) {
        
        //Recorre la lista<Teniente> verificando si el id ya existe
        for (Teniente soldado : lista) {
            if (soldado.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    private void botonNextTenienteActionPerformed(ActionEvent evt) {
       String rango = "2";
        String nombre= textNombreCrearTeniente.getText();
        String id =textIDCrearTeniente.getText();
        String nivel =  textNivelCrearTeniente.getText();
        String mision = areaMisionCrearTeniente.getText();
        String reporte = areaReporteCrearTeniente.getText();
        
        String accion= textAccionCrearTeniente.getText();
        String unidad= textUnidades.getText();

        Teniente nuevoTeniente = new Teniente(unidad, nivel, nombre, id, rango,mision,reporte);

        if(!idExisteEnLista(listaTeniente, id)){       
            
            if (nombre.equals("") || id.equals("")||nivel.equals("") || accion.equals("") || mision.equals("") || reporte.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
            } else {
                listaTeniente.add(nuevoTeniente);
                accionTeniente.add(accion); //Se cumple la condicion se agrega el soldado
                JOptionPane.showMessageDialog(null, "Soldado Raso creado exitosamente");
                // Limpiar campos
                textNombreCrearTeniente.setText("");
                textIDCrearTeniente.setText("");
                textNivelCrearTeniente.setText("");
                textAccionCrearTeniente.setText("");
                areaMisionCrearTeniente.setText("");
                areaReporteCrearTeniente.setText("");
                textUnidades.setText("");
            }

        }else{
            JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Soldado", JOptionPane.ERROR_MESSAGE);
        }
       
    }


    private void botonResetTenienteActionPerformed(java.awt.event.ActionEvent evt) {

        textNombreCrearTeniente.setText("");
        textIDCrearTeniente.setText("");
        textNivelCrearTeniente.setText("");
        textAccionCrearTeniente.setText("");
        areaMisionCrearTeniente.setText("");
        areaReporteCrearTeniente.setText("");
        textUnidades.setText("");
        
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
            java.util.logging.Logger.getLogger(CrearTeniente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTeniente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTeniente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTeniente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearTeniente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMisionCrearTeniente;
    private javax.swing.JTextArea areaReporteCrearTeniente;
    private javax.swing.JButton botonNextTeniente;
    private javax.swing.JButton botonResetTeniente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAccionCrearTeniente;
    private javax.swing.JLabel labelCrearTeniente;
    private javax.swing.JLabel labelIDCrearTeniente;
    private javax.swing.JLabel labelMisionCrearTeniente;
    private javax.swing.JLabel labelNameCrearTeniente;
    private javax.swing.JLabel labelNivelCrearTeniente;
    private javax.swing.JLabel labelReporteCrearTeniente;
    private javax.swing.JLabel labelUnidades;
    private javax.swing.JPanel panelCrearTeniente;
    private javax.swing.JPanel panelCrearTeniente2;
    private javax.swing.JTextField textAccionCrearTeniente;
    private javax.swing.JTextField textIDCrearTeniente;
    private javax.swing.JTextField textNivelCrearTeniente;
    private javax.swing.JTextField textNombreCrearTeniente;
    private javax.swing.JTextField textUnidades;
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
