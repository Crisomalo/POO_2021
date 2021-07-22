package calculator;

import java.awt.Image;
import java.awt.Toolkit;

public class Calculadora extends javax.swing.JFrame {

    float operando;
    float resultado;
    float ans;
    float auxiliar, auxiliar_2;
    String operacion;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("helpers/images/fx.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCerrar = new javax.swing.JButton();
        jLabelTema = new javax.swing.JLabel();
        jButtonNumClearAll = new javax.swing.JButton();
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
        jButtonSigno = new javax.swing.JButton();
        jButtonNumClearWorkSpace = new javax.swing.JButton();
        jButtonAns = new javax.swing.JButton();
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

        jButtonNumClearAll.setBackground(new java.awt.Color(255, 102, 102));
        jButtonNumClearAll.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNumClearAll.setText("CA");
        jButtonNumClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumClearAllActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNumClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 60, 30));

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
        jButtonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPointActionPerformed(evt);
            }
        });
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
        jButtonResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultadoActionPerformed(evt);
            }
        });
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

        Buffer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Buffer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buffer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Buffer.setOpaque(true);
        getContentPane().add(Buffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 20));

        jButtonSigno.setFont(new java.awt.Font("Monospac821 BT", 1, 14)); // NOI18N
        jButtonSigno.setText("+/-");
        jButtonSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 60, 30));

        jButtonNumClearWorkSpace.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNumClearWorkSpace.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        jButtonNumClearWorkSpace.setText("C");
        jButtonNumClearWorkSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumClearWorkSpaceActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNumClearWorkSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 60, 30));

        jButtonAns.setFont(new java.awt.Font("Monospac821 BT", 1, 14)); // NOI18N
        jButtonAns.setText("ANS");
        jButtonAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 60, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helpers/images/wallpaper.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonNumClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumClearAllActionPerformed
        this.jLabelWorkSpace.setText("");
        this.jLabelWorkSpace2.setText("");
        this.Buffer.setText("");
    }//GEN-LAST:event_jButtonNumClearAllActionPerformed

    private void jButtonNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum2ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("2");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "2");
        }   
    }//GEN-LAST:event_jButtonNum2ActionPerformed

    private void jButtonNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum8ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("8");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "8");
        }   
    }//GEN-LAST:event_jButtonNum8ActionPerformed

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed

        if (!"".equals(this.jLabelWorkSpace.getText())) {
            this.operando = Float.parseFloat(this.jLabelWorkSpace.getText());
            if (!"".equals(this.jLabelWorkSpace.getText()) && !"".equals(this.jLabelWorkSpace2.getText()) && "+".equals(this.Buffer.getText())) {
                this.operando = Float.parseFloat(this.jLabelWorkSpace2.getText()) + Float.parseFloat(this.jLabelWorkSpace.getText());
            }
            this.jLabelWorkSpace2.setText(Float.toString(operando));
            this.jLabelWorkSpace.setText("");
            this.Buffer.setText("+");
            this.operacion = this.Buffer.getText();
            //this.ans = this.operando;
        }
        if (!"".equals(this.jLabelWorkSpace2.getText())) {
            this.Buffer.setText("+");
            this.operacion = this.Buffer.getText();
        }
        
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum9ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("9");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "9");
        }   
    }//GEN-LAST:event_jButtonNum9ActionPerformed

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
        if (!"".equals(this.jLabelWorkSpace.getText())) {
            this.operando = Float.parseFloat(this.jLabelWorkSpace.getText());
            if (!"".equals(this.jLabelWorkSpace.getText()) && !"".equals(this.jLabelWorkSpace2.getText())&& "/".equals(this.Buffer.getText())) {
                this.operando = Float.parseFloat(this.jLabelWorkSpace2.getText()) / Float.parseFloat(this.jLabelWorkSpace.getText());
            }
            this.jLabelWorkSpace2.setText(Float.toString(operando));
            this.jLabelWorkSpace.setText("");
            this.Buffer.setText("/");
            this.operacion = this.Buffer.getText();
            //this.ans = this.operando;
        }
        if (!"".equals(this.jLabelWorkSpace2.getText())) {
            this.Buffer.setText("/");
            this.operacion = this.Buffer.getText();
        }
    }//GEN-LAST:event_jButtonDivideActionPerformed

    private void jButtonProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductActionPerformed
        if (!"".equals(this.jLabelWorkSpace.getText())) {
            this.operando = Float.parseFloat(this.jLabelWorkSpace.getText());
            if (!"".equals(this.jLabelWorkSpace.getText()) && !"".equals(this.jLabelWorkSpace2.getText())&& "x".equals(this.Buffer.getText())) {
                this.operando = Float.parseFloat(this.jLabelWorkSpace2.getText()) * Float.parseFloat(this.jLabelWorkSpace.getText());
            }
            this.jLabelWorkSpace2.setText(Float.toString(operando));
            this.jLabelWorkSpace.setText("");
            this.Buffer.setText("x");
            this.operacion = this.Buffer.getText();
            //this.ans = this.operando;
        }
        if (!"".equals(this.jLabelWorkSpace2.getText())) {
            this.Buffer.setText("x");
            this.operacion = this.Buffer.getText();
        }
    }//GEN-LAST:event_jButtonProductActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        if (!"".equals(this.jLabelWorkSpace.getText())) {
            this.operando = Float.parseFloat(this.jLabelWorkSpace.getText());
            if (!"".equals(this.jLabelWorkSpace.getText()) && !"".equals(this.jLabelWorkSpace2.getText())&& "-".equals(this.Buffer.getText())) {
                this.operando = Float.parseFloat(this.jLabelWorkSpace2.getText()) - Float.parseFloat(this.jLabelWorkSpace.getText());
            }

            this.jLabelWorkSpace2.setText(Float.toString(operando));
            this.jLabelWorkSpace.setText("");
            this.Buffer.setText("-");
            this.operacion = this.Buffer.getText();
            //this.ans = this.operando;
        }
        if (!"".equals(this.jLabelWorkSpace2.getText())) {
            this.Buffer.setText("-");
            this.operacion = this.Buffer.getText();
        }
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum7ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("7");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "7");
        }   
    }//GEN-LAST:event_jButtonNum7ActionPerformed

    private void jButtonNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum0ActionPerformed
        if("ANS".equals(this.Buffer.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("0");
        }else{
            if ("".equals(this.jLabelWorkSpace.getText()) || this.jLabelWorkSpace.getText().contains(".") || Float.parseFloat(this.jLabelWorkSpace.getText()) > 0) {
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "0");
        }
        }   
    }//GEN-LAST:event_jButtonNum0ActionPerformed

    private void jButtonNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum1ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("1");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "1");
        }   
    }//GEN-LAST:event_jButtonNum1ActionPerformed

    private void jButtonNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum3ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("3");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "3");
        }   
    }//GEN-LAST:event_jButtonNum3ActionPerformed

    private void jButtonNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum4ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("4");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "4");
        }   
    }//GEN-LAST:event_jButtonNum4ActionPerformed

    private void jButtonNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum5ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("5");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "5");
        }   
    }//GEN-LAST:event_jButtonNum5ActionPerformed

    private void jButtonNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum6ActionPerformed
        if("ANS".equals(this.Buffer.getText())||"0".equals(this.jLabelWorkSpace.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText("6");
        }else{
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + "6");
        }   
    }//GEN-LAST:event_jButtonNum6ActionPerformed

    private void jButtonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPointActionPerformed
        if("ANS".equals(this.Buffer.getText())){
            this.Buffer.setText("");
            this.jLabelWorkSpace.setText(".");
        }else{
            if (!this.jLabelWorkSpace.getText().contains("."))
            this.jLabelWorkSpace.setText(this.jLabelWorkSpace.getText() + ".");
        }
    }//GEN-LAST:event_jButtonPointActionPerformed

    private void jButtonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultadoActionPerformed
        
        if (!"".equals(this.Buffer.getText()) && !"".equals(this.jLabelWorkSpace2.getText())&& !"".equals(this.jLabelWorkSpace.getText())) {
            this.auxiliar = Float.parseFloat(this.jLabelWorkSpace2.getText());
            this.auxiliar_2 = Float.parseFloat(this.jLabelWorkSpace.getText());
            this.jLabelWorkSpace2.setText(bufferOperation(auxiliar, auxiliar_2));
            this.jLabelWorkSpace.setText("");
            this.Buffer.setText("");
        }
    }//GEN-LAST:event_jButtonResultadoActionPerformed

    private void jButtonSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignoActionPerformed
        if (!"".equals(this.jLabelWorkSpace.getText())) {
            if (!"".equals(this.jLabelWorkSpace.getText()) && "".equals(this.jLabelWorkSpace2.getText())) {
                this.operando = Float.parseFloat(this.jLabelWorkSpace.getText()) * -1;
                this.jLabelWorkSpace.setText(Float.toString(this.operando));
            } else if (!"".equals(this.jLabelWorkSpace2.getText())) {
                this.operando = Float.parseFloat(this.jLabelWorkSpace.getText()) * -1;
                this.jLabelWorkSpace.setText(Float.toString(this.operando));
            }
        }
    }//GEN-LAST:event_jButtonSignoActionPerformed

    private void jButtonNumClearWorkSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumClearWorkSpaceActionPerformed
        this.jLabelWorkSpace.setText("");
        if("ANS".equals(this.Buffer.getText())){
            this.Buffer.setText("");
        }
    }//GEN-LAST:event_jButtonNumClearWorkSpaceActionPerformed

    private void jButtonAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnsActionPerformed
            this.jLabelWorkSpace.setText(Float.toString(this.ans));
            if("".equals(this.Buffer.getText())){
                this.Buffer.setText("ANS");
                this.jLabelWorkSpace2.setText("");
            }
    }//GEN-LAST:event_jButtonAnsActionPerformed

    public String bufferOperation(float a, float b) {

        String result = "";
        float x = 0;

        switch (this.operacion) {
            case "+":
                x = a + b;
                break;
            case "-":
                x = a - b;
                break;
            case "/":
                x = a / b;
                break;
            case "x":
                x = a * b;
                break;
        }

        result = Float.toString(x);
        this.ans = Float.parseFloat(result);
        
        return result;
    }

    public float negativePositive(String a) {
        float numeroWorkSpace = 0;

        return numeroWorkSpace;
    }

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
    private javax.swing.JButton jButtonAns;
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
    private javax.swing.JButton jButtonNumClearAll;
    private javax.swing.JButton jButtonNumClearWorkSpace;
    private javax.swing.JButton jButtonPoint;
    private javax.swing.JButton jButtonProduct;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonResultado;
    private javax.swing.JButton jButtonSigno;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTema;
    private javax.swing.JLabel jLabelWorkSpace;
    private javax.swing.JLabel jLabelWorkSpace2;
    // End of variables declaration//GEN-END:variables
}
