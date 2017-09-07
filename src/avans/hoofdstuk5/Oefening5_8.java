package avans.hoofdstuk5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening5_8 extends JPanel {
    JLabel aantalLabel;
    JTextField aantal, totaalKosten;
    JButton bereken;
    int aantalPennen;
    double prijsPerPen;

    public Oefening5_8 () {
        Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);
        setLayout(new GridLayout(2,3));

        aantalLabel = new JLabel();
        aantalLabel.setText("Voer het aantal pennen in:");

        aantal = new JTextField();

        totaalKosten = new JTextField();
        totaalKosten.setEditable(false);

        bereken = new JButton("Bereken prijs");
        bereken.addActionListener(new BerekenActionHandler());

        add(aantalLabel);
        add(aantal);
        add(bereken);

        add(new Label("Totaal kosten:"));
        add(totaalKosten);
        add(new Label());

    }

    class BerekenActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                 aantalPennen = Integer.parseInt(aantal.getText());
                 prijsPerPen = bepaalPrijs(aantalPennen);
                 totaalKosten.setText(String.format("%.2f", aantalPennen*prijsPerPen));
                 aantalLabel.setText("Voer het aantal pennen in:");
            } catch (Exception exception) {
                aantalLabel.setText("Voer een geldig getal in");
            }

        }
    }

    private double bepaalPrijs (int aantalPennen) throws Exception {
        if (aantalPennen <= 0) {
            throw new Exception();
        } else if (aantalPennen < 10) {
            return prijsPerPen = 2.00;
        } else if (aantalPennen < 50) {
            return prijsPerPen = 1.50;
        } else if (aantalPennen < 100) {
            return prijsPerPen = 1.25;
        } else {
            return prijsPerPen = 1.10;
        }
    }
}
