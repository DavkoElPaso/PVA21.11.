package org.example;

public class NakladniAuto extends Auto {
    private int nosnost;
    private int aktualniNaklad;
    Auto auto;

    public NakladniAuto(String znacka, String model, int rokVyroby, int rychlost, int nosnost, int aktualniNaklad) {
        super(znacka, model, rokVyroby, rychlost);
        this.nosnost = nosnost;
        this.aktualniNaklad = aktualniNaklad;
    }

    public void vypisInfo() {
        System.out.println("Značky: " + getZnacka() + " Model: " + getModel() + " rok výroby: " + getRokVyroby() + " rychlost: " + getRychlost());
    }

    public void naloz(int kg) {
        if ((aktualniNaklad + kg) < nosnost){
            aktualniNaklad += kg;
        }
    }

    public void vyloz(int kg) {
        if ((aktualniNaklad - kg) > nosnost){
            aktualniNaklad -= kg;
        }
    }


    public int getNosnost() {
        return nosnost;
    }

    public int getAktualniNaklad() {
        return aktualniNaklad;
    }
}
