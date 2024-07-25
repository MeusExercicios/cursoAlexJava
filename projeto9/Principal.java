// APARECER DATA FORMATADA AO CLICAR EM UM BOTÃO
package projeto9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal extends JDialog {
    private JPanel jPanel = new JPanel();
    private JButton jButton = new JButton("Clique aqui");
    private JTextField jTextField = new JTextField();

   public Principal(){
       setTitle("Descobridor de data");
       setSize(new Dimension(240, 240));
       setLocationRelativeTo(null);
       setResizable(false);

       GridBagConstraints gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 0;



       jTextField.setPreferredSize(new Dimension(200,25));
       gridBagConstraints.gridy++;
       jTextField.setEditable(false);
       jPanel.add(jTextField,gridBagConstraints);

       jButton.setPreferredSize(new Dimension(120,25));
       gridBagConstraints.gridy++;
       jPanel.add(jButton);

       jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Date date = new Date();
               SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
               String formatadorDeData = simpleDateFormat.format(date);
               jTextField.setText(formatadorDeData);
           }
       });

       add(jPanel,BorderLayout.CENTER);

       setVisible(true);



    }

}
