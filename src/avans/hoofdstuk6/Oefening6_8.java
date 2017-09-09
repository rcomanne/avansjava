package avans.hoofdstuk6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening6_8 extends JPanel {
    private Verkeerslicht verkeerslicht;
    private JButton groen, oranje, rood, reset;

    public Oefening6_8 () {
        verkeerslicht = new Verkeerslicht();

        rood = new JButton("Rood");
        rood.addActionListener(new RoodKnopHandler());

        oranje = new JButton("Oranje");
        oranje.addActionListener(new OranjeKnopHandler());

        groen = new JButton("Groen");
        groen.addActionListener(new GroenKnopHandler());

        reset = new JButton("Reset");
        reset.addActionListener(new ResetKnopHandler());

        add(rood);
        add(oranje);
        add(groen);
        add(reset);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        verkeerslicht.teken(g);
    }

    class GroenKnopHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            verkeerslicht.reset();
            verkeerslicht.setGroen(true);
            repaint();
        }
    }

    class OranjeKnopHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            verkeerslicht.reset();
            verkeerslicht.setOranje(true);
            repaint();
        }
    }

    class RoodKnopHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            verkeerslicht.reset();
            verkeerslicht.setRood(true);
            repaint();
        }
    }

    class ResetKnopHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            verkeerslicht.reset();
            repaint();
        }
    }
}
