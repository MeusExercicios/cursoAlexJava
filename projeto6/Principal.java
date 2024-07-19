package projeto6;
// associações de classes com poo + listas + arrays
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        String nomeDoAluno = JOptionPane.showInputDialog(null,"Digite o seu nome: ");
        String matriculaDoAluno = JOptionPane.showInputDialog(null,"Digite a sua matrícula: ");
        String quantidadeDisciplina = JOptionPane.showInputDialog(null,"Digite a quantidade de disciplinas que o aluno possui: ");

        List<Disciplinas> nomeDasDisciplinas = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(quantidadeDisciplina); i++){
            String disciplina = JOptionPane.showInputDialog(null,"Digite o nome da disciplina " + (i+1) + ":");
            double[] notas = new double[4];
            for (int j = 0 ; j < 4; j++){
                String disci = JOptionPane.showInputDialog(null,"Digite a nota " + (j+1));
                notas[j] = Double.parseDouble(disci);
            }

            Disciplinas disciplinas = new Disciplinas(disciplina,notas);
            nomeDasDisciplinas.add(disciplinas);
        }

        Aluno aluno = new Aluno(nomeDoAluno,matriculaDoAluno,nomeDasDisciplinas);

        JOptionPane.showMessageDialog(null, aluno);
    }
}
