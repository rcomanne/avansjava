package avans.autobelasting;

import java.util.ArrayList;

public class Eigenaar
{
    private int bsn;
    private String naam;
    private String adres;
    private ArrayList<String> berichten;

    public Eigenaar(int bsn, String naam, String adres)
    {
        this.bsn = bsn;
        this.naam = naam;
        this.adres = adres;
        this.berichten = new ArrayList<>();
    }

    public void stuurBericht (String bericht) {
        this.berichten.add(bericht);
    }

    @Override
    public String toString()
    {
        String bericht = bsn + ", " + naam + ", " + adres;
        if (!berichten.isEmpty()) {
            bericht += this.genereerBerichten();
        }
        return bericht;
    }

    private String genereerBerichten () {
        String output = "\nBerichten: " + berichten.size();
        for (String bericht : berichten) {
            output += "\n" + bericht;
        }
        return output;
    }
}
