package avans.hoofdstuk5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening5_9 extends JPanel {
    JLabel jaartalLabel;
    JTextField jaartal, uitkomstLabel;
    JButton bereken;

    int jaar;


    public Oefening5_9 () {
        Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        setLayout(new GridLayout(2,2));

        jaartalLabel = new JLabel("Voer een jaartal in");
        uitkomstLabel = new JTextField("Klik op de knop...");
        uitkomstLabel.setEditable(false);

        jaartal = new JTextField();

        bereken = new JButton("Check schrikkeljaar");
        bereken.addActionListener(new BerekenActionHandler());

        add(jaartalLabel);
        add(jaartal);
        add(bereken);
        add(uitkomstLabel);
    }

    public boolean isSchrikkeljaar (int jaar) {
        if ((jaar % 4 == 0 && jaar % 100 != 0) || jaar % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    class BerekenActionHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                jaar = Integer.parseInt(jaartal.getText());
            } catch (Exception exception) {
                jaartalLabel.setText("Ongeldig getal");
            }
            if (isSchrikkeljaar(jaar)) {
                uitkomstLabel.setText("Een schrikkeljaar");
                uitkomstLabel.setBackground(Color.GREEN);
            } else {
                uitkomstLabel.setText("Geen schrikkeljaar");
                uitkomstLabel.setBackground(Color.RED);
            }

        }
    }
}
