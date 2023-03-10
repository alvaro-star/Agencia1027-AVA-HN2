package views;

import controller.ContaControle;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ContaModel;
import visao.FormPadrao;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDesktop = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConta = new javax.swing.JTable();
        JBAlterar_Conta = new javax.swing.JButton();
        JBRemover_Conta = new javax.swing.JButton();
        JBMostrar_Contas = new javax.swing.JButton();
        JBCriar_Conta1 = new javax.swing.JButton();
        jBMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agência 1027");

        jTableConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NConta", "Nome User", "Rua", "NCasa", "Bairro", "Cidade", "Estado", "Cep"
            }
        ));
        jScrollPane1.setViewportView(jTableConta);

        JBAlterar_Conta.setText("Alterar Conta");
        JBAlterar_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterar_ContaActionPerformed(evt);
            }
        });

        JBRemover_Conta.setText("Remover Conta");
        JBRemover_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemover_ContaActionPerformed(evt);
            }
        });

        JBMostrar_Contas.setText("Recarregar");
        JBMostrar_Contas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrar_ContasActionPerformed(evt);
            }
        });

        JBCriar_Conta1.setText("Criar Conta");
        JBCriar_Conta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCriar_Conta1ActionPerformed(evt);
            }
        });

        jBMostrar.setText("Mostrar Conta");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDesktopLayout = new javax.swing.GroupLayout(jpDesktop);
        jpDesktop.setLayout(jpDesktopLayout);
        jpDesktopLayout.setHorizontalGroup(
            jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBCriar_Conta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMostrar_Contas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBAlterar_Conta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBRemover_Conta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMostrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        jpDesktopLayout.setVerticalGroup(
            jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBMostrar_Contas)
                    .addComponent(JBAlterar_Conta)
                    .addComponent(JBRemover_Conta)
                    .addComponent(JBCriar_Conta1)
                    .addComponent(jBMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAlterar_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterar_ContaActionPerformed
        DefaultTableModel tabelaConta = (DefaultTableModel) jTableConta.getModel();

        int rowSelected = jTableConta.getSelectedRow();
        if (rowSelected >= 0) {
            String numeroConta = tabelaConta.getValueAt(rowSelected, 0).toString();
            FormEdit formularioEdit = new FormEdit(numeroConta);
            jpDesktop.add(formularioEdit, getComponentZOrder(this) + 1);
            formularioEdit.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha primeiro");
        }
    }//GEN-LAST:event_JBAlterar_ContaActionPerformed

    private void JBRemover_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemover_ContaActionPerformed
        DefaultTableModel tabelaConta = (DefaultTableModel) jTableConta.getModel();

        int rowSelected = jTableConta.getSelectedRow();
        if (rowSelected >= 0) {
            String numeroConta = tabelaConta.getValueAt(rowSelected, 0).toString();
            try {
                ContaControle.deletar(numeroConta);
                loadTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha primeiro");
        }
    }//GEN-LAST:event_JBRemover_ContaActionPerformed

    private void JBMostrar_ContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrar_ContasActionPerformed
        loadTable();
    }//GEN-LAST:event_JBMostrar_ContasActionPerformed

    private void JBCriar_Conta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCriar_Conta1ActionPerformed
        FormPadrao formulario = new FormPadrao();
        jpDesktop.add(formulario, getComponentZOrder(this) + 1);
        formulario.setVisible(true);
    }//GEN-LAST:event_JBCriar_Conta1ActionPerformed

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
        DefaultTableModel tabelaConta = (DefaultTableModel) jTableConta.getModel();

        int rowSelected = jTableConta.getSelectedRow();
        if (rowSelected >= 0) {
            String numeroConta = tabelaConta.getValueAt(rowSelected, 0).toString();
            ShowCliente formularioEdit = new ShowCliente(numeroConta);
            jpDesktop.add(formularioEdit, getComponentZOrder(this) + 1);
            formularioEdit.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha primeiro");
        }
    }//GEN-LAST:event_jBMostrarActionPerformed

    private void loadTable() {
        DefaultTableModel tabelaConta = (DefaultTableModel) jTableConta.getModel();
        try {
            tabelaConta.setNumRows(0);
            for (ContaModel conta : ContaControle.getAll()) {
                Object[] contaRow = new Object[]{
                    conta.getNumeroConta(),
                    conta.getNomeCliente(),
                    conta.getRua(),
                    conta.getNumeroCasa(),
                    conta.getBairro(),
                    conta.getCidade(),
                    conta.getEstado(),
                    conta.getCep()
                };
                tabelaConta.addRow(contaRow);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar_Conta;
    private javax.swing.JButton JBCriar_Conta1;
    private javax.swing.JButton JBMostrar_Contas;
    private javax.swing.JButton JBRemover_Conta;
    private javax.swing.JButton jBMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConta;
    private javax.swing.JPanel jpDesktop;
    // End of variables declaration//GEN-END:variables
}
