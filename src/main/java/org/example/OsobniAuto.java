package org.example;

public class OsobniAuto extends Auto{
    private int pocetMist;
    private int velikostKufru;
    Auto auto;

    public OsobniAuto(String znacka, String model, int rokVyroby, int rychlost, int velikostKufru, int pocetMist) {
        super(znacka, model, rokVyroby, rychlost);
        this.velikostKufru = velikostKufru;
        this.pocetMist = pocetMist;
    }

    public void vypisInfo() {
        System.out.println("Značky: " + getZnacka() + " Model: " + getModel() + " rok výroby: " + getRokVyroby() + " rychlost: " + getRychlost());
    }

    public int getPocetMist() {
        return pocetMist;
    }

    public int getVelikostKufru() {
        return velikostKufru;
    }
}
