package avans.hoofdstuk6;

import java.awt.*;

public class Cirkel {

    private int x, y, straal;

    public Cirkel (int x,int y,int straal) {
        this.x = x;
        this.y = y;
        this.straal = straal;
    }

    public void teken (Graphics g) {
        g.drawOval(x, y, straal, straal);
    }

    public void setMiddelpunt (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getStraal() {
        return straal;
    }

    public void setStraal(int straal) {
        this.straal = straal;
    }
}
