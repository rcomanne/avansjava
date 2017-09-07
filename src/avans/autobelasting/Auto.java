package avans.autobelasting;

import java.time.LocalDate;

public class Auto {
    private static final int BIJTELLING_LAAG = 14;
    private static final int BIJTELLING_HOOG = 21;

    private Eigenaar eigenaar;
    private AutoType autoType;
    private String kenteken;
    private String naam;

    public Auto(String kenteken, Eigenaar eigenaar, AutoType autoType, String naam)
    {
        this.kenteken = kenteken;
        this.eigenaar = eigenaar;
        this.autoType = autoType;
        this.naam = naam;
    }

    public Auto(String kenteken, AutoType autoType, String naam)
    {
        this.kenteken = kenteken;
        this.autoType = autoType;
        this.naam = naam;
    }

    public AutoType geefAutoType()
    {
        return autoType;
    }

    public Eigenaar geefEigenaar()
    {
        return eigenaar;
    }

    private void setEigenaar(Eigenaar eigenaar) {
        this.eigenaar = eigenaar;
    }

    public void wijzigEigenaar(Eigenaar nieuweEigenaar) {
        this.geefEigenaar().stuurBericht(genereerBericht());
        this.setEigenaar(nieuweEigenaar);
    }

    public String genereerBericht () {
        return "Einde autobezit van " + this.toString() + "\nOp datum: " + LocalDate.now();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int geefLeeftijd (int belastingJaar) {
        return belastingJaar - this.geefAutoType().geefBouwjaar();
    }

    public int berekenBijtelling () {
        int co2Uitstoot = autoType.geefCO2Uitstoot();
        switch (this.geefAutoType().bepaalBrandstofType()) {
            case 1:
                if (co2Uitstoot <= 95) {
                    autoType.setBijtelling(BIJTELLING_LAAG);
                    return BIJTELLING_LAAG;
                } else {
                    autoType.setBijtelling(BIJTELLING_HOOG);
                    return BIJTELLING_HOOG;
                }
            case 2:
                if (co2Uitstoot <= 110) {
                    autoType.setBijtelling(BIJTELLING_LAAG);
                    return BIJTELLING_LAAG;
                } else {
                    autoType.setBijtelling(BIJTELLING_HOOG);
                    return BIJTELLING_HOOG;
                }
            default:
                return -1;
        }
    }

    @Override
    public String toString()
    {
        return "kenteken: " + kenteken + "\nauto: " + autoType + "\neigenaar: " + eigenaar + "\nnaam: " + naam;
    }
}
