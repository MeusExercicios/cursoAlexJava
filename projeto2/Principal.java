package projeto2;
//programa utilizando tela para passar valores e descobrir o lucro através de poo
import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Qual o nome do produto ?");
        String custo = JOptionPane.showInputDialog(null,"Qual o custo do produto ?");
        String receita = JOptionPane.showInputDialog(null,"Qual a receita do produto ?");

        Produto produto = new Produto(nome,Double.parseDouble(custo),Double.parseDouble(receita));

        System.out.println(produto);
    }
}
