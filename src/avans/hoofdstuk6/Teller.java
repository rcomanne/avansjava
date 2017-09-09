package avans.hoofdstuk6;

public class Teller {
    private int waarde;

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public void verhoog () {
        this.waarde += 1;
    }

    public void verlaag () {
        this.waarde -= 1;
    }
}
