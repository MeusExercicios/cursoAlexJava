// SISTEMA EM QUE O USUÁRIO DIGITA UMA DATA PARA PAGAMENTO E AVISA SE ESTÁ OU NÃO VENCIDA
package projeto9;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String dataVencimento = JOptionPane.showInputDialog(null,"Qual data você escolhe para vencimento ?");
        String dataPagamento = JOptionPane.showInputDialog(null,"Qual data você pagou ?");

        Date dataVencimentoBoleto = simpleDateFormat.parse(dataVencimento);
        Date dataPagamentoBoleto = simpleDateFormat.parse(dataPagamento);

        if (dataVencimentoBoleto.after(dataPagamentoBoleto)) {
            JOptionPane.showMessageDialog(null,"Parabéns, seu boleto está em dia!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Seu Boleto está atrasado");
        }
    }
}
