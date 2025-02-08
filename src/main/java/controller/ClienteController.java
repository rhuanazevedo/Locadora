package controller;

import model.Cliente;
import repository.ClienteRepository;

import java.util.List;

public class ClienteController {
    private ClienteRepository repository = new ClienteRepository();

    public List<Cliente> getAll() {
        return repository.getAll();
    }

    public void save(Cliente cliente) {
        repository.save(cliente);
    }
}
