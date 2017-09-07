package avans.autobelasting;

import java.util.ArrayList;

public class Main {
    private static final String DIESEL = "diesel";
    private static final String BENZINE = "benzine";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eigenaar arend = new Eigenaar(1, "Arend van Erk", "Koekoeklaan 12, Dirksland");
        Eigenaar dylan = new Eigenaar(2, "Dylan Leijten", "Kermisplein 2, Tilburg");
        Eigenaar ralph = new Eigenaar(3, "Ralph Comanne", "Ceintuurbaan 237, Bussum");

        AutoType corsa = new AutoType(1999, 9999, 950, 1500, "benzine", 110);
        AutoType clio = new AutoType(2004, 7500, 1250, 1000, "gas", 125);
        AutoType civic = new AutoType(2010, 12500, 1500, 2500, "diesel", 90);
        AutoType pickup = new AutoType(2010, 5000, 5000, 4500, "diesel", 100);
        AutoType f150 = new AutoType(2016, 249000, 1750, 3500, "benzine", 200);

        Auto opel = new Auto("11-AA-22", arend, corsa , "Opel Corsa");
        Auto honda = new Auto("22-BB-33", dylan, civic , "Honda Civic");
        Auto renault = new Auto("33-CC-44", ralph, clio , "Renault Clio");
        Auto ferrari = new Auto("44-DD-55", f150 , "Ferrari F150");
        Auto ford = new Auto("55-EE-66", dylan, pickup, "Dodge Ram");

        AutoBelastingManager abm = new AutoBelastingManager();
        abm.voegAutoToe(opel);
        abm.voegAutoToe(ferrari);
        abm.voegAutoToe(honda);
        abm.voegAutoToe(renault);
        abm.voegAutoToe(ford);

        drukAlleEigenarenAf(abm.geefEigenaren());

        System.out.println("Meeste bijtelling:\n" + abm.meesteBijtelling().toString());

        abm.printEigenarenVoorBrandstof(DIESEL);
        honda.wijzigEigenaar(ralph);
        abm.printEigenarenVoorBrandstof(DIESEL);

        drukAlleEigenarenAf(abm.geefEigenaren());

    }

    public static void drukAlleEigenarenAf (ArrayList<Eigenaar> eigenaren) {
        System.out.println("Alle bekende eigenaar(s):");
        for (Eigenaar eigenaar : eigenaren) {
            System.out.println(eigenaar.toString());
        }
    }
}
