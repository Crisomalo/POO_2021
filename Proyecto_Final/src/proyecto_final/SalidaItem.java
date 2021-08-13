package proyecto_final;

import helpers.Datos;
import helpers.Historico;
import helpers.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SalidaItem extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    Historico historico = new Historico();

    public SalidaItem() {

        initComponents();
        this.setLocationRelativeTo(null);

        if (usuario.getNivelAcceso() == 1) {
            txtUsuario.setText("Acceso total");
        } else {
            txtUsuario.setText("Acceso parcial");
        }

        for (int i = 0; i < 50; i++) {
            if (Datos.data[i][0] != null) {
                boxItems.addItem(Datos.data[i][0]);
            }
        }

        DefaultTableModel model = (DefaultTableModel) tableSalida.getModel();

        model.addColumn("Item");
        model.addColumn("Codigo");
        model.addColumn("Entregado a");
        model.addColumn("Cantidad entregada");
        model.addColumn("Stock");
        initDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSalidaItem = new javax.swing.JPanel();
        txtSalida = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtEntregado = new javax.swing.JLabel();
        iconSalida = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        setCantidad = new javax.swing.JTextField();
        buttonEntregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalida = new javax.swing.JTable();
        buttonRegresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        setEntregado = new javax.swing.JTextField();
        boxItems = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSalidaItem.setBackground(new java.awt.Color(255, 255, 255));
        panelSalidaItem.setMinimumSize(new java.awt.Dimension(1000, 488));
        panelSalidaItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSalida.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtSalida.setText("Salida");
        panelSalidaItem.add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        txtNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtNombre.setText("Item:");
        panelSalidaItem.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        txtEntregado.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtEntregado.setText("Entregado a :");
        panelSalidaItem.add(txtEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        iconSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_origin/salida.png"))); // NOI18N
        panelSalidaItem.add(iconSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtCantidad.setText("Cantidad:");
        panelSalidaItem.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        setCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCantidadActionPerformed(evt);
            }
        });
        panelSalidaItem.add(setCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 250, 30));

        buttonEntregar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEntregar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonEntregar.setText("Entregar");
        buttonEntregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntregarActionPerformed(evt);
            }
        });
        panelSalidaItem.add(buttonEntregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        tableSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableSalida);

        panelSalidaItem.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 680, 110));

        buttonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonRegresar.setText("Regresar");
        buttonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarActionPerformed(evt);
            }
        });
        panelSalidaItem.add(buttonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelSalidaItem.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 160, 30));

        imgUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        panelSalidaItem.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));
        panelSalidaItem.add(setEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 250, 30));

        boxItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxItemsActionPerformed(evt);
            }
        });
        panelSalidaItem.add(boxItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSalidaItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSalidaItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setCantidadActionPerformed

    private void buttonEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntregarActionPerformed

        int aux = 0, temporal = 0;
        String _aux = "";
        int dato_1 = 0, dato_2 = 0;

        if (!"".equals(setEntregado.getText()) && !"".equals(setCantidad.getText()) && !"".equals(boxItems.getSelectedItem())) {
            for (int i = 0; i < 50; i++) {
                if (boxItems.getSelectedItem().equals(Datos.data[i][0])) {
                    if (Datos.data[i][2] == null) {
                        Datos.data[i][2] = "0";
                    }
                    Datos.data[i][7] = setCantidad.getText();
                    Datos.data[i][6] = setEntregado.getText();
                    dato_1 = Integer.parseInt(Datos.data[i][7]);
                    dato_2 = Integer.parseInt(Datos.data[i][2]);
                    if (dato_2 > dato_1) {
                        temporal = dato_2 - dato_1;
                        _aux = Integer.toString(temporal);
                        Datos.data[i][8] = _aux;
                        Datos.data[i][2] = _aux;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad en stock insuficiente !!\n" + dato_2 + " unidades en stock ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            setEntregado.setText("");
            setCantidad.setText("");

            DefaultTableModel model = (DefaultTableModel) tableSalida.getModel();

            for (int i = 0; i < 50 && aux == 0; i++) {
                if (Datos.data[i][0] != null && Datos.data[i][1] != null && Datos.data[i][2] != null && Datos.data[i][8] != null) {
                    Object[] row = {Datos.data[i][0], Datos.data[i][1], Datos.data[i][6], Datos.data[i][7], Datos.data[i][8]};
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
            
            int fila = historico.getSelectorFilaHistorico();
            
            Historico.dataHistorico[fila][0] = Datos.data[fila][0];//Item
            Historico.dataHistorico[fila][1] = Datos.data[fila][1];//Codigo
            Historico.dataHistorico[fila][2] = Datos.data[fila][5];//Proveedor
            Historico.dataHistorico[fila][3] = Datos.data[fila][2];//Ingresado
            Historico.dataHistorico[fila][4] = Datos.data[fila][6];//Solicitante
            Historico.dataHistorico[fila][5] = Datos.data[fila][7];//Entregado 

            historico.incrementarSelectorHistorico();
        }
            

    }//GEN-LAST:event_buttonEntregarActionPerformed

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
            java.util.logging.Logger.getLogger(SalidaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalidaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalidaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalidaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalidaItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxItems;
    private javax.swing.JButton buttonEntregar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel iconSalida;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelSalidaItem;
    private javax.swing.JTextField setCantidad;
    private javax.swing.JTextField setEntregado;
    private javax.swing.JTable tableSalida;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtEntregado;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtSalida;
    public javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void initDatos() {

        Datos inventario = new Datos();

        int aux = 0;

        DefaultTableModel model = (DefaultTableModel) tableSalida.getModel();

        for (int i = 0; i < 50 && aux == 0; i++) {
            if (Datos.data[i][0] != null && Datos.data[i][1] != null && Datos.data[i][2] != null && Datos.data[i][8] != null) {
                Object[] row = {Datos.data[i][0], Datos.data[i][1], Datos.data[i][6], Datos.data[i][7], Datos.data[i][8]};
                model.addRow(row);
            }
            if (Datos.data[i][0] == null) {
                aux = 1;
            }
        }
    }

}
