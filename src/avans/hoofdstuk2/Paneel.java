package avans.hoofdstuk2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paneel extends JPanel {
    private JButton knop, voornaamKnop, achternaamKnop;
    private JTextField textField, textField2;

    public Paneel() {
        voornaamKnop = new JButton("Klik");
        voornaamKnop.addActionListener(new VoornaamKnop());
        achternaamKnop = new JButton("Klik");
        achternaamKnop.addActionListener(new AchternaamKnop());
        knop = new JButton("Klik");
        knop.addActionListener(new KnopHandler());
        textField = new JTextField(10);
        textField2 = new JTextField(20);
        add(voornaamKnop);
        add(achternaamKnop);
        add(knop);
        add(textField);
//        add(textField2);
    }

    class KnopHandler implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e) {
            textField.setText("Je hebt geklikt");
        }
    }

    class VoornaamKnop implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Ralph");
        }
    }

    class AchternaamKnop implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Comanne");
        }
    }
}
