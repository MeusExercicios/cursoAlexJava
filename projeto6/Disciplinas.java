package projeto6;

import java.util.Arrays;
public class Disciplinas {
    private String nomeDisciplina;
    private double nota [] = new double[4];

    public Disciplinas(String nomeDisciplina, double[] nota) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }


    public double calcularMedia(){
        double sum = 0.0;
        for (int i = 0; i < nota.length; i++){
          sum += nota[i];
        }

        return sum/nota.length;
    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", nota=" + Arrays.toString(nota) +
                ", média=" + calcularMedia() +
                '}';
    }
}
