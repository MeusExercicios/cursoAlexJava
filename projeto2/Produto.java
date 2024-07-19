package projeto2;

public class Produto {
    private String nomeProduto;
    private double custoProduto;
    private double receitaProduto;


    public Produto(){}

    public Produto(String nomeProduto, double custoProduto, double receitaProduto) {
        this.nomeProduto = nomeProduto;
        this.custoProduto = custoProduto;
        this.receitaProduto = receitaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getCustoProduto() {
        return custoProduto;
    }

    public void setCustoProduto(double custoProduto) {
        this.custoProduto = custoProduto;
    }

    public double getReceitaProduto() {
        return receitaProduto;
    }

    public void setReceitaProduto(double receitaProduto) {
        this.receitaProduto = receitaProduto;
    }

    public double getLucro(){
        return receitaProduto-custoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", custoProduto=" + custoProduto +
                ", receitaProduto=" + receitaProduto +
                ", lucroProduto=" + getLucro() +
                '}';
    }
}
