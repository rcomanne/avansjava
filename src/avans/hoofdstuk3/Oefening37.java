package avans.hoofdstuk3;

import javax.swing.*;
import java.awt.*;

public class Oefening37 extends JPanel {
    public Oefening37 () {
        setBackground(Color.ORANGE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(10, 10, 200, 50);
        g.setColor(Color.WHITE);
        g.fillRect(10, 60, 200, 50);
        g.setColor(Color.BLUE);
        g.fillRect(10, 110, 200, 50);

    }
}
