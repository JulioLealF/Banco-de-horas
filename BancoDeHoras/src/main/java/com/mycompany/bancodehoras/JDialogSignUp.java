/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancodehoras;

/**
 *
 * @author juliocesarlealdefaria
 */
public class JDialogSignUp extends javax.swing.JDialog {

    /**
     * Creates new form JDialogSignUp
     */
    public JDialogSignUp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmailSignUp = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblTituloSignUp = new javax.swing.JLabel();
        txtNomeSignUp = new javax.swing.JTextField();
        txtSenhaSignUp = new javax.swing.JTextField();
        txtConfirmacaoSenhaSignUp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtEmailSignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmailSignUp.setText("Informe seu email");
        txtEmailSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailSignUpActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 15)); // NOI18N
        btnCadastrar.setText("Cadastrar-se");

        lblTituloSignUp.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 24)); // NOI18N
        lblTituloSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSignUp.setText("SIGN UP");

        txtNomeSignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeSignUp.setText("Informe seu nome");
        txtNomeSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeSignUpActionPerformed(evt);
            }
        });

        txtSenhaSignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenhaSignUp.setText("Informe sua senha");
        txtSenhaSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaSignUpActionPerformed(evt);
            }
        });

        txtConfirmacaoSenhaSignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmacaoSenhaSignUp.setText("Informe sua senha novamente");
        txtConfirmacaoSenhaSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmacaoSenhaSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lblTituloSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEmailSignUp)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSenhaSignUp)
                        .addComponent(txtConfirmacaoSenhaSignUp, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTituloSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenhaSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtConfirmacaoSenhaSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailSignUpActionPerformed

    private void txtNomeSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeSignUpActionPerformed

    private void txtConfirmacaoSenhaSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmacaoSenhaSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmacaoSenhaSignUpActionPerformed

    private void txtSenhaSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogSignUp dialog = new JDialogSignUp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lblTituloSignUp;
    private javax.swing.JTextField txtConfirmacaoSenhaSignUp;
    private javax.swing.JTextField txtEmailSignUp;
    private javax.swing.JTextField txtNomeSignUp;
    private javax.swing.JTextField txtSenhaSignUp;
    // End of variables declaration//GEN-END:variables
}
