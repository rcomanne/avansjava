package avans.hoofdstuk6;

import java.awt.*;

public class Verkeerslicht {
    private boolean groen, oranje, rood;

    public Verkeerslicht () {
        this.groen = false;
        this.oranje = false;
        this.rood = false;
    }

    public void setGroen(boolean groen) {
        this.groen = groen;
    }

    public void setOranje(boolean oranje) {
        this.oranje = oranje;
    }

    public void setRood(boolean rood) {
        this.rood = rood;
    }

    public void reset () {
        this.groen = false;
        this.oranje = false;
        this.rood = false;
    }

    public void teken (Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(200, 25, 100, 250);
        g.fillRect(235, 275, 30, 250);

        g.setColor(Color.GRAY);
        if (this.rood) {
            g.setColor(Color.RED);
        }
        g.fillOval(213, 30, 75, 75);
        g.setColor(Color.GRAY);
        if (this.oranje) {
            g.setColor(Color.ORANGE);
        }
        g.fillOval(213, 110, 75, 75);
        g.setColor(Color.GRAY);
        if (this.groen) {
            g.setColor(Color.GREEN);
        }
        g.fillOval(213, 190, 75, 75);


    }
}
