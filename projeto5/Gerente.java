package projeto5;

public class Gerente extends Pessoa implements Autenticacao{
    private String chaveAutenticadoraAcesso = "13";

    public Gerente(String nome, String cpf, String login, String senha, String chaveAutenticadoraAcesso) {
        super(nome, cpf, login, senha);
        this.chaveAutenticadoraAcesso = chaveAutenticadoraAcesso;
    }

    public String getChaveAutenticadoraAcesso() {
        return chaveAutenticadoraAcesso;
    }

    public void setChaveAutenticadoraAcesso(String chaveAutenticadoraAcesso) {
        this.chaveAutenticadoraAcesso = chaveAutenticadoraAcesso;
    }

    @Override
    public String realizarLogin() {
        return super.realizarLogin();
    }

    @Override
    public String autenticar() {
        boolean c = getChaveAutenticadoraAcesso().equals("13");
        if (c){
            return " Chave de autenticação de gerente correta";
        }else {
            return " Chave de autenticação de gerente incorreta";
        }

    }

    @Override
    public String toString() {
        return " Gerente " + getNome() +
                realizarLogin() +
                autenticar();
    }
}
