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
    private double valorTotal;
    private boolean ativo;

    public Locacao(Veiculo veiculo, Cliente cliente, LocalDate dataLocacao, LocalDate dataDevolucao, double valorTotal) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.ativo = true;
    }

}