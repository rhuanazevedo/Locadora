package controller;

import model.Veiculo;
import repository.VeiculoRepository;

import java.util.List;

public class VeiculoController {
    private VeiculoRepository repository = new VeiculoRepository();

    public List<Veiculo> getAll() {
        return repository.getAll();
    }

    public void save(Veiculo veiculo) {
        repository.save(veiculo);
    }

    public List<Veiculo> getByTipoDisponivel(String tipo) {
        return repository.getByTipoDisponivel(tipo);
    }

    public void alterarDisponibilidade(int id, boolean disponibilidade) {
        repository.alterarDisponibilidade(id, disponibilidade);
    }

}
