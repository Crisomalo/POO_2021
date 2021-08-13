package proyecto_final;

import helpers.Usuario;

public class Historial extends javax.swing.JFrame {
    
    Usuario usuario = new Usuario();
    
    public Historial() {
        
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

        panelHistorial = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        iconHistorial = new javax.swing.JLabel();
        txtInventario = new javax.swing.JLabel();
        buttonRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHistorial = new javax.swing.JTable();
        Buscar = new javax.swing.JTextField();
        iconBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelHistorial.setBackground(new java.awt.Color(255, 255, 255));
        panelHistorial.setMinimumSize(new java.awt.Dimension(1000, 339));
        panelHistorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        panelHistorial.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelHistorial.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 160, 30));

        iconHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_origin/historial.png"))); // NOI18N
        panelHistorial.add(iconHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtInventario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtInventario.setText("Historial");
        panelHistorial.add(txtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        buttonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        buttonRegresar.setText("Regresar");
        buttonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarActionPerformed(evt);
            }
        });
        panelHistorial.add(buttonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, -1, -1));

        tableHistorial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableHistorial);

        panelHistorial.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 690, 160));

        Buscar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        panelHistorial.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 650, 30));

        iconBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        panelHistorial.add(iconBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel iconBuscar;
    private javax.swing.JLabel iconHistorial;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelHistorial;
    private javax.swing.JTable tableHistorial;
    private javax.swing.JLabel txtInventario;
    public javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
