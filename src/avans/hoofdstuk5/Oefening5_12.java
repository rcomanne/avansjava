package avans.hoofdstuk5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening5_12 extends JPanel {
    JTextField jaartalInput,  jaartalOutput;
    JLabel jaartalLabel;
    JButton jaartalButton;

    int jaar;

    Oefening5_12 () {
        setLayout(new GridLayout(2,2));

        jaartalInput = new JTextField();

        jaartalOutput = new JTextField();
        jaartalOutput.setEditable(false);

        jaartalLabel = new JLabel("Voer een jaartal tussen de 0 en 2100 in");

        jaartalButton = new JButton("Vertaal...");

        jaartalButton.addActionListener(new VertaalActionHandler());

        add(jaartalLabel);
        add(jaartalInput);
        add(jaartalOutput);
        add(jaartalButton);
    }

    class VertaalActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                jaartalOutput.setText(vertaalJaartalNaarRomeins(jaartalInput.getText()));
                jaartalOutput.setBackground(Color.GREEN);

            } catch (Exception exception) {
                jaartalOutput.setText("Voer een geldig getal in");
                jaartalOutput.setBackground(Color.RED);
            }
        }
    }

    private String vertaalJaartalNaarRomeins (String jaartal) throws Exception {
        jaar = Integer.parseInt(jaartal);
        jaartal = "";
        if (jaar > 2100) {
            throw new Exception();
        }
        if (jaar > 2000) {
            jaartal += "MM";
            jaar -= 2000;
        }
        if (jaar < 2000 && jaar >= 1000) {
            jaartal += "M";
            jaar -= 1000;
        }
        if (jaar >= 900) {
            jaartal += "CM";
            jaar -= 900;
        }
        if (jaar >= 500) {
            jaartal += "D";
            jaar -= 500;
        }
        if (jaar >= 400) {
            jaartal += "CD";
            jaar -= 400;
        }
        if (jaar >= 200) {
            jaartal += "CC";
            jaar -= 200;
        }
        if (jaar >= 100) {
            jaartal += "C";
            jaar -= 100;
        }
        if (jaar >= 90) {
            jaartal += "XC";
            jaar -= 90;
        }
        if (jaar >= 50) {
            jaartal += "L";
            jaar -= 50;
        }
        if (jaar >= 40) {
            jaartal += "XL";
            jaar -= 40;
        }
        if (jaar >= 20) {
            jaartal += "LL";
            jaar -= 20;
        }
        if (jaar >= 10) {
            jaartal += "X";
            jaar -=10;
        }
        if (jaar >= 9) {
            jaartal += "IX";
            jaar -= 9;
        }
        if (jaar >= 5) {
            jaartal += "V";
            jaar -= 5;
        }
        if (jaar >= 4) {
            jaartal += "IV";
            jaar -= 4;
        }
        if (jaar >= 2) {
            jaartal += "II";
            jaar -= 2;
        }
        if (jaar >= 1) {
            jaartal += "I";
            jaar -= 1;
        }
        return jaartal;
    }
}
