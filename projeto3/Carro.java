package projeto3;

import java.util.Objects;

public class Carro {
    private String marca;
    private String cor;
    private double valor;

    public Carro(String marca, String cor, double valor) {
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Double.compare(valor, carro.valor) == 0 && Objects.equals(marca, carro.marca) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, cor, valor);
    }

    @Override
    public String toString() {
        return "\nmarca='" + marca + '\'' +
                "\n, cor='" + cor + '\'' +
                "\n, valor=" + valor + "\n";
    }
}
