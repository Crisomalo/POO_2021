package proyecto_final;

import helpers.Datos;
import helpers.Historico;
import helpers.Usuario;
import javax.swing.table.DefaultTableModel;

public class Ingreso extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    Historico historico = new Historico();

    public Ingreso() {

        initComponents();
        this.setLocationRelativeTo(null);

        if (usuario.getNivelAcceso() == 1) {
            txtUsuario.setText("Acceso total");
        } else {
            txtUsuario.setText("Acceso parcial");
        }

        DefaultTableModel model = (DefaultTableModel) tableIngreso.getModel();

        model.addColumn("Item");
        model.addColumn("Codigo");
        model.addColumn("Proveedor");
        model.addColumn("Cantidad");
        model.addColumn("Ultimo ingreso");
        initDatos();

        for (int i = 0; i < 50; i++) {
            if (Datos.data[i][0] != null) {
                boxItems.addItem(Datos.data[i][0]);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngreso = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JLabel();
        iconIngreso = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIngreso = new javax.swing.JTable();
        buttonRegresar = new javax.swing.JButton();
        txtNombre = new javax.swing.JLabel();
        buttonIngresar = new javax.swing.JButton();
        txtProveedor = new javax.swing.JLabel();
        setProveedor = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JLabel();
        setCantidad = new javax.swing.JTextField();
        boxItems = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelIngreso.setBackground(new java.awt.Color(255, 255, 255));
        panelIngreso.setMinimumSize(new java.awt.Dimension(664, 339));
        panelIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        panelIngreso.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));

        txtIngreso.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtIngreso.setText("Ingreso");
        panelIngreso.add(txtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        iconIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_origin/ingreso.png"))); // NOI18N
        panelIngreso.add(iconIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelIngreso.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 160, 30));

        tableIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableIngreso);

        panelIngreso.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 680, 140));

        buttonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonRegresar.setText("Regresar");
        buttonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarActionPerformed(evt);
            }
        });
        panelIngreso.add(buttonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, -1, -1));

        txtNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtNombre.setText("Item:");
        panelIngreso.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        buttonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        buttonIngresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonIngresar.setText("Ingresar");
        buttonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarActionPerformed(evt);
            }
        });
        panelIngreso.add(buttonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 160, -1));

        txtProveedor.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtProveedor.setText("Proveedor:");
        panelIngreso.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        setProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setProveedorActionPerformed(evt);
            }
        });
        panelIngreso.add(setProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 250, 30));

        txtCantidad.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtCantidad.setText("Cantidad:");
        panelIngreso.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        setCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCantidadActionPerformed(evt);
            }
        });
        panelIngreso.add(setCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 250, 30));

        boxItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxItemsActionPerformed(evt);
            }
        });
        panelIngreso.add(boxItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngresarActionPerformed

        int aux = 0, temporal = 0;
        String _aux = "";
        int fila = historico.getSelectorFilaHistorico();
        
        if (!"".equals(setProveedor.getText()) && !"".equals(setCantidad.getText())) {
            for (int i = 0; i < 50; i++) {
                if (boxItems.getSelectedItem().equals(Datos.data[i][0])) {
                    if (Datos.data[i][2] == null) {
                        Datos.data[i][2] = "0";
                    }
                    temporal = (Integer.parseInt(Datos.data[i][2])) + (Integer.parseInt(setCantidad.getText()));
                    _aux = Integer.toString(temporal);
                    Datos.data[i][3] = setCantidad.getText();
                    Datos.data[i][2] = _aux;
                    Datos.data[i][5] = setProveedor.getText();
                        Historico.dataHistorico[fila][0] = Datos.data[i][0];//Item
                        Historico.dataHistorico[fila][1] = Datos.data[i][1];//Codigo
                        Historico.dataHistorico[fila][2] = Datos.data[i][5];//Proveedor
                        Historico.dataHistorico[fila][3] = Datos.data[i][2];//Ingresado
                        historico.incrementarSelectorHistorico();
                }
            }
            setProveedor.setText("");
            setCantidad.setText("");

            DefaultTableModel model = (DefaultTableModel) tableIngreso.getModel();

            for (int i = 0; i < 50 && aux == 0; i++) {
                if (Datos.data[i][0] != null && Datos.data[i][2] != null) {
                    Object[] row = {Datos.data[i][0], Datos.data[i][1], Datos.data[i][5], Datos.data[i][2], Datos.data[i][3]};
                    model.addRow(row);
                }
                if (Datos.data[i][0] == null) {
                    aux = 1;
                }
            }
            
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            initDatos();
        }
    }//GEN-LAST:event_buttonIngresarActionPerformed

    private void setProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setProveedorActionPerformed

    private void setCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setCantidadActionPerformed

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_buttonRegresarActionPerformed

    private void boxItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxItemsActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxItems;
    private javax.swing.JButton buttonIngresar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel iconIngreso;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JTextField setCantidad;
    private javax.swing.JTextField setProveedor;
    private javax.swing.JTable tableIngreso;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtIngreso;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtProveedor;
    public javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
public void initDatos() {

        Datos inventario = new Datos();

        int aux = 0;

        DefaultTableModel model = (DefaultTableModel) tableIngreso.getModel();

        for (int i = 0; i < 50 && aux == 0; i++) {
            if (Datos.data[i][0] != null && Datos.data[i][2] != null) {
                Object[] row = {Datos.data[i][0], Datos.data[i][1], Datos.data[i][5], Datos.data[i][2], Datos.data[i][3]};
                model.addRow(row);
            }
            if (Datos.data[i][0] == null) {
                aux = 1;
            }
        }
    }

}
