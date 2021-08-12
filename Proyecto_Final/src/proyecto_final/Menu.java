
package proyecto_final;

import helpers.Datos;
import javax.swing.table.DefaultTableModel;


public class Menu extends javax.swing.JFrame {
    
    //Datos inventario = new Datos();
        
    public Menu() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        txtControlInventario = new javax.swing.JLabel();
        iconMenu = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtInventario = new javax.swing.JLabel();
        txtModificar = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JLabel();
        txtSalida = new javax.swing.JLabel();
        txtHistorial = new javax.swing.JLabel();
        txtCerrarSesion = new javax.swing.JLabel();
        Inventario = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Historial = new javax.swing.JButton();
        Ingreso = new javax.swing.JButton();
        Salida = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setPreferredSize(new java.awt.Dimension(664, 339));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtControlInventario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtControlInventario.setText("Control de Invetario");
        panelMenu.add(txtControlInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 11, -1, -1));

        iconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/almacen.png"))); // NOI18N
        panelMenu.add(iconMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 80, -1, 214));

        imgUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        panelMenu.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelMenu.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 160, 30));

        txtInventario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInventario.setText("Inventario");
        panelMenu.add(txtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 157, 70, -1));

        txtModificar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModificar.setText("Modificar");
        panelMenu.add(txtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 157, 70, -1));

        txtIngreso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngreso.setText("Ingreso");
        panelMenu.add(txtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 277, 70, -1));

        txtSalida.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalida.setText("Salida");
        panelMenu.add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 277, 70, -1));

        txtHistorial.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHistorial.setText("Historial");
        panelMenu.add(txtHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 157, 77, -1));

        txtCerrarSesion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtCerrarSesion.setText("Cerrar sesión");
        panelMenu.add(txtCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 277, -1, -1));

        Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        Inventario.setBorder(null);
        Inventario.setBorderPainted(false);
        Inventario.setContentAreaFilled(false);
        Inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_opaque/inventario opaque.png"))); // NOI18N
        Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioActionPerformed(evt);
            }
        });
        panelMenu.add(Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 80, 70, -1));

        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicion.png"))); // NOI18N
        Modificar.setBorder(null);
        Modificar.setBorderPainted(false);
        Modificar.setContentAreaFilled(false);
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_opaque/adicion opaque.png"))); // NOI18N
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        panelMenu.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 80, 70, -1));

        Historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/historial.png"))); // NOI18N
        Historial.setBorder(null);
        Historial.setBorderPainted(false);
        Historial.setContentAreaFilled(false);
        Historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Historial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_opaque/historial opaque.png"))); // NOI18N
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        panelMenu.add(Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 77, -1));

        Ingreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingreso.png"))); // NOI18N
        Ingreso.setBorder(null);
        Ingreso.setBorderPainted(false);
        Ingreso.setContentAreaFilled(false);
        Ingreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingreso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_opaque/ingreso opaque.png"))); // NOI18N
        Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoActionPerformed(evt);
            }
        });
        panelMenu.add(Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 200, 70, -1));

        Salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salida.png"))); // NOI18N
        Salida.setBorder(null);
        Salida.setBorderPainted(false);
        Salida.setContentAreaFilled(false);
        Salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_opaque/salida opaque.png"))); // NOI18N
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        panelMenu.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 200, 70, -1));

        CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        CerrarSesion.setBorder(null);
        CerrarSesion.setBorderPainted(false);
        CerrarSesion.setContentAreaFilled(false);
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_opaque/cerrar-sesion opaque.png"))); // NOI18N
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        panelMenu.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 77, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioActionPerformed
        
        this.setVisible(false);
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        
    }//GEN-LAST:event_InventarioActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        
        //this.setVisible(false);
        Modificar modificar = new Modificar();
        modificar.setVisible(true);

    }//GEN-LAST:event_ModificarActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        
        this.setVisible(false);
        Historial historial = new Historial();
        historial.setVisible(true);

    }//GEN-LAST:event_HistorialActionPerformed

    private void IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoActionPerformed
        
        this.setVisible(false);
        Ingreso ingreso = new Ingreso();
        ingreso.setVisible(true);

    }//GEN-LAST:event_IngresoActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
       
        this.setVisible(false);
        SalidaItem salida = new SalidaItem();
        salida.setVisible(true);
        
        
    }//GEN-LAST:event_SalidaActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed

        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton Historial;
    private javax.swing.JButton Ingreso;
    private javax.swing.JButton Inventario;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Salida;
    private javax.swing.JLabel iconMenu;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JLabel txtCerrarSesion;
    private javax.swing.JLabel txtControlInventario;
    private javax.swing.JLabel txtHistorial;
    private javax.swing.JLabel txtIngreso;
    private javax.swing.JLabel txtInventario;
    private javax.swing.JLabel txtModificar;
    private javax.swing.JLabel txtSalida;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
