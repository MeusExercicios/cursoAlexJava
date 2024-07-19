package projeto5;

public class Garcom extends Pessoa{
    public Garcom(String nome, String cpf, String login, String senha) {
        super(nome, cpf, login, senha);
    }

    @Override
    public String toString() {
        return "Garcom{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
