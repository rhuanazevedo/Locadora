package table_model;


import model.Cliente;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ClienteTableModel extends AbstractTableModel {
    private final String[] colunas = {"Nome", "CPF", "Telefone", "Data de Nascimento"};
    private List<Cliente> clientes;

    public ClienteTableModel(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> cliente.getNome();
            case 1 -> cliente.getCpf();
            case 2 -> cliente.getTelefone();
            case 3 -> cliente.getDataNascimento();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void atualizarLista(List<Cliente> clientes) {
        this.clientes = clientes;
        fireTableDataChanged();
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}

