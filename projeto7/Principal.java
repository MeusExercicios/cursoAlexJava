package projeto7;

import javax.swing.*;

//PROGRAMAÇÃO EM PARALELO COM O USO DE THREADS
public class Principal {
    public static void main(String[] args) throws InterruptedException {

        Thread threadVerificaNota = new Thread(thread1);
        threadVerificaNota.start();

        JOptionPane.showMessageDialog(null, "O sistema de notas está processando");

    }

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            double notas[] = {10, 9, 7, 6, 10, 3, 9};

            for (int i = 0; i < notas.length; i++) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (notas[i] > 7) {
                    System.out.println("Aluno aprovado na " + (i + 1) + " ª nota");
                } else {
                    System.out.println("Aluno reprovado " + (i + 1) + " ª nota");
                }
            }
            // fim do código paralelo
        }
    };
}
