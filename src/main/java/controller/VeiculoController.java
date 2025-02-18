package controller;

import model.Veiculo;
import repository.VeiculoRepository;

import java.time.LocalDate;
import java.util.List;

public class VeiculoController {
    private VeiculoRepository repository = new VeiculoRepository();

    public List<Veiculo> getAll() {
        return repository.getAll();
    }

    public void save(Veiculo veiculo) {
        repository.save(veiculo);
    }

    public List<Veiculo> getByTipoDisponivel(String tipo, LocalDate dataInicio, LocalDate dataFim) {
        return repository.getByTipoDisponivel(tipo, dataInicio, dataFim);
    }

    public void alterarDisponibilidade(int id, boolean disponibilidade) {
        repository.alterarDisponibilidade(id, disponibilidade);
    }

}
