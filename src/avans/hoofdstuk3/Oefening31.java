package avans.hoofdstuk3;

import javax.swing.*;
import java.awt.*;

public class Oefening31 extends JPanel {
    private int uur = 60, dag = 24, jaar = 365, secPerUur, secPerDag, secPerJaar;

    public Oefening31 () {
        secPerUur = calculate(uur, uur);
        secPerDag = calculate(secPerUur, dag);
        secPerJaar = calculate(secPerDag, jaar);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Per dag: " + secPerDag, 40, 40);
        g.drawString("Per uur: " + secPerUur, 40, 60);
        g.drawString("Per jaar: " + secPerJaar, 40, 80);
    }

    private int calculate (int tijdInSeconde, int multiplier) {
        return tijdInSeconde * multiplier;
    }
}
