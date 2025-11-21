package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SpravceAut spravce = new SpravceAut();


        Auto auto1 = new Auto("Škoda", "Octavia", 2020, 220);
        Auto auto2 = new Auto("Volkswagen", "Golf", 2018, 200);
        Auto auto3 = new Auto("Škoda", "Fabia", 2022, 180);
        Auto auto4 = new Auto("BMW", "X5", 2021, 250);


        NakladniAuto nakladak1 = new NakladniAuto("Tatra", "Phoenix", 2019, 120, 5000, 2000);
        NakladniAuto nakladak2 = new NakladniAuto("Mercedes", "Actros", 2020, 130, 8000, 0);
        NakladniAuto nakladak3 = new NakladniAuto("Volvo", "FH16", 2021, 140, 10000, 5000);


        OsobniAuto osobak1 = new OsobniAuto("Škoda", "Superb", 2022, 230, 580, 5);
        OsobniAuto osobak2 = new OsobniAuto("Mercedes", "Vito", 2020, 190, 800, 8);
        OsobniAuto osobak3 = new OsobniAuto("Ford", "Focus", 2019, 210, 350, 5);


        spravce.pridejAuto(auto1);
        spravce.pridejAuto(auto2);
        spravce.pridejAuto(auto3);
        spravce.pridejAuto(auto4);
        spravce.pridejAuto(nakladak1);
        spravce.pridejAuto(nakladak2);
        spravce.pridejAuto(nakladak3);
        spravce.pridejAuto(osobak1);
        spravce.pridejAuto(osobak2);
        spravce.pridejAuto(osobak3);

        System.out.println("=== VŠECHNA AUTA ===");
        spravce.vypisVsechnaAuta();
        System.out.println();


        System.out.println("=== AUTA PODLE ZNAČKY 'Škoda' ===");
        List<Auto> skodaAuta = spravce.najdiAutaPodleZnacky("Škoda");
        for (Auto auto : skodaAuta) {
            auto.vypisInfo();
        }
        System.out.println();


        System.out.println("=== AUTA VYROBENÁ MEZI 2020-2022 ===");
        List<Auto> autaPodleRoku = spravce.najdiAutaPodleRoku(2020, 2022);
        for (Auto auto : autaPodleRoku) {
            auto.vypisInfo();
        }
        System.out.println();


        System.out.println("=== RYCHLÁ AUTA (více než 200 km/h) ===");
        List<Auto> rychlaAuta = spravce.najdiRychlaAuta(200);
        for (Auto auto : rychlaAuta) {
            auto.vypisInfo();
        }
        System.out.println();


        System.out.println("=== NÁKLADNÍ AUTA S NÁKLADEM ===");
        List<NakladniAuto> nakladniAutaSNakladem = spravce.najdiNakladniAutaSNakladem();
        for (NakladniAuto nakladniAuto : nakladniAutaSNakladem) {
            nakladniAuto.vypisInfo();
            System.out.println("Nosnost: " + nakladniAuto.getNosnost() + " kg, Aktuální náklad: " + nakladniAuto.getAktualniNaklad() + " kg");
        }
        System.out.println();


        System.out.println("=== OSOBNÍ AUTA S VÍCE NEŽ 5 MÍSTY ===");
        List<OsobniAuto> osobniAutaSMisty = spravce.najdiOsobniAutaSPocetemMist(5);
        for (OsobniAuto osobniAuto : osobniAutaSMisty) {
            osobniAuto.vypisInfo();
            System.out.println("Počet míst: " + osobniAuto.getPocetMist() + ", Velikost kufru: " + osobniAuto.getVelikostKufru() + " l");
        }
        System.out.println();


        System.out.println("=== DEMONSTRACE FUNKCÍ AUT ===");
        System.out.println("Původní rychlost Octavie: " + auto1.getRychlost() + " km/h");
        auto1.zrychli(50);
        System.out.println("Po zrychlení: " + auto1.getRychlost() + " km/h");
        auto1.zpomal(30);
        System.out.println("Po zpomalení: " + auto1.getRychlost() + " km/h");
        auto1.zastav();
        System.out.println("Po zastavení: " + auto1.getRychlost() + " km/h");
        System.out.println();


        System.out.println("=== DEMONSTRACE NAKLÁDÁNÍ ===");
        System.out.println("Aktuální náklad Tatry: " + nakladak1.getAktualniNaklad() + " kg");
        nakladak1.naloz(1000);
        System.out.println("Po naložení 1000 kg: " + nakladak1.getAktualniNaklad() + " kg");
        nakladak1.vyloz(500);
        System.out.println("Po vyložení 500 kg: " + nakladak1.getAktualniNaklad() + " kg");
    }
}