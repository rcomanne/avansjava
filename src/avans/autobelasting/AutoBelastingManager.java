package avans.autobelasting;

import java.util.*;

public class AutoBelastingManager {
    private ArrayList<Auto> voertuigen;

    public AutoBelastingManager() {
        voertuigen = new ArrayList<>();
    }

    public int aantalVoertuigen()
    {
        return voertuigen.size();
    }

    public void voegAutoToe(Auto nieuweAuto)
    {
        voertuigen.add(nieuweAuto);
    }

    public Auto meesteBijtelling () {
        Auto hoogsteBijtelling = voertuigen.get(0);
        for (Auto auto : voertuigen) {
            if (!(auto.geefAutoType().getBijtelling() > 0)) {
                auto.berekenBijtelling();
            }
            if (auto.geefAutoType().getBijtelling() > hoogsteBijtelling.geefAutoType().getBijtelling()) {
                hoogsteBijtelling = auto;
            }
        }
        return hoogsteBijtelling;
    }

    public ArrayList<Eigenaar> geefEigenarenVoorBrandstof (String brandstof) {
        ArrayList<Eigenaar> eigenaren = new ArrayList<>();
        for (Auto auto : voertuigen) {
            if(auto.geefAutoType().geefBrandstof().equals(brandstof)) {
                eigenaren.add(auto.geefEigenaar());
            }
        }
        return eigenaren;
    }

    public ArrayList<Eigenaar> geefEigenaren () {
        ArrayList<Eigenaar> eigenaren = new ArrayList<>();
        for (Auto auto : voertuigen) {
            if (auto.geefEigenaar() != null) {
                eigenaren.add(auto.geefEigenaar());
            }
        }
        return eigenaren;
    }

    public void printEigenarenVoorBrandstof (String brandstof) {
        ArrayList<Eigenaar> eigenaren = geefEigenarenVoorBrandstof(brandstof);
        System.out.println("Eigenaar(s) voor brandstof: " + brandstof);
        for (Eigenaar eigenaar : eigenaren) {
            System.out.println(eigenaar.toString());
        }
    }
}
