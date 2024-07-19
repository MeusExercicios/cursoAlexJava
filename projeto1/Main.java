package projeto1;
//PROJETO PARA RETORNAR NA TELA  A DIVISÃO E RESTO
import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String carros = JOptionPane.showInputDialog("Informe a quantidade de carros :");
        String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas :");

        double carroNumb =  Double.parseDouble(carros);
        double pessoaNumb =  Double.parseDouble(pessoa);

        int divisao = (int) (carroNumb/pessoaNumb);

        double resto = carroNumb % pessoaNumb;

        int pergunta = JOptionPane.showConfirmDialog(null,"Deseja ver a divisão ?");

        if (pergunta == 0){
            JOptionPane.showMessageDialog(null,divisao);
            JOptionPane.showMessageDialog(null,resto);

        }else {
            JOptionPane.showMessageDialog(null,"Obrigado por usar o nosso programa !");
        }
    }
}