package avans.hoofdstuk3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening39 extends JPanel {
    JTextField invoervak1, invoervak2, resultaatVak;
    JButton plusKnop, productKnop;

    public Oefening39() {
        invoervak1 = new JTextField(10);
        invoervak2 = new JTextField(10);
        resultaatVak = new JTextField(10);

        plusKnop = new JButton("+");
        plusKnop.addActionListener(new PlusKnopHandler());
        productKnop = new JButton("*");
        productKnop.addActionListener(new ProductKnopHandler());


        add(invoervak1);
        add(invoervak2);
        add(plusKnop);
        add(productKnop);
        add(resultaatVak);
    }

    // Inwendige klasse
    class PlusKnopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String invoerstring1 = invoervak1.getText();
            int getal1 = Integer.parseInt(invoerstring1);

            String invoerstring2 = invoervak2.getText();
            int getal2 = Integer.parseInt(invoerstring2);

            int resultaat = getal1 + getal2;

            resultaatVak.setText("" + resultaat);
        }
    }

    class ProductKnopHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int getal1 = Integer.parseInt(invoervak1.getText());
            int getal2 = Integer.parseInt(invoervak2.getText());

            int reultaat = getal1 * getal2;

            resultaatVak.setText("" + reultaat);
        }
    }
}
