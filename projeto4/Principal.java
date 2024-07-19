package projeto4;

import javax.swing.*;
import java.util.HashMap;


// usei conceitos de poo para fazer instanciações e usei hashmap para criar uma chave id na minha lista de pokemons
public class Principal {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null,"Digite o nome do mestre pokemon: ");
        String cpf = JOptionPane.showInputDialog(null,"Digite o cpf do mestre pokemon: ");
        String quantidade = JOptionPane.showInputDialog(null,"Digite quantos pokemons o mestre " + nome + " possui: ");

        HashMap<Integer,Pokemon> nomesDosPokemons = new HashMap<Integer,Pokemon>();
        for (int i = 0; i < Integer.parseInt(quantidade); i++){
            int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o id do " + (i+1) + " º" + "pokemon ?" )) ;
            String nomePokemon = JOptionPane.showInputDialog(null,"Qual o nome do " + (i+1)+ "º pokemon ?");
            double poderPokemon = Double.parseDouble(JOptionPane.showInputDialog("Qual o poder do " + (i+1) + "º pokemon ?"));

            nomesDosPokemons.put(id,new Pokemon(nomePokemon,poderPokemon));
        }

        Jogador jogador = new Jogador(nome,cpf,nomesDosPokemons);

        JOptionPane.showMessageDialog(null, jogador.toString());


    }
}
