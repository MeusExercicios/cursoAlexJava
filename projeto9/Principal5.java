//informar o valor de um produto
//informar em quantas parcelas
//informar a data de compra
//mostrar a geração das parcelas no terminal com valores e suas respectivas datas
package projeto9;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal5 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        String valorProduto = JOptionPane.showInputDialog(null,"Qual o valor do produto ?");
        String quantidadeParcelas = JOptionPane.showInputDialog(null,"Qual a quantidade de parcelas ?");
        double parcela = Double.parseDouble(valorProduto)/Double.parseDouble(quantidadeParcelas);
        String dataDeCompra = JOptionPane.showInputDialog(null,"Qual a data que o produto foi comprado(dd/MM/yyyy) ?");
        Date date = simpleDateFormat.parse(dataDeCompra);
        calendar.setTime(date);

        for (int i = 1; i <= Integer.parseInt(quantidadeParcelas); i++ ){
            calendar.add(Calendar.MONTH,1);
            System.out.println("Parcela " + i + " - Valor: " + parcela + " - Vencimento: " +
                    new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }

    }
}
