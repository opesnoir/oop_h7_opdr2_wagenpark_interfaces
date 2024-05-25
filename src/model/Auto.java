package model;

import java.time.LocalDate;

public class Auto implements Comparable<Auto> {
    //attributen
    private String merk;
    private String model;
    private LocalDate datumAfgifteKenteken;
    private int kilometerStand;
    private String kenteken;

    //constructor
    public Auto(String merk, String model, LocalDate datumAfgifteKenteken, int kilometerStand, String kenteken) {
        this.merk = merk;
        this.model = model;
        this.datumAfgifteKenteken = datumAfgifteKenteken;
        this.kilometerStand = kilometerStand;
        this.kenteken = kenteken;
    }

    //methodes
    @Override
    public String toString() {
        return String.format("Merk: %s\nModel: %s\nDatum Kenteken: %s\nKilometerstand: %d\nKenteken: %s \n", merk, model, datumAfgifteKenteken, kilometerStand, kenteken);
    }

    @Override
    public int compareTo(Auto andereAuto) {
        return this.datumAfgifteKenteken.compareTo(andereAuto.datumAfgifteKenteken); //vergelijk met elkaar
    }

    public LocalDate getDatumAfgifteKenteken() {
        return datumAfgifteKenteken;
    }
}
