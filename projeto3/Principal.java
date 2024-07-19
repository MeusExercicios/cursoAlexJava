package projeto3;
// RELACIONEI UMA LISTA DE CARROS A UMA CLASSE DE PESSOA
// ADICIONEI, REMOVI E SUBSTITUI CARROS USANDO CONCEITOS DE POO

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
        String pergunta = JOptionPane.showInputDialog("Quantos carros deseja cadastrar para o(a)" + nome + " ?");
        List<Carro> modelosCarro = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(pergunta); i++) {
            String marcaCarro = JOptionPane.showInputDialog("Digite a marca do carro :" + (i + 1));
            String corCarro = JOptionPane.showInputDialog("Digite a cor do carro :" + (i + 1));
            String valorCarro = JOptionPane.showInputDialog("Digite o valor do carro: " + (i + 1));

            Carro carro = new Carro(marcaCarro, corCarro, Double.parseDouble(valorCarro));

            modelosCarro.add(carro);

            if (Double.parseDouble(valorCarro) > 100000){
                JOptionPane.showMessageDialog(null,StatusDaPessoa.RICAO);
            }
        }

        Pessoa pessoa = new Pessoa(nome, cpf, modelosCarro);

        JOptionPane.showMessageDialog(null, "Nome do colecionador: " + pessoa.getNome() + "\nCpf: " +
                pessoa.getCpf() + "\nLista de carros do colecionador: " + "\n" +
                pessoa.getCarros()
        );

        int perguntaRemocao = JOptionPane.showConfirmDialog(null, "Deseja remover um veículo ? ");

        if (perguntaRemocao == 0) {
            String carroRemocao = JOptionPane.showInputDialog(null, "Qual veículo deseja remover (índice)? ");
            modelosCarro.remove(Integer.parseInt(carroRemocao)-1);

            JOptionPane.showMessageDialog(null, "Nova lista do colecionador: " + pessoa.getNome() + "\nCpf: " +
                    pessoa.getCpf() + "\nLista de carros do colecionador: " + "\n" +
                    pessoa.getCarros()
            );
        } else {
            JOptionPane.showMessageDialog(null, "Ok, obrigado por usar o programa");
        }

        String nomeCarroRemocao = JOptionPane.showInputDialog(null,"Qual carro que você adicionou deseja remover da lista ?");
        String nomeCarroNovo = JOptionPane.showInputDialog(null,"Qual carro vai entrar no lugar do carro: " + nomeCarroRemocao + " ?");
        String corCarroNovo = JOptionPane.showInputDialog(null,"Qual a cor do carro do carro ? ");
        String valorCarroNovo = JOptionPane.showInputDialog(null,"Qual o valor do carro que você adicionou ?");

        Carro carroNovo = new Carro(nomeCarroNovo, corCarroNovo, Double.parseDouble(valorCarroNovo));

        Carro carroRemovido = null;

        for (Carro carro: modelosCarro
             ) {
            if (carro.getMarca().equalsIgnoreCase(nomeCarroRemocao)){
                carroRemovido = carro;
                break;
            }
        }

        if (carroRemovido != null) {
            modelosCarro.remove(carroRemovido);
            modelosCarro.add(carroNovo);

        }

        for (Carro novaLista:modelosCarro
             ) {
            JOptionPane.showMessageDialog(null,novaLista);
        }

    }
}
