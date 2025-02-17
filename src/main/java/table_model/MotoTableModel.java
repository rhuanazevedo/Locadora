package table_model;

import model.Moto;
import model.Veiculo;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MotoTableModel extends AbstractTableModel {

    private final List<Moto> motos;
    private final String[] colunas = {"Placa", "Modelo", "Categoria", "Quantidade", "Ano", "Disponível", "Valor Diária", "Cilindrada", "Possui Baú"};

    public MotoTableModel(List<Moto> motos) {
        this.motos = motos;
    }

    @Override
    public int getRowCount() {
        return motos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Moto moto = motos.get(rowIndex);

        switch (columnIndex) {
            case 0: return moto.getPlaca();
            case 1: return moto.getModelo();
            case 2: return moto.getCategoria();
            case 3: return moto.getQuantidade();
            case 4: return moto.getAno();
            case 5: return moto.isDisponivel();
            case 6: return moto.getValorDiaria();
            case 7: return moto.getCilindrada();
            case 8: return moto.isPossuiBau();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    // Métodos para manipular a tabela
    public void addMoto(Moto moto) {
        motos.add(moto);
        fireTableRowsInserted(motos.size() - 1, motos.size() - 1);
    }

    public void removeMoto(int index) {
        motos.remove(index);
        fireTableRowsDeleted(index, index);
    }

    public void updateMoto(int index, Moto moto) {
        motos.set(index, moto);
        fireTableRowsUpdated(index, index);
    }

    public Moto getMotoAt(int selectedRow) {
        return motos.get(selectedRow);
    }
}
