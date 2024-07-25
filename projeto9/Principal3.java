// adicionar e remover dias em uma data do calendário

package projeto9;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal3 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        String dataVencimento = JOptionPane.showInputDialog(null, "Qual data você escolhe para vencimento ?");
        String dataModificada = JOptionPane.showInputDialog(null, "Você quer adicionar ou remover dias na data de vencimento  ?");

        Date dateVencimento = simpleDateFormat.parse(dataVencimento);

        if (dataModificada.equalsIgnoreCase("adicionar")) {
            calendar.setTime(dateVencimento);
            String adicaoDias = JOptionPane.showInputDialog(null, "Quantos dias deseja adicionar ?");
            calendar.add(Calendar.DAY_OF_MONTH, Integer.parseInt(adicaoDias));

            System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        } else {
            calendar.setTime(dateVencimento);
            String remocaoDias = JOptionPane.showInputDialog(null, "Quantos dias deseja remover ?");
            calendar.add(Calendar.DAY_OF_MONTH, -(Integer.parseInt(remocaoDias)));

            System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        }
    }
}
