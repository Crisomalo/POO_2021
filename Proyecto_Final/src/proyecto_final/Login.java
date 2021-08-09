
package proyecto_final;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        IconoInicio = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Login.setBackground(new java.awt.Color(255, 255, 255));

        IconoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carretilla.png"))); // NOI18N

        Titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Titulo.setText("Iniciar Sesión");

        LabelUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        LabelContraseña.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LabelContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlock.png"))); // NOI18N

        Usuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUsuario.setText("Usuario");

        txtContraseña.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtContraseña.setText("Contraseña");

        Ingresar.setBackground(new java.awt.Color(255, 255, 255));
        Ingresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(IconoInicio)
                .addGap(73, 73, 73)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelContraseña)
                    .addComponent(LabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Usuario)
                    .addComponent(txtUsuario)
                    .addComponent(txtContraseña)
                    .addComponent(jPasswordField1)
                    .addComponent(Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(126, 126, 126))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo)
                        .addGap(44, 44, 44)
                        .addComponent(txtUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelUsuario))
                        .addGap(18, 18, 18)
                        .addComponent(txtContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelContraseña))
                        .addGap(40, 40, 40)
                        .addComponent(Ingresar))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(IconoInicio)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconoInicio;
    private javax.swing.JButton Ingresar;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
