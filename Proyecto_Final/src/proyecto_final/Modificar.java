package proyecto_final;

import helpers.Datos;
import helpers.Usuario;
import javax.swing.table.DefaultTableModel;

public class Modificar extends javax.swing.JFrame {

    Datos inventario = new Datos();
    Usuario usuario = new Usuario();

    public Modificar() {

        initComponents();
        this.setLocationRelativeTo(null);
        

        if (usuario.getNivelAcceso() == 1) {
            txtUsuario.setText("Acceso total");
        } else {
            txtUsuario.setText("Acceso parcial");
        }

        DefaultTableModel model = (DefaultTableModel) tableInventario.getModel();

        model.addColumn("Item");
        model.addColumn("Codigo");
        initDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelModificar = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        txtInventario = new javax.swing.JLabel();
        iconModificar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        buttonRegresar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        buttonAñadir = new javax.swing.JButton();
        setCodigo = new javax.swing.JTextField();
        setNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInventario = new javax.swing.JTable();

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

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelModificar.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 160, 30));

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
        txtNombre.setText("Item:");
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

        tableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableInventarioMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tableInventario);

        panelModificar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 262, 680, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAñadirActionPerformed

        int fila = inventario.getSelectorFila();
        int aux = 0;

        if (!"".equals(setNombre.getText()) && !"".equals(setCodigo.getText())) {

            DefaultTableModel model = (DefaultTableModel) tableInventario.getModel();

            inventario.setDato(fila, 0, setNombre.getText());
            inventario.setDato(fila, 1, setCodigo.getText());

            for (int i = 0; i < 50 && aux == 0; i++) {
                for (int j = 0; j <= 7 && aux == 0; j++) {
                    if (Datos.data[i][j] != null) {
                        Object[] row = {Datos.data[i + fila][j], Datos.data[i + fila][j + 1]};
                        model.addRow(row);
                        if (Datos.data[i][j] != null) {
                            aux = 1;
                        }
                    }
                }
            }
            inventario.incrementarSelector();
            setNombre.setText("");
            setCodigo.setText("");
        }
    }//GEN-LAST:event_buttonAñadirActionPerformed

    private void setNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNombreActionPerformed

    }//GEN-LAST:event_setNombreActionPerformed

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed

        this.setVisible(false);


    }//GEN-LAST:event_buttonRegresarActionPerformed

    private void tableInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInventarioMousePressed

    }//GEN-LAST:event_tableInventarioMousePressed

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
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel iconModificar;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JTextField setCodigo;
    private javax.swing.JTextField setNombre;
    public javax.swing.JTable tableInventario;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtInventario;
    private javax.swing.JLabel txtNombre;
    public javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void initDatos() {

        Datos inventario = new Datos();

        int aux = 0;

        DefaultTableModel model = (DefaultTableModel) tableInventario.getModel();

        for (int i = 0; i < 50 && aux == 0; i++) {
            if (Datos.data[i][0] != null) {
                Object[] row = {Datos.data[i][0], inventario.data[i][1]};
                model.addRow(row);
            }
            if (Datos.data[i][0] == null) {
                aux = 1;
            }
        }
    }
}
