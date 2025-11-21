package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpravceAut {
    private ArrayList<Auto> seznamAut = new ArrayList<>();

    public void pridejAuto(Auto auto){
        seznamAut.add(auto);
    }

    public void vypisVsechnaAuta() {
        System.out.println("Všechna auta: ");
        for (Auto auto : seznamAut){
            auto.vypisInfo();
        }
    }

    public List<Auto> najdiAutaPodleZnacky(String znacka) {
        List<Auto> nalezenaAuta = new ArrayList<>();
        for (Auto auto : seznamAut) {
            if (auto.getZnacka().equals(znacka)) {
                nalezenaAuta.add(auto);
            }
        }
        return nalezenaAuta;
    }

    public List<Auto> najdiAutaPodleRoku(int rokOd, int rokDo) {
        List<Auto> nalezenaAuta = new ArrayList<>();
        for (Auto auto : seznamAut) {
            int rokVyroby = auto.getRokVyroby();
            if (rokVyroby >= rokOd && rokVyroby <= rokDo){
                nalezenaAuta.add(auto);
            }

        }
        return nalezenaAuta;
    }

    public List<Auto> najdiRychlaAuta(int minRychlost) {
        List<Auto> rychloAuta = new ArrayList<>();
        for (Auto auto : seznamAut) {
            if (auto.getRychlost() > minRychlost) {
                rychloAuta.add(auto);
            }

        }
        return rychloAuta;
    }

    public List<NakladniAuto> najdiNakladniAutaSNakladem() {
        List<NakladniAuto> autaSNakladem = new ArrayList<>();
        for (Auto auto : seznamAut) {
            if (auto instanceof NakladniAuto) {
                NakladniAuto nakladniAuto = (NakladniAuto) auto;
                if (nakladniAuto.getAktualniNaklad() > 0) {
                    autaSNakladem.add(nakladniAuto);
                }
            }
        }
        return autaSNakladem;
    }

    public List<OsobniAuto> najdiOsobniAutaSPocetemMist(int minPocetMist) {
        List<OsobniAuto> autaSPoctemMist = new ArrayList<>();
        for (Auto auto : seznamAut) {
            if (auto instanceof OsobniAuto) {
                OsobniAuto osobniAuto = (OsobniAuto) auto;
                if (osobniAuto.getPocetMist() > minPocetMist) {
                    autaSPoctemMist.add(osobniAuto);
                }
            }
        }
        return autaSPoctemMist;
    }

}
