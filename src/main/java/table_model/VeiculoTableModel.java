package table_model;

import model.Carro;
import model.Moto;
import model.Veiculo;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class VeiculoTableModel extends AbstractTableModel {

    private final List<Veiculo> veiculos;
    private final String[] colunas = {"Placa", "Modelo", "Categoria", "Ano", "Valor Diária", "Cilindrada", "Possui Baú", "Número de Portas", "Ar Condicionado"};

    public VeiculoTableModel(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public int getRowCount() {
        return veiculos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo veiculo = veiculos.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return veiculo.getPlaca();
            case 1:
                return veiculo.getModelo();
            case 2:
                return veiculo.getCategoria();
            case 3:
                return veiculo.getAno();
            case 4:
                return veiculo.getValorDiaria();
            case 5:
                if (veiculo instanceof Moto) {
                    return ((Moto) veiculo).getCilindrada();
                } else {
                    return null;
                }
            case 6:
                if (veiculo instanceof Moto) {
                    return ((Moto) veiculo).isPossuiBau() ? "Sim" : "Não";
                } else {
                    return null;
                }
            case 7:
                if (veiculo instanceof Carro) {
                    return ((Carro) veiculo).getNumPortas();
                } else {
                    return null;
                }
            case 8:
                if (veiculo instanceof Carro) {
                    return ((Carro) veiculo).isArCondicionado() ? "Sim" : "Não";
                } else {
                    return null;
                }
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public String[] getColunas() {
        return colunas;
    }

    // Método para adicionar um novo veículo ao modelo
    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        fireTableRowsInserted(veiculos.size() - 1, veiculos.size() - 1);
    }

    // Método para remover um veículo do modelo
    public void removeVeiculo(int index) {
        veiculos.remove(index);
        fireTableRowsDeleted(index, index);
    }

    // Método para atualizar o modelo
    public void updateVeiculo(int index, Veiculo veiculo) {
        veiculos.set(index, veiculo);
        fireTableRowsUpdated(index, index);
    }
}
