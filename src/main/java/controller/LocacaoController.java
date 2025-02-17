package controller;

import model.Cliente;
import model.Locacao;
import model.Veiculo;
import repository.LocacaoRepository;

import java.util.List;

public class LocacaoController {
    private LocacaoRepository repository = new LocacaoRepository();
    private ClienteController clienteController = new ClienteController();
    private VeiculoController veiculoController = new VeiculoController();

    public Cliente getClienteByCpf(String cpf) {
        return clienteController.getByCpf(cpf);
    }

    public List<Veiculo> getByTipoDisponivel(String tipo) {
        return veiculoController.getByTipoDisponivel(tipo);
    }

    public void save(Locacao locacao) {
        repository.save(locacao);
    }

    public List<Locacao> getALl() {
        return repository.getAll();
    }

    public List<Locacao> getLocacoesAtivas() {
        return repository.getAllAtivas();
    }
}
