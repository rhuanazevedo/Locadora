package model;

public class Carro extends Veiculo {
    private int numPortas;
    private boolean arCondicionado;

    public Carro(String placa, String modelo, String categoria, int quantidade, int ano, double valorDiaria) {
        super(placa, modelo, categoria, quantidade, ano, valorDiaria);
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

}