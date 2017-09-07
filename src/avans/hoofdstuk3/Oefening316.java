package avans.hoofdstuk3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening316 extends JPanel {
    double percentageMannen = 50.0, percentageVrouwen = 50.0, aantalMannen = 1, aantalVrouwen = 1;
    JButton plusMan, plusVrouw;

    public Oefening316 () {
        plusMan = new JButton("Man");
        plusVrouw = new JButton("Vrouw");
        plusMan.addActionListener(new VoegManToe());
        plusVrouw.addActionListener(new VoegVrouwToe());
        add(plusMan);
        add(plusVrouw);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Aantal mannen: " + (int)aantalMannen, 20, 170);
        g.drawString("Aantal vrouwen: " + (int)aantalVrouwen, 200, 170);
        g.setColor(Color.blue);
        g.fillRect(20, 150 - (int)percentageMannen, 20, (int)percentageMannen);
        g.setColor(Color.PINK);
        g.fillRect(200, 150 - (int)percentageVrouwen, 20, (int)percentageVrouwen);
    }

    private class VoegManToe implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            aantalMannen += 1;
            percentageMannen = aantalMannen / (aantalMannen + aantalVrouwen) * 100;
            percentageVrouwen = aantalVrouwen / (aantalMannen + aantalVrouwen) * 100;
            repaint();
        }
    }

    private class VoegVrouwToe implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            aantalVrouwen += 1;
            percentageMannen = aantalMannen / (aantalMannen + aantalVrouwen) * 100;
            percentageVrouwen = aantalVrouwen / (aantalMannen + aantalVrouwen) * 100;
            repaint();
        }
    }
}
