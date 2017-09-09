package avans.hoofdstuk6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening6_7 extends JPanel {

    private Cirkel cirkel;

    private JTextField straalInput;
    private JButton knop;

    public  Oefening6_7 () {
        straalInput = new JTextField(10);

        knop = new JButton("update straal");
        knop.addActionListener(new StraalActionHandler());

        cirkel = new Cirkel(20, 40, 30);

        add(straalInput);
        add(knop);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        cirkel.teken(g);
    }

    class StraalActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                cirkel.setStraal(Integer.parseInt(straalInput.getText()));
                straalInput.setText("");
                repaint();
            } catch (Exception e1) {
                straalInput.setText("Voer een heel getal in.");
            }
        }
    }
}
