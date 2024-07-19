package projeto5;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String login;

    protected String senha;

    public Pessoa(String nome, String cpf, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String realizarLogin(){
        boolean b = getLogin().equalsIgnoreCase("admin") && getSenha().equalsIgnoreCase("admin");
        if (b) {
            return " Login autorizado ";
        }else {
            return " Login ou senha incorreta ";
        }

    }
}
