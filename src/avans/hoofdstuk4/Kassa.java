package avans.hoofdstuk4;

public class Kassa {
    private double subtotaal;
    private final double PERCENTAGE_BTW = 21.0;

    public void telOp(double bedrag) {
        subtotaal += bedrag;
        subtotaal = afrondenToDouble(subtotaal);
    }

    public double getSubtotaal() {
        return subtotaal;
    }

    public void reset() {
        subtotaal = 0;
    }

    public double berekenBTW() {
        return subtotaal - berekenSubtotaalExBtw();
    }

    public double berekenSubtotaalExBtw() {
        return subtotaal / (1 + PERCENTAGE_BTW/100);
    }

    private double afrondenToDouble (double bedrag) {
        return Math.round(bedrag*100)/100.00;
    }
}
