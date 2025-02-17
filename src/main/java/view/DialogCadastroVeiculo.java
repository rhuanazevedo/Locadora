/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.VeiculoController;
import model.Carro;
import model.Moto;
import model.Veiculo;

import javax.swing.*;


public class DialogCadastroVeiculo extends javax.swing.JDialog {

    VeiculoController controller;
    TelaPrincipal parent;

    public DialogCadastroVeiculo(TelaPrincipal parent, boolean modal,VeiculoController controller) {
        super(parent, modal);
        initComponents();

        this.parent = parent;
        this.controller = controller;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        bgTipoVeiculo = new javax.swing.ButtonGroup();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        rbtnCarro = new javax.swing.JRadioButton();
        rbtnMoto = new javax.swing.JRadioButton();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca1 = new javax.swing.JTextField();
        lblValorDiaria = new javax.swing.JLabel();
        txtValorDiaria = new javax.swing.JTextField();
        lblPortaCilindrada = new javax.swing.JLabel();
        txtPortaCilindrada = new javax.swing.JTextField();
        lblCB = new javax.swing.JLabel();
        cbBoolean = new javax.swing.JComboBox<>();
        btnCadastrar1 = new javax.swing.JButton();

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Veículo");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblModelo.setText("Modelo");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        lblAno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAno.setText("Ano");

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCategoria.setText("Modelo");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Sedan", "SUV", "Picape", "Compacto", "Utilitário"}));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade.setText("Quantidade");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        bgTipoVeiculo.add(rbtnCarro);
        rbtnCarro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtnCarro.setText("Carro");
        rbtnCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCarroActionPerformed(evt);
            }
        });
        rbtnCarro.setSelected(true);
        atualizarComboBox("Carro");

        bgTipoVeiculo.add(rbtnMoto);
        rbtnMoto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtnMoto.setText("Moto");
        rbtnMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMotoActionPerformed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlaca.setText("Placa");

        txtPlaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca1ActionPerformed(evt);
            }
        });

        lblValorDiaria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValorDiaria.setText("Valor da Diária");

        txtValorDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorDiariaActionPerformed(evt);
            }
        });

        lblPortaCilindrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPortaCilindrada.setText("Num. Portas");

        txtPortaCilindrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortaCilindradaActionPerformed(evt);
            }
        });

        lblCB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCB.setText("Possui Ar-condicionado");

        cbBoolean.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Sim", "Não"}));
        cbBoolean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBooleanActionPerformed(evt);
            }
        });

        btnCadastrar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar1.setText("CADASTRAR");
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblModelo))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblAno)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(rbtnCarro)
                                                                .addGap(68, 68, 68)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblCategoria)
                                                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblPlaca))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblValorDiaria))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPortaCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblPortaCilindrada)
                                                        .addComponent(rbtnMoto))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lblCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cbBoolean, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbtnCarro)
                                        .addComponent(rbtnMoto))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblModelo)
                                        .addComponent(lblCategoria)
                                        .addComponent(lblQuantidade)
                                        .addComponent(lblAno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblValorDiaria)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblPlaca)
                                                .addComponent(lblCB)
                                                .addComponent(lblPortaCilindrada)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPortaCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbBoolean, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtPlaca1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtValorDiariaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtPortaCilindradaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        String modelo = txtModelo.getText();
        String placa = txtPlaca1.getText();
        String categoria = cbCategoria.getSelectedItem().toString();
        int ano = Integer.parseInt(txtAno.getText());
        double valorDiaria = Double.parseDouble(txtValorDiaria.getText());
        Veiculo veiculo;

        if (rbtnCarro.isSelected()) {
            int nPorta = Integer.parseInt(txtPortaCilindrada.getText());
            boolean possuiAc = cbBoolean.getSelectedItem().toString().equalsIgnoreCase("sim");
            veiculo = new Carro(placa, modelo, categoria, ano, valorDiaria, nPorta, possuiAc);

        } else {
            int cilindrada = Integer.parseInt(txtPortaCilindrada.getText());
            boolean possuiBau = cbBoolean.getSelectedItem().toString().equalsIgnoreCase("sim");
            veiculo = new Moto(placa, modelo, categoria, ano, valorDiaria, cilindrada, possuiBau);
        }
        controller.save(veiculo);

        limparCampos();
        parent.addVeiculo(veiculo);

        JOptionPane.showMessageDialog(this, "Veículo cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

    }

    private void limparCampos() {
        txtModelo.setText("");
        txtPlaca1.setText("");
        txtAno.setText("");
        txtValorDiaria.setText("");
        txtPortaCilindrada.setText("");
        txtQuantidade.setText("");
        cbCategoria.setSelectedIndex(0);
        cbBoolean.setSelectedIndex(0);
    }


    private void cbBooleanActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void rbtnCarroActionPerformed(java.awt.event.ActionEvent evt) {
        atualizarComboBox("Carro");
    }

    private void rbtnMotoActionPerformed(java.awt.event.ActionEvent evt) {
        atualizarComboBox("Moto");
    }

    private void atualizarComboBox(String tipo) {
        DefaultComboBoxModel<String> model;

        if (tipo.equals("Carro")) {
            lblCB.setText("Possui AC:");
            lblPortaCilindrada.setText("Nº de Portas: ");
            model = new DefaultComboBoxModel<>(new String[]{"Sedã", "Hatch", "SUV"});
        } else {
            lblCB.setText("Possui Baú:");
            lblPortaCilindrada.setText("Cilindrada: ");
            model = new DefaultComboBoxModel<>(new String[]{"Esportiva", "Custom", "Scooter"});
        }
        cbCategoria.setModel(model);
    }


    // Variables declaration - do not modify
    private javax.swing.ButtonGroup bgTipoVeiculo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JComboBox<String> cbBoolean;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCB;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPortaCilindrada;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorDiaria;
    private javax.swing.JRadioButton rbtnCarro;
    private javax.swing.JRadioButton rbtnMoto;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca1;
    private javax.swing.JTextField txtPortaCilindrada;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorDiaria;
    // End of variables declaration
}