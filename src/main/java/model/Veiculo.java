package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_veiculo", discriminatorType = DiscriminatorType.STRING)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Gerar id automaticamente
    @Column(name = "veiculo_id", nullable = false)
    protected int id;
    protected String placa;
    protected String modelo;
    protected String categoria;
    protected int quantidade;
    protected int ano;
    protected boolean disponivel;
    protected double valorDiaria;

    @OneToMany(mappedBy = "veiculo", cascade = CascadeType.REMOVE)
    protected List<Locacao> locacoes;


    public Veiculo(String placa, String modelo, String categoria, int ano, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.categoria = categoria;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.locacoes = new ArrayList<>();
        this.disponivel = true;
    }

    protected void alterarDisponibilidade() {
        disponivel = !disponivel;
    }

}
