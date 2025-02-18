package controller;

import model.Cliente;
import model.Locacao;
import model.Veiculo;
import repository.LocacaoRepository;

import java.time.LocalDate;
import java.util.List;

public class LocacaoController {
    private LocacaoRepository repository = new LocacaoRepository();
    private ClienteController clienteController = new ClienteController();
    private VeiculoController veiculoController = new VeiculoController();

    public Cliente getClienteByCpf(String cpf) {
        return clienteController.getByCpf(cpf);
    }

    public List<Veiculo> getByTipoDisponivel(String tipo, LocalDate dataInicial, LocalDate dataFinal) {
        return veiculoController.getByTipoDisponivel(tipo, dataInicial, dataFinal);
    }

    public void save(Locacao locacao) {
        repository.save(locacao);
        veiculoController.alterarDisponibilidade(locacao.getVeiculo().getId(), false);
    }

    public List<Locacao> getALl() {
        return repository.getAll();
    }

    public List<Locacao> getLocacoesAtivas() {
        return repository.getAllAtivas();
    }

    public List<Locacao> buscarLocacoes(String cpf, String placa) {
        return repository.findByCpfAndPlaca(cpf, placa);
    }

    public void finalizarLocacao(Locacao locacaoASerFinalizada) {
        repository.alterarStatusAtivo(locacaoASerFinalizada.getId(), false);
    }
}
