// descobrir o dia que nasceu através do LocalDate
package projeto9;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal6 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        String nascimento = JOptionPane.showInputDialog(null,"Qual o dia, mês e ano do seu aniversário ?");

        LocalDate localDate = LocalDate.parse(nascimento,dateTimeFormatter);

        String  diaDaSemana = localDate.getDayOfWeek().name();

        JOptionPane.showMessageDialog(null,diaDaSemana);

    }
}
