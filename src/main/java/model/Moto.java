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
@DiscriminatorValue("Moto")
public class Moto extends Veiculo{
    private int cilindrada;
    private boolean possuiBau;

    public Moto(String placa, String modelo, String categoria, int ano, double valorDiaria, int cilindrada, boolean possuiBau) {
        super(placa, modelo, categoria, ano, valorDiaria);
        this.cilindrada = cilindrada;
        this.possuiBau = possuiBau;
    }
}
