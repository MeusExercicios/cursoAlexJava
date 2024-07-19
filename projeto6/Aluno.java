package projeto6;

import java.util.List;
import java.util.Objects;

public class Aluno {
    private String nomeAluno;

    private String matricula;

    private List<Disciplinas> disciplinas;

    public Aluno(String nomeAluno, String matricula, List<Disciplinas> disciplinas) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nomeAluno, aluno.nomeAluno) && Objects.equals(matricula, aluno.matricula) && Objects.equals(disciplinas, aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeAluno, matricula, disciplinas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", matricula='" + matricula + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
