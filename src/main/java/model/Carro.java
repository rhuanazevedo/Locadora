package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("Carro")
public class Carro extends Veiculo {
    private int numPortas;
    private boolean arCondicionado;

    public Carro(String placa, String modelo, String categoria, int ano, double valorDiaria, int numPortas, boolean arCondicionado) {
        super(placa, modelo, categoria, ano, valorDiaria);
        this.numPortas = numPortas;
        this.arCondicionado = arCondicionado;
    }
}