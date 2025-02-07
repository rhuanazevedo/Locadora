package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Locacao {
    @Id
    @Column(name = "locacao_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private double valorDiaria;
    private boolean ativo;



    private double calculoValorLocacao(){
        return valorDiaria * ChronoUnit.DAYS.between(dataLocacao, dataDevolucao);
    }
}
