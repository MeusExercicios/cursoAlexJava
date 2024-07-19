package projeto5;

import javax.swing.*;
// criei conceitos de herença, classes abstratas, métodos abstratos e interfaces.
public class Principal {
    public static void main(String[] args) {
        String cargo = JOptionPane.showInputDialog(null,"Informe qual o seu cargo: ");

        if (cargo.equalsIgnoreCase("gerente")){
            String nomeGerente = JOptionPane.showInputDialog(null,"Informe seu nome: ");
            String cpfGerente = JOptionPane.showInputDialog(null,"Informe seu CPF: ");
            String loginGerente = JOptionPane.showInputDialog(null,"Informe seu login: ");
            String senhaGerente = JOptionPane.showInputDialog(null,"Informe sua senha: ");
            String codAutGerente = JOptionPane.showInputDialog(null,"Informe seu código de Gerente: ");

            Pessoa gerente = new Gerente(nomeGerente,cpfGerente,loginGerente,senhaGerente,codAutGerente);

            JOptionPane.showMessageDialog(null,gerente.toString());

        } else if (cargo.equalsIgnoreCase("garcom")) {
            String nomeGarcom = JOptionPane.showInputDialog(null,"Informe seu nome: ");
            String cpfGarcom = JOptionPane.showInputDialog(null,"Informe seu CPF: ");
            String loginGarcom = JOptionPane.showInputDialog(null,"Informe seu login: ");
            String senhaGarcom = JOptionPane.showInputDialog(null,"Informe sua senha: ");

            Pessoa garcom = new Garcom(nomeGarcom,cpfGarcom,loginGarcom,senhaGarcom);

            JOptionPane.showMessageDialog(null,garcom.toString());
        }
        else {
            JOptionPane.showMessageDialog(null,"Você digitou errado");
        }
    }
}
