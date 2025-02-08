/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ClienteController;
import model.Cliente;
import table_model.ClienteTableModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TelaPrincipal extends javax.swing.JFrame {

    private ClienteController clienteController;
    private ClienteTableModel clienteTableModel;

    public TelaPrincipal() {
        initComponents();
        clienteController = new ClienteController();
        carregarClientes(); // Carrega os clientes ao iniciar
    }

    private void carregarClientes() {
        List<Cliente> clientes = clienteController.getAll();
        clienteTableModel = new ClienteTableModel(clientes);
        tableCliente.setModel(clienteTableModel);

    }

    public void addCliente(Cliente cliente) {
        this.clienteTableModel.addCliente(cliente);
        this.tableCliente.updateUI();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelLocacao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLocacao = new javax.swing.JTable();
        btnCadastroLocacao = new javax.swing.JButton();
        painelVeiculo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVeiculos = new javax.swing.JTable();
        btnCadastroVeiculo = new javax.swing.JButton();
        painelCliente = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        btnCadastroCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                    "Nome", "CPF", "Telefone", "Data de Nascimento"
            }
        ));
        jScrollPane1.setViewportView(tableLocacao);

        btnCadastroLocacao.setText("CADASTRAR");
        btnCadastroLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroLocacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLocacaoLayout = new javax.swing.GroupLayout(painelLocacao);
        painelLocacao.setLayout(painelLocacaoLayout);
        painelLocacaoLayout.setHorizontalGroup(
            painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocacaoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastroLocacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        painelLocacaoLayout.setVerticalGroup(
            painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocacaoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnCadastroLocacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Locação", painelLocacao);

        tableVeiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableVeiculos);

        btnCadastroVeiculo.setText("CADASTRAR");
        btnCadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVeiculoLayout = new javax.swing.GroupLayout(painelVeiculo);
        painelVeiculo.setLayout(painelVeiculoLayout);
        painelVeiculoLayout.setHorizontalGroup(
            painelVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVeiculoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(painelVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastroVeiculo)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        painelVeiculoLayout.setVerticalGroup(
            painelVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVeiculoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnCadastroVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Veículos", painelVeiculo);

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableCliente);

        btnCadastroCliente.setText("CADASTRAR");
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastroCliente)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnCadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", painelCliente);

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        DialogCadastroCliente cadastro = new DialogCadastroCliente(this, true, clienteController);
        cadastro.setLocationRelativeTo(this);
        cadastro.setVisible(true); 
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    private void btnCadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroVeiculoActionPerformed
        DialogCadastroVeiculo cadastro = new DialogCadastroVeiculo(this, true);
        cadastro.setLocationRelativeTo(this);
        cadastro.setVisible(true); 
    }//GEN-LAST:event_btnCadastroVeiculoActionPerformed

    private void btnCadastroLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroLocacaoActionPerformed
        DialogCadastroLocacao cadastro = new DialogCadastroLocacao(this, true);
        cadastro.setLocationRelativeTo(this);
        cadastro.setVisible(true); 
    }//GEN-LAST:event_btnCadastroLocacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JButton btnCadastroLocacao;
    private javax.swing.JButton btnCadastroVeiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JPanel painelLocacao;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelVeiculo;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTable tableLocacao;
    private javax.swing.JTable tableVeiculos;
    // End of variables declaration//GEN-END:variables
}
