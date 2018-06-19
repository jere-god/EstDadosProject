package Projeto1;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeremias
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        vetfunc = new Vector();
        initComponents();
        txtlogin.grabFocus();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jllogin = new javax.swing.JLabel();
        jlsenha = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        bntentrar = new javax.swing.JButton();
        txtsenha = new javax.swing.JPasswordField();
        bntsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jllogin.setText("Login");

        jlsenha.setText("Senha");

        txtlogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtloginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtloginFocusLost(evt);
            }
        });

        bntentrar.setText("Entrar");
        bntentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntentrarActionPerformed(evt);
            }
        });
        bntentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bntentrarKeyPressed(evt);
            }
        });

        txtsenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsenhaFocusLost(evt);
            }
        });

        bntsair.setText("Sair");
        bntsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsairActionPerformed(evt);
            }
        });
        bntsair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bntsairKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlsenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsenha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jllogin)
                        .addGap(18, 18, 18)
                        .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bntentrar)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bntsair)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntsair)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jllogin)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlsenha)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(bntentrar)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String autenticar(String login, String senha) {
        if (login.equals("Aluno") && senha.equals("123")) {
            String msg = "Acesso permitido!";
            JOptionPane.showMessageDialog(null, msg, "system", JOptionPane.INFORMATION_MESSAGE);
            return "1";
        } else if (login.equals("") || senha.equals("")) {
            String msg = "Nenhum campo pode ficar vazio. Tente novamente!";
            JOptionPane.showMessageDialog(null, msg, "system", JOptionPane.WARNING_MESSAGE);
            return "-1";
        } else {
            String msg = "Login ou senha incorretos. Tente novamente!";
            JOptionPane.showMessageDialog(null, msg, "system", JOptionPane.WARNING_MESSAGE);
            txtsenha.setText("");
            return "0";
        }
    }

    private void txtloginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtloginFocusGained
        txtlogin.setBackground(Color.gray);
    }//GEN-LAST:event_txtloginFocusGained

    private void txtloginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtloginFocusLost
        txtlogin.setBackground(Color.white);
    }//GEN-LAST:event_txtloginFocusLost

    private void bntentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntentrarActionPerformed
        if ((autenticar(txtlogin.getText(), txtsenha.getText())).equals("1")) {
            principal = new Principal();
            this.hide();
            principal.setVetfunc(vetfunc);
            principal.setVisible(true);
        }
    }//GEN-LAST:event_bntentrarActionPerformed

    private void txtsenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsenhaFocusGained
        txtsenha.setBackground(Color.gray);
    }//GEN-LAST:event_txtsenhaFocusGained

    private void txtsenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsenhaFocusLost
        txtsenha.setBackground(Color.white);
    }//GEN-LAST:event_txtsenhaFocusLost

    private void bntentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntentrarKeyPressed
        if ((autenticar(txtlogin.getText(), txtsenha.getText())).equals("1")) {
            principal = new Principal();
            this.hide();
            principal.setVetfunc(vetfunc);
            principal.setVisible(true);
        }
    }//GEN-LAST:event_bntentrarKeyPressed

    private void bntsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsairActionPerformed
        String msg = "Encerrando sistema!";
        JOptionPane.showMessageDialog(null, msg, "system", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_bntsairActionPerformed

    private void bntsairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntsairKeyPressed
        String msg = "Encerrando sistema!";
        JOptionPane.showMessageDialog(null, msg, "system", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_bntsairKeyPressed

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

    public Vector getVetfunc() {
        return vetfunc;
    }

    public void setVetfunc(Vector vetfunc) {
        this.vetfunc = vetfunc;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntentrar;
    private javax.swing.JButton bntsair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jllogin;
    private javax.swing.JLabel jlsenha;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables

    private Vector vetfunc;
    private Principal principal;
}