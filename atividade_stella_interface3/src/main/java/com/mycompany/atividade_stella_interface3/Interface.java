/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atividade_stella_interface3;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    
    String nome, situacao, disciplina;
    double nota1, nota2, nota3, media;
    
    public Interface() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtnota1 = new javax.swing.JLabel();
        txtnota2 = new javax.swing.JLabel();
        txtnota3 = new javax.swing.JLabel();
        txtmedia = new javax.swing.JLabel();
        txtsituacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabela = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton_fechar_nota = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();
        jnome = new javax.swing.JTextField();
        jnota1 = new javax.swing.JTextField();
        jnota2 = new javax.swing.JTextField();
        jnota3 = new javax.swing.JTextField();
        jmedia = new javax.swing.JTextField();
        jsituacao = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtnota1.setText("Nota A1:");

        txtnota2.setText("Nota A2:");

        txtnota3.setText("Nota A3:");

        txtmedia.setText("Média:");

        txtsituacao.setText("Situação:");

        jLabel1.setText("Nome do Aluno:");

        jtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Disciplina", "A1", "A2", "A3", "Média", "Situação"
            }
        ));
        jtabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtabela);
        if (jtabela.getColumnModel().getColumnCount() > 0) {
            jtabela.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jtabela.getColumnModel().getColumn(1).setHeaderValue("Disciplina");
            jtabela.getColumnModel().getColumn(1).setCellEditor(null);
            jtabela.getColumnModel().getColumn(2).setHeaderValue("A1");
            jtabela.getColumnModel().getColumn(3).setHeaderValue("A2");
            jtabela.getColumnModel().getColumn(4).setHeaderValue("A3");
            jtabela.getColumnModel().getColumn(5).setHeaderValue("Média");
            jtabela.getColumnModel().getColumn(6).setHeaderValue("Situação");
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Linguagem de Programação", "Banco de Dados", "Big Data", "Redes de Computadores" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton_fechar_nota.setText("Fechar Notas");
        jButton_fechar_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_fechar_notaActionPerformed(evt);
            }
        });

        jButton_limpar.setText("Limpar");
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jnota1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnota3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmedia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_fechar_nota)
                                .addGap(74, 74, 74)
                                .addComponent(jButton_limpar)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnota2)
                                    .addComponent(txtnota3)
                                    .addComponent(txtmedia)
                                    .addComponent(txtsituacao)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jnome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnota1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnota1)
                    .addComponent(jnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnota2)
                    .addComponent(jnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnota3)
                    .addComponent(jnota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmedia)
                    .addComponent(jmedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsituacao)
                    .addComponent(jsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_fechar_nota)
                    .addComponent(jButton_limpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       // Fiz com a variavel disciplina recebesse o valor
       // de Jcombox1 e convertesse ele para string
        disciplina = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton_fechar_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_fechar_notaActionPerformed
        // TODO add your handling code here:
        nome = (jnome.getText());
      // situacao = (jsituacao.getText());
        nota1 = Double.parseDouble(jnota1.getText());
        nota2 = Double.parseDouble(jnota2.getText());
        nota3 = Double.parseDouble(jnota3.getText());
        
        
        media = (nota1 + nota2 + nota3) / 3;
        
        jmedia.setText(Double.toString(media));  
        //comando if para fazer a comparação de valor
        //se caso a media for maior ou igual que 70 o aluno está aprovado
        if (media >= 70){
            //comando jsituacao.setTex para fazer com que a
            //a textfild receba o valor aprovado e reprovado
            situacao = ("Aprovado! ");
        }
        if(media <= 69.99){
            situacao = ( "Reprovado! ");
        }
        jsituacao.setText(situacao);

        //aqui coloquei a configuração da minha tabela 
        DefaultTableModel nota_aluno = (DefaultTableModel)jtabela.getModel();
        Object[] aluno;
        aluno = new Object[]{
            nome,
            disciplina,
            nota1,
            nota2,
            nota3,
            media,
            situacao
            };
        nota_aluno.addRow(aluno);
                      
    }//GEN-LAST:event_jButton_fechar_notaActionPerformed

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed
        // TODO add your handling code here:
        
        jnome.setText("");
        jnota1.setText("");
        jnota2.setText("");
        jnota3.setText("");
        jsituacao.setText("");
        jmedia.setText("");
        
    }//GEN-LAST:event_jButton_limparActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_fechar_nota;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jmedia;
    private javax.swing.JTextField jnome;
    private javax.swing.JTextField jnota1;
    private javax.swing.JTextField jnota2;
    private javax.swing.JTextField jnota3;
    private javax.swing.JTextField jsituacao;
    private javax.swing.JTable jtabela;
    private javax.swing.JLabel txtmedia;
    private javax.swing.JLabel txtnota1;
    private javax.swing.JLabel txtnota2;
    private javax.swing.JLabel txtnota3;
    private javax.swing.JLabel txtsituacao;
    // End of variables declaration//GEN-END:variables
}