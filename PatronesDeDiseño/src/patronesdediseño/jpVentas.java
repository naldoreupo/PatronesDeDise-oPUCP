/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import patronesdediseño.CadenaDeResponsabilidad.AreaDeVentas;

/**
 *
 * @author usuario
 */
public class jpVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form JINTERNALFRAME1
     */
    public int montoACobrar = 80000;
    public int Saldo = 0;
    DefaultTableModel modelo = new DefaultTableModel();

    public jpVentas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogCobrar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        lblMontoACobrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCobrar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePagos = new javax.swing.JTable();
        txtMontoAPagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        rbCredito = new javax.swing.JRadioButton();
        rbEfectivo = new javax.swing.JRadioButton();
        btnCobrar2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        rbgTipoPago = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        btnCobrar = new javax.swing.JButton();

        dialogCobrar.setModal(true);
        dialogCobrar.setName("dgCobrar"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Total a Cobrar ($) :  ");

        lblMontoACobrar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMontoACobrar.setText("0.00");

        jLabel3.setFont(new java.awt.Font("Comfortaa", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Cobrar");

        btnCobrar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCobrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patronesdediseño/imagenes/coin-add-icon.png"))); // NOI18N
        btnCobrar1.setText("Agregar pago");
        btnCobrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrar1ActionPerformed(evt);
            }
        });

        tablePagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,  new Integer(0), null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo pago", "Monto", "Aprobado por :"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePagos);

        txtMontoAPagar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMontoAPagar.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Saldo ($) :  ");

        lblSaldo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(255, 0, 0));
        lblSaldo.setText("0.00");

        rbgTipoPago.add(rbCredito);
        rbCredito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbCredito.setSelected(true);
        rbCredito.setText("Crédito");

        rbgTipoPago.add(rbEfectivo);
        rbEfectivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbEfectivo.setText("Efectivo");

        btnCobrar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCobrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patronesdediseño/imagenes/Icon-cleanup.png"))); // NOI18N
        btnCobrar2.setText("Limpiar pagos");
        btnCobrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrar2ActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patronesdediseño/imagenes/Save_ico.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCobrarLayout = new javax.swing.GroupLayout(dialogCobrar.getContentPane());
        dialogCobrar.getContentPane().setLayout(dialogCobrarLayout);
        dialogCobrarLayout.setHorizontalGroup(
            dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCobrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dialogCobrarLayout.createSequentialGroup()
                        .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogCobrarLayout.createSequentialGroup()
                                .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dialogCobrarLayout.createSequentialGroup()
                                        .addComponent(txtMontoAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCobrarLayout.createSequentialGroup()
                                        .addComponent(btnCobrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dialogCobrarLayout.createSequentialGroup()
                                        .addComponent(rbCredito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                        .addComponent(rbEfectivo))
                                    .addGroup(dialogCobrarLayout.createSequentialGroup()
                                        .addComponent(btnCobrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 14, Short.MAX_VALUE))))
                            .addGroup(dialogCobrarLayout.createSequentialGroup()
                                .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogCobrarLayout.createSequentialGroup()
                                .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMontoACobrar, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCobrarLayout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCobrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dialogCobrarLayout.setVerticalGroup(
            dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCobrarLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMontoACobrar))
                .addGap(18, 18, 18)
                .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSaldo))
                .addGap(18, 18, 18)
                .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dialogCobrarLayout.createSequentialGroup()
                        .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMontoAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbCredito)
                            .addComponent(rbEfectivo))
                        .addGap(39, 39, 39)
                        .addGroup(dialogCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCobrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCobrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        rbCredito.getAccessibleContext().setAccessibleName("rbtipoPago");
        rbEfectivo.getAccessibleContext().setAccessibleName("rbtipoPago");

        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setVisible(true);

        jLabel2.setFont(new java.awt.Font("Comfortaa", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Registrar venta");

        btnCobrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patronesdediseño/imagenes/Money.png"))); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 487, Short.MAX_VALUE)
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        llenarTabla();
        this.Saldo = this.montoACobrar;
        this.lblMontoACobrar.setText(Integer.toString(this.montoACobrar));
        this.txtMontoAPagar.setText(Integer.toString(this.Saldo));
        this.dialogCobrar.setResizable(true);
        this.dialogCobrar.setSize(900, 600);
        this.dialogCobrar.show();

    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnCobrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrar2ActionPerformed
        // TODO add your handling code here:
        LimpiarPago();
    }//GEN-LAST:event_btnCobrar2ActionPerformed

    private void btnCobrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrar1ActionPerformed
        // TODO add your handling code here:
        try {
            AgregarPago();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCobrar1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (this.Saldo>0 ){
            JOptionPane.showMessageDialog(null,
                    "Saldo pendiente",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dialogCobrar.hide();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void llenarTabla() {       
        modelo = new DefaultTableModel();
        this.tablePagos.setModel(modelo);
        modelo.addColumn("Tipo pago");
        modelo.addColumn("Monto");
        modelo.addColumn("Aprobado por :");
        LimpiarPago();
    }

    private void LimpiarPago() {

        DefaultTableModel model = (DefaultTableModel) this.tablePagos.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        this.Saldo = this.montoACobrar;
        this.lblMontoACobrar.setText(Integer.toString(this.montoACobrar));
        this.txtMontoAPagar.setText(Integer.toString(this.Saldo));
    }

    private void AgregarPago() {
        int pagoParcial = Integer.parseInt(this.txtMontoAPagar.getText());
        this.lblMontoACobrar.setText(Integer.toString(this.montoACobrar));

        if (ValidarSaldo(pagoParcial)) {
            this.Saldo -= pagoParcial;
            String aprobador = "No necesita";
            if (this.rbCredito.isSelected()) {
                if (TieneCreditoAnteriores()) {
                    return;
                }
                aprobador = solicitarCredito(pagoParcial);

                JOptionPane.showMessageDialog(null,
                        "Crédito aprobado por " + aprobador,
                        "Solicitud de crédito",
                        JOptionPane.WARNING_MESSAGE);
            }

            Object[] pago = new Object[8];
            pago[0] = this.rbCredito.isSelected() ? "Credito" : "Efectivo";
            pago[1] = pagoParcial;
            pago[2] = aprobador;
            modelo.addRow(pago);

            this.lblSaldo.setText(Integer.toString(this.Saldo));
            this.txtMontoAPagar.setText(Integer.toString(this.Saldo));
        }
    }

    private String solicitarCredito(int pagoParcial){
           AreaDeVentas areaDeVentas = new AreaDeVentas();
           return  areaDeVentas.solicitudPrestamo(pagoParcial);

    }
    
    @SuppressWarnings("empty-statement")
    private boolean TieneCreditoAnteriores() {
        DefaultTableModel model = (DefaultTableModel) this.tablePagos.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            String valor = model.getValueAt(i, 0).toString();
            if (valor.equals("Credito")) {

                JOptionPane.showMessageDialog(null,
                        "Ya tiene un crédito aprobado",
                        "Solicitud de crédito",
                        JOptionPane.WARNING_MESSAGE);
                return true;
            };

        }
        return false;
    }

    private boolean ValidarSaldo(int pagoParcial) {
        if (pagoParcial > this.Saldo) {

            JOptionPane.showMessageDialog(null,
                    "Pago mayor al saldo",
                    "Solicitud de crédito",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (this.Saldo <= 0) {

            JOptionPane.showMessageDialog(null,
                    "Saldo cubierto",
                    "Solicitud de crédito",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnCobrar1;
    private javax.swing.JButton btnCobrar2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JDialog dialogCobrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMontoACobrar;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.ButtonGroup rbgTipoPago;
    private javax.swing.JTable tablePagos;
    private javax.swing.JTextField txtMontoAPagar;
    // End of variables declaration//GEN-END:variables
}
