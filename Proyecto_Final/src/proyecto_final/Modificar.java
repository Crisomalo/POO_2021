
package proyecto_final;

public class Modificar extends javax.swing.JFrame {

    public Modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelModificar = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        txtInventario = new javax.swing.JLabel();
        iconModificar = new javax.swing.JLabel();
        buttonEliminar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonRegresar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        buttonAñadir = new javax.swing.JButton();
        setCodigo = new javax.swing.JTextField();
        setNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelModificar.setBackground(new java.awt.Color(255, 255, 255));
        panelModificar.setMinimumSize(new java.awt.Dimension(664, 339));
        panelModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        panelModificar.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));

        txtInventario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtInventario.setText("Modificar");
        panelModificar.add(txtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        iconModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_origin/modificar.png"))); // NOI18N
        panelModificar.add(iconModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        buttonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEliminar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonEliminar.setText("Eliminar");
        buttonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelModificar.add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelModificar.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 160, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        panelModificar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 680, 170));

        buttonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonRegresar.setText("Regresar");
        buttonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarActionPerformed(evt);
            }
        });
        panelModificar.add(buttonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtCodigo.setText("Codigo:");
        panelModificar.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        txtNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtNombre.setText("Nombre: ");
        panelModificar.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        buttonAñadir.setBackground(new java.awt.Color(255, 255, 255));
        buttonAñadir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonAñadir.setText("Añadir");
        buttonAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAñadirActionPerformed(evt);
            }
        });
        panelModificar.add(buttonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));
        panelModificar.add(setCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 250, 30));

        setNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNombreActionPerformed(evt);
            }
        });
        panelModificar.add(setNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAñadirActionPerformed

    private void setNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setNombreActionPerformed

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed
        
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAñadir;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel iconModificar;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JTextField setCodigo;
    private javax.swing.JTextField setNombre;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtInventario;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
