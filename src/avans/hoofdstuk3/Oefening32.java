package avans.hoofdstuk3;

import javax.swing.*;
import java.awt.*;

public class Oefening32 extends JPanel {
    int bigNegative = -2147483640, smallNegative = -100, answer;

    public Oefening32 () {
        answer = bigNegative + smallNegative;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString(bigNegative + " + " + smallNegative, 40, 40);
        g.drawString("Is positief: " + answer, 40, 60);
    }
}
