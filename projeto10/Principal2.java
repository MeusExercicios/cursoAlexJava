// leitura de txt
package projeto10;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
 * SEQUÊNCIA DE LEITURA:
 * OBJETO DA CLASSE FILEIMPUTSTREAM PARA PEGAR O CAMINHO DO ARQUIVO TXT
 * OBJETO DA CLASSE SCANNER PARA LER O ARQUIVO + FORMATO
 * */
public class Principal2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream entradaArquivo = new FileInputStream(new File("C:\\Development\\Projetos\\cursoJavaAlex\\src\\projeto10\\arquivo.txt"));
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

        while (lerArquivo.hasNext()) {
            String linha = lerArquivo.nextLine();

            JOptionPane.showMessageDialog(null,linha);
        }
    }
}
