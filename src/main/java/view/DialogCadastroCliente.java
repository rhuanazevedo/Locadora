/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.ClienteController;
import model.Cliente;

import javax.swing.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author henri
 */
public class DialogCadastroCliente extends javax.swing.JDialog {

    ClienteController controller;
    TelaPrincipal parent;

    public DialogCadastroCliente(TelaPrincipal parent, boolean modal, ClienteController controller) {
        super(parent, modal);
        initComponents();

        this.parent = parent;
        this.controller = controller;

        txtDataNascimento.setDateFormatString("dd/MM/yyyy");
        txtDataNascimento.getJCalendar().setWeekOfYearVisible(false);
        Date date;
        date = Date.from(LocalDate.now().minusYears(18).atStartOfDay(ZoneId.systemDefault()).toInstant());
        txtDataNascimento.setMaxSelectableDate(date);
        txtDataNascimento.setDate(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        painelPrincipalCadastroCliente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDataNascimento = new com.toedter.calendar.JDateChooser();
        btnCadastrar = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO CLIENTE");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Cliente");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("CPF:");

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Telefone");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Data de Nascimento");

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);


        String caminhoImagem = "src/main/java/imgs/cliente.png";
        File arquivo = new File(caminhoImagem);

        if (arquivo.exists()) {
            lblImg.setIcon(new ImageIcon(arquivo.getAbsolutePath()));
        } else {
            System.out.println("Imagem não encontrada!");
        }

        lblImg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefone)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome)
                            .addComponent(jLabel4))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout painelPrincipalCadastroClienteLayout = new javax.swing.GroupLayout(painelPrincipalCadastroCliente);
        painelPrincipalCadastroCliente.setLayout(painelPrincipalCadastroClienteLayout);
        painelPrincipalCadastroClienteLayout.setHorizontalGroup(
            painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalCadastroClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelPrincipalCadastroClienteLayout.setVerticalGroup(
            painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalCadastroClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPrincipalCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // Pegando valores dos campos de texto
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String telefone = txtTelefone.getText().trim();
        Date dataNasc = txtDataNascimento.getDate();

        // Validação para evitar campos vazios
        if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || dataNasc == null) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Formatando data para dd/MM/yyyy
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(dataNasc);

        Cliente cliente = new Cliente(nome, cpf, telefone, dataNasc.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        controller.save(cliente);

        parent.addCliente(cliente);

        // Limpando os campos após cadastro
        limparCampos();

        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtDataNascimento.setDate(null);
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
            java.util.logging.Logger.getLogger(DialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel painelPrincipalCadastroCliente;
    private javax.swing.JTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtDataNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
