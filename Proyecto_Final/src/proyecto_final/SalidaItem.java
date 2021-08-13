package proyecto_final;

import helpers.Usuario;

public class SalidaItem extends javax.swing.JFrame {
    
    Usuario usuario = new Usuario();
    
    public SalidaItem() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        if (usuario.getNivelAcceso() == 1) {
            txtUsuario.setText("Acceso total");
        } else {
            txtUsuario.setText("Acceso parcial");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSalidaItem = new javax.swing.JPanel();
        setNombre = new javax.swing.JTextField();
        txtSalida = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        setCodigo = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        txtEntregado = new javax.swing.JLabel();
        iconSalida = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        setCantidad = new javax.swing.JTextField();
        buttonLimpiarCampos = new javax.swing.JButton();
        buttonEntregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalida = new javax.swing.JTable();
        buttonRegresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        txtEntregadoa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSalidaItem.setBackground(new java.awt.Color(255, 255, 255));
        panelSalidaItem.setMinimumSize(new java.awt.Dimension(1000, 488));
        panelSalidaItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNombreActionPerformed(evt);
            }
        });
        panelSalidaItem.add(setNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 250, 30));

        txtSalida.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtSalida.setText("Salida");
        panelSalidaItem.add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        txtNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtNombre.setText("Nombre: ");
        panelSalidaItem.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));
        panelSalidaItem.add(setCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 250, 30));

        txtCodigo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtCodigo.setText("Codigo:");
        panelSalidaItem.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

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

        buttonLimpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        buttonLimpiarCampos.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonLimpiarCampos.setText("Limpiar campos");
        buttonLimpiarCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSalidaItem.add(buttonLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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
        panelSalidaItem.add(txtEntregadoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 250, 30));

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

    private void setNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setNombreActionPerformed

    private void setCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setCantidadActionPerformed

    private void buttonEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEntregarActionPerformed

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_buttonRegresarActionPerformed

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
    private javax.swing.JButton buttonEntregar;
    private javax.swing.JButton buttonLimpiarCampos;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel iconSalida;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelSalidaItem;
    private javax.swing.JTextField setCantidad;
    private javax.swing.JTextField setCodigo;
    private javax.swing.JTextField setNombre;
    private javax.swing.JTable tableSalida;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtEntregado;
    private javax.swing.JTextField txtEntregadoa;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtSalida;
    public javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
