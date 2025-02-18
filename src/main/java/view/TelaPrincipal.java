/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ClienteController;
import controller.LocacaoController;
import controller.VeiculoController;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Cliente;
import model.Locacao;
import model.Veiculo;
import table_model.ClienteTableModel;
import table_model.LocacaoTableModel;
import table_model.VeiculoTableModel;

import javax.swing.*;
import java.util.List;
import java.util.Random;


public class TelaPrincipal extends javax.swing.JFrame {

    private final ClienteController clienteController;
    private ClienteTableModel clienteTableModel;

    private final VeiculoController veiculoController;
    private VeiculoTableModel veiculoTableModel;

    private final LocacaoController locacaoController;
    private LocacaoTableModel locacaoTableModel;

    public TelaPrincipal() {
        initComponents();
        locacaoController = new LocacaoController();
        carregarLocacoes();
        clienteController = new ClienteController();
        carregarClientes();
        veiculoController = new VeiculoController();
        carregarVeiculos();
    }

    private void carregarLocacoes() {
        List<Locacao> locacoes = locacaoController.getALl();
        locacaoTableModel = new LocacaoTableModel(locacoes);
        tableLocacao.setModel(locacaoTableModel);
    }

    private void carregarClientes() {
        List<Cliente> c = new ArrayList<>();
        String[] nomes = {"João", "Maria", "Carlos", "Ana", "Pedro", "Juliana", "Marcos", "Camila", "Fernando", "Bianca",
                "Rafael", "Larissa", "Lucas", "Fernanda", "Tiago", "Aline", "Eduardo", "Paula", "Ricardo", "Sofia"};

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String nome = nomes[i];
            String cpf = gerarCPF();
            String telefone = "(11) 9" + (random.nextInt(90000) + 10000) + "-" + (random.nextInt(9000) + 1000);
            LocalDate dataNascimento = LocalDate.of(random.nextInt(30) + 1970, random.nextInt(12) + 1, random.nextInt(28) + 1);

            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setTelefone(telefone);
            cliente.setDataNascimento(dataNascimento);

            clienteController.save(cliente);
        }

        List<Cliente> clientes = clienteController.getAll();
        clienteTableModel = new ClienteTableModel(clientes);
        tableCliente.setModel(clienteTableModel);
    }

    public void addCliente(Cliente cliente) {
        this.clienteTableModel.addCliente(cliente);
        this.tableCliente.updateUI();
    }

    public void addLocacao(Locacao locacao){
        this.locacaoTableModel.addLocacao(locacao);
        this.tableLocacao.updateUI();
    }

    private void carregarVeiculos() {
        List<Veiculo> veiculos = veiculoController.getAll();
        veiculoTableModel = new VeiculoTableModel(veiculos);
        tableVeiculos.setModel(veiculoTableModel);
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculoTableModel.addVeiculo(veiculo);
        this.tableVeiculos.updateUI();
    }


    private String gerarCPF() {
        Random random = new Random();
        return random.nextInt(900) + 100 + "." +
                random.nextInt(900) + 100 + "." +
                random.nextInt(900) + 100 + "-" +
                random.nextInt(90) + 10;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelLocacao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLocacao = new javax.swing.JTable();
        btnCadastroLocacao = new javax.swing.JButton();
        btnFinalizarLocacao = new javax.swing.JButton();
        txtCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
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
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        tableLocacao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableLocacao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableLocacao);

        btnCadastroLocacao.setText("CADASTRAR");
        btnCadastroLocacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastroLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroLocacaoActionPerformed(evt);
            }
        });

        btnFinalizarLocacao.setText("FINALIZAR");
        btnFinalizarLocacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarLocacaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CPF do cliente");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Placa do veículo:");

        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.MatteBorder(null));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLocacaoLayout = new javax.swing.GroupLayout(painelLocacao);
        painelLocacao.setLayout(painelLocacaoLayout);
        painelLocacaoLayout.setHorizontalGroup(
                painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelLocacaoLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painelLocacaoLayout.createSequentialGroup()
                                                .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(27, 27, 27)
                                                .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(painelLocacaoLayout.createSequentialGroup()
                                                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnFinalizarLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCadastroLocacao)))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        painelLocacaoLayout.setVerticalGroup(
                painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelLocacaoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painelLocacaoLayout.createSequentialGroup()
                                                        .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jLabel2))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(btnFinalizarLocacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnCadastroLocacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
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
        btnCadastroVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                                .addContainerGap(36, Short.MAX_VALUE))
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
        btnCadastroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                                .addContainerGap(36, Short.MAX_VALUE))
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
    }// </editor-fold>

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {
        DialogCadastroCliente cadastro = new DialogCadastroCliente(this, true, clienteController);
        cadastro.setLocationRelativeTo(this);
        cadastro.setVisible(true);
    }

    private void btnCadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {
        DialogCadastroVeiculo cadastro = new DialogCadastroVeiculo(this, true, veiculoController);
        cadastro.setLocationRelativeTo(this);
        cadastro.setVisible(true);
    }

    private void btnCadastroLocacaoActionPerformed(java.awt.event.ActionEvent evt) {
        DialogCadastroLocacao cadastro = new DialogCadastroLocacao(this, true, locacaoController);
        cadastro.setLocationRelativeTo(this);
        cadastro.setVisible(true);
    }

    private void btnFinalizarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {
        int indexSelectedRow = tableLocacao.getSelectedRow();
        if(indexSelectedRow == -1) return;

        int opt = JOptionPane.showConfirmDialog(this, "Deseja finalizar a Locação", "!", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            Locacao locacaoASerFinalizada = locacaoTableModel.getLocacaoAt(indexSelectedRow);
            locacaoController.finalizarLocacao(locacaoASerFinalizada);
            locacaoTableModel.setLocacaoInativaAt(indexSelectedRow);
            JOptionPane.showMessageDialog(null, "Locação finalizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ação cancelada.");
        }


    }


    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        locacaoTableModel.atualizarLista(
                locacaoController.buscarLocacoes(txtCpf.getText(), txtPlaca.getText())
        );
        tableLocacao.updateUI();
    }


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

    // Variables declaration - do not modify
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JButton btnCadastroLocacao;
    private javax.swing.JButton btnCadastroVeiculo;
    private javax.swing.JButton btnFinalizarLocacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration
}
