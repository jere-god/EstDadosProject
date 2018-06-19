/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto1;

import java.awt.Color;
import java.util.Vector;
import javafx.scene.control.ButtonBar;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeremias
 */
public class RemoverFunc extends javax.swing.JFrame {

    /**
     * Creates new form RemoverFunc
     */
    public RemoverFunc(Vector vetfunc) {
        initComponents();
        this.vetfunc = vetfunc;
        this.setLocationRelativeTo(null);
        bntremover.setVisible(false);
        txtnumfunc.setVisible(false);
        jlnumfunc.setVisible(false);
        txtnome.grabFocus();
        
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
        jlnome = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        bntpesquisar = new javax.swing.JButton();
        bntremover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxtresultpesq = new javax.swing.JTextArea();
        bntvoltar = new javax.swing.JButton();
        bntverregistro = new javax.swing.JToggleButton();
        txtnumfunc = new javax.swing.JTextField();
        jlnumfunc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dispensa ");

        jlnome.setText("Nome completo");

        txtnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomeFocusLost(evt);
            }
        });

        bntpesquisar.setText("Pesquisar");
        bntpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntpesquisarActionPerformed(evt);
            }
        });
        bntpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bntpesquisarKeyPressed(evt);
            }
        });

        bntremover.setText("Remover dados do funcionário");
        bntremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntremoverActionPerformed(evt);
            }
        });
        bntremover.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bntremoverKeyPressed(evt);
            }
        });

        atxtresultpesq.setEditable(false);
        atxtresultpesq.setColumns(20);
        atxtresultpesq.setRows(5);
        jScrollPane1.setViewportView(atxtresultpesq);

        bntvoltar.setText("Voltar");
        bntvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntvoltarActionPerformed(evt);
            }
        });
        bntvoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bntvoltarKeyPressed(evt);
            }
        });

        bntverregistro.setText("Ver Registro");
        bntverregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntverregistroActionPerformed(evt);
            }
        });
        bntverregistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bntverregistroKeyPressed(evt);
            }
        });

        jlnumfunc.setText("Nº do funcionário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bntvoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntverregistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(bntpesquisar)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlnumfunc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnumfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntremover))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntvoltar)
                    .addComponent(bntverregistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnome)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntpesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntremover)
                    .addComponent(txtnumfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlnumfunc))
                .addGap(0, 26, Short.MAX_VALUE))
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

    private void txtnomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeFocusGained
        txtnome.setBackground(Color.gray);
    }//GEN-LAST:event_txtnomeFocusGained

    private void txtnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeFocusLost
        txtnome.setBackground(Color.white);
    }//GEN-LAST:event_txtnomeFocusLost

    private void bntpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntpesquisarActionPerformed
        funcionario = new Funcionario();
        nomePes = txtnome.getText().toUpperCase();
        String msg = "";
        int a = 0;
        for(int i=0; i<vetfunc.size(); i++){
            funcionario = (Funcionario) vetfunc.elementAt(i);
            nome = funcionario.getNome().toUpperCase();
            if(nome.equals(nomePes)){
                msg += "Funcionário encontrado!\n";
                msg += "Funcionário nº "+(i+1)+"\n";
                msg += "Nome: "+funcionario.getNome()+"\n";
                msg += "Cargo: "+funcionario.getCargo()+"\n";
                msg += "Sal: R$"+funcionario.getSal()+"\n";
                msg += "----------------------------------\n";
                a++;
            }
        }
        if(a==0){
            msg = "Nenhum funcionário encontrado!";
        }else{
            txtnome.setText("");
            bntremover.setVisible(true);
            txtnumfunc.setVisible(true);
            jlnumfunc.setVisible(true);
        }
        atxtresultpesq.setText(msg);
    }//GEN-LAST:event_bntpesquisarActionPerformed

    private void bntremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntremoverActionPerformed
        try{
            numfunc = Integer.parseInt(txtnumfunc.getText());
            String msg = "Você tem certeza que deseja remover esses dados? (S/N)";
                int certeza = JOptionPane.showConfirmDialog(null, msg, "system", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(certeza==ConfirmationCallback.YES){
                    vetfunc.remove(numfunc-1);
                    atxtresultpesq.setText("");
                    txtnumfunc.setText("");
                    txtnumfunc.setVisible(false);
                    jlnumfunc.setVisible(false);
                    bntremover.setVisible(false);
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Número inválido!", "system", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bntremoverActionPerformed

    private void bntvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntvoltarActionPerformed
        principal = new Principal();
        principal.setVetfunc(vetfunc);
        this.hide();
        principal.setVisible(true);
    }//GEN-LAST:event_bntvoltarActionPerformed

    private void bntvoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntvoltarKeyPressed
        principal = new Principal();
        principal.setVetfunc(vetfunc);
        this.hide();
        principal.setVisible(true);
    }//GEN-LAST:event_bntvoltarKeyPressed

    private void bntpesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntpesquisarKeyPressed
        funcionario = new Funcionario();
        nomePes = txtnome.getText().toUpperCase();
        String msg = "";
        int a = 0;
        for(int i=0; i<vetfunc.size(); i++){
            funcionario = (Funcionario) vetfunc.elementAt(i);
            nome = funcionario.getNome().toUpperCase();
            if(nome.equals(nomePes)){
                msg += "Funcionário encontrado!\n";
                msg += "Funcionário nº "+(i+1)+"\n";
                msg += "Nome: "+funcionario.getNome()+"\n";
                msg += "Cargo: "+funcionario.getCargo()+"\n";
                msg += "Sal: R$"+funcionario.getSal()+"\n";
                msg += "----------------------------------\n";
                a++;
            }
        }
        if(a==0){
            msg = "Nenhum funcionário encontrado!";
        }else{
            txtnome.setText("");
            bntremover.setVisible(true);
            txtnumfunc.setVisible(true);
            jlnumfunc.setVisible(true);
        }
        atxtresultpesq.setText(msg);
    }//GEN-LAST:event_bntpesquisarKeyPressed

    private void bntremoverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntremoverKeyPressed
        try{
            numfunc = Integer.parseInt(txtnumfunc.getText());
            String msg = "Você tem certeza que deseja remover esses dados? (S/N)";
                int certeza = JOptionPane.showConfirmDialog(null, msg, "system", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(certeza==ConfirmationCallback.YES){
                    vetfunc.remove(numfunc-1);
                    atxtresultpesq.setText("");
                    txtnumfunc.setText("");
                    txtnumfunc.setVisible(false);
                    jlnumfunc.setVisible(false);
                    bntremover.setVisible(false);
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Número inválido!", "system", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bntremoverKeyPressed

    private void bntverregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntverregistroActionPerformed
        listarfunc = new ListarFunc(vetfunc, 2);
        this.hide();
        listarfunc.setVisible(true);
    }//GEN-LAST:event_bntverregistroActionPerformed

    private void bntverregistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntverregistroKeyPressed
        listarfunc = new ListarFunc(vetfunc, 2);
        this.hide();
        listarfunc.setVisible(true);
    }//GEN-LAST:event_bntverregistroKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxtresultpesq;
    private javax.swing.JButton bntpesquisar;
    private javax.swing.JButton bntremover;
    private javax.swing.JToggleButton bntverregistro;
    private javax.swing.JButton bntvoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlnome;
    private javax.swing.JLabel jlnumfunc;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumfunc;
    // End of variables declaration//GEN-END:variables

    private Principal principal;
    private ListarFunc listarfunc;
    
    private Vector vetfunc;
    private Funcionario funcionario;
    
    private String nome = "";
    private String nomePes = "";
    private int numfunc;

}