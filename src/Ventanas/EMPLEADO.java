/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Paquete.Controlador;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIEL
 */
public class EMPLEADO extends javax.swing.JInternalFrame {

    Controlador control = new Controlador();
    String idempleado = "";

    /**
     * Creates new form EMPLEADO
     */
    public EMPLEADO() {
        initComponents();
    }

    public void Crear() {
        if (idempleado.length() > 0) {
            JOptionPane.showMessageDialog(null, "Estamos en modo Edicion");
            txNom.grabFocus();
            return;
        }
        if (validarCampos()) {
            control.Sql = "select * from empleado where dni='" + txDni.getText() + "'";
            if (control.Verificarconsulta(control.Sql)) {
                JOptionPane.showMessageDialog(null, "Este " + txDni.getText() + " \n Ya existe");
                control.objControles.MarcarTexto(txDni);
            } else {
                control.Sql = "insert into empleado  values(default,'" + txNom.getText() + "','" + txApe.getText() + "','"
                        + cboGenero.getSelectedItem().toString() + "','" + txDni.getText() + "')";
                control.CrearRegistro(control.Sql);

            }

        }
    }

    public boolean validarCampos() {
        boolean valor = false;
        if (txNom.getText().trim().length() != 0) {
            if (txApe.getText().trim().length() != 0) {
                if (cboGenero.getSelectedIndex() != 1) {
                    if (txDni.getText().trim().length() != 0) {
                    } else {
                        JOptionPane.showMessageDialog(null, "Tienes que ingresar DNI");
                        txDni.grabFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione el Genero");
                    cboGenero.grabFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tienes que ingresar Apellido");
                txApe.grabFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tienes que ingresar nombre");
            txNom.grabFocus();
        }
        return valor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txApe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txNom = new javax.swing.JTextField();
        cboGenero = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        bSalir = new javax.swing.JButton();
        bCrear = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bImprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmpleados = new javax.swing.JTable();
        txBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de los Empleados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Dni");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        txDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDniActionPerformed(evt);
            }
        });
        txDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txDniKeyTyped(evt);
            }
        });
        jPanel2.add(txDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 110, 23));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Apellidos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        txApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txApeActionPerformed(evt);
            }
        });
        txApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txApeKeyTyped(evt);
            }
        });
        jPanel2.add(txApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 170, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Genero");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomActionPerformed(evt);
            }
        });
        txNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNomKeyTyped(evt);
            }
        });
        jPanel2.add(txNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 240, -1));

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGeneroActionPerformed(evt);
            }
        });
        jPanel2.add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bSalir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        bSalir.setMnemonic('s');
        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jPanel3.add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 110, 45));

        bCrear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add-icon.png"))); // NOI18N
        bCrear.setMnemonic('c');
        bCrear.setText("Crear");
        bCrear.setMargin(new java.awt.Insets(2, 1, 2, 14));
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });
        jPanel3.add(bCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 45));

        bEditar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit.png"))); // NOI18N
        bEditar.setMnemonic('d');
        bEditar.setText("Editar");
        bEditar.setMargin(new java.awt.Insets(2, 1, 2, 14));
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jPanel3.add(bEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 45));

        bEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        bEliminar.setMnemonic('e');
        bEliminar.setText("Eliminar");
        bEliminar.setMargin(new java.awt.Insets(2, 1, 2, 14));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(bEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 115, 45));

        bCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        bCancelar.setMnemonic('a');
        bCancelar.setText("Cancelar");
        bCancelar.setMargin(new java.awt.Insets(2, 1, 2, 14));
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(bCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 115, 45));

        bImprimir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Print.png"))); // NOI18N
        bImprimir.setMnemonic('e');
        bImprimir.setText("Imprimir");
        bImprimir.setMargin(new java.awt.Insets(2, 1, 2, 14));
        bImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimirActionPerformed(evt);
            }
        });
        jPanel3.add(bImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 115, 45));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de los Empleados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(51, 0, 102))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmpleadosMouseClicked(evt);
            }
        });
        tbEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbEmpleadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 130));

        txBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 680, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Buscar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDniActionPerformed

    private void txDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDniKeyTyped
        control.objControles.Solonumeros(evt);
        if (txDni.getText().trim().length() >= 8) {
            evt.consume();
        }

    }//GEN-LAST:event_txDniKeyTyped

    private void txApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txApeActionPerformed

    private void txApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txApeKeyTyped
        //control.objControles.SoloLetras(evt);
    }//GEN-LAST:event_txApeKeyTyped

    private void txNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomActionPerformed

    private void txNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomKeyTyped
        //control.objControles.SoloLetras(evt);
    }//GEN-LAST:event_txNomKeyTyped

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed

        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        Crear();
    }//GEN-LAST:event_bCrearActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed

    }//GEN-LAST:event_bEditarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed

    }//GEN-LAST:event_bEliminarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed

    }//GEN-LAST:event_bCancelarActionPerformed

    private void bImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimirActionPerformed

    }//GEN-LAST:event_bImprimirActionPerformed

    private void tbEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmpleadosMouseClicked

    }//GEN-LAST:event_tbEmpleadosMouseClicked

    private void tbEmpleadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbEmpleadosKeyReleased

    }//GEN-LAST:event_tbEmpleadosKeyReleased

    private void txBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txBuscarKeyReleased
        //MostrarProfesiones();
    }//GEN-LAST:event_txBuscarKeyReleased

    private void cboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGeneroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bImprimir;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEmpleados;
    private javax.swing.JTextField txApe;
    private javax.swing.JTextField txBuscar;
    public static javax.swing.JTextField txDni;
    public static javax.swing.JTextField txNom;
    // End of variables declaration//GEN-END:variables
}
