package avans.autobelasting;

public class AutoType
{
    private int bouwjaar;
    private int nieuwPrijs;
    private int gewicht;
    private int motorinhoud;
    private String brandstof;
    private int CO2Uitstoot;
    private int bijtelling;

    public AutoType(int bouwjaar, int nieuwPrijs, int gewicht, int motorinhoud, String brandstof, int CO2Uitstoot)
    {
        this.bouwjaar = bouwjaar;
        this.nieuwPrijs = nieuwPrijs;
        this.gewicht = gewicht;
        this.motorinhoud = motorinhoud;
        this.brandstof = brandstof;
        this.CO2Uitstoot = CO2Uitstoot;
        this.bijtelling = 0;
    }

    public String geefBrandstof()
    {
        return brandstof;
    }

    public int geefCO2Uitstoot()
    {
        return CO2Uitstoot;
    }

    public void wijzigBouwjaar(int bouwjaar)
    {
        this.bouwjaar = bouwjaar;
    }

    public int geefBouwjaar()
    {
        return bouwjaar;
    }

    public int getBijtelling() {
        return bijtelling;
    }

    public void setBijtelling(int bijtelling) {
        this.bijtelling = bijtelling;
    }

    public int bepaalBrandstofType () {
        String brandstoftype = this.geefBrandstof();
        if (brandstoftype.equalsIgnoreCase("diesel")) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public String toString()
    {
        return brandstof + " " + bouwjaar;
    }
}
