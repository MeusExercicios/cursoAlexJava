package projeto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private String cpf;
    private List<Carro> carros;

    public Pessoa(String nome, String cpf, List<Carro> carros) {
        this.nome = nome;
        this.cpf = cpf;
        this.carros = carros;
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

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(cpf, pessoa.cpf) && Objects.equals(carros, pessoa.carros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, carros);
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", carros=" + carros +
                '}';
    }
}