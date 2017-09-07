package avans.hoofdstuk4;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening4_14 extends JPanel {
    private JTextField bevolking, jaartal;
    private JButton ophogenBevolking;
    private JLabel bevolkingLabel, jaartalLabel;

    private static final double PERCENTAGE = 1.02;

    private double bevolingAantal = 1;
    private int jaarInt = 2017;

    public Oefening4_14 () {
        bevolking = new JTextField(12);
        bevolking.setText(bevolingAantal+"");
        bevolking.setLocation(100, 100);

        bevolkingLabel = new JLabel("Voer een aantal in:");
        bevolkingLabel.setLocation(100, 10);

        jaartal = new JTextField(4);
        jaartal.setText(jaarInt+"");

        jaartalLabel = new JLabel("Voer een jaartal in:");

        ophogenBevolking = new JButton("Een jaar later");
        ophogenBevolking.addActionListener(new BevolkingOphogenHandler());

        setLayout(new GridLayout(3,2, 50, 10));
        Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        add(bevolkingLabel);
        add(bevolking);
        add(jaartalLabel);
        add(jaartal);
        add(ophogenBevolking);
    }

    class BevolkingOphogenHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                bevolingAantal = Double.parseDouble(bevolking.getText());
                jaarInt = Integer.parseInt(jaartal.getText());
            } catch (Exception exception) {
                bevolking.setText("Voer een geldig getal in");
                System.out.println(exception.getMessage());
            }
            bevolingAantal *= PERCENTAGE;
            bevolingAantal = Math.round(bevolingAantal);
            bevolking.setText(""+bevolingAantal);
            jaarInt++;
            jaartal.setText(""+jaarInt);
        }
    }
}
