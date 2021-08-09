
package proyecto_final;

public class Inventario extends javax.swing.JFrame {

    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInventario = new javax.swing.JPanel();
        iconInventario = new javax.swing.JLabel();
        txtInventario = new javax.swing.JLabel();
        buttonRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventario = new javax.swing.JTable();
        txtUsuario = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        iconBuscar = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelInventario.setBackground(new java.awt.Color(255, 255, 255));
        panelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_origin/inventario.png"))); // NOI18N
        panelInventario.add(iconInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtInventario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtInventario.setText("Inventario");
        panelInventario.add(txtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        buttonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonRegresar.setText("Regresar");
        buttonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInventario.add(buttonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, -1, -1));

        tableInventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableInventario);

        panelInventario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 167, 690, 240));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelInventario.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 160, 30));

        imgUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        panelInventario.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));

        iconBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        panelInventario.add(iconBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        Buscar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        panelInventario.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 650, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel iconBuscar;
    private javax.swing.JLabel iconInventario;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JTable tableInventario;
    private javax.swing.JLabel txtInventario;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
