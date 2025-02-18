package table_model;

import model.Carro;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CarroTableModel extends AbstractTableModel {

    private List<Carro> carros;
    private final String[] colunas = {"Placa", "Modelo", "Categoria", "Ano", "Valor Diária", "Número de Portas", "Ar Condicionado"};

    public CarroTableModel(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public int getRowCount() {
        return carros.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Carro carro = carros.get(rowIndex);

        switch (columnIndex) {
            case 0: return carro.getPlaca();
            case 1: return carro.getModelo();
            case 2: return carro.getCategoria();
            case 3: return carro.getAno();
            case 4: return carro.getValorDiaria();
            case 5: return carro.getNumPortas();
            case 6: return carro.isArCondicionado() ? "Sim" : "Não";
            default: return null;
        }
    }

    public Carro getCarroAt(int rowIndex) {
        return carros.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    // Métodos para manipular a tabela
    public void addCarro(Carro carro) {
        carros.add(carro);
        fireTableRowsInserted(carros.size() - 1, carros.size() - 1);
    }

    public void removeCarro(int index) {
        carros.remove(index);
        fireTableRowsDeleted(index, index);
    }

    public void updateCarro(int index, Carro carro) {
        carros.set(index, carro);
        fireTableRowsUpdated(index, index);
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
