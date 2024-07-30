package projeto10;

import java.io.Serializable;

public class Atleta implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String categoriaEsporte;
    private String cpf;


    public Atleta(String nome, String categoriaEsporte, String cpf) {
        this.nome = nome;
        this.categoriaEsporte = categoriaEsporte;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoriaEsporte() {
        return categoriaEsporte;
    }

    public void setCategoriaEsporte(String categoriaEsporte) {
        this.categoriaEsporte = categoriaEsporte;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", categoriaEsporte='" + categoriaEsporte + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
