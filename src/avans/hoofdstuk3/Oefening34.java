package avans.hoofdstuk3;

import javax.swing.*;
import java.awt.*;

public class Oefening34 extends JPanel {
    int leeftijdInSeconden = 5454532, weken, dagen, uren, minuten;
    private static final int SECONDE = 60;
    private static final int MINUUT = 60;
    private static final int UUR = 60;
    private static final int DAG = 24;
    private static final int WEEK = 7;

    public Oefening34 () {
        minuten = leeftijdInSeconden / MINUUT;
        uren = leeftijdInSeconden / (MINUUT * UUR);
        dagen = leeftijdInSeconden / (MINUUT * UUR * DAG);
        weken = leeftijdInSeconden / (MINUUT * UUR * DAG * WEEK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Minuten: " + minuten, 40, 40);
        g.drawString("Uren: " + uren, 40, 60);
        g.drawString("Dagen: " + dagen, 40, 80);
        g.drawString("Weken: " + weken, 40, 1200);
    }
}
