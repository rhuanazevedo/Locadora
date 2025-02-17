/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;


import controller.LocacaoController;
import controller.VeiculoController;
import model.*;
import table_model.CarroTableModel;
import table_model.MotoTableModel;
import table_model.VeiculoTableModel;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class DialogCadastroLocacao extends javax.swing.JDialog {

    LocacaoController controller;
    TelaPrincipal parent;
    Cliente cliente;
    Veiculo veiculo;
    CarroTableModel carroTableModel;
    MotoTableModel motoTableModel;

    public DialogCadastroLocacao(TelaPrincipal parent, boolean modal, LocacaoController controller) {
        super(parent, modal);
        initComponents();

        this.controller = controller;
        this.parent = parent;

        txtDataInicial.setDateFormatString("dd/MM/yyyy");
        txtDataFinal.setDateFormatString("dd/MM/yyyy");
        txtDataInicial.getJCalendar().setWeekOfYearVisible(false);
        txtDataFinal.getJCalendar().setWeekOfYearVisible(false);
        Date date = new Date();

        txtDataInicial.setMinSelectableDate(date);
        txtDataFinal.setEnabled(false);
        System.out.println(txtDataInicial.getDate());

        txtDataInicial.getDateEditor().addPropertyChangeListener("date", evt -> {
            if (txtDataInicial.getDate() != null) {
                // Converte Date para LocalDate

                LocalDate dataInicial = txtDataInicial.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                // Define a data mínima como dataInicial + 1 dia
                LocalDate dataMinima = dataInicial.plusDays(1);
                Date dateMinima = Date.from(dataMinima.atStartOfDay(ZoneId.systemDefault()).toInstant());

                // Habilita o campo e define a data mínima
                txtDataFinal.setEnabled(true);
                txtDataFinal.setDate(null);
                txtDataFinal.setMinSelectableDate(dateMinima);
            } else {
                // Desabilita e limpa o campo Data Final se a Data Inicial for removida
                txtDataFinal.setEnabled(false);
                txtDataFinal.setDate(null);
            }

        });

        txtDataFinal.getDateEditor().addPropertyChangeListener("date", evt -> {
            calcularDiferencaDeDias();
            calcularAluguel();
        });


        carregarCarros();
        carregarMotos();
    }

    private void carregarCarros() {
        List<Carro> carros = (List<Carro>) (List<?>) controller.getByTipoDisponivel("Carro");
        carroTableModel = new CarroTableModel(carros);
        tblVeiculos.setModel(carroTableModel);
        tblVeiculos.updateUI();
    }

    private void carregarMotos() {
        List<Moto> motos = (List<Moto>) (List<?>) controller.getByTipoDisponivel("Moto");
        motoTableModel = new MotoTableModel(motos);
    }

    private void calcularAluguel() {
        if (txtDataFinal.getDate() == null || txtDataInicial.getDate() == null || veiculo == null) {
            return;
        }
        int numDiarias = Integer.parseInt(lblNumDiarias.getText());
        double aluguel = veiculo.getValorDiaria() * numDiarias;

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        lblValor.setText(formatoMoeda.format(aluguel));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoVeiculo = new javax.swing.ButtonGroup();
        painelPrincipalCadastroLocacao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblDataInicial = new javax.swing.JLabel();
        txtDataInicial = new com.toedter.calendar.JDateChooser();
        lblDataFinal = new javax.swing.JLabel();
        txtDataFinal = new com.toedter.calendar.JDateChooser();
        rbCarro = new javax.swing.JRadioButton();
        rbMoto = new javax.swing.JRadioButton();
        TabelaVeiculos = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblNumDiarias = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblNomeCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO LOCACAO");

        painelPrincipalCadastroLocacao.setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Locação");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf.setText("CPF do cliente");

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        lblDataInicial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataInicial.setText("Data Inicial");

        lblDataFinal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataFinal.setText("Data Final");

        bgTipoVeiculo.add(rbCarro);
        rbCarro.setText("Carro");
        rbCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCarroActionPerformed(evt);
            }
        });
        rbCarro.setSelected(true);

        bgTipoVeiculo.add(rbMoto);
        rbMoto.setText("Moto");
        rbMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMotoActionPerformed(evt);
            }
        });

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        tblVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblVeiculos.setRowSelectionAllowed(true);
        tblVeiculos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVeiculos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblVeiculosMouseReleased(evt);
            }
        });
        TabelaVeiculos.setViewportView(tblVeiculos);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Número de Diárias:");

        lblNumDiarias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumDiarias.setText("num");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Valor Total:");

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(51, 153, 0));
        lblValor.setText("R$");

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeCliente.setText("Nome:");

        javax.swing.GroupLayout painelPrincipalCadastroLocacaoLayout = new javax.swing.GroupLayout(painelPrincipalCadastroLocacao);
        painelPrincipalCadastroLocacao.setLayout(painelPrincipalCadastroLocacaoLayout);
        painelPrincipalCadastroLocacaoLayout.setHorizontalGroup(
                painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblCpf))
                                                                .addGap(55, 55, 55)
                                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblDataInicial)
                                                                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblDataFinal))
                                                                .addGap(63, 63, 63)
                                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(rbCarro)
                                                                        .addComponent(rbMoto)))
                                                        .addComponent(TabelaVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(26, 26, 26))
                                        .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblNomeCliente)
                                                        .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(lblNumDiarias))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelPrincipalCadastroLocacaoLayout.setVerticalGroup(
                painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblCpf)
                                                        .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lblDataFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(lblDataInicial)))
                                                .addGap(11, 11, 11)
                                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(painelPrincipalCadastroLocacaoLayout.createSequentialGroup()
                                                .addComponent(rbCarro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rbMoto)))
                                .addGap(16, 16, 16)
                                .addComponent(lblNomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TabelaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(lblNumDiarias))
                                .addGap(18, 18, 18)
                                .addGroup(painelPrincipalCadastroLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(lblValor))
                                .addGap(8, 8, 8)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(painelPrincipalCadastroLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(painelPrincipalCadastroLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCarroActionPerformed
        tblVeiculos.setModel(carroTableModel);
        tblVeiculos.updateUI();
    }//GEN-LAST:event_rbCarroActionPerformed

    private void rbMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMotoActionPerformed
        tblVeiculos.setModel(motoTableModel);
        tblVeiculos.updateUI();
    }//GEN-LAST:event_rbMotoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cliente = controller.getClienteByCpf(txtCpf.getText());
        LocalDate dataInicial = txtDataInicial.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dataFinal = txtDataFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (rbCarro.isSelected()) {
            veiculo = carroTableModel.getCarroAt(tblVeiculos.getSelectedRow());
        } else {
            veiculo = motoTableModel.getMotoAt(tblVeiculos.getSelectedRow());
        }

        Locacao locacao = new Locacao(veiculo, cliente, dataInicial, dataFinal, Double.parseDouble(lblValor.getText()));
        controller.save(locacao);

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
        cliente = controller.getClienteByCpf(txtCpf.getText());
        if (cliente != null) {
            lblNomeCliente.setText("Nome: " + cliente.getNome());
        } else {
            lblNomeCliente.setText("Cliente não encontrado");
        }
    }//GEN-LAST:event_txtCpfKeyReleased

    private void tblVeiculosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeiculosMouseReleased
        if (tblVeiculos.getSelectedRow() == -1) return;
        if (rbCarro.isSelected()) {
            veiculo = carroTableModel.getCarroAt(tblVeiculos.getSelectedRow());
        } else {
            veiculo = motoTableModel.getMotoAt(tblVeiculos.getSelectedRow());
        }
        calcularAluguel();
    }//GEN-LAST:event_tblVeiculosMouseReleased

    private void calcularDiferencaDeDias() {
        if (txtDataInicial.getDate() != null && txtDataFinal.getDate() != null) {
            LocalDate dataInicial = txtDataInicial.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate dataFinal = txtDataFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Calcular a diferença de dias
            long diferenca = ChronoUnit.DAYS.between(dataInicial, dataFinal);
            lblNumDiarias.setText(String.valueOf(diferenca));
        } else {
            // Se alguma data não estiver preenchida, exibir uma mensagem padrão
            lblNumDiarias.setText("Selecione as datas");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TabelaVeiculos;
    private javax.swing.ButtonGroup bgTipoVeiculo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicial;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNumDiarias;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painelPrincipalCadastroLocacao;
    private javax.swing.JRadioButton rbCarro;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtDataFinal;
    private com.toedter.calendar.JDateChooser txtDataInicial;
    // End of variables declaration//GEN-END:variables
}
