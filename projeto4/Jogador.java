package projeto4;

import java.util.HashMap;
import java.util.Objects;

public class Jogador {
    private String nome;
    private String cpf;
    private HashMap<Integer,Pokemon>nomesPoks;

    public Jogador(String nome, String cpf, HashMap<Integer, Pokemon> nomesPoks) {
        this.nome = nome;
        this.cpf = cpf;
        this.nomesPoks = nomesPoks;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public HashMap<Integer, Pokemon> getNomesPoks() {
        return nomesPoks;
    }

    public void setNomesPoks(HashMap<Integer, Pokemon> nomesPoks) {
        this.nomesPoks = nomesPoks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return Objects.equals(nome, jogador.nome) && Objects.equals(cpf, jogador.cpf) && Objects.equals(nomesPoks, jogador.nomesPoks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, nomesPoks);
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nomesPoks=" + nomesPoks +
                '}';
    }
}
