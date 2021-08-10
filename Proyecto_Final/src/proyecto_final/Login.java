
package proyecto_final;

import helpers.Administrador;
import helpers.Normal;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Administrador administrador = new Administrador();
    Normal normal = new Normal();
    
    public String tipoUsuario [] = {administrador.getTipoUsuario(),normal.getTipoUsuario()};
    public String contraseña [] = {administrador.getContraseña(), normal.getContraseña()};
    public int nivelAcceso [] = {administrador.getNivelAcceso(),normal.getNivelAcceso()};
            
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        IconoInicio = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setMinimumSize(new java.awt.Dimension(664, 339));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carretilla.png"))); // NOI18N
        panelLogin.add(IconoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 68, -1, -1));

        Titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Titulo.setText("Iniciar Sesión");
        panelLogin.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 11, -1, -1));

        LabelUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        panelLogin.add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 115, -1, -1));

        LabelContraseña.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LabelContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlock.png"))); // NOI18N
        panelLogin.add(LabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 192, -1, -1));

        Usuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        panelLogin.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 114, 240, 31));
        panelLogin.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 192, 240, 30));

        txtUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUsuario.setText("Usuario");
        panelLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 85, -1, -1));

        txtContraseña.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtContraseña.setText("Contraseña");
        panelLogin.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 163, -1, -1));

        Ingresar.setBackground(new java.awt.Color(255, 255, 255));
        Ingresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        panelLogin.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 262, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        int count = 0, i,aux = 0;
        
        for(i = 0; i < tipoUsuario.length && aux != 1; i++){
            if(Usuario.getText().equals(tipoUsuario[i])){
                 count = i;
                 aux = 1;
            }
        }
        System.out.println(tipoUsuario.length);
        if(count < tipoUsuario.length ){
            if(Contraseña.getText().equals(contraseña[count])){
                this.setVisible(false);
                Menu menu = new Menu();
                menu.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }

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
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel IconoInicio;
    private javax.swing.JButton Ingresar;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
