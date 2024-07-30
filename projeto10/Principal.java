// criar um objeto de pessoas , instanciar as informações e passar para um arquivo de texto
package projeto10;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        String nomePessoa = JOptionPane.showInputDialog(null,"Digite o nome da pessoa: ");
        String idadePessoa = JOptionPane.showInputDialog(null,"Digite a idade da pessoa: ");
        String emailPessoa = JOptionPane.showInputDialog(null,"Digite o email da pessoa: ");

        Pessoa pessoa = new Pessoa(nomePessoa,Integer.parseInt(idadePessoa),emailPessoa);

        File arquivo = new File("C:\\Development\\Projetos\\cursoJavaAlex\\src\\projeto10\\arquivo.txt");

        if (!arquivo.exists()){
            arquivo.createNewFile();
        }
        FileWriter escreverNoArquivo = new FileWriter(arquivo);
        escreverNoArquivo.write(pessoa.getNome() + "; " + pessoa.getIdade() + "; " + pessoa.getEmail());

        escreverNoArquivo.flush();
        escreverNoArquivo.close();

    }
}
