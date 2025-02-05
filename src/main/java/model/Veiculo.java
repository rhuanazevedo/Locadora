package model;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected String categoria;
    protected int quantidade;
    protected int ano;
    protected boolean disponivel;
    protected double valorDiaria;

    public Veiculo(String placa, String modelo, String categoria, int quantidade, int ano, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        boolean disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void alterarDisponibilidade(){
        this.setDisponivel(!this.isDisponivel());
    }

}
