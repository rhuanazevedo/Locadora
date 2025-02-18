package table_model;

import model.Locacao;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class LocacaoTableModel extends AbstractTableModel {
    private final String[] colunas = {"CPF", "Nome", "Modelo", "Placa", "Aluguel Total", "Data Inicial", "Data Final", "Ativo"};
    private List<Locacao> locacoes;

    public LocacaoTableModel(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    @Override
    public int getRowCount() {
        return locacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Locacao locacao = locacoes.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> locacao.getCliente().getCpf();
            case 1 -> locacao.getCliente().getNome();
            case 2 -> locacao.getVeiculo().getModelo();
            case 3 -> locacao.getVeiculo().getPlaca();
            case 4 -> locacao.getValorTotal();
            case 5 -> locacao.getDataLocacao();
            case 6 -> locacao.getDataDevolucao();
            case 7 -> locacao.isAtivo() ? "Sim" : "Não";
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public Locacao getLocacaoAt(int row) {
        return locacoes.get(row);
    }

    public void setLocacaoInativaAt(int row) {
        locacoes.get(row).setAtivo(false);
        fireTableDataChanged();
    }

    public void atualizarLista(List<Locacao> locacoes) {
        this.locacoes = locacoes;
        fireTableDataChanged();
    }

    public void addLocacao(Locacao locacao) {
        this.locacoes.add(locacao);
    }
}
