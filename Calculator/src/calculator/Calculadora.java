
package calculator;
import java.awt.Image;
import java.awt.Toolkit;

public class Calculadora extends javax.swing.JFrame {

    float operando;
    float resultado;
    float temporal;
    String operacion;
    
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("helpers/images/fx.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCerrar = new javax.swing.JButton();
        jLabelTema = new javax.swing.JLabel();
        jButtonNumClear = new javax.swing.JButton();
        jButtonNum4 = new javax.swing.JButton();
        jButtonNum1 = new javax.swing.JButton();
        jButtonNum8 = new javax.swing.JButton();
        jButtonNum5 = new javax.swing.JButton();
        jButtonNum2 = new javax.swing.JButton();
        jButtonNum0 = new javax.swing.JButton();
        jButtonPoint = new javax.swing.JButton();
        jButtonSumar = new javax.swing.JButton();
        jButtonNum6 = new javax.swing.JButton();
        jButtonNum3 = new javax.swing.JButton();
        jButtonResultado = new javax.swing.JButton();
        jButtonNum9 = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonProduct = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonNum7 = new javax.swing.JButton();
        jLabelWorkSpace = new javax.swing.JLabel();
        jLabelWorkSpace2 = new javax.swing.JLabel();
        Buffer = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCerrar.setText("CERRAR");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 253, -1, 30));

        jLabelTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helpers/images/vector-mathematic-icons.jpg"))); // NOI18N
        jLabelTema.setText("jLabel1");
        getContentPane().add(jLabelTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, -1));

        jButtonNumClear.setBackground(new java.awt.Color(255, 102, 102));
        jButtonNumClear.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNumClear.setText("C");
        jButtonNumClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNumClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 60, 30));

        jButtonNum4.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum4.setText("4");
        jButtonNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 60, 30));

        jButtonNum1.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum1.setText("1");
        jButtonNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 60, 30));

        jButtonNum8.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum8.setText("8");
        jButtonNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 60, 30));

        jButtonNum5.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum5.setText("5");
        jButtonNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 60, 30));

        jButtonNum2.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum2.setText("2");
        jButtonNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 60, 30));

        jButtonNum0.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum0.setText("0");
        jButtonNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 60, 30));

        jButtonPoint.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonPoint.setText(".");
        getContentPane().add(jButtonPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 60, 30));

        jButtonSumar.setFont(new java.awt.Font("Monospac821 BT", 1, 14)); // NOI18N
        jButtonSumar.setText("+");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 40, 30));

        jButtonNum6.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum6.setText("6");
        jButtonNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 60, 30));

        jButtonNum3.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum3.setText("3");
        jButtonNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 60, 30));

        jButtonResultado.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonResultado.setText("=");
        getContentPane().add(jButtonResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 60, 30));

        jButtonNum9.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum9.setText("9");
        jButtonNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 30));

        jButtonDivide.setFont(new java.awt.Font("Monospac821 BT", 1, 14)); // NOI18N
        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 40, 30));

        jButtonProduct.setFont(new java.awt.Font("Monospac821 BT", 1, 14)); // NOI18N
        jButtonProduct.setText("X");
        jButtonProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 40, 30));

        jButtonResta.setFont(new java.awt.Font("Monospac821 BT", 1, 14)); // NOI18N
        jButtonResta.setText("-");
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 40, 30));

        jButtonNum7.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNum7.setText("7");
        jButtonNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 60, 30));

        jLabelWorkSpace.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelWorkSpace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelWorkSpace.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelWorkSpace.setOpaque(true);
        getContentPane().add(jLabelWorkSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, 40));

        jLabelWorkSpace2.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jLabelWorkSpace2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelWorkSpace2.setOpaque(true);
        getContentPane().add(jLabelWorkSpace2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 150, 40));

        Buffer.setOpaque(true);
        getContentPane().add(Buffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 10));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helpers/images/wallpaper.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonNumClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumClearActionPerformed
        this.jLabelWorkSpace.setText("");
        this.jLabelWorkSpace2.setText("");
    }//GEN-LAST:event_jButtonNumClearActionPerformed

    private void jButtonNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum2ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"2");
    }//GEN-LAST:event_jButtonNum2ActionPerformed

    private void jButtonNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum8ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"8");
    }//GEN-LAST:event_jButtonNum8ActionPerformed

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        if(!"".equals(this.jLabelWorkSpace.getText())){
                    this.operando = Float.parseFloat(this.jLabelWorkSpace.getText());
        if(!"".equals(this.jLabelWorkSpace.getText())&&!"".equals(this.jLabelWorkSpace2.getText())){
            this.operando =Float.parseFloat(this.jLabelWorkSpace2.getText())+Float.parseFloat(this.jLabelWorkSpace.getText());
        }
        this.jLabelWorkSpace2.setText(Float.toString(operando));
        this.jLabelWorkSpace.setText("");
        }
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum9ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"9");
    }//GEN-LAST:event_jButtonNum9ActionPerformed

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDivideActionPerformed

    private void jButtonProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProductActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum7ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"7");
    }//GEN-LAST:event_jButtonNum7ActionPerformed

    private void jButtonNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum0ActionPerformed
       this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"0");
    }//GEN-LAST:event_jButtonNum0ActionPerformed

    private void jButtonNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum1ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"1");
    }//GEN-LAST:event_jButtonNum1ActionPerformed

    private void jButtonNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum3ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"3");
    }//GEN-LAST:event_jButtonNum3ActionPerformed

    private void jButtonNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum4ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"4");
    }//GEN-LAST:event_jButtonNum4ActionPerformed

    private void jButtonNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum5ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"5");
    }//GEN-LAST:event_jButtonNum5ActionPerformed

    private void jButtonNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum6ActionPerformed
        this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText()+"6");
    }//GEN-LAST:event_jButtonNum6ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buffer;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonNum0;
    private javax.swing.JButton jButtonNum1;
    private javax.swing.JButton jButtonNum2;
    private javax.swing.JButton jButtonNum3;
    private javax.swing.JButton jButtonNum4;
    private javax.swing.JButton jButtonNum5;
    private javax.swing.JButton jButtonNum6;
    private javax.swing.JButton jButtonNum7;
    private javax.swing.JButton jButtonNum8;
    private javax.swing.JButton jButtonNum9;
    private javax.swing.JButton jButtonNumClear;
    private javax.swing.JButton jButtonPoint;
    private javax.swing.JButton jButtonProduct;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonResultado;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTema;
    private javax.swing.JLabel jLabelWorkSpace;
    private javax.swing.JLabel jLabelWorkSpace2;
    // End of variables declaration//GEN-END:variables
}
