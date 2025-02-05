package model;

public class Moto extends Veiculo{
    private int cilindrada;
    private boolean possuiBau;

    public Moto(String placa, String modelo, String categoria, int quantidade, int ano, double valorDiaria) {
        super(placa, modelo, categoria, quantidade, ano, valorDiaria);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }
}
