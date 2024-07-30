//entrar com dados e converter os dados em json
package projeto10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal3 {
    public static void main(String[] args) throws IOException {
        String quantidade = JOptionPane.showInputDialog(null,"Digite a quantidade de atletas que deseja cadastrar: ");

        List<Atleta> atletas = new ArrayList<>();

        for (int i=1; i <= Integer.parseInt(quantidade); i++){
            String nomeAtleta = JOptionPane.showInputDialog(null,"Qual o nome do atleta ?");
            String categoriaEsporte = JOptionPane.showInputDialog(null,"Qual o esporte do atleta ?");
            String cpf = JOptionPane.showInputDialog(null,"Qual o CPF do atleta ?");

            Atleta atleta = new Atleta(nomeAtleta,categoriaEsporte,cpf);

            atletas.add(atleta);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonUser = gson.toJson(atletas);

        FileWriter fileWriter = new FileWriter("C:\\Development\\Projetos\\cursoJavaAlex\\src\\projeto10\\filjson.json");

        fileWriter.write(jsonUser);
        fileWriter.flush();
        fileWriter.close();

        System.out.println("Json Criado!");

    }
}
