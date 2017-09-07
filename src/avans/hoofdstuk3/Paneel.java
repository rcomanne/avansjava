package avans.hoofdstuk3;

import javax.swing.*;
import java.awt.*;

public class Paneel extends JPanel {
    private int a, b, som, verschil, product, quotient, rest;

    public Paneel () {
        a = 10;
        b = 8;
        som = a + b;
        verschil = a - b;
        product = a * b;
        quotient = a / b;
        rest = a % b;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("a: " + a + " b: " + b, 40, 40);
        g.drawString("Som: " + som, 40, 60);
        g.drawString("Verschil: " + verschil, 40, 80);
        g.drawString("Product: " + product, 40, 100);
        g.drawString("Quotient: " + quotient, 40, 120);
        g.drawString("Rest: " + rest, 40, 140);
    }
}
