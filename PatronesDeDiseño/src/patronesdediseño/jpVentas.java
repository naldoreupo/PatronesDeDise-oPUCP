/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import patronesdediseño.AbstractFactory.IAuto;
import patronesdediseño.AbstractFactory.IBus;
import patronesdediseño.AbstractFactory.ICamion;
import patronesdediseño.AbstractFactory.IMarca;
import patronesdediseño.AbstractFactory.IMoto;
import patronesdediseño.AbstractFactory.Kia;
import patronesdediseño.AbstractFactory.Mitsubishi;
import patronesdediseño.AbstractFactory.Toyota;
import patronesdediseño.CadenaDeResponsabilidad.AreaDeVentas;

/**
 *
 * @author usuario
 */
public class jpVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form JINTERNALFRAME1
     */
    public int montoACobrar = 0;
    public int Saldo = 0;
    DefaultTableModel modelo = new DefaultTableModel();

    // Daniel
    DefaultTableModel modelVehiculo = new DefaultTableModel();
    DefaultTableModel modelPorComprar = new DefaultTableModel();

    public jpVentas() {
        initComponents();

        modelVehiculo.addColumn("Tipo");
        modelVehiculo.addColumn("Precio");
        tblVehiculo.setModel(modelVehiculo);

        modelPorComprar.addColumn("Marca");
        modelPorComprar.addColumn("Tipo");
        modelPorComprar.addColumn("Precio");
        tblPorComprar.setModel(modelPorComprar);
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
        jLabel5 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPorComprar = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        btnPorComprar = new javax.swing.JButton();
        btnLimpiarPorComprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setVisible(true);

        jLabel2.setFont(new java.awt.Font("Comfortaa", 1, 48)); // NOI18N
        jLabel2.setText("Registrar venta");

        btnCobrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patronesdediseño/imagenes/Money.png"))); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione la marca que desea buscar:");

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --", "Kia", "Mitsubishi", "Toyota" }));
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblVehiculo.setFocusable(false);
        jScrollPane2.setViewportView(tblVehiculo);

        tblPorComprar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Marca", "Tipo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPorComprar);

        jLabel6.setText("Monto total :");

        txtMontoTotal.setEditable(false);
        txtMontoTotal.setText("0.00");

        btnPorComprar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnPorComprar.setText(">");
        btnPorComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorComprarActionPerformed(evt);
            }
        });

        btnLimpiarPorComprar.setText("Limpiar");
        btnLimpiarPorComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarPorComprarActionPerformed(evt);
            }
        });

        jLabel7.setText("Vehículos relacionados a la marca:");

        jLabel8.setText("Vehículos por comprar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(356, 356, 356)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnLimpiarPorComprar)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarPorComprar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCobrar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        llenarTabla();
        String montoString = txtMontoTotal.getText();
        String montoACobrar = txtMontoTotal.getText().substring(0, montoString.length() - 2);
        this.montoACobrar = Integer.parseInt(montoACobrar);
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
        if (this.Saldo > 0) {
            JOptionPane.showMessageDialog(null,
                    "Saldo pendiente",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dialogCobrar.hide();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        // TODO add your handling code here:
        IMarca marca;

        String marcaSeleccionada = cmbMarca.getSelectedItem().toString();

        switch (marcaSeleccionada) {
            case "Kia":
                marca = new Kia();
                break;
            case "Mitsubishi":
                marca = new Mitsubishi();
                break;
            case "Toyota":
                marca = new Toyota();
                break;
            default:
                marca = null;
                break;
        }

        if (marca != null) {
            IAuto auto = marca.crearAuto();
            IMoto moto = marca.crearMoto();
            ICamion camion = marca.crearCamion();
            IBus bus = marca.crearBus();

            modelVehiculo.setRowCount(0);

            modelVehiculo.addRow(new Object[]{auto.getNombre(), auto.getPrecio()});
            modelVehiculo.addRow(new Object[]{moto.getNombre(), moto.getPrecio()});
            modelVehiculo.addRow(new Object[]{camion.getNombre(), camion.getPrecio()});
            modelVehiculo.addRow(new Object[]{bus.getNombre(), bus.getPrecio()});

        }
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void btnPorComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorComprarActionPerformed

        int indiceSeleccionado = tblVehiculo.getSelectedRow();

        if (indiceSeleccionado >= 0) {
            String tipo = modelVehiculo.getValueAt(indiceSeleccionado, 0).toString();
            double precio = (double) modelVehiculo.getValueAt(indiceSeleccionado, 1);
            String marcaSeleccionada = cmbMarca.getSelectedItem().toString();

            modelPorComprar.addRow(new Object[]{marcaSeleccionada, tipo, precio});

            double montoPorPagar = Double.parseDouble(txtMontoTotal.getText());
            montoPorPagar += precio;
            String monto = Double.toString(montoPorPagar);
            txtMontoTotal.setText(monto);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No ha seleccionado ningún vehículo para comprar",
                    "Vehículos",
                    JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnPorComprarActionPerformed

    private void btnLimpiarPorComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarPorComprarActionPerformed

        modelVehiculo.setRowCount(0);
        modelPorComprar.setRowCount(0);
        txtMontoTotal.setText("0.0");
        cmbMarca.setSelectedIndex(0);

    }//GEN-LAST:event_btnLimpiarPorComprarActionPerformed

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
    private javax.swing.JButton btnLimpiarPorComprar;
    private javax.swing.JButton btnPorComprar;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JDialog dialogCobrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMontoACobrar;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.ButtonGroup rbgTipoPago;
    private javax.swing.JTable tablePagos;
    private javax.swing.JTable tblPorComprar;
    private javax.swing.JTable tblVehiculo;
    private javax.swing.JTextField txtMontoAPagar;
    private javax.swing.JTextField txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}
