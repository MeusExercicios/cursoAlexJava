package projeto4;

import java.util.Objects;

public class Pokemon {
    private String nome;
    private double poder;

    public Pokemon(String nome, double poder) {
        this.nome = nome;
        this.poder = poder;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Double.compare(poder, pokemon.poder) == 0 && Objects.equals(nome, pokemon.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, poder);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", poder=" + poder +
                '}';
    }
}
