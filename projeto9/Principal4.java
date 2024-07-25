//Descobrir aniversário
package projeto9;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class Principal4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String aniversario = JOptionPane.showInputDialog(null,"Qual o dia, mês e ano do seu aniversário ?");
        Date nascimento = simpleDateFormat.parse(aniversario);
        LocalDate dataNascimento = nascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Long resposta = ChronoUnit.YEARS.between(dataNascimento,LocalDate.now());

        System.out.println("Você tem : " + resposta + " anos");
    }
}
