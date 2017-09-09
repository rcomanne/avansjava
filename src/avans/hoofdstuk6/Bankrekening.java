package avans.hoofdstuk6;

public class Bankrekening {

    private String rekeningnummer;
    private double saldo = 0.0;

    public double getSaldo () {
        return this.saldo;
    }

    public void stort (double bedrag) {
        this.saldo += bedrag;
    }

    public boolean neemOp (double bedrag) {
        if (this.saldo - bedrag < 0) {
            return false;
        } else {
            this.saldo -= bedrag;
            return true;
        }
    }
}
