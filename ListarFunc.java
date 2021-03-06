/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto1;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeremias
 */
public class ListarFunc extends javax.swing.JFrame {

    /**
     * Creates new form ListarFunc
     */
    public ListarFunc(Vector vetfunc, int backTo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.vetfunc = vetfunc;
        this.backTo = backTo;
        listarTodos();
        
        
    }
    
    private void listarTodos(){
        String msg = "";
        if(vetfunc.size()!=0){
            for(int i=0; i<vetfunc.size(); i++){
                funcionario = (Funcionario) vetfunc.elementAt(i);
                msg += "Funcionário "+(i+1)+"\n";
                msg += "Nome: "+funcionario.getNome()+"\n";
                msg += "Cargo: "+funcionario.getCargo()+"\n";
                msg += "Salário: R$"+funcionario.getSal()+"\n";
                msg += "---------------------------\n";
            }
        }else{
            msg = "\n\n\n\n\n\n    **REGISTRO VAZIO**";
        }
        atxtlista.setText(msg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntvoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxtlista = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registros");

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

        atxtlista.setEditable(false);
        atxtlista.setColumns(20);
        atxtlista.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        atxtlista.setRows(5);
        jScrollPane1.setViewportView(atxtlista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntvoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntvoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntvoltarActionPerformed
        this.hide();
        if(backTo==1){
            principal = new Principal();
            principal.setVetfunc(vetfunc);
            principal.setVisible(true);
        }else{
            removerfunc = new RemoverFunc(vetfunc);
            removerfunc.setVisible(true);
        }
        
    }//GEN-LAST:event_bntvoltarActionPerformed

    private void bntvoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntvoltarKeyPressed
        this.hide();
        if(backTo==1){
            principal = new Principal();
            principal.setVetfunc(vetfunc);
            principal.setVisible(true);
        }else{
            removerfunc = new RemoverFunc(vetfunc);
            removerfunc.setVisible(true);
        }
    }//GEN-LAST:event_bntvoltarKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxtlista;
    private javax.swing.JButton bntvoltar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private Vector vetfunc;
    private Principal principal;
    private RemoverFunc removerfunc;
    private Funcionario funcionario;
    
    private int backTo = 1;

    public Vector getVetfunc() {
        return vetfunc;
    }

    public void setVetfunc(Vector vetfunc) {
        this.vetfunc = vetfunc;
    }
}
