package proyecto_final;

public class Ingreso extends javax.swing.JFrame {

    public Ingreso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngreso = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JLabel();
        iconIngreso = new javax.swing.JLabel();
        buttonLimpiarCampos = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIngreso = new javax.swing.JTable();
        buttonRegresar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        buttonIngresar = new javax.swing.JButton();
        setCodigo = new javax.swing.JTextField();
        setNombre = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JLabel();
        setProveedor = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JLabel();
        setCantidad = new javax.swing.JTextField();

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

        buttonLimpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        buttonLimpiarCampos.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonLimpiarCampos.setText("Limpiar campos");
        buttonLimpiarCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelIngreso.add(buttonLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelIngreso.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 160, 30));

        tableIngreso.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableIngreso);

        panelIngreso.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 680, 90));

        buttonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonRegresar.setText("Regresar");
        buttonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelIngreso.add(buttonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtCodigo.setText("Codigo:");
        panelIngreso.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        txtNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtNombre.setText("Nombre: ");
        panelIngreso.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        buttonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        buttonIngresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonIngresar.setText("Ingresar");
        buttonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarActionPerformed(evt);
            }
        });
        panelIngreso.add(buttonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));
        panelIngreso.add(setCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 250, 30));

        setNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNombreActionPerformed(evt);
            }
        });
        panelIngreso.add(setNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 250, 30));

        txtProveedor.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtProveedor.setText("Proveedor:");
        panelIngreso.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        setProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setProveedorActionPerformed(evt);
            }
        });
        panelIngreso.add(setProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 250, 30));

        txtCantidad.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtCantidad.setText("Cantidad:");
        panelIngreso.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        setCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCantidadActionPerformed(evt);
            }
        });
        panelIngreso.add(setCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 250, 30));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIngresarActionPerformed

    private void setNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setNombreActionPerformed

    private void setProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setProveedorActionPerformed

    private void setCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setCantidadActionPerformed

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
    private javax.swing.JButton buttonIngresar;
    private javax.swing.JButton buttonLimpiarCampos;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel iconIngreso;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JTextField setCantidad;
    private javax.swing.JTextField setCodigo;
    private javax.swing.JTextField setNombre;
    private javax.swing.JTextField setProveedor;
    private javax.swing.JTable tableIngreso;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtIngreso;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtProveedor;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
